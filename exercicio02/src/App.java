import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a largura do Retângulo: ");
        double width = sc.nextDouble();
        System.out.println("Insira a altura do Retângulo: ");
        double height = sc.nextDouble();

        Rectangle r1 = new Rectangle(width, height);

        System.out.printf("A Área do Retângulo é: %.2f%n", r1.area());
        System.out.printf("O Perímetro do Retângulo é: %.2f%n", r1.perimeter());
        System.out.printf("A Diagonal do Retângulo é: %.2f%n", r1.diagonal());

        sc.close();
    }
}
