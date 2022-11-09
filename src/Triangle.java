public class Triangle extends Figure implements Drawable {

    private Integer sideA;
    private Integer sideB;
    private Integer sideC;

    public Triangle(String name, Integer sideA, Integer sideB, Integer sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public void draw() {
        System.out.println("Я рисую триугольник");
    }

    @Override
    public Integer calculatePerimeter() {
        return  sideA + sideB + sideC;
    }
}
