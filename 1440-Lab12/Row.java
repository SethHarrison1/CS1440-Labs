import java.util.ArrayList;

/**
 * Row Class.
 * @author Seth Harrison
 * @version 5/1
 */
public class Row
{
    private ArrayList<Square> sqList;

    /**
     * contructor.
     */
    public Row()
    {
        sqList = new ArrayList<Square>();
        addSquaresToList();
        delay(4000);
        changeSquareSize(48);
        delay(4000);
        changeEvenToBlack();
    }

    /**
     * constructor.
     * @param rowNumber input
     */
    public Row(int rowNumber)
    {
        sqList = new ArrayList<Square>();
        addSquaresToList();
        changeSquareSize(48);
        changeEvenToBlack();
        for (Square s : sqList)
        {
            s.setY(rowNumber * 50);
        }
    }

    /**
     * adds squares.
     */
    public void addSquaresToList()
    {
        int x = 0;
        while (x < 400)
        {
            sqList.add(new Square(x, 0, 50, "red"));
            x += 50;
        }
    }

    /**
     * move vertically.
     * @param amountToMove input
     */
    public void moveVertically(int amountToMove)
    {
        for (Square s : sqList)
        {
            s.setY(s.getY() + amountToMove);
        }
    }

    /**
     * changes square size.
     * @param size input
     */
    public void changeSquareSize(int size)
    {
        for (Square s : sqList)
        {
            s.setSize(size);
        }
    }

    /**
     * change even squares to black.
     */
    public void changeEvenToBlack()
    {
        for (int i = 0; i < sqList.size(); i += 2)
        {
            sqList.get(i).setColor("black");
        }
    }

    /**
     * changes odd squares to black.
     */
    public void changeOddToBlack()
    {
        for (int i = 1; i < sqList.size(); i += 2)
        {
            sqList.get(i).setColor("black");
        }
    }

    /**
     * delays.
     * @param waitAmountMillis input
     */
    public void delay(long waitAmountMillis)
    {
        long endingtime = System.currentTimeMillis() + waitAmountMillis;
        while (System.currentTimeMillis() < endingtime)
        {
            continue;
        }
    }

    /**
     * accessor.
     * @return sqList
     */
    public ArrayList<Square> getSqList()
    {
        return sqList;
    }

    /**
     * mutator.
     * @param sqList input
     */
    public void setSqList(ArrayList<Square> sqList)
    {
        this.sqList = sqList;
    }
    
    /**
     * reverses colors.
     */
    public void reverseColors()
    {
        for (int i = 0; i < sqList.size(); i++)
        {
            if (sqList.get(i).getColor().equals("black"))
            {
                sqList.get(i).setColor("red");
            }
            else
            {
                sqList.get(i).setColor("black");
            }
        }
    }
}
