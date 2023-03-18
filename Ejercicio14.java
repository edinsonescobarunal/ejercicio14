// Capítulo 4: Estructura decisión lógica - Ejercicio 14.

import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /* vD -> ventas del departamento 1, 2 y 3.
           salario -> salario general de los vendedores, ya que Las nóminas de los tres departamentos son iguales.
           vT -> venta total.
           sVD -> salario de los vendedores de cada departamento 1, 2 y 3 con el porcentaje del 20%.
           pV -> porcetaje del 33% de las venta total.
        */

        double vD1, vD2, vD3, salario, sVD1, sVD2, sVD3, vT, pV;

        System.out.println("Ingrese las ventas del departamento 1:");
        vD1 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2:");
        vD2 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3:");
        vD3 = entrada.nextDouble();
        System.out.println("Ingrese el salario que reciben los vendedores en cada departamento.(Las nóminas de los tres departamentos son iguales)");
        salario = entrada.nextDouble();

        vT = vD1 + vD2 + vD3;
        pV = vT * 0.33;

        if (vD1 > pV){
            sVD1 = salario + (salario * 0.2);
        }
        else{
            sVD1 = salario;
        }

        if (vD2 > pV){
            sVD2 = salario + (salario * 0.2);
        }
        else{
            sVD2 = salario;
        }

        if (vD3 > pV){
            sVD3 = salario + (salario * 0.2);
        }
        else{
            sVD3 = salario;
        }

        System.out.println("SALARIO VENDEDORES DEPARTAMENTO 1:" + " " + sVD1);
        System.out.println("SALARIO VENDEDORES DEPARTAMENTO 2:" + " " + sVD2);
        System.out.println("SALARIO VENDEDORES DEPARTAMENTO 3:" + " " + sVD3);

    }

}
