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
public class Turismo extends DePasajeros{
    private boolean asientoCama;
    private boolean serviBar;

    public Turismo() {
        super();
    }

    public Turismo(String marca, String numMotor, String placas, double costoCamion, 
            int totalPasaj, boolean asientoCama, boolean serviBar ) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }
    
    @Override
    public double calculaCostoServicio(double cantKm){
        double costo;
        
        costo=super.calculaCostoServicio(cantKm);
        if (asientoCama && serviBar)
            costo+=costo*0.1;
        else 
            if(asientoCama || serviBar)
                costo+=costo*0.05;
        
        return costo;
    }  
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        if(this.asientoCama)
            cad.append("Cuenta con asientos cama\n");
        else
            cad.append("No cuenta con asientos cama\n");
        if(this.serviBar)
            cad.append("Cuenta con serviBar\n");
        else
            cad.append("No cuenta con serviBar\n");
        
        return cad.toString();    
    }
  
}
