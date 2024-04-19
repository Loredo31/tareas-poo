package mx.utng.s23.factory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{
    @Override
    public void log(String msg){
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("log.txt"));
            write.write(msg);
            write.close();
        } catch (IOException e) {
            System.out.println("Error de I/O" + e.getMessage());
        }
        
    }

    
}
