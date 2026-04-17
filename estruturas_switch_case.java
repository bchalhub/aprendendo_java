import java.util.Scanner;

public class estruturas_switch_case {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7:");
        var option = scanner.nextInt();
        switch (option){ //switch é uma estrutura que testa o valor de uma variável e executa um case específico dependendo do valor.
            case 1: //case são as possibilidades
                System.out.println("Domingo");
                break; //O break serve para parar o switch.
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default: //O default funciona como o else
                System.out.println("Opção Inválida.");
        }

            //OUTRA FORMA DE CODIFICAR, USANDO ARROW CASE ->

            switch (option){ //Com o arrow case (->) não é necessário utilizar o break, essa opção está disponível a partir versão 17 do java.
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Segunda-feira");
                case 3 -> System.out.println("Terça-feira");
                case 4 -> System.out.println("Quarta-feira");
                case 5 -> System.out.println("Quinta-feira");
                case 6 -> System.out.println("Sexta-feira");
                case 7 -> System.out.println("Sábado");
                default -> System.out.println("Opção Inválida");
            }
            
            //OUTRA FORMA CODIFICAR:

            var message = switch (option) {
                case 1, 7 -> { //posso juntar dois cases em um dessa forma. Quando for necessário mais linhas dentro de um case é preciso abrir chaves{}
                    var day = option == 1 ? "Domingo" : "Sábado";
                    yield String.format("Hoje é %s, fim de semana!", day); //O yield retornar um valor dentro do bloco case, usado quando abrimos as chaves{}
                } //Se option == 1 retorna(yield) "Domingo" no arg(%s), se option == 7 retorna(yield) "Sábado" no arg(%s).
                case 2 -> "Segunda-feira";
                case 3 -> "Terça-feira";
                case 4 -> "Quarta-feira";
                case 5 -> "Quinta-feira";
                case 6 -> "Sexta-feira";
                default -> "Opção Inválida";
            };
            System.out.println(message);
            
            /*
            O switch está sendo usado para gerar um valor
            Esse valor vai para a variável message
            Como foi aberto chaves{ }, precisa usar yield para devolver o resultado dentro da case
            */

        }
}
