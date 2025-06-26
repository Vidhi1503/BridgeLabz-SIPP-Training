package Day1_Java_Class_and_Object;

class palindrome {
    String text;
    boolean isPalindrome() {
        return text.equals(new StringBuilder(text).reverse().toString());
    }
    void display() {
        System.out.println(text + " is palindrome? " + isPalindrome());
    }
}
