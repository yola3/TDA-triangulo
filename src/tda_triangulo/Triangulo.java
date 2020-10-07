/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_triangulo;

/**
 *
 * @author casa
 */
public class Triangulo {

    int lado;

    private int base;// declaro mis atributos y de que tipos de datos es 

    private float haltura;// declaro mis atributos y de que tipos de datos es
    // metodo constructor

    public Triangulo(int L1, int b, float h) { // el metodo constructor con su parametros que me se servira para inicializar mis atributos
        lado = L1;
        base = b;
        haltura = h;
    }

    //metodo get la que me perimte consultar mis datos o mostrar
    public float getHlado() {
        return (this.lado);
    }

    public int getBase() {
        return (this.base);
    }

    public float getHaltura() {
        return (this.haltura);
    }

    //agrego este metodo set para que pueda modicar mis datos
    public void setlado(int lado) {
        this.lado = lado;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHaltura(float haltura) {
        this.haltura = haltura;
    }

    public float perimetro() { // en este metodo meto ya la formula que es lo quiero calcular
        return (lado * 2 + base);
    }

    public float area() { // este metodo la voy a utilizar para calcular el area del triangulo
        return (base * haltura / 2);
    }

}
