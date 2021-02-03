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

    public int getTotalPasaj() {
        return totalPasaj;
    }

    public double calculaCostoServicio(double cantKm){ //el parametro es la cantidad de kilometros a recorrer
        return (.0001*super.getCostoCamion()/totalPasaj)*cantKm;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("\nCamion de pasajeros\n");
        cad.append(super.toString());
        cad.append("Total de pasajeros: "+totalPasaj+"\n");
        
        return cad.toString();
    }

}
