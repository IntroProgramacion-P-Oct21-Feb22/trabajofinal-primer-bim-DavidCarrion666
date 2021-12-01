/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Elaborar un algoritmo que calcule e imprima la suma 1 + 1/2 + 1/3 +
        1/4 ... + 1/100. Ejercicio  */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite = 100;
        int numerador = 1;
        int denominador = 2;
        String signo = "+" ;
        String cadena = "";

        do {
            
            cadena = String.format("%s%s %d/%d ", 
                    cadena,
                    signo,
                    numerador, 
                    denominador);
            denominador = denominador + 1;

        } while (denominador <= limite);

        System.out.println("1" + " " + cadena);

    }

}
