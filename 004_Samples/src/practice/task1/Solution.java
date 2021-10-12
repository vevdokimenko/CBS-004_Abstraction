package practice.task1;

public class Solution {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Rectangle(3, 4);
        figures[1] = new Circle(2);
        figures[2] = new RightTriangle(4,5);
        figures[3] = new Trapeze(2,3,10);

        for (Figure item:
             figures) {
            System.out.println(item.square());
        }
    }
}
