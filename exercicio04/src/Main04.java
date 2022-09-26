//import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);

        int num_Shapes = 2;
        int cont = 1;
        //double areas[];
        //ArrayList<Double> lista_areas = new ArrayList<Double>(Arrays.asList(areas));

        for (int i = num_Shapes; i > 0; i--){
            System.out.println("**Dados da Forma #" + cont + ":**");
            //Se cont for par = c, se for ímpar = r
            //width = 4*cont, height = 5
            //radius = 3*(cont-1)
            String s;
            Color color;
            double width = 4 * cont;
            double height = 5 * cont;
            double radius = 3 * (cont - 1);

            if ((cont % 2) != 0){
                s = "r";
            } else {
                s = "c";
            }

            if (cont < 3){
                color = Color.PRETO;
            } else if (cont < 5){
                color = Color.AZUL;
            } else {
                color = Color.VERMELHO;
            }

            if (s == "r"){
                //Color color = Color.PRETO;
                System.out.println("Cor (PRETO/AZUL/VERMELHO): " + color.getTitulo());
                
                System.out.println("Width: " + width);
                //double width = sc.nextDouble();
                System.out.println("Height: " + height);
                //double height = sc.nextDouble();

                Shape r = new RectangleShape(width, height, color);
                System.out.println(r.area());
            } else {
                System.out.println("Cor (PRETO/AZUL/VERMELHO): " + color.getTitulo());
            //    String ent_color = sc.nextLine();
            //    Color color = Color.PRETO;
            //    if (ent_color == "AZUL"){
            //        color = Color.AZUL;
            //    } else if (ent_color == "VERMELHO"){
            //            color = Color.VERMELHO;
            //        }
                System.out.println("Radius: " + radius);
            //    double radius = sc.nextDouble();

                Shape c = new CircleShape(radius, color);
                System.out.println(c.area());
            }
            cont++;
        }
    }
}
