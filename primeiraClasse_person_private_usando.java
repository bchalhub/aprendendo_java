public class primeiraClasse_person_private_usando {
    
    public static void main(String[] args){             //new = cria um objeto novo, cada objeto tem seus próprios dados
        var male = new primeiraClasse_person_private(); //Em uma variável chamamos a classe person e a cada new estamos definindo valores ao objeto da variável criada
        male.setName("Arduíno"); //para definirmos os valores de uma classe private utilizamos o set()
        male.setAge(54);
        var female = new primeiraClasse_person_private(); //Aqui já temos um segundo objeto da classe person, vai ficar 'salvo' com os valores definidos
        female.setName("Bárbara");
        female.setAge(31);
        System.out.println("Male name: " + male.getName() + " age: " + male.getAge()); //Aqui chamamos os valores do objetos através do get
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());

        /*classe definida como private para proteger os dados, nesse caso utilizamos
        o set() (para receber as informações) e o get() (para ler as informações)*/

        
    }

}
