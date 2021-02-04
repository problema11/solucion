/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico11;

public class Escolar extends DePasajeros {
    private boolean lugarProyecto;

    public Escolar() {
        super();
    }

    public Escolar( String marca, String numMotor, String placas, double costoCamion, 
            int totalPasaj, boolean lugarProyecto) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.lugarProyecto = lugarProyecto;
    }
    
    public int getTotPasajeros(){
        return super.getTotPasajeros();
    }
    
    public boolean isLugarProyecto() {
        return lugarProyecto;
    }
    
    public double calculaCostoServicio(){
        return (.0001*super.getCostoCamion()/super.getTotalPasaj())*250;
    }

    @Override
    public String toString() {
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        cad.append("Lugar proyecto: "+lugarProyecto+"\n");
        
        return cad.toString();
    }
    
}
