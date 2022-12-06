import java.util.Scanner;

public class evennum {
    public static void main(String[] args) {
        //     for (int i = 1; i <= 12; i++) {
        //         System.out.println(2 * i);
        int m = 0;
        System.out.println("enter the string");
        Scanner s = new Scanner(System.in);
        String d= s.next();
        for (int i = 0; i < d.length(); i++) {
            Character c = d.charAt(i);
            if (c=='a'||c== 'A'||c =='e'||c =='E'||c =='i'||c =='I'||c =='o'||c =='O'||c =='u' || c == 'U') {
                m++;
            }
            System.out.println("no.of vowels in the string:"+m);
        }
    }
}




