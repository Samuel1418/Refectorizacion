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

    private float kilometros;
    private float litros;
    private float velocidadeMedia;
    private float precioGasolina;
    private float tiempo;

    public Propiedades() {
    }

    public Propiedades(float a, float b, float c, float d, float e, float f) {
        litros = a;
        precioGasolina = b;
        velocidadeMedia = c;
        precioGasolina = d;
        tiempo = e;
        kilometros = f;
    }

    public float getTempo() {
        float tempo = (kilometros / velocidadeMedia); //se le pone otro nombre que no sea el de arriba y con el return es como si se lo diesemos
        return tempo;

    }

    public float consumoMedio() {
        return ((this.litros / this.precioGasolina) * 100); //se puede hacer asi para simplificar
    }

    public float consumoEuros() {
        float euros = (precioGasolina * kilometros / 100);

        return euros;
    }

    public void setKilometros(float km) { // en los set hay que darles el valor
    }

    public void setLitros(float lt) {
        this.litros = lt;
    }

    public float getLitros() { //A los get no se le ponen parametros en los parentesis
        return litros;
    }

    public void setVelocidadMedia(float vMed) {
        this.velocidadeMedia = vMed;
    }

    public float getVelocidadMedia() {
        return kilometros / tiempo;
    }

    public void setGas(float pGas) {
        this.precioGasolina = pGas;
    }

}
