/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_daniel_trimarchi;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author X
 */
public class hiloRepoduccion extends Thread {

    private JProgressBar barra;
    private JLabel label;
    private boolean vive = true;
    private boolean Avanzar = true;

    public hiloRepoduccion(JProgressBar barra, JLabel label) {
        this.barra = barra;
        this.label = label;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return Avanzar;
    }

    public void setAvanzar(boolean Avanzar) {
        this.Avanzar = Avanzar;
    }

    @Override
    public void run() {
        while (vive) {
            if (Avanzar) {
                try {
                    if (barra.getValue() >= barra.getMaximum()) {
                        Avanzar = false;
                        vive = false;
                    }
                    barra.setValue(barra.getValue() + 1);
                    label.setText(String.valueOf(barra.getValue()));

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }
            }
        }
    }

}
