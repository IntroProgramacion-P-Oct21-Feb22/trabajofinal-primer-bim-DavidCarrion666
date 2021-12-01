/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double anguloA;
        double anguloB;
        double anguloC;
        String tipo_triangulo = "";

        System.out.println("ingrese el valor del angulo A");
        anguloA = entrada.nextDouble();

        System.out.println("ingrese el valor del angulo B");
        anguloB = entrada.nextDouble();

        System.out.println("ingrese el valor del angulo C");
        anguloC = entrada.nextDouble();

        if (anguloA == 90 || anguloB == 90 || anguloC == 90) {
            tipo_triangulo = "rectangulo";
        } else {
            if (((anguloA > (90)) && (anguloA <= (180)))
                        || ((anguloB > (90)) && (anguloB <= (180)))
                        || ((anguloC > (90)) && (anguloC <= (180)))) {
                    tipo_triangulo = "obtusangulo";
            } else {
                if (anguloA < 90 || anguloB < 90 || anguloC < 90) {
                tipo_triangulo = "Acutangulo";
                }
            }
        }

        System.out.printf("el triangulo es tipo:\n" + "%s\n",
                tipo_triangulo);
    }

}
