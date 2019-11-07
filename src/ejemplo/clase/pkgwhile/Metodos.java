package ejemplo.clase.pkgwhile;

import java.util.Scanner;
/**
 *
 * @author jalvarezbarciela
 */
public class Metodos {

    private int num;
    Scanner sc = new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.println("Tecle numero:");
        num = sc.nextInt();
    }
    
    public void verDatos() {
        pedirDatos();
        while (num != 0) {
            System.out.println(num);
            pedirDatos();
        }
        System.out.println("Rematamos");
    }
}
