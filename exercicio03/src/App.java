import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Funcionario fun = new Funcionario("Joao Silva", 6000.00, 1000.00);

        System.out.println("Funcionário: " +fun);
        System.out.println("Qual porcentagem deseja aumentar? ");
        double porcentagem = 10.0;
        fun.aumentarSalario(porcentagem);

        System.out.println("Atualização: " +fun);
    }
}
