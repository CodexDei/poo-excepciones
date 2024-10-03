package org.codexdei.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {

    public static void main(String[] args) {

            try{

                        Calculadora cal = new Calculadora();

                        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo"));
                        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor"));

                        double division = cal.dividir(dividendo, divisor);

                        System.out.println(division);

                        String dividendo2 = JOptionPane.showInputDialog("Ingrese el divisor string");
                        String divisor2 = JOptionPane.showInputDialog("Ingrese el divisor string");

                        double division2 = cal.dividir(dividendo2, divisor2);

                        System.out.println(division2);

            } catch (NumberFormatException nfe){

                System.err.println("Ingrese un valor numerico. Error: " + nfe.getMessage());
                nfe.printStackTrace();
                main(args);

            } catch (DivisionPorZeroExcepcion dpze){

                System.err.println("No se puede dividir por cero. Error: " + dpze.getMessage());
                dpze.printStackTrace();
                //reinicia el programa
                main(args);

            } catch (FormatoNumException fne) {

                System.err.println("Formato invalido: " + fne.getMessage());
                fne.printStackTrace();
                main(args);


            } finally {

                System.out.println("Me ejecuto pase lo que pase  jajaja");
            }
    }
}
