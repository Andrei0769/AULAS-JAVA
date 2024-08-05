package com.example;

import java.util.Scanner;

public class nota_aluno{

    public static void main(String[] args) {
        // Criar um Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner (System.in) ;

        // Solicitar ao usuário para inserir seu nome
        System. out.print ("Digite seu nome: ");
        String nome = scanner.nextLine ();

        // Solicitar ao usuario para inserir o primeiro número
        System. out.print ("Digite a primeira nota: ");
        double notal = scanner.nextDouble ();

        // Solicitar ao usuario para inserir o segundo número
        System. out.print ("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble ();

        // Calcular a média das notas
        double media = (notal + nota2) / 2;

        // Determinar se o aluno esta aprovado ou reprovado
        if (media >= 7) {
            System. out.println (nome + " esta aprovado com uma media de " + media);
        } else {
            System. out.println (nome + " esta reprovado com uma media de " + media);
        }
    }
}
