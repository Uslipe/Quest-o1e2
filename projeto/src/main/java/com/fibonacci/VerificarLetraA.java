package com.fibonacci;

public class VerificarLetraA {

    //Método que verifica a quantidade de letras A dado uma palavra
    public static int quantidadeDeLetraA(String palavra){
        int contadorDeOcorrencias = 0;
        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A'){
                contadorDeOcorrencias++;
            }
        }
        return contadorDeOcorrencias;
    }
}
