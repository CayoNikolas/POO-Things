public class PersonLegal extends Person{
    
    public String cnpj;

    public PersonLegal(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public boolean isValid(){
        boolean valid;
        if (cnpj.length() == 14){
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

    public String toString(){
        return "CNPJ: " + this.cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
