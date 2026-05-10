public class primeiraClasse_exercicio1_petMachine {
    //Atributos (variáveis da classe):
    private boolean clean = true; //Diz se a máquina está limpa ou não.

    private int water = 30; //Quantidade de água da máquina.

    private int shampoo = 10; //Quantidade de shampoo.

    private primeiraClasse_exercicio1_pet pet; //A máquina “tem um pet”. Aqui é o relacionamento entre as classes: “A máquina pode guardar um objeto do tipo pet”.

   
    //Métodos (ação que a classe pode fazer):
    public void takeAshower(){ //ação de dar banho - void = “esse método NÃO retorna nada” ele só executa ações (dar banho + imprimir)
        if(this.pet == null){ //verifica se tem pet na máquina
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return; //se não tiver > para o método
        }
        this.water -= 10; //Aqui é o consumo dos recursos, reduziu água e shampoo.
        this.shampoo -= 2;
        pet.setClean(true); //se tiver > deixa o pet limpo. A máquina está modificando o estado do pet.
        System.out.println("O pet " + pet.getName() + " está limpo.");
    }
    public void addWater(){ //Ação de adicionar água.
        if (water == 30){ //Verifica o limite, definir capacidade máxima.
            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }
        water += 2; //Adiciona água caso não tenha chegado a 30 ainda.
    }
    public void addShampoo(){ //Ação de adicionar shampoo.
        if (shampoo == 10){ //Verifica o limite, definir capacidade máxima.
            System.out.println("A capacidade de shampoo da máquina está no máximo.");
            return;
        }
        shampoo += 2; //Adiciona shampoo caso não tenha chegado a 10 ainda.
    }

    //Getter:
    public int getWater(){ //Retorna a quantidade de água.
        return water;
    }
    public int getShampoo(){ //Retorna a quantidade de shampoo.
        return shampoo;
    }

    public boolean hasPet(){ //Aqui está verificando se tem pet na máquina.
        return pet != null; //Se pet existe > true || Se não existe > false
    }

    //Métodos (ação que a classe pode fazer):
    public void setPet(primeiraClasse_exercicio1_pet pet){ //Coloca um pet na máquina.
        if (!this.clean){ //Verifica a máquina “se NÃO estiver limpa”.
            System.out.println("A máquina está suja, para coloca o pet é necessário limpa-la.");
            return;
        }
        if(hasPet()){ //Verifica se já tem pet.
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento.");
        }
        this.pet = pet; //Colocando o pet. O atributo da máquina recebe o pet passado no parâmetro.
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void removePet(){ //Remove o pet da máquina.
        this.clean = this.pet.isClean(); //Atualiza limpeza da máquina. Se o pet estiver limpo: máquina fica limpa, Se o pet estiver sujo: máquina fica suja.
        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina.");
        this.pet = null; //Remove o pet.
    }

    public void washMachine(){ //Limpa a máquina.
        this.water -= 3; //Consumo dos recursos
        this.shampoo -= 1;
        this.clean = true; //Atualiza estado. Máquina agora está limpa.
        System.out.println("A máquina foi limpa.");
    }
}
