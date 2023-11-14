//1. Para hallar en qué fecha cae el Domingo de Pascua de un año cualquiera basta
        //con calcular las cantidades a y b siguientes:
        //a=(19*(anyo%19)+24) % 30
        //b=2*(anyo%4)+4*(anyo%7)+6*a+5)%7
        //A partir de este cálculo el correspondiente Domingo de Pascua será el:
        //22 de marzo + a + b días que podría caer en abril.
import java.util.Scanner;

//Ejercicio T3 P1
public class T3P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un año ");
        int anyo = sc.nextInt();
        int a=(19*(anyo%19)+24) % 30;
        int b=(2*(anyo%4)+4*(anyo%7)+(6*a)+5)%7;

        if (((22+a+b)/31) == 1) {
                if (((22+a+b)%31) > 0) {
                    System.out.println(" Pascua caerá el " + ((22 + a+ b) % 31)+" de Abril");
                }else{
                    System.out.println("Pascua cae el 31 de marzo");
            }

        }else {
            System.out.println("Pascua cae el " + (22+a+b)+"de Marzo");
        }


    }
}