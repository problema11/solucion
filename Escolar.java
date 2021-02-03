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
public class Escolar extends DePasajeros {
    private boolean lugarProyecto;
    private final int maxNiños = 20; 

    public Escolar() {
        super();
    }

    public Escolar( String marca, String numMotor, String placas, double costoCamion, 
            int totalPasaj, boolean lugarProyecto) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.lugarProyecto = lugarProyecto;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public double calculaCostoServicio(){
        return (.0001*super.getCostoCamion()/super.getTotalPasaj())*250;
    }
    
    public int getMaxNiños(){
        return maxNiños;
    }
}
