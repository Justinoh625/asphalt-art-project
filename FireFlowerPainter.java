import org.code.neighborhood.*;

public class FireFlowerPainter extends AsphaltPainter {

  //paints the fire flower by calling the methods
  public void paintFireFlower() {
    paintFlowerOutline();
    colorLeaf();
    getReadyToColorFace();
    colorFace();
    paintEyes();
    goToStartingPoint();
  }
  
  //paints the flower outline in black
  public void paintFlowerOutline() {
    turnRMoveturnL();
    walk(5);
    paintLine("black", 6);
    turnRMoveturnL();
    paintLine("black", 2);
    turnRMoveturnL();
    paintLine("black", 1);
    turnRightThenMove();
    paintLine("black", 3);
    turnRMoveturnL();
    paintLine("black", 1);
    turnRightThenMove();
    paintLine("black", 2);
    turnAround();
    moveThenTurnRight();
    move();
    paintLine("black", 1);
    turnAround();
    moveThenTurnLeft();
    paintLine("black", 8);
    turnAround();
    moveThenTurnLeft();
    moveThenTurnLeft();
    paintLine("black", 2);
    turnRightThenMove();
    paintLine("black", 1);
    turnLeft();
    moveThenTurnRight();
    paintLine312();
    moveThenTurnRight();
    walk(8);
    paintLine("black", 4);
    turnLeft();
    walk(3);
    turnLeft();
    move();
    paintLine("black", 4); 
    turnRight();
    walk(4);
    paintLine("black", 2);
    turnRightThenMove();
    paintLine312();    
    turnLeft();
    moveThenTurnRight();
    turnLeft();
    turnRight();
    paintLine("black", 8);
    turnRMoveturnL();
    paintLine("black", 2);
    turnRMoveturnL();
    paintLine("black", 1);
    turnRightThenMove();
    paintLine("black", 3);
    turnRightThenMove();
    paintLine("black", 2);
    turnRightThenMove();
    paintLine("black", 1);
    turnLeft();
    move();
    paintLine("black", 2);
    walk(4);
    paintLine("black", 2);
    turnLeft();
    moveThenTurnRight();
    paintLine("black", 1);
  }

  //makes the painter turn right, then move, then turn left
  public void turnRMoveturnL() {
    turnRight();
    moveThenTurnLeft();
  }

  /*paints a black line of 3 units, turn right, move, paint a line of one unit, turn left, move, turn right, then paint a black line with 2 units.
  used to shorten repetitive code in the original raw code
  */
  public void paintLine312() {
    paintLine("black", 3);
    turnRightThenMove();
    paintLine("black", 1);
    turnLeft();
    moveThenTurnRight();
    paintLine("black", 2);
  }

  //colors the green leaf
  public void colorLeaf() {
    paintLine("MediumSeaGreen", 2);
    turnRight();
    moveThenTurnRight();
    move();
    paintLine("MediumSeaGreen", 3);
    moveThenTurnLeft();
    moveThenTurnLeft();
    paintLine("MediumSeaGreen", 5);
    turnAround();
    moveThenTurnLeft();
    moveThenTurnRight();
    move();
    paintLine("MediumSeaGreen", 4);
    turnAround();
    walk(2);
    turnRight();
    moveThenTurnRight();
    paintLine("MediumSeaGreen", 3);
    turnRight();
    paintLine("MediumSeaGreen", 5);
    turnLeft();
    moveThenTurnLeft();
    move();
    paintLine("MediumSeaGreen", 5);
    turnRightThenMove();
    turnRMoveturnL();
    paintLine("MediumSeaGreen", 3);
    moveThenTurnRight();
    moveThenTurnRight();
    paintLine("MediumSeaGreen", 4);
    turnLeft();
    moveThenTurnLeft();
    move();
    paintLine("MediumSeaGreen", 5);
    turnRight();
    moveThenTurnRight();
    move();
    paintLine("MediumSeaGreen", 3);
    turnAround();
    walk(2);
    turnRight();
    moveThenTurnLeft();
    paintLine("MediumSeaGreen", 2); 
  }

  //positions the painter to paint the color the flower face after coloring the leaf.
  public void getReadyToColorFace() {
    turnRight();
    walk(8);
    turnRight();
    walk(5);
  }

  //colors the face of the flower
  public void colorFace() {

    //paints the red part of the flower
    paintLine("FireBrick", 6);
    turnAround();
    moveThenTurnLeft();
    moveThenTurnLeft();
    paintLine("FireBrick", 3);
    turnRightThenMove();
    paintLine("FireBrick", 3);
    turnRightThenMove();
    paintLine("FireBrick", 2);
    turnLeft();
    paintLine("FireBrick", 1);
    turnRight();
    paintLine("FireBrick", 6);
    turnAround();
    moveThenTurnLeft();
    moveThenTurnLeft();
    paintLine("FireBrick", 3);
    turnRightThenMove();
    paintLine("FireBrick", 3);
    turnRightThenMove();
    paintLine("FireBrick", 3);
    walk(6);
    turnRightThenMove();
    paintLine("FireBrick", 3);
    turnRight();
    walk(9);
    turnRightThenMove();
    paintLine("FireBrick", 3);
    turnRight();
    walk(3);
    
    //paints the orange part of the flower
    paintLine("DarkOrange", 4);
    turnRight();
    moveThenTurnLeft();
    paintLine("DarkOrange", 1);
    turnRight();
    paintLine("DarkOrange", 2);
    turnRight();
    paintLine("DarkOrange", 2);
    turnLeft();
    moveThenTurnRight();
    paintLine("DarkOrange", 4);
    turnRight();
    moveThenTurnLeft();
    paintLine("DarkOrange", 1);
    turnRight();
    paintLine("DarkOrange", 2);
    turnRight();
    paintLine("DarkOrange", 2);
    move();
    
    //paints the yellow part of the flower
    paintLine("Yellow", 2);
    moveThenTurnRight();
    move();
    paintLine("Yellow", 1);
    turnRight();
    walk(2);
    paintLine("Yellow", 2);
    moveThenTurnRight();
    move();
    paintLine("Yellow", 1);
    turnRight();
    walk(2);
    turnRight();
    moveThenTurnLeft();

    //paints the white part of the flower
    paintLine("white", 2);
    turnLeft();
    move();
    turnAround();
  }

  //draws the eyes of the flower
  public void paintEyes() {
    paintLine("black", 3);
    turnRight();
    walk(3);
    turnRightThenMove();
    paintLine("black", 3);
  }

  //returns the painter to the starting point after drawing the eyes
  public void goToStartingPoint() {
    while (canMove()) {
      if (canMove()) {
        move();
      }
    }
    turnLeft();
    while (canMove()) {
      if (canMove()) {
        move();
      }
    }
    turnAround();
      }     

  //moves the painter a certain amount of spaces 
  public void walk(int steps) {
    for (int i = 0; i < steps; i++) {
      move();
    }
  }

  //moves the painter, then turns left
  public void moveThenTurnLeft() {
    move();
    turnLeft();
  }

  //moves the painter, then turns right
  public void moveThenTurnRight() {
    move();
    turnRight();
  }

  //makes the painter turn right, then move
  public void turnRightThenMove() {
    turnRight();
    move();
  }
}