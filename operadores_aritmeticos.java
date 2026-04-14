import java.util.Scanner;

public class operadores_aritmeticos {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: "); //Pede a informação
        var value1 = scanner.nextInt(); //Recebe a informação
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);

        var value = 5 + 9 * 10 - 5 / 2; //Seguindo a matemática primeiro será calculado mult. e div. e depois soma e sub.
        System.out.println(value); //saída = 93
        var valuep = (5 + 9) * (10 - 5) / 2; //Seguindo a matemática primeiro será calculado o que está dentro dos parênteses.
        System.out.println(valuep); //saída = 35

        var valor = 5;
        valor += 12; //O += está somando o próprio valor + o 12, como em valor = valor + 12. Pode ser feito com qualquer cálculo, +, -, /...
        System.out.println(valor);

        System.out.println("Informe um número: "); //Pede o valor
        var valor1 = scanner.nextInt(); //Recebe o valor
        System.out.printf("A raíz quadrada de %s é %s\n", valor1, Math.sqrt(valor1)); //Math é uma classe, sqrt é a fórmula para calcular raíz quadrada.

        System.out.println("Informe um número: "); //Pede o valor
        var valor2 = scanner.nextInt(); //Recebe o valor
        System.out.printf("A potência de %s é %s\n", valor2, Math.pow(valor2, 2)); //Math é uma classe, pow é a fórmula para calcular potência, ele pede um segundo número que será o elevado.

        var valores = 50; 
        System.out.println(++valores); //saída = 51, o ++ vai somar 1 ao valor, como se fosse: valores +=1 ou valores = valores + 1. Também funciona com --
        System.out.println(valores); //saída = 51
        //Também pode ser usado após a variável (valores++), assim a soma ocorrerá apenas na próxima linha, segue exemplo:
        var valores1 = 50; 
        System.out.println(valores1++); //saída = 50
        System.out.println(valores1); //saída = 51

        /*
        + = soma
        - = subtração
        / = divisão
        * = multiplicação
        % = resulta o resto, o que sobra da divisão, muito utilizado para descobrir par e ímpar ( if x % 2 == 0 -> Par)
        */


    }
}
