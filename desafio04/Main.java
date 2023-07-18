package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        s.nextLine();//consome a quebra de linha após a inserção do primeiro inteiro

        for (int i = 0 ; i < N ; i++){
            String frase = s.nextLine();
            StringBuilder metade1 = new StringBuilder(frase.substring(0, frase.length()/2)); //indice zero até a metade
            StringBuilder metade2 = new StringBuilder(frase.substring(frase.length()/2, frase.length())); //da metade até o final
            metade1.reverse();
            metade2.reverse();
            System.out.println(metade1.toString() + metade2.toString());

        }


    }
}
