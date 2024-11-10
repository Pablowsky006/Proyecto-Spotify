/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reproductor;

import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Frame extends javax.swing.JFrame {
File Archivo;
Clip clip;
    public Frame() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnPlay = new javax.swing.JButton();
        BtnPausa = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        CmbxRolas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        BtnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnPlay.setFont(new java.awt.Font("Times New Roman", 3, 8)); // NOI18N
        BtnPlay.setText("Play");
        BtnPlay.setMaximumSize(new java.awt.Dimension(55, 22));
        BtnPlay.setMinimumSize(new java.awt.Dimension(55, 22));
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });

        BtnPausa.setFont(new java.awt.Font("Times New Roman", 1, 8)); // NOI18N
        BtnPausa.setText("Pausa");
        BtnPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPausaActionPerformed(evt);
            }
        });

        BtnReset.setFont(new java.awt.Font("Times New Roman", 1, 8)); // NOI18N
        BtnReset.setText("|<<");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        CmbxRolas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tu boda-Fuerza regida", "Hablemos-Ariel camacho" }));
        CmbxRolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbxRolasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("Reproduciendo");

        BtnOk.setText("OK");
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(86, 86, 86)
                        .addComponent(CmbxRolas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BtnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CmbxRolas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnOk))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnPausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
           if (clip != null) {
        if (!clip.isRunning()) {
            clip.start(); // Inicia la reproducción si está pausada o preparada
            System.out.println("Reproducción iniciada o reanudada.");
        } else {
            System.out.println("El clip ya está en reproducción.");
        }
    } else {
        System.out.println("No hay un clip cargado para reproducir.");
    }
    }//GEN-LAST:event_BtnPlayActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
   if (clip != null) {
        clip.stop(); // Detiene la reproducción
        clip.setFramePosition(0); // Reinicia al inicio
        System.out.println("Reproducción reiniciada al inicio. Presione Play para reproducir.");
    } else {
        System.out.println("No hay un clip cargado para reiniciar.");
    }
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
       switch (CmbxRolas.getSelectedIndex()) {
        case 0:
            Archivo = new File("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Reproductor\\src\\main\\java\\Musica\\y2mate.com - Oscar Maydon x Fuerza Regida  Tu Boda.wav");
            jTextField1.setText("Tu boda - Fuerza Regida");
            break;
        case 1:
            Archivo = new File("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Reproductor\\src\\main\\java\\Musica\\y2mate.com-ARIEL-CAMACHO-HABLEMOS.wav");
            jTextField1.setText("Hablemos - Ariel Camacho");
            break;
        default:
            jTextField1.setText("Seleccione una canción");
            break;
    }
    cargarArchivo(Archivo);
    }//GEN-LAST:event_BtnOkActionPerformed

    private void BtnPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPausaActionPerformed
           if (clip != null && clip.isRunning()) {
        clip.stop();
        System.out.println("Reproducción pausada.");
    }
    }//GEN-LAST:event_BtnPausaActionPerformed

    private void CmbxRolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbxRolasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbxRolasActionPerformed
public void cargarArchivo(File archivo) {
    try {
        // Detener y cerrar el clip si ya está reproduciéndose o cargado
        if (clip != null) {
            if (clip.isRunning()) {
                clip.stop();
            }
            clip.close();
        }

        // Obtener un flujo de entrada
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);

        // Reutilizar la variable de instancia `clip`
        clip = AudioSystem.getClip();
        clip.open(audioStream);

        System.out.println("Archivo cargado: " + archivo.getName() + ". Listo para reproducir.");

    } catch (UnsupportedAudioFileException e) {
        System.err.println("El archivo de audio no es compatible: " + e.getMessage());
    } catch (IOException e) {
        System.err.println("Error al cargar el archivo de audio: " + e.getMessage());
    } catch (LineUnavailableException e) {
        System.err.println("Línea de audio no disponible: " + e.getMessage());
    }
}
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOk;
    private javax.swing.JButton BtnPausa;
    private javax.swing.JButton BtnPlay;
    private javax.swing.JButton BtnReset;
    private javax.swing.JComboBox<String> CmbxRolas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
