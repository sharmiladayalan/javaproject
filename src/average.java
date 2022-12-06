import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class average {
    public static void main(String[] args) throws IOException {
        int a,b,c,d,e;
        int z;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        System.out.println("enter the value of a:");
        b=Integer.parseInt(br.readLine());
        System.out.println("enter the value of b:");
        c=Integer.parseInt(br.readLine());
        System.out.println("enter the value of c:");
        d=Integer.parseInt(br.readLine());
        System.out.println("enter the value of d:");
        e=Integer.parseInt(br.readLine());
        System.out.println("enter the value of e:");
        z=(a+b+c+d+e)/5;
        System.out.println(z);
        if(z>=90){
            System.out.println("you get bicycle");
        }
        else if(z>=70 && z<=90){
            System.out.println("will get chocolate");
        }
        else{
            System.out.println("you  have to study well");
        }

        }

    }

