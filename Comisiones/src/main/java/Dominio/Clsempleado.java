/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author W10
 */
public class Clsempleado {
    private int idEmpleado;
    private String nombre;
    private double Enero;
    private double Febrero;
    private double Marzo;
    

    @Override
    public String toString() {
        return  "idEmpleado=" +idEmpleado+ ", nombre=" + nombre + ", Enero=" + Enero + ", Febrero=" + Febrero + ", Marzo=" + Marzo + '}';
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

   

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEnero() {
        return Enero;
    }

    public void setEnero(double Enero) {
        this.Enero = Enero;
    }

    public double getFebrero() {
        return Febrero;
    }

    public void setFebrero(double Febrero) {
        this.Febrero = Febrero;
    }

    public double getMarzo() {
        return Marzo;
    }

    public void setMarzo(double Marzo) {
        this.Marzo = Marzo;
    }
    
    
}
