public class contaBancaria {
    //Atributos (variáveis da classe):      algo armazenado permanentemente.
    private final String name;

    private float saldo;

    private float chequeEspecial;

    private boolean taxaCobrada;

    //Construtor:
    public contaBancaria (final String name, float saldoInicial){
        this.name = name;           //atributo recebe o parâmetro.
        this.saldo = saldoInicial;  //saldo da conta nasce definido.
        if (saldoInicial <= 500){   //verifica saldo inicial para definir o valor do cheque especial.
            chequeEspecial = 50;
        } else {
            chequeEspecial = saldoInicial / 2;
        }
        this.taxaCobrada = false;
    }

    //Métodos com void:      algo calculado quando necessário.   Um método normalmente segue: modificador + tipo de retorno + nome + parâmetros
    public void consultarSaldo(){
        System.out.printf("Olá %s, seu saldo está no valor de R$%.2f.\n", name, saldo);
    }

    public void consultarChequeEspecial(){
        System.out.printf("Olá %s, seu Cheque Especial está no valor de R$%.2f.\n", name, chequeEspecial);
    }

    public void depositar(float valorDeposito){ //dentro do () você define parâmetros. “para depositar, preciso receber um valor”
        boolean estavaUsandoCheque = usandoChequeEspecial(); //guardou estado anterior ao depósito.
        saldo += valorDeposito;                 //depois o valorDeposito vai entrar como uma variável no Main, pedindo o valor ao usuário.
        if(estavaUsandoCheque && !taxaCobrada){ //se o cheque especial foi usado e a taxa ainda não foi cobrada, alica-se a taxa.
            aplicacaoTaxa();
            taxaCobrada = true; //taxa passa para positivo pq foi cobrada.
        }if(saldo >= 0){    //após o saldo se regularizar a taxa pode ser cobrada novamente se usar o cheque especial.
            taxaCobrada = false;
        }
    }
   
    public void pagarBoleto(float valorBoleto){
        if(saldoDisponivel() >= valorBoleto){
            saldo -= valorBoleto;
            System.out.printf("Boleto pago. Saldo atual: R$%.2f.\n", saldo);
        }else{
            System.out.println("Saldo insuficiente.");
        }    
    }

    public void saque(float valorSaque){
        if(saldoDisponivel() >= valorSaque){
            saldo -= valorSaque;
            System.out.printf("Saque realizado no valor de R$%.2f. Saldo atual: R$%.2f.\n", valorSaque, saldo);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    //Métodos sem void:     retornam valores, sempre usado com return.
    public float saldoDisponivel(){     //calcula um valor e retorna esse valor. Calcula dinheiro disponível.
        return saldo + chequeEspecial;  //o método devolve o resultado.
    }

    public boolean usandoChequeEspecial(){      //um método boolean que retorna true/false baseado no estado do objeto.
        return saldo < 0;
    }

    public float valorUsadoChequeEspecial(){
        if(usandoChequeEspecial()){
            return Math.abs(saldo);     //Math.abs() retorna o valor absoluto, ex: -30 = 30. Transforma em positivo.
        }else{
            return 0;
        }        
    }

    public float calculoTaxa(){
        if(usandoChequeEspecial()){
            return valorUsadoChequeEspecial() * 0.20f;
        }else{
            return 0;
        }
    }

    //Métodos com void:      algo calculado quando necessário.
    public void aplicacaoTaxa(){
            saldo -= calculoTaxa();
    }
}