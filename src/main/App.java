package main;

import java.util.Queue;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

         LogicaClasificacion lc = new LogicaClasificacion();

         Queue<String> cola = new Queue<>(3);
         cola.add("Ana");
         cola.add("Luis");
         cola.add("Pedro");

        lc.invertirColaNombres(cola);
        

    }
}
