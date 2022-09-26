public class Validator {
    
    public static void runValidation(IEntityValidation e){
        System.out.println(e.toString());
        //System.out.println(e.isValid());
        if (e.isValid() == true){
            System.out.println("Dados válidos!");
        } else {
            System.out.println("Dados inválidos!");
        }
    }
}
