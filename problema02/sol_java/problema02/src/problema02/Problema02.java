/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* En un almacén de venta de trajes, si se compra uno se hace el 20% de
        descuento, si se compran 2, el 25%, si se compran 3, el 40%, y si compra
        más de 3, el 50%. Elaborar un algoritmo que lea la cantidad de trajes 
        y el precio unitario (todos tienen el mismo precio) e imprima el 
        subtotal por pagar, el descuento y el total por pagar.*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double descuento1;
        double descuento2;
        double descuento3;
        double descuento4;

        double porcentaje1 = 20;
        double porcentaje2 = 25;
        double porcentaje3 = 40;
        double porcentaje4 = 50;

        int cantidadtrajes;
        double costo_trajes;
        double valortotal;
        double subtotal;
        double descuento_realizado;

        System.out.println("ingrese la cantidad de trajes");
        cantidadtrajes = entrada.nextInt();
        System.out.println("ingrese el precio de los trajes");
        costo_trajes = entrada.nextDouble();

        subtotal = costo_trajes * cantidadtrajes;

        if (cantidadtrajes == 1) {
            descuento1 = (porcentaje1 * subtotal) / 100;
            valortotal = subtotal - descuento1;
            descuento_realizado = porcentaje1;
        } else {
            if (cantidadtrajes == 2) {
                descuento2 = (porcentaje2 * subtotal) / 100;
                valortotal = subtotal - descuento2;
                descuento_realizado = porcentaje2;
            } else {
                if (cantidadtrajes == 3) {
                    descuento3 = (subtotal * porcentaje3) / 100;
                    valortotal = subtotal - descuento3;
                    descuento_realizado = porcentaje3;

                } else {
                    descuento4 = subtotal * porcentaje4 / 100;
                    valortotal = subtotal - descuento4;
                    descuento_realizado = porcentaje4;

                }

            }
        }
        System.out.printf("El subtotal que debe pagar es %s\nEl descuento "
                + "realizado es de %s\nEl total a pagar es de %s\n", subtotal, 
                descuento_realizado + "%", valortotal);

    }

}
