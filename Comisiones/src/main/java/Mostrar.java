
import Datos.ClsConexion;
import Datos.ClsempleadoJDBC;
import Dominio.Clsempleado;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W10
 */
public class Mostrar extends javax.swing.JFrame {

    /**
     * Creates new form Mostrar
     */
    public Mostrar() {
        initComponents();
        setLocationRelativeTo(null);
        Mostrar();
        getContentPane().setBackground(new java.awt.Color(255, 204, 255));
        this.setTitle("Mostrar Registros");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbempleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));

        tbempleados.setBackground(new java.awt.Color(255, 204, 255));
        tbempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbempleados);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("regresar a Crud");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setText("Mayor y Menor vendedor Enero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Mayor y Menor Vendedo Febrero");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Ver Mayor y Menor vendedor de Marzo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        volver();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        enero();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        febrero();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        marzo();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void Mostrar(){
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        Clsempleado empleado =null;
        try{
        con=ClsConexion.getConnection();

       String[] titulos={"idEmpleado","nombre","Enero","Febrero","Marzo","Total_Ventas","Promedio_Ventas"};
       String[] empleados= new String [7];
       
       DefaultTableModel modelo = new DefaultTableModel(null, titulos);
       
       String sql="SELECT * FROM empleados";
       
        Statement st = con.createStatement();
        rs = st.executeQuery(sql);
        
        while(rs.next()){
            
             int idEmpleado= rs.getInt("idEmpleados");
                String nombre=rs.getString("nombre");
                double Enero=rs.getDouble("Enero");
                double Febrero=rs.getDouble("Febrero");
                double Marzo = rs.getDouble("Marzo");
                double tot=Enero+Febrero+Marzo;
                double prom=tot/3;
                
                empleados[0]=String.valueOf(idEmpleado);
                empleados[1]=nombre;
                empleados[2]="Q."+String.valueOf(Enero);
                empleados[3]="Q."+String.valueOf(Febrero);
                empleados[4]="Q."+String.valueOf(Marzo);
                empleados[5]="Q."+String.valueOf(tot);
                empleados[6]="Q."+String.valueOf(prom);
                
                
                
                
                
                
                
                 
                
              
            modelo.addRow(empleados);
            
            tbempleados.setModel(modelo);
            
           
            
            }
        
                
            
           
           
           
           
    }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al mostrar la tabla");
            }
    
       
        
        
    }
    public void enero(){
        ClsempleadoJDBC em= new ClsempleadoJDBC();
     ClsempleadoJDBC e = new ClsempleadoJDBC();
        List<Clsempleado> todos = em.empleado();
         double may=0;
            String nmay=null, nmin=null;
            double min=99999.99;
        for(Clsempleado empe: todos){
           if(empe.getEnero()>may){
                    may=empe.getEnero();
                    nmay=empe.getnombre();
                }
                if(empe.getEnero()<min){
                    min= empe.getEnero();
                    nmin=empe.getnombre();
                }
        }
        JOptionPane.showMessageDialog(null,"La persona que mas vendio en enero fue"+nmay+" con Q."+may);
        JOptionPane.showMessageDialog(null,"La persona que menos vendio en enero fue"+nmin+" con Q."+min);   
        
    }
    
    
    
    public void febrero(){
    ClsempleadoJDBC em= new ClsempleadoJDBC();
     ClsempleadoJDBC e = new ClsempleadoJDBC();
        List<Clsempleado> todos = em.empleado();
         double may=0;
            String nmay=null, nmin=null;
            double min=99999.99;
        for(Clsempleado empe: todos){
           if(empe.getFebrero()>may){
                    may=empe.getFebrero();
                    nmay=empe.getnombre();
                }
                if(empe.getFebrero()<min){
                    min= empe.getFebrero();
                    nmin=empe.getnombre();
                }
        }
        JOptionPane.showMessageDialog(null,"La persona que mas vendio en febrero fue"+nmay+" con Q."+may);
        JOptionPane.showMessageDialog(null,"La persona que menos vendio en febrero fue"+nmin+" con Q."+min);   
        
    
    
    
    
    
    }
    
    public void marzo(){
        ClsempleadoJDBC em= new ClsempleadoJDBC();
     ClsempleadoJDBC e = new ClsempleadoJDBC();
        List<Clsempleado> todos = em.empleado();
         double may=0;
            String nmay=null, nmin=null;
            double min=99999.99;
        for(Clsempleado empe: todos){
           if(empe.getMarzo()>may){
                    may=empe.getMarzo();
                    nmay=empe.getnombre();
                }
                if(empe.getMarzo()<min){
                    min= empe.getMarzo();
                    nmin=empe.getnombre();
                }
        }
        JOptionPane.showMessageDialog(null,"La persona que mas vendio en marzo fue"+nmay+" con Q."+may);
        JOptionPane.showMessageDialog(null,"La persona que menos vendio en marzo fue"+nmin+" con Q."+min);   
        
    }
    
    
    public void volver(){
        
        CRUD crud = new CRUD();
        crud.setVisible(true);
        this.dispose();
        
        
        
        
        
    }
            
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbempleados;
    // End of variables declaration//GEN-END:variables
}
