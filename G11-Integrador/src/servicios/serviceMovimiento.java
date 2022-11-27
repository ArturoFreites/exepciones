package servicios;

import entidades.Armadura;
import entidades.Bota;
import entidades.Dispositivo;
import entidades.Guante;
import enums.Movimiento;
import java.util.Scanner;

public class serviceMovimiento {

    Scanner read = new Scanner(System.in);

    public void movimiento(Armadura armadura) {

        Movimiento tipoMovimiento = tipoMovimiento();

        if (!sistemasDañados(tipoMovimiento, armadura))
        {
            System.out.println("Ingrese tiempo del movimiento");
            float tiempo = read.nextFloat();
            actualizarBateria(armadura, tiempo, tipoMovimiento);
            sufriendoDanios(armadura, tipoMovimiento);

        } else
        {
            System.out.println("NO SE PUEDE MOVER ERROR DE SISTEMAS");
        }

    }

    private Movimiento tipoMovimiento() {
        int respuesta;
        Movimiento tipo = null;
        do
        {
            System.out.println("1- CAMINAR");
            System.out.println("2- CORRER");
            System.out.println("3- PROPULSARSE");
            System.out.println("4- VOLAR");

            System.out.println("Ingrese opcion!");
            respuesta = read.nextInt();

            switch (respuesta)
            {
                case 1:
                    tipo = Movimiento.CAMINAR;
                    break;
                case 2:
                    tipo = Movimiento.CORRER;
                    break;
                case 3:
                    tipo = Movimiento.PROPULSARSE;
                    break;
                case 4:
                    tipo = Movimiento.VOLAR;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta!");
            }

        } while (respuesta > 4);

        return tipo;
    }

    private boolean comprobarEstadoBotas(Armadura armadura) {
        
        boolean daniada=false;
        
        for (Dispositivo dispositivo : armadura.getDispositivos())
        {
            if (dispositivo instanceof Bota && dispositivo.isDaniado())
            {
                daniada=true;
                break;
            }
        }
        return daniada;
    }
    
    private boolean comprobarEstadoGuantes(Armadura armadura) {
        
        boolean daniada=false;
        
        for (Dispositivo dispositivo : armadura.getDispositivos())
        {
            if (dispositivo instanceof Guante && dispositivo.isDaniado())
            {
                daniada=true;
                break;
            }
        }
        return daniada;
    }
    
    

    private boolean sistemasDañados(Movimiento tipoMovimiento, Armadura armadura) {

        boolean daniado = false;

        switch (tipoMovimiento)
        {
            case CAMINAR:
                if (comprobarEstadoBotas(armadura))
                {
                    daniado = true;
                }
                break;
            case CORRER:
                if (comprobarEstadoBotas(armadura))
                {
                    daniado = true;
                }
                break;
            case PROPULSARSE:
                if (comprobarEstadoBotas(armadura))
                {
                    daniado = true;
                }
                break;
            case VOLAR:
                if (comprobarEstadoBotas(armadura) && comprobarEstadoGuantes(armadura))
                {
                    daniado = true;
                }
                break;
        }

        return daniado;
    }
    
    private void actualizarBateria(Armadura armadura, float segundos, Movimiento tipo) {
        float consumoBota = 0;
        float consumoGuante = 0;
        
        for (Dispositivo dispositivo : armadura.getDispositivos())
        {
            if (dispositivo instanceof Bota)
            {
                 consumoBota+= dispositivo.getConsumo();
            }
            
            if (dispositivo instanceof Guante)
            {
                consumoGuante+= dispositivo.getConsumo();
                break;
            }
        }
        
        float consumo = (tipo.getBota() * consumoBota) + (tipo.getGuante() * consumoGuante);

        armadura.setBateria(armadura.getBateria() - consumo);
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}

    private void sufriendoDanios(Armadura armadura, Movimiento tipoMovimiento) {
        
        if (tipoMovimiento.getBota()>0  && tipoMovimiento.getGuante()==0)
        {
            romperBotas(armadura);
        }else{
            romperAmbos(armadura);
        }
        
    }

    private void romperBotas(Armadura armadura) {
        
        int indices [] = new int [2];
        int i=0;
        
        for (Dispositivo dispositivo : armadura.getDispositivos())
        {
            if (dispositivo instanceof Bota)
            {
                indices[i] = armadura.getDispositivos().indexOf(dispositivo);
                i++;
            }
        }
        
        if (Aleatorio(0, 100)<=30)
        {
            i= Aleatorio(0, 1);
            armadura.getDispositivos().get(i).setDaniado(true);
        }
        
    }

    private void romperAmbos(Armadura armadura) {
        int indices [] = new int [4];
        int i=0;
        
        for (Dispositivo dispositivo : armadura.getDispositivos())
        {
            if (dispositivo instanceof Bota || dispositivo instanceof Guante)
            {
                indices[i] = armadura.getDispositivos().indexOf(dispositivo);
                i++;
            }
        }
        
        if (Aleatorio(0, 100)<=30)
        {
            i= Aleatorio(0, 3);
            armadura.getDispositivos().get(i).setDaniado(true);
        }
    }

}
