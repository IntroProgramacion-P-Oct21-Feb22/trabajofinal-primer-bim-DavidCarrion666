/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valor_x;
        double valor_y;
        String coordenadas;
        String cuadrante = "";

        System.out.println("ingrese el valor de X");
        valor_x = entrada.nextDouble();

        System.out.println("ingrese el valor de Y");
        valor_y = entrada.nextDouble();

        coordenadas = String.format("(%s,%s)", valor_x, valor_y);

        if ((valor_x > 0) && (valor_y > 0)) {
            cuadrante = "cuadrante I";
        } else {
            if ((valor_x < 0) && (valor_y > 0)) {
                cuadrante = "cuadrante II";
            } else {
                if ((valor_x < 0) && (valor_y < 0)) {
                    cuadrante = "cuadrante III";
                } else {
                    if ((valor_x > 0) && (valor_y < 0)) {
                        cuadrante = "cuadrante IV";
                    }
                }
            }
        }
        System.out.printf("Las coordenadas ingresadas son:%s\nEstan ubicadas"
                + "en el cuadrante: %s\n", coordenadas, cuadrante);
    }
}
