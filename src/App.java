import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        double raio = 0f;
        double area = 0f;

        System.out.print("Digite o raio do circulo: ");
        raio = console.nextDouble();
        
        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é %.2f", area);
        console.close();
    }
}
