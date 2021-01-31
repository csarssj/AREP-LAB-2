package edu.escuelaing.arem.calculator;

import edu.escuelaing.arem.linkedList.LinkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *Clase para la lectura e imprmimir el calculo de la media y la desviación estandar
 *
 * @author Ceseg
 */
public class Reader {
    private Calculator calculator;
    private Double mean;
    private Double mean2;
    private Double des;
    private Double des2;

    public Reader(){
        calculator = new Calculator();
        mean = new Double (0);
        mean2 = new Double (0);
        des = new Double (0);
        des2  = new Double (0);
    };

    /**
     * Metodo encargado de la impresion del calculo de la media y la desviasion
     *
     * @param file archivo a leer
     */
    public void fileReader(File file){
        LinkedList col1 = new LinkedList();
        LinkedList col2 = new LinkedList();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = br.readLine())!=null) {
                String[] par = line.split(" ");
                Double first = Double.parseDouble(par[0]);
                Double second = Double.parseDouble(par[1]);
                col1.append(first);
                col2.append(second);
            }
            br.close();
            mean = calculator.mean(col1);
            mean2 = calculator.mean(col2);
            des = calculator.desviationStandar(col1);
            des2 = calculator.desviationStandar(col2);
            System.out.println("La media calculada es: "+String.format("%.2f",mean)+" con una desviacion de: "+String.format("%.2f",des));
            System.out.println("La media calculada es: "+String.format("%.2f",mean2)+" con una desviacion de: "+String.format("%.2f",des2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }

    public Double getMean2() {
        return mean2;
    }

    public void setMean2(Double mean2) {
        this.mean2 = mean2;
    }

    public Double getDes() {
        return des;
    }

    public void setDes(Double des) {
        this.des = des;
    }

    public Double getDes2() {
        return des2;
    }

    public void setDes2(Double des2) {
        this.des2 = des2;
    }
}
