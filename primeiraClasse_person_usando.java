public class primeiraClasse_person_usando {

    public static void main(String[] args){
        var male = new primeiraClasse_person(); //Em uma variável chamamos a classe person e a cada new estamos definindo valores ao objeto da variável criada
        male.name = "Arduíno";                  //new = cria um objeto novo, cada objeto tem seus próprios dados
        male.age = 54;
        var female = new primeiraClasse_person(); //Aqui já temos um segundo objeto da classe person, vai ficar 'salvo' com os valores definidos
        female.name = "Bárbara";
        female.age = 31;
        System.out.println("Male name: " + male.name + " age: " + male.age); //Aqui chamamos os valores do objetos
        System.out.println("Female name: " + female.name + " age: " + female.age);

        //uso da classe definida como public

        
    }
    
}
