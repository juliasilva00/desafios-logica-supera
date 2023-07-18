package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        ArrayList<Integer> entrada = new ArrayList();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();

        for(int i = 0 ; i < N; i++){
            int valor = s.nextInt();
            entrada.add(valor);
        }

        for (int i = 0; i < entrada.size(); i++) {
            for (int j = i + 1; j < entrada.size(); j++) {
                if (entrada.get(j) - entrada.get(i) == K) {
                    contador++;
                }
            }
        }
        System.out.println(contador);

    }
}