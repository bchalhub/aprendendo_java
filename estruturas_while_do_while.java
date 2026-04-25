import java.util.Scanner;

public class estruturas_while_do_while {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        var name = "";
        while(true){
            System.out.println("Informe seu nome:");
            name = scanner.next();
            System.out.println(name);

            if (name.equalsIgnoreCase("exit")) break;
        }

        //OUTRA FORMA DE UTILIZAR:

        var i = 0;
        while(args.length > i){ //utilizando o args em launch.json (Run > Open Configuration)
            System.out.println(args[i]);
            i++;
        }
        
        //Utilizando a estrutura: do while

        do{
            System.out.println(args[i]);
            i++;
        }while(args.length > i);

        //para rodar e aparecer a lista de args é necessário fazer por debug, não pelo run, clicando em F5
    }

}