public class methodoverloading {
    public static String add(String Str){
        String Str1 = Str.toUpperCase();
        return Str1;
    }
    public static int add(int x,int y){
        int sum=x+y;
        return sum;
    }
    public static void add(){
        System.out.println("hi how are you");
    }

    public static void main(String[] args) {
        System.out.println(add("pooja"));
        System.out.println(add(6,8));
        add();
    }

}
