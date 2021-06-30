package tablero;

import usuario.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Tabla extends JFrame implements ActionListener{
    JLabel label[] = new JLabel[64];
    Color casillas, fondo, jugador, casilla2, jugador2;
    JButton movimiento;
    JButton regresar;
    private int dadito, player, player2;
    FondoPanel pantalla = new FondoPanel(); 

    
    public Tabla(){
         
        super("");
        this.setContentPane(pantalla);
        this.setSize(385,577);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        objetos();
        this.getContentPane().setBackground(fondo);
        this.setVisible(true);
        

       
    }
    
    class FondoPanel extends JPanel{
        private Image imagen;
        
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondopartida.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            super.paint(g);
                    
        }
    }

    
    
    
    public void objetos(){
        casillas = new Color (170,170,170);
        casilla2 = new Color (164,235,243);
        fondo = new Color (0,255,255);
        jugador = new Color (254,254,254);
        jugador2 = new Color (255,136,75);
        
       
        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel("      "+(i+1)+"   ");
        }
        
        movimiento = new JButton("tirar dados");
        regresar = new JButton("Regresar");
        
        
        
        
        this.setLayout(null);
        
        label[0].setBounds(10, 10, 60, 60);
        label[1].setBounds(70, 10, 60, 60);
        label[2].setBounds(130, 10, 60, 60);
        label[3].setBounds(190, 10, 60, 60);
        label[4].setBounds(250, 10, 60, 60);
        label[5].setBounds(310, 10, 60, 60);
        
        
        label[6].setBounds(10, 70, 60, 60);
        label[7].setBounds(70, 70, 60, 60);
        label[8].setBounds(130, 70, 60, 60);
        label[9].setBounds(190, 70, 60, 60);
        label[10].setBounds(250, 70, 60, 60);
        label[11].setBounds(310, 70, 60, 60);
        
        
        label[12].setBounds(10,  130, 60, 60);
        label[13].setBounds(70,  130, 60, 60);
        label[14].setBounds(130, 130, 60, 60);
        label[15].setBounds(190, 130, 60, 60);
        label[16].setBounds(250, 130, 60, 60);
        label[17].setBounds(310, 130, 60, 60);
        
        
        label[18].setBounds(10,  190, 60, 60);
        label[19].setBounds(70,  190, 60, 60);
        label[20].setBounds(130, 190, 60, 60);
        label[21].setBounds(190, 190, 60, 60);
        label[22].setBounds(250, 190, 60, 60);
        label[23].setBounds(310, 190, 60, 60);
        
       
        label[24].setBounds(10,  250, 60, 60);
        label[25].setBounds(70,  250, 60, 60);
        label[26].setBounds(130, 250, 60, 60);
        label[27].setBounds(190, 250, 60, 60);
        label[28].setBounds(250, 250, 60, 60);
        label[29].setBounds(310, 250, 60, 60);
        
        
        label[30].setBounds(10,  310, 60, 60);
        label[31].setBounds(70,  310, 60, 60);
        label[32].setBounds(130, 310, 60, 60);
        label[33].setBounds(190, 310, 60, 60);
        label[34].setBounds(250, 310, 60, 60);
        label[35].setBounds(310, 310, 60, 60);
       
        
        label[36].setBounds(10, 370, 60, 60);
        label[37].setBounds(70, 370, 60, 60);
        label[38].setBounds(130,370, 60, 60);
        label[39].setBounds(190,370, 60, 60);
        label[40].setBounds(250,370, 60, 60);
        label[41].setBounds(310,370, 60, 60);
        
        
        label[42].setBounds(10, 430, 60, 60);
        label[43].setBounds(70, 430, 60, 60);
        label[44].setBounds(130,430, 60, 60);
        label[45].setBounds(190,430, 60, 60);
        label[46].setBounds(250,430, 60, 60);
        label[47].setBounds(310,430, 60, 60);
        
        

        movimiento.setBounds(25,500,125,30);
        regresar.setBounds(200, 500, 125, 30);
        
        tab();
        label[0].setBackground(jugador);
       //label[1].setBackground(jugador2);

        for (int i = 0; i < label.length; i++) {
            this.add(label[i]);
        }
        
        this.add(movimiento);
        movimiento.addActionListener(this);
        
        this.add(regresar);
        
        
    }
    
    public void tab(){
        for (int i = 0; i < label.length; i++) {
            label[i].setOpaque(true);
        }
        
        
         //primerafila
        label[0].setBackground(casillas);
        label[1].setBackground(casilla2);
        label[2].setBackground(casillas);
        label[3].setBackground(casilla2);
        label[4].setBackground(casillas);
        label[5].setBackground(casilla2);
        
        
        //Segundafila
        label[6].setBackground(casilla2);
        label[7].setBackground(casillas);
        label[8].setBackground(casilla2);
        label[9].setBackground(casillas);
        label[10].setBackground(casilla2);
        label[11].setBackground(casillas);
        
        
        //tercerafila
        label[12].setBackground(casillas);
        label[13].setBackground(casilla2);
        label[14].setBackground(casillas);
        label[15].setBackground(casilla2);
        label[16].setBackground(casillas);
        label[17].setBackground(casilla2);
        
        
        
        //Cuartafila
        label[18].setBackground(casilla2);
        label[19].setBackground(casillas);
        label[20].setBackground(casilla2);
        label[21].setBackground(casillas);
        label[22].setBackground(casilla2);
        label[23].setBackground(casillas);
        
        
        //Quintafila
        label[24].setBackground(casillas);
        label[25].setBackground(casilla2);
        label[26].setBackground(casillas);
        label[27].setBackground(casilla2);
        label[28].setBackground(casillas);
        label[29].setBackground(casilla2);
        
        
        //sextafila
        label[30].setBackground(casilla2);
        label[31].setBackground(casillas);
        label[32].setBackground(casilla2);
        label[33].setBackground(casillas);
        label[34].setBackground(casilla2);
        label[35].setBackground(casillas);
        
        
          //septimafila
        label[36].setBackground(casillas);
        label[37].setBackground(casilla2);
        label[38].setBackground(casillas);
        label[39].setBackground(casilla2);
        label[40].setBackground(casillas);
        label[41].setBackground(casilla2);
        
        
        
          //Octavafila
        label[42].setBackground(casilla2);
        label[43].setBackground(casillas);
        label[44].setBackground(casilla2);
        label[45].setBackground(casillas);
        label[46].setBackground(casilla2);
        label[47].setBackground(casillas);
        
        
    }

    
    
    
    private JLabel[] j1 = new JLabel [64];
    private JLabel[] j2 = new JLabel [64];
    
    private int posj1 = 0;
    private int posj2 = 0;

    private int turno = 0;
    
    
    public void actionPerformed(ActionEvent ae) {
        
        if (turno == 0) {
            JOptionPane.showMessageDialog(null, "turno jugador 1 balanco ");
            
            int espacios  = (int)(((Math.random())*60)/10)+1;
            
            posj1+=espacios;
            int postablero = posj1+1;
            JOptionPane.showMessageDialog(null, "jugador 1 tiene  '"+ espacios +"' se mueve a la casilla '"+postablero+"' ");
            
            for (int i = 0; i < 64; i++) {
                
                if (posj1 == 4) {
                    JOptionPane.showMessageDialog(null, "escalera avanza al espacio 17");
                    posj1= 16;
                }
                if (posj1 == 24) {
                    JOptionPane.showMessageDialog(null, "avanza 5 espacios");
                    posj1= 29;
                }
                if (posj1 == 36) {
                    JOptionPane.showMessageDialog(null, "pierdes un turno");
                    posj1= 35;
                }
                if (posj1 == 39) {
                    JOptionPane.showMessageDialog(null, "serpiente retrocedes 14 espacios");
                    posj1= 25;
                }
                if (posj1 == 42) {
                    JOptionPane.showMessageDialog(null, "serpiente, retrocede 18 espacios");
                    posj1= 24;
                }
                        
                    //Pintar tablero
                for (int j = 0; j < posj1; j++) { 
                    tab();
                    label[posj1].setBackground(jugador);  
                    label[posj2].setBackground(jugador2);
                 
                }
            }
            
            if (posj1 >=47) {
                JOptionPane.showMessageDialog(null, "jugador 1 ganador");
            }

            turno =1;
              
            
 
        } else if (turno == 1) {
            JOptionPane.showMessageDialog(null, "turno juagador 2 naranja ");

            int espacios  = (int)(((Math.random())*60)/10)+1;

            posj2+=espacios;
            int postablero = posj2+1;
            JOptionPane.showMessageDialog(null, "jugador 2 tiene '"+ espacios +"' se mueve a la casilla '"+postablero+"' ");

            for (int i = 0; i < 64; i++) {

                if (posj2 == 4) {
                    JOptionPane.showMessageDialog(null, "escalera avanza al espacio 17");
                    posj2= 16;
                }
                if (posj2 == 24) {
                    JOptionPane.showMessageDialog(null, "avanza 5 espacios");
                    posj2= 29;
                }
                if (posj2 == 36) {
                    JOptionPane.showMessageDialog(null, "pierdes un turno");
                    posj2= 35;
                }
                if (posj2 == 39) {
                    JOptionPane.showMessageDialog(null, "serpiente retrocedes 14 espacios");
                    posj2= 25;
                }
                if (posj2 == 42) {
                    JOptionPane.showMessageDialog(null, "serpiente retrocedes 18 espacios");
                    posj2= 24;

                }

                //Pintar Tablero
                for (int j = 0; j < posj2; j++) {  
                    tab();
                    label[posj1].setBackground(jugador);  
                    label[posj2].setBackground(jugador2); 
                    
                }
      
            }
            if (posj2 >=47) {
                JOptionPane.showMessageDialog(null, "jugador 2 es el ganador");
            }
            
            turno =0;
      
        }

    }   
}