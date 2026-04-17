import java.util.Scanner;

public class estruturas_if_else {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s"); //.equalsIgnoreCase compara a resposta com "s" ignorando maiúsculo/minúsculo.
        /* 
        Retorna:    true se for "s", "S", "s", etc.
                    false se for qualquer outra coisa
        */
        if (age >=18) { //é necessário colocar a condição dentro do parênteses e abrir e fechar chaves {}
            System.out.printf("%s, você tem %s anos, pode dirigir.\n", name, age);
        } else if (age >= 16 && isEmancipated){ //else if = elif: serve para incluir mais condições
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir.\n", name, age);
        } else { //abre e fecha chaves {}
            System.out.printf("%s, você tem %s anos, não pode dirigir.\n", name, age);
        }
        System.out.println("Fim da execução.");

        // OUTRA FORMA DE CODIFICAR:

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated); 
        var message = ""; //variável declarada vazia fora do if para valida-la 
        if (canDrive) {
            message = name + ", você pode dirigir.\n";
        } else {
            message = name + ", você não pode dirigir.\n";
        }
        System.out.println(message);
        System.out.println("Fim da execução.");

        // OUTRA FORMA DE CODIFICAR, USANDO ?: (elvis operator)

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated); 
        var message = canDrive ? //inicia com ?
            name + ", você pode dirigir.\n": //repare que aqui está os :
            name + ", você não pode dirigir.\n"; //e aqui o ; fechando
        /*
        A leitura é feita no canDrive? 
        se true sairá a mensagem antes dos :
        e se for false sairá a mensagem após os :
        */
        System.out.println(message);
        System.out.println("Fim da execução.");

    }
}