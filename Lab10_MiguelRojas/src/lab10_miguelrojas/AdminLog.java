package lab10_miguelrojas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminLog {

    public ArrayList<Log> logs = new ArrayList();
    private File archivo = null;

    public AdminLog(String path) {
        archivo = new File(path);
    }
    
    // logs
    public Log getLog(int i) {
        return logs.get(i);
    }
    public void addLog(Log log) {
        logs.add(log);
    }
    
    public void escribir() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            
            for (Log log : logs) {
                bw.write(log.getPrimerNombre() + ";");
                bw.write(log.getDescripcion() + ";");
                bw.write(log.getFechaHora() + ";");
            }
            bw.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void cargar() {
        Scanner sc = null;
        logs = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    logs.add(new Log(sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    } 
    
}
