/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;


public class Carro extends Vehiculo{
    String precio,color, puestos;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPuestos() {
        return puestos;
    }

    public void setPuestos(String puestos) {
        this.puestos = puestos  ;
    }
    
    public String Datos1(){
        return "Especificaciones Del Carro: "+"Marca: "+ marca +" Modelo: "+ modelo+" Color: "+ color+" Precio: "+precio+" Puestos: "+puestos ;
    }
}
