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
public class Propiedades {
    private float km;
    private float lt;
    private float vMed;
    private float pGas;
    private float tiempo;
    
public Propiedades(){}

public Propiedades (float a,float b,float c,float d, float e,float f){
lt=a;
pGas=b;
vMed=c;
pGas=d;
tiempo=e;
km=f;
}


public  float getTempo(){
float tempo= (km/vMed); //se le pone otro nombre que no sea el de arriba y con el return es como si se lo diesemos
return tempo;

}

 public float consumoMedio(){
    return  ((this.lt/this.pGas)*100); //se puede hacer asi para simplificar
}
 
 
public float consumoEuros(){
float euros= (pGas*km/100);

return euros;
}
        
public void setKms (float km){ // en los set hay que darles el valor
}
public void setLitros(float lt){
this.lt=lt;
}
public float getLitros(){ //A los get no se le ponen parametros en los parentesis
return lt;
}

public void setvMed(float vMed){
    this.vMed=vMed;
}

public float getvMed(){
return km/tiempo;
}

public void setGas(float pGas){
this.pGas=pGas;
}


}