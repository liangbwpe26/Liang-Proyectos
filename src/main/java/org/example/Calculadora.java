package Calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {
        double numero1, numero2;
        int opcion;
        boolean condicion= true;

        while(condicion){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    """
                            CALCULADORA INGRESA LA OPCION A REALIZAR:
                            1- SUMA\s
                            2- RESTA\s
                            3- MULTIPLICAR\s
                            4- DIVIDIR\s
                            5- RESTO\s
                            6- SALIR"""

            ));
            switch (opcion){
                case 1->{
                    numero1=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    double suma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "LA SUMA ES: "+ suma);

                }
                case 2->{
                    numero1=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    double resta = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "LA RESTA ES: "+ resta);

                }
                case 3->{
                    numero1=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    double multiplicar = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "LA MULTIPLICACIÓN ES: "+ multiplicar);


                }
                case 4->{
                    numero1=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    if (numero2==0){
                        JOptionPane.showMessageDialog(null,"LA DIVISION POR CERO NO ES POSIBLE, INGRESE OTRO NÚMERO: ");

                    }else {
                        double division = numero1 / numero2;
                        JOptionPane.showMessageDialog(null, "LA DIVISIÓN ES: "+ division);
                    }


                }
                case 5->{
                    numero1=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÚMERO: "));
                    numero2=Double.parseDouble(JOptionPane.showInputDialog("INGRESA UN NÙMERO: "));
                    double resto = numero1 % numero2;
                    JOptionPane.showMessageDialog(null, "EL RESTO ES: "+ resto);


                }
                case 6->{
                    condicion=false;
                    JOptionPane.showMessageDialog(null, "***SALISTE DEL SISTEMA***");


                }

            }
        }
    }
}