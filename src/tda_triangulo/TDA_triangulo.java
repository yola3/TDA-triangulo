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
public class TDA_triangulo {

   
    public static void main(String[] args) {
    Triangulo triangulo = new Triangulo(8,10,9); // aqui cree un objeto y se instancia
        
        float perimetro; // declaro la variable donde se va almacenar el resultado del perimetro
        perimetro = triangulo.perimetro(); // aqui mando llamar el metodo que quiero para que calcule mi perimetro
        System.out.println("el perimetro del triangulo es:" + perimetro); //envio un mensaje y mando a llamar la variable donde almacenë mis datos 
        float area;//declaro la variable donde se va almacenar el resultado del perimetro
        area = triangulo.area();// aqui mando llamar el metodo que quiero para que calcule el area del rectangulo
        System.out.println("el area del triangulo es:" + area);//envio un mensaje y mando a llamar la variable donde almacenë mis datos 
        

       
    }
     }
    

