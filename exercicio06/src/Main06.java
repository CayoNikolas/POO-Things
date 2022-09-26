public class Main06 {
    public static void main(String[] args) throws Exception {
        String cpf1 = "12345";
        String cpf2 = "54321";
        String cnpj1 = "67891";
        String cnpj2 = "19876";
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
