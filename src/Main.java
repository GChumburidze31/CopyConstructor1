


public class Main {
    public static void main (String [] args){

        Point originalPoint = new Point (5,2);
        Point copyPoint = new Point (originalPoint);

        originalPoint.printCoordinates();
        copyPoint.printCoordinates();
    }
}