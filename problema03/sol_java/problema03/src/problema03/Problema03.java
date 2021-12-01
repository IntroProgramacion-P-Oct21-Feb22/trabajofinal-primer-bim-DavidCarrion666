/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        double cuota;
        int tipo_empleado;
        int numero_horas;
        double sueldo = 0;

        System.out.println("ingrese el nombre del empleado");
        nombre = entrada.nextLine();

        System.out.println("ingrese el tipo de empleado");
        tipo_empleado = entrada.nextInt();

        System.out.println("ingrese el numero de horas trabajadas");
        numero_horas = entrada.nextInt();

        System.out.println("ingrese la cuota a pagar por hora");
        cuota = entrada.nextDouble();

        if (tipo_empleado == 1) {{
        if ((numero_horas > 40)){
            cuota = numero_horas * 1.5 * cuota;
            sueldo = cuota;
        }else {
        System.out.println("no alzanca las horas requeridas");}
        }
        } else {
            if (tipo_empleado == 2) {
                cuota = numero_horas * 2 * cuota;
                sueldo = cuota;
            } else {
                if (tipo_empleado == 3) {
                    cuota = numero_horas * 2.5 * cuota;
                    sueldo = cuota;
                } else {
                    if (tipo_empleado == 4) {
                        cuota = numero_horas * 3 * cuota;
                        sueldo = cuota;
                    } else {
                        System.out.println("el tipo de empleado es incorrecto");
                    }
                }
            }

        }
                System.out.printf("el sueldo a pagar es de:\n" + "%s\n",
                sueldo);
    }

}
