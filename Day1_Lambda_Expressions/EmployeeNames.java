package Day1_Lambda_Expressions;

import java.util.*;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vidhi","Aman","Riya");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
