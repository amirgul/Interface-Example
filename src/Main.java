public class Main
{

    public static void main(String[] args)
    {
        Measurable box = new Rectangle(5.0, 5.0);
        Measurable disc = new Circle(5.0);
        display(box);
        display(disc);


    }
    public static void display(Measurable figure)
    {
        double primeter = figure.getPerimeter();
        double area = figure.getArea();
        System.out.println("perimeter: " + primeter + " area: " + area);
    }
}
