
/**
 * Write a description of class ShapeFun here.
 * 
 * @author Seth Harrison 
 * @version 2/26/19
 */
public class ShapeFun
{
    /**
     * Sentence.
     * 
     * @param args input
     */
    public static void main(String[] args)
    {
        Square square = new Square();
        square.makeVisible();
        square.moveHorizontal(-60);
        square.moveVertical(-50);
        square.changeSize(500);
        square.changeColor("green");
        Triangle triangle = new Triangle();
        triangle.makeVisible();
        Circle circle = new Circle();
        circle.makeVisible();
    }
}

