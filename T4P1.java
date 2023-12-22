import java.util.Scanner;

public class T4P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paralelepípedo rectangular
        System.out.println("Introduce la longitud del paralelepípedo rectangular: ");
        double longitud = sc.nextDouble();
        System.out.println("Introduce la altura del paralelepípedo rectangular: ");
        double altura = sc.nextDouble();
        System.out.println("Introduce el ancho del paralelepípedo rectangular: ");
        double ancho = sc.nextDouble();

        double volumenParalelepipedo = calcularVolumenParalelepipedo(longitud, altura, ancho);
        System.out.println("El volumen del paralelepípedo rectangular es: " + volumenParalelepipedo);

        // Esfera
        System.out.println("Introduce el radio de la esfera: ");
        double radioEsfera = sc.nextDouble();
        double volumenEsfera = calcularVolumenEsfera(radioEsfera);
        System.out.println("El volumen de la esfera es: " + volumenEsfera);

        // Cilindro
        System.out.println("Introduce el radio del cilindro: ");
        double radioCilindro = sc.nextDouble();
        System.out.println("Introduce la altura del cilindro: ");
        double alturaCilindro = sc.nextDouble();
        double volumenCilindro = calcularVolumenCilindro(radioCilindro, alturaCilindro);
        System.out.println("El volumen del cilindro es: " + volumenCilindro);

        // Cono
        System.out.println("Introduce el radio del cono: ");
        double radioCono = sc.nextDouble();
        System.out.println("Introduce la altura del cono: ");
        double alturaCono = sc.nextDouble();
        double volumenCono = calcularVolumenCono(radioCono, alturaCono);
        System.out.println("El volumen del cono es: " + volumenCono);

        sc.close();
    }

    // Método para calcular el volumen de un paralelepípedo rectangular
    private static double calcularVolumenParalelepipedo(double longitud, double altura, double ancho) {
        return longitud * altura * ancho;
    }

    // Método para calcular el volumen de una esfera
    private static double calcularVolumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    // Método para calcular el volumen de un cilindro
    private static double calcularVolumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    // Método para calcular el volumen de un cono
    private static double calcularVolumenCono(double radio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    }
}