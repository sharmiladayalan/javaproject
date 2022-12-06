class cal11{
    public int cal_add(int x,int y){
        return x+y;
    }
}
class cal1 extends cal11{
    public int cal_sub(int x,int y){
        return x-y;
    }
}
class cal2 extends cal1{
    public int cal_mul(int x, int y) {
        return x * y;
    }
}
class cal3 extends cal2{
    public int cal_div(int x,int y){
        return x%y;
    }
}
public class inherit {
    public static void main(String[] args) {
        cal3 c=new cal3();
        int a=c.cal_mul(5,9);
        int b=c.cal_div(5,8);
        int d=c.cal_sub(4,2);
        int e=c.cal_add(6,9);
        System.out.println("mul:"+a);
        System.out.println("div:"+b);
        System.out.println("sub:"+d);
        System.out.println("add:"+e);
    }
}
