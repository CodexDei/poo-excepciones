package org.codexdei.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int dividendo, int divisor) throws DivisionPorZeroExcepcion{

        if (divisor == 0){

            throw new DivisionPorZeroExcepcion("Indeterminado, No se puede dividir por cero!!");
        }
        return dividendo / (double) divisor;
    }

    public double dividir(String dividendo, String divisor) throws
                                DivisionPorZeroExcepcion, FormatoNumException{

        try{

            int numero1 = Integer.parseInt(dividendo);
            int numero2 = Integer.parseInt(divisor);

            return this.dividir(numero1,numero2);

        }catch (NumberFormatException fne){

            throw new FormatoNumException("Ingrese un numero");
        }
    }
}
