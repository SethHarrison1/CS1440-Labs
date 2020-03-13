
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House
{
    private Square wall;
    private Triangle roof;
    private Square window;
    /**
     * Sentence.
     * 
     * @param args
     */
    public House()
    {
        wall = new Square();
        wall.makeVisible();
        wall.changeSize(100);
        wall.moveHorizontal(40);
        wall.moveVertical(150);
        roof = new Triangle();
        roof.makeVisible();
        roof.changeSize(50, 150);
        roof.changeColor("black");
        roof.moveVertical(135);
        roof.moveHorizontal(100);
        window = new Square();
        window.makeVisible();
        window.changeColor("blue");
        window.moveVertical(170);
        window.moveHorizontal(45);
    }

    /**
     * Sentence.
     * 
     * @param args input
     */
    public static void main(String[] args)
    {
        House house = new House();
    }

    /**
     * Sentence.
     * 
     * @param roofColor change roof color
     */
    public void changeRoofColor(String roofColor)
    {
        roof.changeColor(roofColor);
    }

    /**
     * Sentence.
     * 
     * @param wallColor wall color
     */
    public void changeWallColor(String wallColor)
    {
        wall.changeColor(wallColor);
    }

    /**
     * Sentence.
     * 
     * @param windowColor window color
     */
    public void changeWindowColor(String windowColor)
    {
        window.changeColor(windowColor);
    }

    /**
     * Sentence.
     * 
     * @param numHorizontal move horizontal
     */
    public void moveHorizontal(int numHorizontal)
    {
        wall.moveHorizontal(numHorizontal);
        roof.moveHorizontal(numHorizontal);
        window.moveHorizontal(numHorizontal);
    }

    /**
     * Sentence.
     * 
     * @param numVertical move vertical
     */
    public void moveVertical(int numVertical)
    {
        wall.moveVertical(numVertical);
        roof.moveVertical(numVertical);
        window.moveVertical(numVertical);
    }

    /**
     * Sentence.
     * 
     * @param args
     */
    public void makeInvisible()
    {
        wall.makeInvisible();
        roof.makeInvisible();
        window.makeInvisible();
    }

    /**
     * Sentence.
     * 
     * @param args
     */
    public void makeVisible()
    {
        wall.makeVisible();
        roof.makeVisible();
        window.makeVisible();
    }
}
