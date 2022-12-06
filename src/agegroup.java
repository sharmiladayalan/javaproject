import java.util.Scanner;

public class agegroup {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the  age");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age>60){
             num=3;
        }
        else if(age>30 && age<=60){
            num=2;
        }
        else{
             num=1;
        }
        switch(num){
            case 1:
                System.out.println("focus on your job");
                break;
            case 2:
                System.out.println("study hard");
                break;
            case 3:
                System.out.println("enjoy your life");
                break;





        }


        }
    }

