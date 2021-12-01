/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema08;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Elaborar un algoritmo que permita leer una medida (N) en número de 
        metros y que imprima una tabla de equivalencias a yardas, pulgadas y 
        pies, desde 1 metro hasta N metros de uno en uno. Equivalencias: 
        1 pie = 12 pulgadas, 1 yarda = 3 pies, 1 pulgada = 2.54 cm, 
        1 metro = 100 cm. Se debe imprimir la tabla siguiente:

                    Metros	Yardas     Pulgadas	Pies
                        1	  ?	      ?	         ?
                        2	  ?	      ?	         ?
                        3	  ?	      ?	         ?
                       ...	  ?	      ?	         ?
                        N	  ?	      ?	         ?      */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double medida_metros;

        double yarda = 0;
        double pulgadas = 0;
        double pies = 0;
        double metros = 0;

        System.out.println("Ingrese la la medida en metros");
        medida_metros = entrada.nextDouble();

        do {
            metros = metros + 1;
            yarda = metros * 1.094;
            pulgadas = metros * 39.37;
            pies = metros * 3.281;

            System.out.printf("metros=%s\t\t yardas=%.2f\t\t pulgadas=%.2f\t\t"
                    + "pies=%.2f\n", metros, yarda, pulgadas, pies);

        } while (metros < medida_metros);

    }

}
