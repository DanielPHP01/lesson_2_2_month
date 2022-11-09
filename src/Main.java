public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle("����",2);
       Square square = new Square("�������",4);
       Triangle triangle =new Triangle("�����������",4,4,4);
       Rectangle rectangle = new Rectangle("Rectangle",3,5);
       Dog dog = new Dog("Rex",3);
       Drawable[] drawables = {circle,square,triangle,rectangle,dog};

        for (int i = 0; i < drawables.length ; i++) {
           if (drawables[i] instanceof Figure) {
               drawables[i].draw();
               System.out.println( ((Figure) drawables[i]).calculatePerimeter() +
               ((Figure) drawables[i]).getName());
           } if (drawables[i] instanceof Animal) {
               drawables[i].draw();
                System.out.println( ((Animal) drawables[i]).getName());
            }
        }
    }
}