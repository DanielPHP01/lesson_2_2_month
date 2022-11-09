public class Rectangle extends Figure implements Drawable {

    private Integer sideA;
    private Integer sideB;

    public Rectangle(String name, Integer sideA, Integer sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }



    @Override
    public void draw() {
        System.out.println("Я рисую прямоугольник");
    }

    @Override
    public Integer calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
