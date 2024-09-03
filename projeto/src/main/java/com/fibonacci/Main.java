package com.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int numero = 0;
        String palavra;

        do{
            System.out.println("-------------------------------------------------------");
            System.out.println("Escolha um sistema para testar: ");
            System.out.println("\n1.) Número aparece ou não em Fibonacci");
            System.out.println("2.) Quantidade de letras A em uma palavra");
            System.out.println("3.) Encerrar programa");
            System.out.println("\nDigite aqui sua escolha: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nDigite o número para testar: ");
                    numero = scanner.nextInt();
                    scanner.nextLine();
                    if(Fibonacci.pertenceAFibonacci(numero)){
                        System.out.println(numero + " Pertence a Fibonacci\n");
                    }
                    else{
                        System.out.println(numero + " Não pertence a Fibonnaci\n");
                    }
                    break;
            
                case 2:
                    System.out.println("\nDigite a palavra para testar: ");
                    palavra = scanner.nextLine();
                    System.out.println("A letra 'a' apareceu: " + VerificarLetraA.quantidadeDeLetraA(palavra) + "\n");
                    break;
                
                case 3:
                    System.out.println("\nPrograma encerrado");
                    break;

                default:
                    System.out.println("\nOpção inválida\n");
                    break;
            }

        } while (escolha != 3);

        scanner.close();
    }
}