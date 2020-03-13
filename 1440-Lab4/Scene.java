
/**
 * Write a description of class Scene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene
{
    private House house1;
    private House house2;
    private Circle sun;
    private Circle moon;
    /**
     * 
     */
    public Scene()
    {
        house1 = new House();
        house2 = new House();
        house1.changeRoofColor("green");
        house1.changeWindowColor("blue");
        house1.changeWallColor("red");
        house1.moveHorizontal(-70);
        house1.moveVertical(-10);
        house2.changeRoofColor("black");
        house2.changeWindowColor("yellow");
        house2.changeWallColor("blue");
        house2.moveHorizontal(80);
        house2.moveVertical(-40);
        sun = new Circle();
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.changeSize(50);
        sun.moveVertical(-50);
        moon = new Circle();
        moon.makeVisible();
        moon.changeColor("blue");
        moon.changeSize(50);
        moon.moveVertical(-50);
        moon.moveHorizontal(-100);
    }

    /**
     * Sentence.
     * 
     * @param args input
     */
    public static void main(String[] args)
    {
        Scene scene = new Scene();
        scene.animate();
    }

    /**
     * 
     * 
     */
    public void animate()
    {
        sun.slowMoveHorizontal(300);
        moon.slowMoveHorizontal(300);
    }
}
