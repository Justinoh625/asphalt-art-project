import org.code.neighborhood.*;

public class AsphaltPainter extends PainterPlus {
    
  //paints the background based on a color and size that the user chooses
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();
    
     if(canMove("south")){
       
      paintLine(color, size);
      turnToEast();
     }
    }

    paintLine(color, size);
    turnAround();
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

  /*
   * Turns the AsphaltPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the AsphaltPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the AsphaltPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * Resets the AsphaltPainter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * Moves the AsphaltPainter to the bottom right corner
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }

  /* Paints the stripes in the background based on a color that is chosen by the user
  it starts from the bottom and works its way up to the top, skipping a line, giving the stripe effect.
  */
  
  public void paintBackgroundStripes(String color, int size) {
   while (canMove("north")) {
    paintLine(color, size);
    turnLeft();
    if (canMove()) {
    move();
    move();
    turnLeft();
   }
    paintLine(color, size);
    turnRight();
     if (canMove()) {
    move();
       if (canMove()) {
        move();
       }
    turnRight();
    }
   }
  }
}