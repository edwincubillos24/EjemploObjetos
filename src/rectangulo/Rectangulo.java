package rectangulo;

import java.util.Scanner;

public class Rectangulo {

    private int ancho, alto;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public int area(){
        return ancho*alto;
    }
    
    public int perimetro(){
        return (2*(ancho+alto));
    }
    

        
    
    
}
