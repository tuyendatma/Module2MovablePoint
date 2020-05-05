public class start {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(1.0f,1.0f,5.0f,5.0f);
        System.out.println(movablePoint1);
        MovablePoint movablePoint2 = movablePoint1.move().move();
        System.out.println(movablePoint2);
    }
}
