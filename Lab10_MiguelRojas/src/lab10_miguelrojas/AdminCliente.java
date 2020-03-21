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

public class AdminCliente {

    public ArrayList<Cliente> clientes = new ArrayList();
    private File archivo = null;
    
    public AdminCliente(String path) {
        archivo = new File(path);
    }
    
    // clientes
    public Cliente getCliente(int i) {
        return clientes.get(i);
    }
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    
    
    public void escribir() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Cliente cliente : clientes) {
                bw.writeObject(cliente);
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
            clientes = new ArrayList();
            Cliente temp;

            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cliente) objeto.readObject()) != null) {
                        clientes.add(temp);
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
