
class Rectangle{
    private int length;
    private int width;
    public Rectangle(int l, int b){
        length = l;
        width = b;
    }
    public void setLength(int l){
        length = l;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int w){
        width = w;
    }
    public int getWidth(){
        return width;
    }
    int area(){
        return length * width;
    }
    int perimeter(){
        return 2 * (length + width);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,10 );
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
