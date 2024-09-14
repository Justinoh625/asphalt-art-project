import org.code.neighborhood.*;

public class PainterPlus extends Painter {

    //turns right by making three lefts
  public void turnRight() {
       turnLeft();
       turnLeft(); 
       turnLeft(); 
    }

   //takes all paint if the painter is standing on a bucket
  public void takeAllPaint() {
      while (isOnBucket()){
        takePaint();
      }
    }

    //paints a donut
  public void paintDonut(String color) {
        while (hasPaint()) {
          move();
          turnRight();
          paint(color);
          move();
          paint(color);
        }
      }

    //moves until the painter cant
  public void moveFast() {
      while (canMove()) {
        move();
      }
    }
}