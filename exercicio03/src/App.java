import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Funcionario fun = new Funcionario("Joao Silva", 6000.00, 1000.00);

        System.out.println("Funcionário: " +fun);
        System.out.println("Aumentando a porcentagem de 10%...");
        double porcentagem = 0.1;
        fun.aumentarSalario(porcentagem);

        System.out.println("Atualização: " +fun);
    }
}
