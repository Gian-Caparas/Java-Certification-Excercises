public class Main {
    public static void main(String[] args){
       Shape c = new Circle(7);
       Shape r = new Rectangle(2,5);
       Shape t = new Triangle(4,6);

       System.out.printf("Shape name: %s , Area: %.2f\n", c.name, c.getArea());
       System.out.printf("Shape name: %s , Area: %.2f\n",r.name, r.getArea());
       System.out.printf("Shape name: %s , Area: %.2f\n",t.name, t.getArea());

    }
}
