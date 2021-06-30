
package bienvenida;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import usuario.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public final class Agregar extends javax.swing.JFrame {

    private ArrayList<Persona>Lis;   
    
    public Agregar() {
        Lis= new ArrayList<Persona>();
        initComponents();
        
        this.setLocationRelativeTo(Agregar.this);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePersona = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        Fondo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Naturaleza.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 23, 23));
        jLabel1.setText("número");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 23, 23));
        jLabel2.setText("nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 80, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(23, 23, 23));
        jLabel4.setText("apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 30));

        TxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdActionPerformed(evt);
            }
        });
        getContentPane().add(TxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, -1));

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 190, -1));

        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, -1));

        BtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 100, 30));

        BtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 30));

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 110, 40));

        JTablePersona.setForeground(new java.awt.Color(0, 0, 0));
        JTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "núimero", "nombre", "apellido"
            }
        ));
        JTablePersona.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(JTablePersona);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 460, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void TxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdActionPerformed
    
    public void Cargar (){
        File Archivo = new File ("Jugadores.txt");
        FileReader Leer;
        BufferedReader Almacen;
        Persona per, aux = new Persona();
        try {
            Leer = new FileReader(Archivo);
            Almacen = new BufferedReader(Leer);
            per = aux.cargar(Almacen);
            while (per != null) {
               Lis.add(per);  
            }
            Almacen.close();
            Leer.close();
        } catch (Exception e) {
        }
        verDatos();
    }
    
    private void limpiar(){
        TxtId.setText("");
        TxtNombre.setText("");
        TxtApellido.setText("");
    
    }
        
        
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        String Nom,Apell;
        int id;
        try{
            Nom = TxtNombre.getText();
            Apell = TxtApellido.getText();
            id = Integer.parseInt(TxtId.getText());
            Lis.add(new Persona(id, Nom, Apell) );
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Verifica los datos");
        }
        limpiar();
        verDatos();
        
    }//GEN-LAST:event_BtnAgregarActionPerformed

    
    
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int c;
        
        try {
          c = JTablePersona.getSelectedRow();
          Lis.remove(c);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Favor escoja una fila"); 
        }
        verDatos();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    
    //Guardar los jugadores agregados en archivos
    private void guardar(){
        File file = new File("Jugadores.txt");
        PrintWriter Escribe;
        //Crear archivos
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
            }
        }
        //Guardar Archivos 
        try {
            Persona auxiliar;
            Escribe = new PrintWriter(file, "utf-8");
            for (int i = 0; i < Lis.size(); i++) {
                auxiliar = Lis.get(i);
                auxiliar.guardar(Escribe);   
            }
            Escribe.close();
        } catch (Exception e) {
            
        }
    }
    
    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        String botones [] = {"Si", "No"};
        int opcion = JOptionPane.showOptionDialog(null, "Desea guardar la informacion?", "Titulo", 0, 0, null, botones, null);
        
        if (opcion == 0) {
            guardar();
            
        }
 
        Menu regresar = new Menu();
        regresar.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_BtnRegresarActionPerformed
    
    private void verDatos(){
         String Mat[][] = new String [Lis.size()][3];
         Persona aux;
         
         for (int i = 0; i < Lis.size(); i++) {
            aux = Lis.get(i);
            Mat[i][0] = Integer.toString(aux.getId());
            Mat[i][1] = aux.getNombre();
            Mat[i][2] = aux.getApellido();
        }
         
        JTablePersona.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "Id", "Nombre", "Apellido"
            }
        ));
         
         
    }
   
     
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable JTablePersona;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
