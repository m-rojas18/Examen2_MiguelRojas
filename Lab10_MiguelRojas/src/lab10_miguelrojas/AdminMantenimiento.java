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

public class AdminMantenimiento {

    public ArrayList<Mantenimiento> mantenimientos = new ArrayList();
    private File archivo = null;
    
    public AdminMantenimiento(String path) {
        archivo = new File(path);
    }
    
    // mantenimientos
    public Mantenimiento getMantenimiento(int i) {
        return mantenimientos.get(i);
    }
    public void addMantenimiento(Mantenimiento mantenimiento) {
        mantenimientos.add(mantenimiento);
    }

    public ArrayList<Mantenimiento> getMantenimientos() {
        return mantenimientos;
    }
    
    
    
    public void escribir() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Mantenimiento mantenimiento : mantenimientos) {
                bw.writeObject(mantenimiento);
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
            mantenimientos = new ArrayList();
            Mantenimiento temp;

            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Mantenimiento) objeto.readObject()) != null) {
                        mantenimientos.add(temp);
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
