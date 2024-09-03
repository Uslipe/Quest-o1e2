package com.fibonacci;

public class Fibonacci {
    
    //Função que verifica se um número pertence a fibonacci
    public static boolean pertenceAFibonacci(int numeroFornecido){
        int numeroAnterior = 0;
        int numeroPosterior = 1;
        int resultado = 0;

        while(resultado <= numeroFornecido){
            if(resultado == numeroFornecido){
                return true;
            }
            
            resultado = numeroPosterior + numeroAnterior;
            numeroAnterior = numeroPosterior;
            numeroPosterior = resultado;
        }
        return false;
    }
}
