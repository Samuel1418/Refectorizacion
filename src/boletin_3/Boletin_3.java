/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_3;

/**
 *
 * @author Samuel
 */
public class Boletin_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Propiedades consumo= new Propiedades(); //constructor sin parametros
      consumo.setLitros(50f);
      consumo.setGas(1.57f);
      int lt=50;
      int vv=120;
      Propiedades consumo1= new Propiedades(50f,1.57f);
      System.out.println("El consumo medio es "+consumo.consumoMedio());
      System.out.println("El consumo en litros es");
      consumo1.setLitros(lt);
      System.out.println("La velocidad media es ");
      consumo1.setvMed(vv);
      
    }
}
