package services;

import entidades.Juego;
import java.util.Scanner;

public class serviceJuego {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Juego crearJuego() {

        return new Juego(Aleatorio(1, 500), 0);
    }

    public static int Aleatorio(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public void inicarJuego() {
        Juego juego = crearJuego();
        int numIngresado;
        do
        {
            try
            {
                System.out.println("Ingrese numero!");
                numIngresado = read.nextInt();
                if (numIngresado > juego.getNumAdivinar())
                {
                    System.out.println("El numero que ingresate es mayor");
                } else if (numIngresado == juego.getNumAdivinar())
                {
                    System.out.println("Adivinaste");

                } else
                {
                    System.out.println("El numero que ingresate menor!");
                }

            } catch (Exception e)
            {
                System.out.println("Numero no valido");
                read.nextLine();
                numIngresado = 0;

            } finally
            {
                juego.setNumIntentos(juego.getNumIntentos() + 1);
            }

            System.out.println("Intentos= " + juego.getNumIntentos());

        } while (numIngresado != juego.getNumAdivinar());

    }

}
