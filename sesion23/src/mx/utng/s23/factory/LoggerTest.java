package mx.utng.s23.factory;

import java.util.Scanner;

public class LoggerTest {
    public static void main(String[] args) {
        //Declarar un objeto LoggerFactory
        LoggerFactory factory = new LoggerFactory();
        //El usuario tecleara el tipo 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Teclea el tipo de Logger: ");
        int tipo = scanner.nextInt();
        //Crear el Logger elegido por el usuario
        Logger logger = factory.getLogger(tipo);
        logger.log("Registro de eventos del sistema");
    }
    
}
