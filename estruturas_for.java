import java.util.Scanner;

public class estruturas_for {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        for(;;){    //for(;;) significa que está sem definição de condições
            System.out.println("Digite um nome:");
            var name = scanner.next();

            if (name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
        }

        for (var i = 1; i <= 100; i ++){    //for (inicialização; condição; incremento) | var i = 1 cria a variável i e começa com valor 1;
            System.out.println(i);          //i <= 100 condição de parada, é verificada antes de cada repetição;
            if (i == 100){                  //i ++ aumenta i em +1 a cada loop, para quando atinge a condição.
                System.out.println("Fim da execução"); 
                break;
            }                  
        }
                                            
        for (var i = 0; i < args.length; i++){ //utilizando o args em launch.json (Run > Open Configuration)
            System.out.println(i + 1 + " - " + args[i]);
        }      
           System.out.println("Args length: " + args.length); //mostra a quantiade de args configuradas em launch.json 
           //para rodar e aparecer a lista de args é necessário fazer por debug, não pelo run, clicando em F5                                        
    }


}

