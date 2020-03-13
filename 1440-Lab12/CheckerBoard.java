import java.util.ArrayList;

/**
 * checkerboard class.
 * @author Seth Harrison
 * @version 5/1
 */
public class CheckerBoard
{
    private ArrayList<Row> rowList;

    /**
     * constructor.
     */
    public CheckerBoard()
    {
        rowList = new ArrayList<Row>();
        for (int i = 0; i < 8; i++)
        {
            rowList.add(new Row(i));
        }
        for (int i = 1; i < 8; i += 2)
        {
            rowList.get(i).reverseColors();
        }
    }

    /**
     * reverse colors.
     */
    public void reverseColors()
    {
        for (Row r : rowList)
        {
            r.reverseColors();
        }
    }
    
    /**
     * delays.
     * @param waitAmountMillis input
     */
    public void delay(long waitAmountMillis)
    {

    }

    /**
     * extra credit.
     */
    public void extraCreditAnimation()
    {

    }

    /**
     * get row list.
     * @return ArrayList<Row>
     */
    public ArrayList<Row> getRowList()
    {
        return rowList;
    }

    /**
     * set row list.
     * @param rowList input
     */
    public void setRowList(ArrayList<Row> rowList)
    {
        this.rowList = rowList;
    }
}
