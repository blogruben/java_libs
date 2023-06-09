package org.ruben.java.bbdd.hilos;

import java.util.ArrayList;
import java.util.List;

import org.ruben.java.bbdd.App;

public class ServHilos {

    public static void iniciarHilosApp(int numeroHilos)  {
        try {
            ServHilos.crearHilos(numeroHilos);
        } catch (InterruptedException e) {
            System.out.println("Error al iniciar los hilos de ejecucion para procesar los ficheros");
            System.out.println(e);
        }
    }

    private static void crearHilos(int numeroHilos) throws InterruptedException  {
            App t = new App();
            List<Thread> hilos = new ArrayList<>();
            //creamos los hilos
            for ( int i = 0; i < numeroHilos; i++ )
		    {
                hilos.add(new Thread(t));
            }
            //Iniciamos los hilos
            for (Thread th : hilos) {
                th.start();
            }
            //Continuamos con la ejecucion principal
            //una vez que hayan terminado
            for (Thread th : hilos) {
                th.join();
            }
	}



    

}

