/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerointeiros;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author davil
 */
public class NumeroInteiros {
    
    public static int contarPares(ArrayList<Integer> numeros){
      int contador = 0;
      for (int numero : numeros) {
        if (numero % 2 == 0) {
            contador++;
          }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(5);
        numeros.add(3);
        numeros.add(2);
        numeros.add(7);
        numeros.add(6);
        
       int quantidadePares = contarPares(numeros);
       System.out.println("Quantidade de numeros pares na lista " + quantidadePares);
    }
}
