public class tabela_verdade_or_and {
   public static void main(String[] args) {
    //Tabela Verdade do and (&&) - Só é verdade se tudo for verdade
    System.out.printf("true && true = %s \n", true && true);
    System.out.printf("false && false = %s \n", false && false);
    System.out.printf("true && false = %s \n", true && false);
    System.out.printf("false && true = %s \n", false && true);
    System.out.printf("================================================\n");
    //Tabela Verdade do or (||) - Só é falso se tudo for falso
    System.out.printf("true || true = %s \n", true || true);
    System.out.printf("false || false = %s \n", false || false);
    System.out.printf("true || false = %s \n", true || false);
    System.out.printf("false || true = %s \n", false || true);
    System.out.printf("================================================\n");
    //Negação:
    System.out.printf("!true = %s \n", !true);
    System.out.printf("!false = %s \n", !false);
    


   } 
}
