/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import entidades.Armadura;
import entidades.Dispositivo;
import java.util.Scanner;

public class serviceEstado {
    
    Scanner read = new Scanner(System.in);
    serviceDispositivos servDispositivo = new serviceDispositivos();
    
    public void mostrarEstado(Armadura armadura) {
        
        int respuesta;
        
        do
        {
            System.out.println("1- MOSTRAR ESTADO DE TODOS LOS DISPOSITIVOS");
            System.out.println("2- MOSTRAR ESTADO DE LA BATERIA");
            System.out.println("3- MOSTRAR INFORMACION DEL REACTOR");
            System.out.println("4- REPARAR DAÑOS");

            System.out.println("Ingrese opcion!");
            respuesta = read.nextInt();

            switch (respuesta)
            {
                case 1:
                    estadoDispositivos(armadura);
                    break;
                case 2:
                    estadoBateria(armadura);
                    break;
                case 3:
                    infoReactor(armadura);
                    break;
                case 4:
                    repararDanios(armadura);
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta!");
            }

        } while (respuesta > 4);
        
    }

    private void estadoDispositivos(Armadura armadura) {
        System.out.println("----------- STATUS ARMADURA ---------");
        
        for (Dispositivo dispositivo : armadura.getDispositivos())
        {
            System.out.println(dispositivo.getNombre() +" | dañado= "+dispositivo.isDaniado());
        }
    }
    
    private void estadoBateria(Armadura armadura) {
        System.out.println("----------- ESTADO DE LA BATERIA ---------");
        
        float bateriaLlena = 1000000000f;
        float bateriaActual = armadura.getBateria();
        
        System.out.println("Estado de la bateria = " + ((bateriaActual*100)/bateriaLlena)+ "%");
    }

    private void infoReactor(Armadura armadura) {
        
        float joules=(armadura.getBateria()*36000000);
        
        System.out.println("Bateria actual es de = " + armadura.getBateria() + "KWH");
        System.out.println("Bateria actual es de = " + (armadura.getBateria()*36000000) + "JOULES" );
        System.out.println("Bateria actual es de = " + (joules/4186) + "KCAl/KG" );
    }

    private void guardarDispositivosD(Armadura armadura){
        
        for (Dispositivo dispositivo : armadura.getDispositivos())
        {
            
        }
    }
    
    private void repararDanios(Armadura armadura) {
        
        int idDispositivo = elejirDispositivo(armadura);
        
        if (Aleatorio(0, 100)<=40)
        {
            armadura.getDispositivos().get(idDispositivo).setDaniado(false);
        }
        
    }

    
    
    private int elejirDispositivo(Armadura armadura) {
       
        for (Dispositivo dispositivo : armadura.getDispositivos()){
            
            if (dispositivo.isDaniado())
            {
                System.out.println("ID= " + armadura.getDispositivos().indexOf(dispositivo) + "Nombre: "+dispositivo.getNombre());
            }
            
        }
        System.out.println("Seleccione ID del dispositivo a reparar ");
        int op = read.nextInt();
        
        return op;
    }

    private void repararDispositivo(Dispositivo dispoAReparar) {
        
        int random = Aleatorio(0, 100);
        
        if (random <= 30)
        {
            dispoAReparar.setDaniado(false);
            System.out.println("Dispositivo reparado");
        }else{
            System.out.println("No se pudo reparar el dispositivo");
        }
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
    
}
