package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         Scanner dados = new Scanner (System.in) ;
        // Declaração de variaveis
        int a = 10;
        int b = 2;
        int menor;
            
        // Operadores aritméticos
        if (a > b) {
            menor = a;
        } else {
            menor = b;
        }

        // Exibindo resultados
         System. out.println ("O maior Numero é: "+ menor) ;
    }
}
