package Day2_Functional_Interfaces;

interface SecurityUtils {
    static boolean isStrong(String p){return p.length()>=8 && p.matches(".*\\d.*");}
}
public class PasswordValidator {
    public static void main(String[]a){
        System.out.println(SecurityUtils.isStrong("Pass1234"));
    }
}
