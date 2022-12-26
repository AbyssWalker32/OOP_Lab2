import rectClasses.Rectangle;

public class Test {
    public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(2, 1, 3, 4);
        rectangles[1] = new Rectangle(2, 2);
        rectangles[2] = new Rectangle();
        printTest(rectangles);
        //...
        System.out.println("\nAfter using move method:\n");
        rectangles[0].move(2, 2);
        rectangles[1].move(3, 8);
        rectangles[2].move(5, 1);
        printTest(rectangles);
        //...
        System.out.println("\nAfter using union method:\n");
        Rectangle rect = rectangles[0].Union(rectangles[1]);
        rect.rect_print();
    }

    public static void printTest(Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i].rect_print();
        }
    }
}
