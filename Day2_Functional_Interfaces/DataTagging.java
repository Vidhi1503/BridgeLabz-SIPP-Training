package Day2_Functional_Interfaces;

interface SensitiveData {}
class UserCredentials implements SensitiveData {
    String pwd="secret";
}
public class DataTagging {
    public static void main(String[]a){
        UserCredentials u=new UserCredentials();
        if(u instanceof SensitiveData) System.out.println("Sensitive Data Tagged");
    }
}
