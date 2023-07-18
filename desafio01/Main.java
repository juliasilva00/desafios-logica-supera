package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //declaraçã de variaveis
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ArrayList<Integer> entrada = new ArrayList();
        ArrayList<Integer> pares = new ArrayList();
        ArrayList<Integer> impares = new ArrayList();


        //entrada de dados e inserção no array
        for(int i = 0 ; i < N; i++){
            int valorDeEntrada = s.nextInt();
            entrada.add(valorDeEntrada);

            if(valorDeEntrada % 2 == 0){
                pares.add(valorDeEntrada);
            } else {
                impares.add(valorDeEntrada);
            }
        }

        //ordenando array
        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);


        //impressao do array
        for(int par : pares){
            System.out.println(par);
        }

        for(int impar : impares){
            System.out.println(impar);
        }

    }
}