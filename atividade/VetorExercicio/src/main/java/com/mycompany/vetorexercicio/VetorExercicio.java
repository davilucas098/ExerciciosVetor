/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorexercicio;

import java.util.Scanner;
/**
 *
 * @author davil
 */
public class VetorExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior, menor;
        
        System.out.println("Insira 10  números inteiros: ");
        
        for (int i = 0; i < numeros.length; i++) {
          System.out.println("Numero" + (i + 1) + ": ");
          numeros[i] = scanner.nextInt();
          soma += numeros[i];
        }
        
        maior = menor = numeros[0];
        
        for (int num : numeros) {
          if (num > maior) maior = num;
          if (num < menor) menor = num;
        }
        
        System.out.println("Soma de todos os valores " + soma);
        System.out.println("Maior valor " + maior);
        System.out.println("Menor Valor: " + menor);
        
        System.out.println("Valores inseridos:");
        for (int num : numeros) {
          System.out.print(num);
          if (num == maior) {
            System.out.println(" Maior");
          } else if (num == menor) {
            System.out.println(" Menor");
          }
          System.out.println();
        }
        scanner.close();
        
    }
}
