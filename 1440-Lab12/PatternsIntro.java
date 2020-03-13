/**
 * PatternsIntro Class.
 * @author Tim Partridge
 * @version 5/1
 */
public class PatternsIntro
{
    /**
     * contructor.
     */
    public PatternsIntro()
    {
        tediousTenSquares();
        tenSquaresWhileLoop();
        tenSquaresForLoop();
        rowOfSquares(8, "black", 100, 300, 30, 20);
    }

    /**
     * Creates a row of 10 blue squares, each is 40x40 pixels, repeated every 50
     * pixels on the x-axis. The top-left corner of the row is at (x,y) =
     * (100,100)
     */
    public void tediousTenSquares() 
    {
        new Square(100, 100, 40, "blue");
        new Square(150, 100, 40, "blue");
        new Square(200, 100, 40, "blue");
        new Square(250, 100, 40, "blue");
        new Square(300, 100, 40, "blue");
        new Square(350, 100, 40, "blue");
        new Square(400, 100, 40, "blue");
        new Square(450, 100, 40, "blue");
        new Square(500, 100, 40, "blue");
        new Square(550, 100, 40, "blue");
    }
    
    /**
     * while loop method.
     */
    public void tenSquaresWhileLoop()
    {
        int x = 100;
        while (x < 600)
        {
            new Square(x, 200, 20, "red");
            x += 50;
        }
    }

    /**
     * for loop method.
     */
    public void tenSquaresForLoop() 
    {
        for (int i = 100; i < 600; i += 50)
        {
            new Square(i, 250, 20, "green");
        }
    }

    /**
     * creates row of squares.
     * @param numSquares input
     * @param color input
     * @param x input
     * @param y input
     * @param size input
     * @param spacing input
     */
    public void rowOfSquares(int numSquares, String color,
        int x, int y, int size, int spacing)
    {
        for (int i = x; i < (x + (numSquares * (size + spacing))); 
            i += (size + spacing))
        {
            new Square(i, y, size, color);
        }
    }
}
