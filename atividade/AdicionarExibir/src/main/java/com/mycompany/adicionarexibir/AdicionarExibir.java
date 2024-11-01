/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adicionarexibir;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author davil
 */
public class AdicionarExibir {
    
    public static boolean buscarFruta(ArrayList<String> frutas, String fruta){
      return frutas.contains(fruta);
    }
    
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("Abacaxi");
        frutas.add("Banana");
        frutas.add("Abacate");
        frutas.add("Melancia");
        frutas.add("Uvas");
        
        String frutaBuscada = "Abacate";
        
        if (buscarFruta(frutas, frutaBuscada)) {
          System.out.println(frutaBuscada + " esta na lista");
        } else {
            
          System.out.println(frutaBuscada + "não esta na lista");
        }
    }
}
