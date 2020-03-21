package lab10_miguelrojas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JLabel;

public class HiloHora implements Runnable {

    //Hora_Simulación
    public Date h = new Date();
    public DateFormat f = new SimpleDateFormat("hh:mm:ss");
    private JLabel hora;
    public long tiempo;
            
    public HiloHora(JLabel hora){
        this.hora = hora;
    }
    
    // hora
    public JLabel getHora() {
        return hora;
    }
    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    // h
    public Date getH() {
        return h;
    }
    public void setH(Date h) {
        this.h = h;
    }
    
    public void run() {
        while(true) {
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("hh:mm:ss");
            hora.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

