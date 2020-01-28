/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import Codigo.formas.Circulo;
import Codigo.formas.Cuadrado;
import Codigo.formas.DibujoLibre;
import Codigo.formas.Estrella;
import Codigo.formas.Forma;
import Codigo.formas.Pentagono;
import Codigo.formas.Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author aghsk
 */
public class VentanaPaint extends javax.swing.JFrame {

    //sirve para poder dibujar en el JPANLE "LIENZO"
    BufferedImage buffer, buffer2 = null;
    Graphics2D bufferGraphics, bufferGraphics2, jpanelGraphics = null;
    Circulo miCirculo = null;
    DibujoLibre dibujoLibre = null;
    Forma miForma = new Forma(-1, -1, 1, Color.white, false);//para que la forma no de error

    /**
     * Creates new form VentanaPaint
     */
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(640, 450);
    }

    private void inicializaBuffers() {
        //Voy a crear una imagen del mismo tamaño que "Lienzo"
        buffer = (BufferedImage) Lienzo.createImage(Lienzo.getWidth(), Lienzo.getHeight());
        buffer2 = (BufferedImage) Lienzo.createImage(Lienzo.getWidth(), Lienzo.getHeight());
        //creo una imagen modificada
        bufferGraphics = buffer.createGraphics();
        bufferGraphics2 = buffer2.createGraphics();
        //inicializo el buffer para que se pinte de blanco
        bufferGraphics.setColor(Color.white);

        bufferGraphics.fillRect(0, 0, Lienzo.getWidth(), Lienzo.getHeight());
        bufferGraphics2.setColor(Color.white);

        bufferGraphics2.fillRect(0, 0, Lienzo.getWidth(), Lienzo.getHeight());
        //enlazamos el Lienzo jPanel cone el JpanelGraphics
        jpanelGraphics = (Graphics2D) Lienzo.getGraphics();
    }
    //se encarga de dibujar los elementos que puse en la pantalla

    @Override
    public void paint(Graphics g) {
        super.paint(g);//llama al metodo que lo hace correctamente (paint)

        //pinto el buffer sobre el JPanel Lienzo
        jpanelGraphics.drawImage(buffer, 0, 0, null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        Lienzo = new javax.swing.JPanel();
        panelColores1 = new Codigo.PanelColores();
        herramientas1 = new Codigo.Herramientas();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton2)
                        .addGap(165, 165, 165)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LienzoMouseDragged(evt);
            }
        });
        Lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LienzoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout LienzoLayout = new javax.swing.GroupLayout(Lienzo);
        Lienzo.setLayout(LienzoLayout);
        LienzoLayout.setHorizontalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        LienzoLayout.setVerticalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        jButton1.setText("Colores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(panelColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelColores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(herramientas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseDragged
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        switch (herramientas1.formaElegida) {
            case 0:
                dibujoLibre.dibujate(bufferGraphics2, evt.getX(),
                        evt.getY()
                );
                break;

            case 1:
                miCirculo.dibujate(bufferGraphics, evt.getX());
                break;
            case 3:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 4:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 5:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 6:
                bufferGraphics2.setColor(Color.WHITE);
                bufferGraphics2.fillOval(evt.getX(), evt.getY(), 16, 16);
                break;
            case 7:
                bufferGraphics2.setColor(panelColores1.colorSeleccionado);
                bufferGraphics2.fillOval(evt.getX(), evt.getY(), 16, 16);
                break;
            case 256:
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
        }
        repaint(0, 0, 1, 1);

    }//GEN-LAST:event_LienzoMouseDragged

    private void LienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMousePressed
        switch (herramientas1.formaElegida) {
            case 0:
                dibujoLibre = new DibujoLibre(evt.getX(), evt.getY(), panelColores1.colorSeleccionado);
                dibujoLibre.dibujate(bufferGraphics, evt.getX(), evt.getY());
            case 1:
                miCirculo = new Circulo(evt.getX(), evt.getY(), 1, panelColores1.colorSeleccionado, herramientas1.relleno);
                miCirculo.dibujate(bufferGraphics, evt.getX());
                break;
            case 3:
                miForma = new Triangulo(evt.getX(), evt.getY(), 4, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 4:
                miForma = new Cuadrado(evt.getX(), evt.getY(), 4, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 5:
                miForma = new Pentagono(evt.getX(), evt.getY(), 5, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
            case 256:
                miForma = new Estrella(evt.getX(), evt.getY(), 256, panelColores1.colorSeleccionado, herramientas1.relleno);
                miForma.dibujate(bufferGraphics, evt.getX(), evt.getY());
                break;
        }

    }//GEN-LAST:event_LienzoMousePressed

    private void LienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseReleased

        //si es el circulo lo dibuja sobre el buffer2
        if (herramientas1.formaElegida == 1) {
            miCirculo.dibujate(bufferGraphics2, evt.getX());
        } else if (herramientas1.formaElegida != 0) {
            miForma.dibujate(bufferGraphics2, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_LienzoMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //paleta de colores de competi
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Queremos que se cierre y quiero que lea el color que a sido seleccionado
        jDialog1.setVisible(false);
        panelColores1.colorSeleccionado = jColorChooser1.getColor();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Esto es para guardar
        int seleccion = jFileChooser1.showSaveDialog(this);
        if (seleccion == jFileChooser1.APPROVE_OPTION) {
            //si entra aqui es por que el usuario ha pulsado "Guardar"
            File fichero = jFileChooser1.getSelectedFile();
            String nombre = fichero.getName();
            String extension = nombre.substring(nombre.lastIndexOf('.')+1,nombre.length());
            if(extension.equalsIgnoreCase("jpg")|| extension.equalsIgnoreCase("png")){
            try {
                ImageIO.write(buffer, "png", fichero);
            } 
            catch (IOException e) {
            }
            }
        else{
        //mensaje de extension no valida
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lienzo;
    private Codigo.Herramientas herramientas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private Codigo.PanelColores panelColores1;
    // End of variables declaration//GEN-END:variables
}
