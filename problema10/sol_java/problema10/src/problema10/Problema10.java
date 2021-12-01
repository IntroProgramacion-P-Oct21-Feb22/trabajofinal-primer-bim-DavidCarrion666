/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Realice un algoritmo que lea un número de datos y calcule la media y 
          la varianza de los mismos. El usuario decide cuando no ingresar más
          números. */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double contador = 0;
        double entrada_datos = 0;
        int numero = 0;
        String salida;
        double media = 0;
        int variedad =0;
        double contador1 = 0;
        boolean bandera = true;
        double dato = 0;
        double numero_comparacion = 0;

        while (bandera) {
            System.out.println("ingrese los datos requeridos");
            entrada_datos = entrada.nextDouble();
            contador = contador + 1;

            {
                if (entrada_datos != numero_comparacion) {
                    contador1 = contador1 + 1;
                } else {
                    contador1 = contador1 + 0;
                }
            }
            dato = dato + entrada_datos;
            System.out.println("Ingrese si para salir del proceso");
            salida = entrada.nextLine();

            salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
                   
        }
        media = dato / contador;
        System.out.printf("la media es %s\n", media);
        System.out.printf("la  variedad de datos es %s\n", contador1);

    }

}
