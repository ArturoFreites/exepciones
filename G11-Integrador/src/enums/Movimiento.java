
package enums;

public enum Movimiento {
    
    CAMINAR(1,0),CORRER(2,0),PROPULSARSE(3,0),VOLAR(3,2);
    
    int bota,guante;

    private Movimiento(int bota, int guante) {
        this.bota = bota;
        this.guante = guante;
    }

    public int getBota() {
        return bota;
    }

    public int getGuante() {
        return guante;
    }
    
}
