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
            if(camiones[i] instanceof Escolar && ((Escolar)camiones[i]).getTotPasajeros()>=totalNinos){
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
        String resp;
        int i=0;
        
        while(i<totalCam && camiones[i].getPlacas()!=placa ){
            i++;
        }
        if(i!=totalCam)
            resp="El camion esta disponible, el tipo de unidad es: "+ camiones[i].getClass().getSimpleName();
        else
            resp="No esta disponible ese camion";
            
        return resp;
    }
        
    //inciso 4
    public String camionesEscolaresDisponibles(){
        StringBuilder cad= new StringBuilder();
        
        for(int i=0;i<totalCam;i++){
            if(camiones[i]instanceof Escolar){
                if(((Escolar)camiones[i]).getTotPasajeros()>=20){
                    if(((Escolar)camiones[i]).isLugarProyecto())
                        cad.append(camiones[i].getPlacas()+"\t");
                }
            }
        }
        
        return cad.toString();
    }
    
    //inciso 5
    public int totalMarcaTurismo (String marca, double cantKM, double cantX){
        int total=0;
        
        for(int i=0;i<totalCam;i++){
            if(camiones[i]instanceof Turismo && camiones[i].getMarca().equalsIgnoreCase(marca))
                if(((Turismo)camiones[i]).isServiBar())
                    if(((Turismo)camiones[i]).calculaCostoServicio(cantKM)<=cantX)
                        total++;       
        }
        
        return total;
    }

            
    
}
