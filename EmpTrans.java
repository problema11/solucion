/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico11;

public class EmpTrans {
    private String nomEmp;
    private Camion[] camiones;
    private int totalCam;
    private final int MAX=10;

    public EmpTrans() {
        camiones=new Camion[MAX];
        totalCam=0;
    }

    public EmpTrans(String nomEmp) {
        this();
        this.nomEmp = nomEmp;
    }
    
    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, 
            int totalPasaj, boolean asientoCama, boolean serviBar){ //alta de turismo
        boolean resp=false;

        if (totalCam<MAX){ 
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

        if (totalCam<MAX){
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
   //Inciso 2  
     public String buscaEscolares(int totalNiños, int cantCamiones){
        int contador=0;
        String resp="No es posible satisfacer la demanda";
        
        for(int i=0; i<totalCam; i++){
            if(camiones[i] instanceof Escolar && ((Escolar)camiones[i]).getMaxNiños()>=cantCamiones){
                contador++;
            }
        }
        if(contador>=cantCamiones){
            resp="Si es posible satisfacer la demanda";
        }
        return resp;
    }
    
    
}
