class Circle{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public void draw() {
        System.out.println("I am drawing a Circle");
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class TestCircle {
    public static void main(String args[]) {
        Circle c1 = new Circle(5);
        c1.draw();
        System.out.println(c1.getRadius());

        Circle c2 = new Circle(10);
        c2.draw();
        System.out.println(c2.getRadius());
    }
}