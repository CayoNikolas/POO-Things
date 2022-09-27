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
        return nome + ", $ " + (brutoSalario-imposto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBrutoSalario() {
        return brutoSalario;
    }

    public void setBrutoSalario(double brutoSalario) {
        this.brutoSalario = brutoSalario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
