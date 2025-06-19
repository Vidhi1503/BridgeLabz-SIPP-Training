package Day4_Strings;

public class voting {
    public static void main(String[] args) {
        int[] ages = new int[10];
        System.out.println("Age\tCan Vote?");
        
        for (int i = 0; i < ages.length; i++) {
            ages[i] = 10 + (int)(Math.random() * 21); 
            System.out.println(ages[i] + "\t" + (ages[i] >= 18 ? "Yes" : "No"));
        }
    }
}
