/*Exercício: Escreva uma hierarquia de classes para criação de relógios para diferentes lugares do mundo,
defina uma classe pai que tenha as propriedades Hora, minuto e segundo com seus respectivos getters e setters
(atendendo as regras do funcionamento de um relógio) e um método que deverá retornar a hora no formato HH:MM:SS,
a partir dessa classe crie 2 implementações, uma chamada relógio Americando e outra chamada relógio Brasileiro,
lembrando que para o relógio americano não existem as horas de 13 até 24. Defina também na super classe um método
que ficará por responsabilidade da classe que extende-la definir seu funcionamemnto, esse método deve receber um
relógio ( independente da implementação) e deve-se extrair as informações dele e usa-la no objeto que recebeu para
setar as novas informações do relógio. */


public sealed abstract class Clock permits BRLClock, USClock{   //Sealed: apenas as classes listadas em permits podem estender Clock.
    /*Uma classe abstract é usada quando queremos definir um modelo comum para outras classes,
    impedindo que esse modelo seja instanciado diretamente. Ela serve como uma "base" para as
    subclasses, concentrando atributos e comportamentos compartilhados e podendo exigir que as
    classes filhas implementem determinados métodos.
    Clock foi criada como abstract porque representa um conceito genérico que não deve ser instanciado diretamente,
    concentra características comuns a todos os relógios e define um contrato (método abstrato) que obriga cada tipo
    de relógio a implementar seu próprio comportamento.
    Se fosse só "public class Clock" seria possível a criação de um relógio novo sem métodos definidos: "Clock clock = new Clock();"
    permitindo a existência de um relógio genérico, sem uma regra específica de funcionamento.
    Com Clock sendo abstract, ele define o contrato e a estrutura comuns, enquanto a criação dos
    objetos acontece nas subclasses concretas: "Clock clock = new BrazilianClock();"
    Isso quer dizer que existe um comportamento que todas as subclasses DEVEM implementar
    */

    //Atributos/propriedades
    protected int hour;

    protected int minute;

    protected int second;


    //Getter and setter
    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if(hour >= 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }

    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        if(minute >= 60){
            this.minute = 60;
            return;
        }
        this.minute = minute;
    }

    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        if(second >= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }


    //Método
    abstract Clock convert(Clock clock);
    /*O método abstract Clock convert(Clock clock) define um contrato que obriga todas as subclasses
    de Clock a implementarem uma forma de converter as informações recebidas de outro relógio.
    O parâmetro Clock clock permite receber qualquer implementação de relógio através do polimorfismo,
    enquanto o retorno Clock indica que o método devolverá um objeto do tipo relógio após a conversão. 
    Se existe um comportamento comum a todos os objetos, mas a forma de executá-lo varia entre as
    subclasses, provavelmente esse comportamento deve ser definido como um método abstrato na superclasse.*/

    private String format(int value){
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    
    public String getTime(){
        return format(hour) + ":" + format(minute) + ":" + format(second);
    }

}
