public class Funcionario {
    private String nome;
    private double brutoSalario;
    private double imposto;

    public Funcionario(String nome, double brutoSalario, double imposto){
        this.brutoSalario = brutoSalario;
        this.nome = nome;
        this.imposto = imposto;
    }

    public void aumentarSalario(double porcentagem){
        brutoSalario = brutoSalario + (brutoSalario*porcentagem);
    }

    public String toString(){
        return "Funcionário: " + nome + ", $ " + (brutoSalario-imposto);
    }
}
