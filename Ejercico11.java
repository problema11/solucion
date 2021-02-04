/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico11;

public class Ejercico11 {
    
    public static void main(String[] args) {
        EmpTrans emp=new EmpTrans ("El rápido");
        
        if(emp.altaCamion("Mercedes", "5432g", "d355", 500000, 20, true, true))
            System.out.println("Alta exitosa");
        else
            System.out.println("Error en el alta");
        
        if(emp.altaCamion("Mercedes", "54324g", "d3545", 5000000, 40, true, false))
            System.out.println("Alta exitosa");
        else
            System.out.println("Error en el alta");
        
        if(emp.altaCamion("audi", "543gt", "t564", 200000, 30, true))
            System.out.println("Alta exitosa");
        else
            System.out.println("Error en el alta");
        
        if(emp.altaCamion("audi", "5432gg", "d354355", 500000, 20, true))
            System.out.println("Alta exitosa");
        else
            System.out.println("Error en el alta");
        
        if(emp.altaCamion("LOl", "5432g3g", "df355", 500000, 20, true, false))
            System.out.println("Alta exitosa");
        else
            System.out.println("Error en el alta");
        
        //inciso1
        System.out.println(emp.buscaTurismo(10, 300));
        System.out.println("_____________________________");
        //inciso2
        System.out.println(emp.buscaEscolares(15, 2));
        System.out.println("_____________________________");
        //inciso3
        System.out.println(emp.buscarPlaca("d355"));
        System.out.println(emp.buscarPlaca("t564"));
        System.out.println("_____________________________");
        //inciso4
        System.out.println(emp.camionesEscolaresDisponibles());
        System.out.println("_____________________________");
        //inciso5
        System.out.println(emp.totalMarcaTurismo("Mercedes",300, 5000));
        
    }
    
}
