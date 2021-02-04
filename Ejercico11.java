/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico11;

public class Ejercico11 {
    
    public static void main(String[] args) {
        EmpTrans emp=new EmpTrans ("El rápido");
        
        emp.altaCamion("Mercedes", "5432g", "d355", 500000, 20, true, true);
        emp.altaCamion("Mercedes", "54324g", "d3545", 5000000, 40, true, false);
        emp.altaCamion("audi", "543gt", "t564", 200000, 30, true);
        emp.altaCamion("audi", "5432gg", "d354355", 500000, 20, false, true);
        emp.altaCamion("LOl", "5432g3g", "df355", 500000, 20, true, false);
        
        System.out.println(emp.buscaTurismo(10, 300));
    }
    
}
