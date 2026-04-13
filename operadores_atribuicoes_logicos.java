import java.util.Scanner; //obrigatório para o uso da variável scanner importar a classe

public class operadores_atribuicoes_logicos {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); //para ler dados do teclado declare a variável scanner
        System.out.println("Quanto é 2 + 2?");
        var result = scanner.nextInt(); //para receber os dados do teclado use a variável scanner.nextTipo(), tipo pode ser String, int, float...
        var isRight = result == 4;
        System.out.printf("O resultado é 4, você acertou?\n%s\n", isRight); //%s é um argumento, \n pula uma linha

        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt(); 
        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16); //as duas barras || significa ou (or), e o && significa e (and)
        System.out.printf("Você pode dirigir?\n%s", canDrive); 

        /* 
        = atribuição
        == igual a
        != diferente de
        > maior que
        < menor que
        >= maior ou igual a
        <= menor ou igual a
         */

    }
}
