
package ejercicios;

import java.util.Scanner;


/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestos {
    public static String evaluar(int anno){
        if (anno < 1582) { // Calendario juliano
            return anno % 4 == 0 ? anno + " es bisiesto" :  anno + " no es bisiesto";
        } else { // Calendario gregoriano
            return ((anno % 4 == 0 && anno % 100 != 0) || anno % 400 == 0) ? 
                 anno + " es bisiesto" : anno + " no es bisiesto";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(anno);
        System.out.println(respuesta);
    }
            
}