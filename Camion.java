/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema11;

import java.util.Objects;

/**
 *
 * @author aldahir
 */

public abstract class Camion {
    private String marca;
    private String numMotor;
    private String placas;
    private double costoCamion;
    
    public Camion(){    
    }

    public Camion(String marca, String numMotor, String placas,double costoCamion) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion=costoCamion;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public String getPlacas() {
        return placas;
    }

    public double getCostoCamion() {
        return costoCamion;
    }
    
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("Marca: "+marca+"\n");
        cad.append("Numero de motor: "+numMotor+"\n");
        cad.append("Placas: "+placas+"\n");
        cad.append("Costo del camión: "+costoCamion+"\n");
        
        return cad.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Camion other = (Camion) obj;
        if (!Objects.equals(this.placas, other.placas)) {
            return false;
        }
        return true;
    }  
}
