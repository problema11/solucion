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
    public String toString() {
        String cad="";
        if (serviBar==true && asientoCama==true){
            cad=super.toString()+ "\nAsientocama: " + "Sí" + "\nServiBar: " + "Sí";
        }
        else if (serviBar==true && asientoCama!=true){
            cad=super.toString()+ "\nAsientocama: " + "No" + "\nServiBar: " + "Sí";
        }
        else if (serviBar!=true && asientoCama==true){
            cad=super.toString()+ "\nAsientocama: " + "Sí" + "\nServiBar: " + "No";
        }
        else if (serviBar!=true && asientoCama!=true){
            cad=super.toString()+ "\nAsientocama: " + "No" + "\nServiBar: " + "No";
        }
        
        return  cad;
    }
    
    public double calculaCostoServicio(double cantKm){
        double costo;
        if (asientoCama==true && serviBar==true){
            costo=super.calculaCostoServicio(cantKm);
            costo=(costo*.05)*.05;
        }
        else if (asientoCama==true || serviBar==true){
            costo=super.calculaCostoServicio(cantKm);
            costo=costo*.05;
        }
        else{
            costo=super.calculaCostoServicio(cantKm);
        }
        return costo;
    }    
    
    
    

    
}
