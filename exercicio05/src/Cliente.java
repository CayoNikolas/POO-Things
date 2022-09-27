import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date nascimentoData;

    public Cliente(String nome, String email, Date nascimentoData){
        this.nome = nome;
        this.email = email;
        this.nascimentoData = nascimentoData;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getNascimentoData() {
        return nascimentoData;
    }
    public void setNascimentoData(Date nascimentoData) {
        this.nascimentoData = nascimentoData;
    }

    
}
