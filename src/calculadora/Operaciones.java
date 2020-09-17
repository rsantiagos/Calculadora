/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Romualdo
 */
public class Operaciones {
    
    
    public Double[] addtoArray(Double array[], Double num){
        
        List<Double> miArrayList = new ArrayList<>(Arrays.asList(array));
        miArrayList.add(num);
        Double[] nuevoArray = new Double[miArrayList.size()];
        //Aquí convertimos la lista a arreglo nuevamente
        nuevoArray = miArrayList.toArray(nuevoArray);
        return nuevoArray;
        
      }
    
    public Double suma(Double numsSuma[]){
        Double resultado = 0.0;
        for (int i = 0; i < numsSuma.length; i++) {
            resultado += numsSuma[i];
            System.out.println(numsSuma[i]);
            //JOptionPane.showMessageDialog(null, double1);
        }
        return resultado;
    }
}
