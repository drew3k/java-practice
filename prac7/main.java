package prac7;

public class main {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(0, 5, 10, 0);
        System.out.println(movableRectangle.toString());
        movableRectangle.moveDown();
        System.out.println(movableRectangle.toString());
    }
}
