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
public class EmpTrans {
    private String nomEmp;
    private Camion[] camiones;
    private int totalCam;
    private final int Max;

    public EmpTrans() {
        Max=10;
        camiones=new Camion[Max];
        totalCam=0;
    }

    public EmpTrans(String nomEmp) {
        this();
        this.nomEmp = nomEmp;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, 
            int totalPasaj, boolean asientoCama, boolean serviBar){ //alta de turismo
        boolean resp=false;

        if (totalCam<Max){ 
            camiones[totalCam]=new Turismo (marca, numMotor,placas, costoCamion, totalPasaj,
                     asientoCama, serviBar);
            totalCam++;
            resp=true;
        }
        return true;
    }

    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, 
            int totalPasaj, boolean lugarProyecto){
        boolean resp=false;

        if (totalCam<Max){
            camiones[totalCam]=new Escolar (marca, numMotor,placas, costoCamion, totalPasaj,
                     lugarProyecto);
            totalCam++;
            resp=true;
        }
        return true;
    }
    
    public String buscaTurismo(int numPasaj, double cantKm){
        StringBuilder cad=new StringBuilder();
        int pos=-1;
        
        for (int i=0; i<totalCam; i++){
            if(camiones[i] instanceof Turismo && ((Turismo)camiones[i]).getTotalPasaj()==numPasaj){
                cad.append("\n"+((Turismo)camiones[i]).toString()+"\nEl costo del serivicio es: $"+
                        ((Turismo)camiones[i]).calculaCostoServicio(cantKm));
            }
        }
        if (cad.length()==0){
            cad.append("No hay opciones para ese numero de pasajeros");
        }
        return cad.toString();
    }
     
    
    
    
}
