public class operadores_bitwise {
    public static void main(String[] args) {
        
        //OR | - ||
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1); //Integer é uma classe, toBinaryString() é um método dessa classe onde ele recebe um número inteiro e retorna uma String com o valor em binário.
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
        var result = value1 | value2; //| é o símbolo do or
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s (representação binária %s)\n", value1, value2, result, binaryResult);
        
        /*
        0 = false
        1 = true
        Utilizando a lógica do or: (só é falso se tudo for falso)
        110
        101
        ___
        111
        */

        //AND & - &&
        var value3 = 6;
        var binary3 = Integer.toBinaryString(value3);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value3, binary3);
        var value4 = 5;
        var binary4 = Integer.toBinaryString(value4);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value4, binary4);
        var result1 = value3 & value4; //& é o símbolo do and
        var binaryResult1 = Integer.toBinaryString(result1);
        System.out.printf("%s & %s = %s (representação binária %s)\n", value3, value4, result1, binaryResult1);
    
        /*
        0 = false
        1 = true
        Utilizando a lógica do and: (só é verdade se tudo for verdade)
        110
        101
        ___
        100
        */
    
        //XOR (OU exclusivo) ^:
        var value5 = 6;
        var binary5 = Integer.toBinaryString(value5);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value5, binary5);
        var value6 = 5;
        var binary6 = Integer.toBinaryString(value6);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value6, binary6);
        var result2 = value5 ^ value6; //^ é o símbolo do xor
        var binaryResult2 = Integer.toBinaryString(result2);
        System.out.printf("%s ^ %s = %s (representação binária %s)\n", value5, value6, result2, binaryResult2);
    
        /*
        0 = false
        1 = true
        Utilizando a lógica do xor: (só é verdade se tudo for diferente)
        110
        101
        ___
        011
        */
        
        //NEGAÇÃO ~:
        var valor = 6;
        var binario = Integer.toBinaryString(valor);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor, binario);
        var resultado = ~valor; //~ é o símbolo da negação
        var binarioResultado = Integer.toBinaryString(resultado);
        System.out.printf("~%s = %s (representação binária %s)\n", valor, resultado, binarioResultado);
    
        /*
        0 = false
        1 = true
        Utilizando a lógica da negação: 
        00000000000000000000000000000110
        11111111111111111111111111111001
        */
   
        //Deslocamento de bits (bit shift): SHIFT LEFT <<
        var valor1 = 9;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor1, binario1);
        var valor2 = 2; //Aqui o 2 vai representar quantos zeros serão "empurrados"
        var binario2 = Integer.toBinaryString(valor2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", valor2, binario2);
        var resultado1 = valor1 << valor2; //<< é o símbolo do shift left
        var binarioResultado1 = Integer.toBinaryString(resultado1);
        System.out.printf("%s << %s = %s (representação binária %s)\n", valor1, valor2, resultado1, binarioResultado1);
    
        /*
        0 = false
        1 = true
        Utilizando a lógica do shift left <<: 
        Move bits a esquerda, isso acrescentar zeros a direita
        1001
        100100 = + 2 zeros a direita
        */

        //Deslocamento de bits (bit shift): SHIFT RIGHT >>
        var valor3 = 8;
        var binario3 = Integer.toBinaryString(valor3);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor3, binario3);
        var valor4 = 2; 
        var binario4 = Integer.toBinaryString(valor4);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", valor4, binario4);
        var resultado2 = valor3 >> valor4; //>> é o símbolo do shift right
        var binarioResultado2 = Integer.toBinaryString(resultado2);
        System.out.printf("%s >> %s = %s (representação binária %s)\n", valor3, valor4, resultado2, binarioResultado2);
    
        /*      
        0 = false
        1 = true
        Utilizando a lógica do shift right >>: 
        Move os bits para a direita.
            - Remove bits da direita
            - Adiciona bits à esquerda:
               0 se número positivo
               1 se número negativo
        
            Exemplo:
            1000 (8)
            >> 2
            Resultado:
            0010 (2)
        */

        //Deslocamento de bits (bit shift): SHIFT RIGHT SEM SINAL >>>
        var valor5 = 12;
        var binario5 = Integer.toBinaryString(valor5);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor5, binario5);
        var valor6 = 2; 
        var binario6 = Integer.toBinaryString(valor6);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", valor6, binario6);
        var resultado3 = valor5 >>> valor6; //>>> é o símbolo do shift right sem sinal
        var binarioResultado3 = Integer.toBinaryString(resultado3);
        System.out.printf("%s >>> %s = %s (representação binária %s)\n", valor5, valor6, resultado3, binarioResultado3);
    
        /*      
        0 = false
        1 = true
        Utilizando a lógica do shift right sem sinal >>>: 
        Move os bits para a direita.
            - Remove bits da direita
            - Adiciona zeros à esquerda independente se for positivo ou negativo
        
            Exemplo:
            1100 (12)
            >> 2
            Resultado:
            0011 (3)
        */

    }    
}
