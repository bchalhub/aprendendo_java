import java.time.OffsetDateTime;
import java.util.Scanner;

public class exercicios_fundamentos {
    public static void main(String[] args){
        /*
        Exercício 01: Escreva um código que receba o nome e o ano de nascimento de alguém e 
        imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos."
        */       
        
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var name = scanner.next();
        System.out.println("Digite o ano do seu nascimento: ");
        var age = scanner.nextInt();
        System.out.printf("Olá %s, você tem %s anos.\n", name, 2026 - age);

        // OUTRO JEITO DE FAZER:

        var baseYear = OffsetDateTime.now().getYear(); //classe offsetDateTime trabalha com informações de data.
        System.out.println("Digite seu nome: ");
        var nome = scanner.next();
        System.out.println("Digite o ano do seu nascimento: ");
        var year = scanner.nextInt();
        var idade = baseYear - year;
        System.out.printf("Olá %s, você tem %s anos.\n", nome, idade);
        
        /*
        Exercício 02: Escreva um código que receba o tamanho do lado de um quadrado,
        calcule sua área e exiba na tela.
        fórmula: área = lado X lado
        */ 
        
        System.out.println("Digite um tamanho p/ o lado do quadrado: ");
        var side = scanner.nextInt();
        System.out.printf("A área do quadrado mede %s m².\n", side * side);

        /*
        Exercício 03: Escreva um código que receba a base e a altura de um retângulo,
        calcule sua área e exiba na tela.
        fórmula: área = base X altura
        */ 

        System.out.println("Digite um tamanho p/ a base do retângulo: ");
        var base = scanner.nextInt();
        System.out.println("Digite um tamanho p/ a altura do retângulo: ");
        var height = scanner.nextInt();
        System.out.printf("A área do retângulo mede %s m².\n", base * height);    
        
        /*
        Exercício 04: Escreva um código que receba o nome e a idade
        de 2 pessoas e imprima a diferença de idade entre elas.
        */

        System.out.println("Digite o nome da primeira pessoa: ");
        var name1 = scanner.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        var age1 = scanner.nextInt();
        System.out.println("Digite o nome da segunda pessoa: ");
        var name2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        var age2 = scanner.nextInt();
        System.out.printf("Olá %s e %s, a diferença idade entre vocês é de %s anos.\n", name1, name2, age1 - age2);

    }
}
