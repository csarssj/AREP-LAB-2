package edu.escuelaing.arem.calculator;

import edu.escuelaing.arem.linkedList.LinkedList;

/**
 * Clase que realiza los calculos de la medio y la desviacion estandar
 *
 * @author ceseg
 */
public class Calculator {
    public Calculator(){}

    /**
     * Este metodo permite calcular la media de una lista
     * @param numbers// este es de tipo LinkedList
     * @return
     */
    public Double mean(LinkedList numbers){
        Double mean;
        double c = 0;
        for(int i=0; i<numbers.getSize();i++){
            c += numbers.get(i);
        }
        mean = c / numbers.getSize();
        return mean;
    }
    /**
     * Este metodo permite calcular la Desviacion de una lista
     * @param numbers// este es de tipo LinkedList
     * @return double
     */
    public Double desviationStandar(LinkedList numbers){
        Double deviation;
        double c = 0;
        double mean = mean(numbers);
        for(int i=0; i<numbers.getSize();i++){
            c += Math.pow((numbers.get(i) - mean),2);
        }
        deviation = Math.sqrt((c / (numbers.getSize() - 1)));
        return deviation;
    }
}
