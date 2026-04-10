import java.util.Scanner; //ctrl + shift + O limpa os importes que não estão sendo utilizados

public class Main {

    public static void main(String[] args) { // comentário de uma linha
        Scanner scanner = new Scanner(System.in); //System.in significa que a informação vem do teclado
        System.out.println("Olá, informe seu nome:"); //o println já pula uma linha, o print normal não pula linha
        String name = scanner.next(); //isso é uma variável
        System.out.println("Informe sua idade:");
        int age = scanner.nextInt(); //isso é uma variável
        System.out.println("Olá " + name + " sua idade é " + age + " anos."); // existem formas diferentes de fazer esse print, segue próxima opção:
        System.out.printf("Olá %s sua idade é %s anos.\n", name, age); //repare que agora é printf, o %s é um argumento

        // outra forma de declarar variáveis:

        System.out.println("Olá, informe seu nome:"); 
        var nome = scanner.next(); //isso é uma variável, troquei name por nome para não dar conflito
        System.out.println("Informe sua idade:");
        var idade = scanner.nextInt(); //isso é uma variável, troquei age por idade para não dar conflito
        System.out.println("Olá " + nome + " sua idade é " + idade + " anos."); 
        

    }

}

/*

Comentário de várias linhas

*/