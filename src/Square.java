public class Square extends Figure implements Drawable {


    private Integer sideA;


    public Square(String name, Integer sideA) {
        super(name);
        this.sideA = sideA;

    }


    @Override
    public void draw() {
        System.out.println("� ����� �������");
    }

    @Override
    public Integer calculatePerimeter() {
        return sideA * 4;
    }
}
