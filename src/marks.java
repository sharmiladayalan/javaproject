import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        System.out.println("enter the day number");
        Scanner s =new Scanner(System.in);
        int num=s.nextInt();
        switch (num){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("invalid");
        }
    }
}
