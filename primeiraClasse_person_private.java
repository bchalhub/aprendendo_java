public class primeiraClasse_person_private {
    
    //Criando a classe em private para proteger os dados
    private String name;

    private int age;

    //Aqui definimos o set() (para receber as informações) e o get() (para ler as informações)
    public void setName(String name){
        this.name = name; //o uso do this. só é permitido em instâncias(objetos (new Pessoa())) sem static
    }
    public String getName(){
        return name;
    }


        public void setAge(int age){ 
        if (age > 0) {          //aqui a idade valerá a partir de valores positivos
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    
    /*private + get/set = encapsulamento
      void significa: esse método não retorna nada. É usado quando você só quer executar uma ação e não precisa devolver nada.
      static significa: isso pertence à classe, não ao objeto. Sem static você PRECISA criar um objeto (new Pessoa()). 
      Com static você usa direto pela classe.
     */
}
