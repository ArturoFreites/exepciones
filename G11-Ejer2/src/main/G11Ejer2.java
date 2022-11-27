/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Biblioteca;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class G11Ejer2 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.llenarBiblioteca(biblioteca);
        
        for (String libro : biblioteca.getLibros())
        {
            System.out.println(libro);
        }
        
        System.out.println("Ingrese el numero un libro");
        int libro = read.nextInt();
        
        try{
            System.out.println(biblioteca.getLibros()[libro]);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }
    
}
