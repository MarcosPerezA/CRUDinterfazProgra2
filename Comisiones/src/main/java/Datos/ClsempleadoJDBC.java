/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Clsempleado;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author W10
 */
public class ClsempleadoJDBC {
    private static final String SQL_SELECT="SELECT * FROM empleados";
    private static final String SQL_INSERT="insert into empleados(nombre,Enero,Febrero,Marzo) values(?,?,?,?);";
    private static final String SQL_UPDATE="UPDATE empleados set nombre=?,Enero=?,Febrero=?,Marzo=? where idEmpleados=?";
    private static final String SQL_DELETE="DELETE FROM empleados where idEmpleados=?";
    
    
    
    //Seleccionar info
    
    
    public List<Clsempleado> empleado(){    
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        Clsempleado empleado =null;
        List<Clsempleado> empleados=new ArrayList<Clsempleado>();
        
        
        
        try {
            con=ClsConexion.getConnection();
            stmt=con.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            while(rs.next()){
                int idEmpleado= rs.getInt("idEmpleados");
                String nombre=rs.getString("nombre");
                double Enero=rs.getDouble("Enero");
                double Febrero=rs.getDouble("Febrero");
                double Marzo = rs.getDouble("Marzo");
                
                
                empleado = new Clsempleado();
                empleado.setIdEmpleado(idEmpleado);
                empleado.setnombre(nombre);
                empleado.setEnero(Enero);
                empleado.setFebrero(Febrero);
                empleado.setMarzo(Marzo);
                empleados.add(empleado);
                
                
                
               
                
            }
            
            
            
            //muestra el mayor vendedor de enero
             double me=0;
            String nme=null, nmine=null;
            double Mine=99999.99;
            
            double Minf=99999.99;
            double mf=0;
            String nmf=null, nminf=null;
            
            
            double Minm=99999.99;
            double mm=0;
            String nmm=null, nminm=null;
            
            
            
            for(Clsempleado emp : empleados){
                
                if(emp.getEnero()>me){
                    me=emp.getEnero();
                    nme=emp.getnombre();
                }
                if(emp.getEnero()<Mine){
                    Mine= emp.getEnero();
                    nmine=emp.getnombre();
                }
            }
                for(Clsempleado empf : empleados){
                
                if(empf.getFebrero()>mf){
                    mf=empf.getFebrero();
                    nmf=empf.getnombre();
                }
                if(empf.getFebrero()<Minf){
                    Minf= empf.getFebrero();
                    nminf=empf.getnombre();
                }
                }
                for(Clsempleado empm : empleados){
                
                if(empm.getMarzo()>mm){
                    mm=empm.getMarzo();
                    nmm=empm.getnombre();
                }
                if(empm.getMarzo()<Minm){
                    Minm= empm.getMarzo();
                    nminm=empm.getnombre();
                }
                }
                
                   
           System.out.println("Mayor Vendedor Enero: "+nme+ " Cantidad Q"+me); 
           System.out.println("Mayor Vendedor Febrero: "+nmf+ " Cantidad Q"+mf); 
           System.out.println("Mayor Vendedor Marzo: "+nmm+ " Cantidad Q"+mm); 
           System.out.println("Menor Vendedor Enero: "+nmine+  " Cantidad Q"+Mine); 
           System.out.println("Menor Vendedor Febrero: "+nminf+ " Cantidad Q"+Minf); 
           System.out.println("Menor Vendedor Marzo: "+nminm+ " Cantidad Q"+Minm); 
           
           
           
           
           
           
           
           
           
            
        } catch (SQLException ex) {
        ex.printStackTrace(System.out);  
        } finally{
            
            ClsConexion.close(rs);
            ClsConexion.close(stmt);
            ClsConexion.close(con);
        }
        
        return empleados;
        
    }
    
    public int insert(Clsempleado empleado){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, empleado.getnombre());
            stmt.setDouble(2, empleado.getEnero());
            stmt.setDouble(3, empleado.getFebrero());
            stmt.setDouble(4, empleado.getMarzo());
            
         
            
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        
        return rows;
    }
    
   public int actualizar(Clsempleado empleado){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, empleado.getnombre());
            stmt.setDouble(2, empleado.getEnero());
            stmt.setDouble(3, empleado.getFebrero());
            stmt.setDouble(4, empleado.getMarzo());
            stmt.setInt(5, empleado.getIdEmpleado());
            
            System.out.println("ejecutando query:" + SQL_UPDATE);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        
        return rows;
    }
   
      public int borrar(Clsempleado empleado){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, empleado.getIdEmpleado());
            
            System.out.println("ejecutando query:" + SQL_DELETE);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        
        return rows;
    }
   
   public List<Clsempleado> empleadot(){
          Connection con=null;
            PreparedStatement stmt=null;
            ResultSet rs=null;
            Clsempleado empleado =null;
            List<Clsempleado> empleados=new ArrayList<Clsempleado>();
        try {
          
            con=ClsConexion.getConnection();
            stmt=con.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
          
            
            
            double mayor=0;
            String nombremay=null, nombremen=null;
            double menor=99999.99;
            for(Clsempleado emp : empleados){
                
                if(emp.getEnero()>mayor){
                    mayor=emp.getEnero();
                    nombremay=emp.getnombre();
                }
                if(emp.getEnero()<menor){
                    menor= emp.getEnero();
                    nombremen=emp.getnombre();
                }
                
            }
            System.out.println("Mayor Vendedor Enero: "+nombremay+"Cantidad Q"+mayor);
            return empleados;
        } catch (SQLException ex) {
            Logger.getLogger(ClsempleadoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
   
}