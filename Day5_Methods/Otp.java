package Day5_Methods;

import java.util.*;
public class Otp{
    static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    static boolean temp(int[] otps) {
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j]) 
                return false;
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("All Unique: " + temp(otps));
    }
}
