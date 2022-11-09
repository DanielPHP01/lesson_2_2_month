public class Circle extends Figure implements  Drawable {

    private Integer radius;

    public Circle(String name,Integer radius) {
        super(name);
        this.radius = radius;
    }



    @Override
    public void draw() {
        System.out.println("Я рисую круг");
    }

    @Override
    public Integer calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }
}
