/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Elaborar un algoritmo que permita leer 3 números e imprima el mayor.
           Debe validar que sean diferentes, es decir, si hay números iguales 
           debe enviar un mensaje de error. */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double numero1;
        double numero2;
        double numero3;
        double respuesta = 0;

        System.out.println("ingrese el valor del primer numero");
        numero1 = entrada.nextDouble();

        System.out.println("ingrese el valor del segundo numero");
        numero2 = entrada.nextDouble();

        System.out.println("ingrese el valor del tercer numero");
        numero3 = entrada.nextDouble();

        if ((numero1 == numero2) || (numero1 == numero3)
                || (numero2 == numero3)) {
            System.out.println("los numeros ingresados no son validos");
        } else {
            if ((numero1 > numero2) && (numero1 > numero3)) {
                respuesta = numero1;
            } else {
                if ((numero2 > numero1) && numero2 > (numero3)) {
                    respuesta = numero2;
                } else {
                    if ((numero3 > numero1) && (numero3 > numero2)) {
                        respuesta = numero3;
                    }
                }

            }

        }
        System.out.printf("la respuesta es:\n" + "%s\n",
                respuesta);
    }
}
