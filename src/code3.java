class moolya{
    public static int sub(int x,int y) {
        int z;
        if(x>y){
            z=x-y;
        }
        else{
            z=y-x;
        }
        return z;

    }
    public static int add(int a,int b){
        int diff;
        if(a>b){
            diff=a+b;
        }
        else{
            diff=b+a;
        }
        return diff;
    }

    }

public class code3 {
    public static void main(String[] args) {
        int c;
        c=moolya.sub(10,5);
        System.out.println(c);
        c=moolya.add(24,54);
        System.out.println(c);

    }
}
