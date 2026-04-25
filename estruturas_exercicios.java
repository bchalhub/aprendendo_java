import java.util.Scanner;

public class estruturas_exercicios {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        /*Exercício 01. Escreva um código onde o usuário entra com um número
        e seja gerada a tabuada de 1 até 10 desse número.*/
        System.out.println("Digite um número:");
            var number = scanner.nextInt();
            for(var i = 0; i <= 10; i++){
                System.out.printf("%s x %s = %s\n", number, i, number * i);
            }

        /*Exercício 02. Escreva um código onde o usuário entra com sua altura e peso, 
        seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
        Se for menor ou igual a 18,5 "Abaixo do peso";
        se for entre 18,6 e 24,9 "Peso ideal";
        Se for entre 25,0 e 29,9 "Levemente acima do peso";
        Se for entre 30,0 e 34,9 "Obesidade Grau I";
        Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        Se for maior ou igual a 40,0 "Obesidade III (Mórbida)"; */
        System.out.println("Informe seu nome:");
            var name = scanner.next();
        System.out.println("Informe sua altura:");
            var height = scanner.nextDouble();
        System.out.println("Informe seu peso:");
            var weight = scanner.nextInt();
            var imc = weight / (height * height);
        System.out.printf("%s, seu IMC é %.2f.\n", name, imc);
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        } else if (imc >= 40){
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        /*Exercício 03. Escreva um código que o usuário entre com um primeiro número,
        um segundo número maior que o primeiro e escolhe entre a opção par e impar,
        com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
        no intervalo de números informados, incluindo os números informados e em ordem decrescente; */
        System.out.println("Informe o primeiro número:");
            var number1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
            var number2 = scanner.nextInt();
        System.out.println("Escolha entre par ou impar:");
            var parImpar = scanner.next(); //entrada do usuário em STRING
            
            //Validando a entrada do usuário:
            while (!parImpar.equalsIgnoreCase("par") && !parImpar.equalsIgnoreCase("impar")) { //se NÃO for "par" E NÃO for "impar" == inválido
                System.out.println("Opção inválida. Digite 'par' ou 'impar':");
                parImpar = scanner.next(); //repete enquanto for inválido
            }
            //Convertendo a informação para BOOLEAN:
            var ehPar = parImpar.equalsIgnoreCase("par"); 
            
            //Verificando qual número é o maior e o menor, utilizando um operador ternário (?:; - condição? saída if true: saída if false;)
            var maior = number1 > number2? number1 : number2; //se number1 é maior que number2, maior = number1, se não maior = number2.
            var menor = number1 > number2? number2 : number1; //se number2 é maior que number1, maior = number2, se não maior = number1.
            
            //Loop para a impressão dos números       
                for(var i = maior; i >= menor; i--){
                    if(ehPar && i % 2 == 0){
                        System.out.println(i);
                    } else if(ehPar == false && i % 2 != 0){
                        System.out.println(i);
                    }
                }
                /*O código if poderia ser simplificado para: 
                    if(ehPar == (i % 2 == 0)){
                        System.out.println(i);
                    } 
                pois está comparando boolean com boolean,
                o que o usuário quer == o tipo do número
                parImpar == (i % 2 == 0)  
                Assim:
                par + quer par → true == true ✔
                ímpar + quer ímpar → false == false ✔
                par + quer ímpar → true != false X
                ímpar + quer par → false != true X */
    
                /*Exercício 4. Escreva um código onde o usuário informa um número inicial,
                posteriormente irá informar outros N números, a execução do código irá continuar
                até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
                números menores que o primeiro número devem ser ignorados */
                System.out.println("Informe um número:");
                var numero = scanner.nextInt();
                
                while (true){
                    System.out.println("Informe um número para verificação:");
                    var toVerify = scanner.nextInt();
                    if (toVerify < numero){
                        System.out.printf("Informe um número maior que %s.\n", numero);
                        continue;
                    }
                    var result = toVerify % numero;
                    System.out.printf("%s %% %s = %s\n", toVerify, numero, result);
                    if (result != 0) break;
                }
    }  
}      
            
            
   