git remote add origin https://github.com/w1lmaxter/tercerParcial.git
git branch -M main
git push -u origin main



//aca estamos preparandonos para el parcial
package com.mycompany.cliclos_while;

import javax.swing.JOptionPane;

public class Cliclos_While {

    int numero;

    public static void main(String[] args) {
        System.out.println(" Agregando texto al codigo");
        int numero, cuadrado;/*podemos declarar la variable tipo double para usar numeros grandes,
          pero en la linea 62 la igualamos a (Int)para ahorrar memoria*/
        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite un numero "));
        while (numero >= 0) {//mientras numero sea "0" o positivo
            cuadrado = (int) Math.pow(numero, 2); // necesitamos que le saque el cuadrado al numero solicitado
            JOptionPane.showMessageDialog(null, "El numero " + numero + " elevado al cuadrado es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite otro numero"));//le solicitamos al usuario que digite otro numero
        }
        /**
         * Ejercicio 2: Leer un número e indicar si es positivo o negativo,el
         * proceso se repetira hasta que se introduzca un "0".
         */
        int num2;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero: "));
        while (numero < 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo! ");
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo! ");
            }//se deja un comentario en git hube

            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero: "));
        }
    }
}
