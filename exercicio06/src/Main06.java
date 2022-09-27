public class Main06 {
    public static void main(String[] args) throws Exception {
        String cpf1 = "12345678901";
        String cpf2 = "5432109876";
        String cnpj1 = "6789112343256678";
        String cnpj2 = "12345678901234";
        Person e1 = new PersonIndividual(cpf1);
        Person e2 = new PersonLegal(cnpj1);
        Person e3 = new PersonIndividual(cpf2);
        Person e4 = new PersonLegal(cnpj2);

        Validator.runValidation(e1);
        //System.out.println(e1);
        Validator.runValidation(e2);
        Validator.runValidation(e3);
        Validator.runValidation(e4);
    }
}
