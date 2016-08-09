/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author Edwin
 */
public class Principal {
  public static void main(String[] args) {
        int a, b,are,per;
        Scanner lector = new Scanner(System.in);
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("Digite el ancho: ");
        a=lector.nextInt();  
        r1.setAncho(a);
        
        System.out.println("Digite el alto: ");
        r1.setAlto(lector.nextInt());
        
        System.out.println("ancho: "+r1.getAncho()+
                " alto: "+r1.getAlto());        
        
        per=r1.perimetro();
        
        System.out.println("Area: "+r1.area()+" Perimetro: "+per);        
    }  
}
