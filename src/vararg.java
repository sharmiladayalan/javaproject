public class vararg {
    public int prod(int ...arr){
        int product=1;
        System.out.println("number of arguments:"+arr.length);
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
            System.out.println(arr[i]);
        }
        return product;
    }

    public static void main(String[] args) {
        vararg v=new vararg();
        int y=v.prod(5,8,9,6);
        System.out.println(y);
    }
}
