/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico11;

/**
 *
 * @author robertodelriosalgado
 */
public abstract class DePasajeros extends Camion{
    private int totalPasaj;

    public DePasajeros() {
        super();
    }

    public DePasajeros(String marca, String numMotor, String placas, double costoCamion, int totalPasaj) {
        super(marca, numMotor, placas,costoCamion);
        this.totalPasaj=totalPasaj;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nTotal de pasajeros: " + totalPasaj;
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }

    
    public double calculaCostoServicio(double cantKm){ //el parametro es la cantidad de kilometros a recorrer
        return (.0001*super.getCostoCamion()/totalPasaj)*cantKm;
    }
    
    
    
    
}
