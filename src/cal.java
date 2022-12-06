public class cal {
    public  int calculation(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }

    public  int calculation(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public static boolean calculation() {
        int mul = 4 * 9;
        System.out.println(mul);

        return true;
    }
    public  double calculation(int x, double y){
        double div=x/y;
        return div;
    }
    public static void main(String[] args) {
        cal obj=new cal();
        System.out.println(obj.calculation(8, 4));
        System.out.println(obj.calculation(4, 9, 7));
        System.out.println(calculation());
        System.out.println(obj.calculation(5,67));
    }
}
