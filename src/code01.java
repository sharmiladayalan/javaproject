import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code01 {
    public static void main(String[]args) throws IOException {
        System.out.println("pooja");  // printing
        int i=3;
        String str="pooja";
        float j=3.5f;
        boolean nn=true;
        int k=8;
        System.out.println(i+k);
        System.out.println(i*k);
        System.out.println(k-i);
        System.out.println(i%k);
        System.out.println(i/k);
        int a,b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value for a:");
            a = Integer.parseInt(br.readLine());
        System.out.println(a);
        System.out.println("enter the value for b:");
        b = Integer.parseInt(br.readLine());
        System.out.println(b);
        System.out.println(a+b);
         int q=9,w=6;
        System.out.println(q>w);
        int p=7;
        System.out.println(++p);
        System.out.println(p++);
        System.out.println(p);
        int z=6;int c=9; int m=4;
        System.out.println(z<c && z<m);
        System.out.println(z>c || z>m);
        String Str="poojad";
        System.out.println(Str.length());
        System.out.println(Str.toUpperCase());
        String POI="POOJADAYALAN";
        System.out.println(Str.toLowerCase());
        System.out.println(str.trim());





    }


    }

