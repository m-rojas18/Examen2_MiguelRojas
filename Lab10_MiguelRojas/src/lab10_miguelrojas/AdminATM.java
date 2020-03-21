package lab10_miguelrojas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminATM {

    public ArrayList<ATM> ATMs = new ArrayList();
    private File archivo = null;
    
    public AdminATM(String path) {
        archivo = new File(path);
    }
    
    // ATMs
    public ATM getATM(int i) {
        return ATMs.get(i);
    }
    public void addATM(ATM atm) {
        ATMs.add(atm);
    }
    
    public void escribir() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (ATM atm : ATMs) {
                bw.writeObject(atm);
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void cargar() throws FileNotFoundException, IOException {
        try {
            ATMs = new ArrayList();
            ATM temp;

            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ATM) objeto.readObject()) != null) {
                        ATMs.add(temp);
                    }

                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
}
