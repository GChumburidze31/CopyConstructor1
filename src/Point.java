public class Point {
    int x;
    int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point (Point anotherPoint){
        this.x = anotherPoint.x;
        this.y = anotherPoint.y;
    }

    public void printCoordinates(){
        System.out.println("(" + x +"," + y + ")");
    }

}
