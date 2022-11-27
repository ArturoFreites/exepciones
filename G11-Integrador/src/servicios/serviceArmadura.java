/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Armadura;
import entidades.Bota;
import entidades.Dispositivo;
import entidades.Guante;
import enums.Colores;
import java.util.Scanner;
import enums.Materiales;
import java.util.ArrayList;

public class serviceArmadura {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    serviceBota servBota = new serviceBota();
    serviceGuante servGuante = new serviceGuante();
    serviceSintetizador servSintetizador = new serviceSintetizador();
    serviceConsola servConsola = new serviceConsola();
    

    public Armadura crearArmadura() {

        Armadura markV = new Armadura();

        elegirMaterial(markV);
        
        System.out.println("COLOR PRIMARIO");
        markV.setColorPrimario(elegirColor());
        
        System.out.println("COLOR SECUNDARIO");
        markV.setColorSecundario(elegirColor());
        
        markV.setSalud(100);
        markV.setBateria(1000000000f);
        
        crearDispositivos(markV);
        
        crearMapaObjetos(markV);
        
        return markV;
    }

    private void elegirMaterial(Armadura markV) {
        int respuesta;
        do
        {
            System.out.println("1- " + Materiales.ADAMANTIUM.getMaterial());
            System.out.println("2- " + Materiales.CARBONO.getMaterial());
            System.out.println("3- " + Materiales.METAL.getMaterial());

            System.out.println("Ingrese material");
            respuesta = read.nextInt();

            switch (respuesta)
            {
                case 1:
                    markV.setMaterial(Materiales.ADAMANTIUM.getMaterial());
                    markV.setResistencia(Materiales.ADAMANTIUM.getResistencia());
                    break;
                case 2:
                    markV.setMaterial(Materiales.CARBONO.getMaterial());
                    markV.setResistencia(Materiales.CARBONO.getResistencia());
                    break;
                case 3:
                    markV.setMaterial(Materiales.METAL.getMaterial());
                    markV.setResistencia(Materiales.METAL.getResistencia());
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta!");
            }

        } while (respuesta > 3);

        System.out.println("-------- MATERIAL CARGADO -- RESISTENCIA CALCULADA --------");
    }

    private Colores elegirColor() {
        
        int respuesta;
        Colores color = Colores.AMARRILLO;
        
        do
        {
            System.out.println("1- " + Colores.AMARRILLO);
            System.out.println("2- " + Colores.BLANCO);
            System.out.println("3- " + Colores.CELESTE);
            System.out.println("4- " + Colores.NEGRO);
            System.out.println("5- " + Colores.ROJO);

            System.out.println("Ingrese material");
            respuesta = read.nextInt();
            

            switch (respuesta)
            {
                case 1:
                    color = Colores.AMARRILLO;
                    break;
                case 2:
                    color = Colores.BLANCO;
                    break;
                case 3:
                    color = Colores.CELESTE;
                    break;
                case 4:
                    color = Colores.NEGRO;
                    break;
                case 5:
                    color = Colores.ROJO;
                    break;
                    
                default:
                    System.out.println("Ingrese una opcion correcta!");
            }

        } while (respuesta > 5);
        
        System.out.println("-------- COLOR CARGADO --------");
        
        return color;
    }

    private void crearDispositivos(Armadura markV) {
        ArrayList<Dispositivo> dispositivos = new ArrayList();
        
        Bota bota = servBota.crearBota();
        
        bota.setNombre("Bota Izquierda");
        dispositivos.add(bota);
        
        bota = servBota.crearBota();
        bota.setNombre("Bota Derecha");
        dispositivos.add(bota);
        
        System.out.println("BOTAS CREADAS");
        
        Guante guante = servGuante.crearGuante();
        guante.setNombre("Guante Izquierdo");
        dispositivos.add(guante);
        
        guante = servGuante.crearGuante();
        guante.setNombre("Guante Derecho");
        dispositivos.add(guante);
        
        System.out.println("GUANTES CREADOS");
        
        dispositivos.add(servConsola.crearConsola());
        dispositivos.add(servSintetizador.crearSintetizador());
        
        System.out.println("CASCO CREADO");
        
        markV.setDispositivos(dispositivos);
    }

    private void crearMapaObjetos(Armadura markV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
