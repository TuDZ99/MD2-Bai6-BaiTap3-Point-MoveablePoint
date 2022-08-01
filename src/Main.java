public class Main {
    public static void main(String[] args) {
        Point point = new Point(5,5);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(),10,20);
        System.out.println("truoc khi move " + moveablePoint);
        moveablePoint.move();
        System.out.println("sau khi move " + moveablePoint);
    }
}
