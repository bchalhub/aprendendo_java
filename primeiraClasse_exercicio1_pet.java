public class primeiraClasse_exercicio1_pet {
    //Atributos (variáveis da classe):
    private final String name; //Nome do pet, criado em final, pois após o nome criado não poderá modifica-lo.

    private boolean clean; //Se o pet está limpo.


    //Construtor:
    public primeiraClasse_exercicio1_pet(final String name) {
        this.name = name;
        this.clean = false; //Está em falso pois entendesse que quando ele entrar no sistema ele estará sujo.
    }


    //Getter e setter:
    public String getName(){ //o setter do nome não é criado pois está definido como final. Então não tem alteração, é definido uma vez e pronto.
        return name;
    }
    public boolean isClean(){
        return clean;
    }
    public void setClean(boolean clean){
        this.clean = clean;
    }

}
