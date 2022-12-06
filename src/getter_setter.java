class circle{
    double area;
    public void set(int r){
        double a=3.132*r*r;
        this.area=a;
    }
    public double get(){
        return area;
    }

}
public class getter_setter {
    public static void main(String[] args) {
        circle c=new circle();
        c.set(8);
        System.out.println(c.get());
    }
}
