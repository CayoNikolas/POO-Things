public class PersonIndividual extends Person{
    
    public String cpf;

    public PersonIndividual(String cpf){
        this.cpf = cpf;
    }

    @Override
    public boolean isValid(){
        boolean valid;
        if (cpf.length() == 11){
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

    public String toString(){
        return "CPF: " + this.cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
