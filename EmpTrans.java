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
    
    //alta de turismo
    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, 
            int totalPasaj, boolean asientoCama, boolean serviBar){ 
        boolean resp=false;

        if (totalCam<MAX){ 
            camiones[totalCam]=new Turismo (marca, numMotor,placas, costoCamion, totalPasaj,
                     asientoCama, serviBar);
            totalCam++;
            resp=true;
        }
        
        return resp;
    }

    //alta de escolar
    public boolean altaCamion(String marca, String numMotor, String placas, double costoCamion, 
            int totalPasaj, boolean lugarProyecto){
        boolean resp=false;

        if (totalCam<MAX){
            camiones[totalCam]=new Escolar (marca, numMotor,placas, costoCamion, totalPasaj,
                     lugarProyecto);
            totalCam++;
            resp=true;
        }
        
        return resp;
    }
    
    //inciso 1
    public String buscaTurismo(int numPasaj, double cantKm){
        StringBuilder cad=new StringBuilder();
        
        for (int i=0; i<totalCam; i++){
            if(camiones[i] instanceof Turismo && ((Turismo)camiones[i]).getTotPasajeros()>=numPasaj){
                cad.append("\n"+((Turismo)camiones[i]).toString());
                cad.append("\nEl costo del serivicio es: $"+((Turismo)camiones[i]).calculaCostoServicio(cantKm));
            }
        }
        if (cad.length()==0){
            cad.append("No hay opciones para ese número de pasajeros");
        }
        
        return cad.toString();
    }
    
   //Inciso 2  
    public String buscaEscolares(int totalNinos, int cantCamiones){
        int contador=0;
        String resp="No es posible satisfacer la demanda";
        
        for(int i=0; i<totalCam; i++){
            if(camiones[i] instanceof Escolar && ((Escolar)camiones[i]).getMaxNinos()>=cantCamiones){
                contador++;
            }
        }
        if(contador>=cantCamiones){
            resp="Si es posible satisfacer la demanda";
        }
        return resp;
    }
    
    //Inciso 3
    public String buscarPlaca(String placa){
        String resp=null;
        int i=0;
        while(i<totalCam){
            if(camiones[i].getPlacas()==placa){
                resp="El camion si esta disponible, el tipo de unidad es: " + camiones[i].getClass().getSimpleName();
                i++;
            }
            else{
                resp="No esta disponible ese camion";
                i++;
            }
        }
        return resp;
    }
    
    //Inciso 5
    public int totalMarcaTurismo (String marca, double costoBar, double cantKM){
        int total=0;
        int i=0;
        
        while(i<totalCam)
            if(camiones[i] instanceof Turismo && ((Turismo)camiones[i]).get
    
}
