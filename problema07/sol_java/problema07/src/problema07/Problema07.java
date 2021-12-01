/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero;
        int contador = 2;

        int val1 = 2;
        int val2 = 0;
        int total = 0;
        int cadena= 0;
      

        System.out.println("ingrese el numero par");
        numero = entrada.nextInt();

        if (numero > 2 && numero % 2 == 0) {
            System.out.println("La suma de los numeros pares hasta el numero"
                    + " ingresado es");

            while (contador <= numero) {
                contador = contador + 2;

                val1 = 2;
                val2 = val2 + 1; // 1 2 3 4
                total = val1 *val2; // 2 4 6 8
                cadena = total + cadena ; //2 6 12 20
                
            }
            
            System.out.println(cadena);
        } else {
            System.out.println("Numero ingresado erróneo");
        }

    }
}
