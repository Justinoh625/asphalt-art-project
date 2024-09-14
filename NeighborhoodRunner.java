import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //Instantiates a new asphalt painter
    AsphaltPainter backgroundPainter = new AsphaltPainter();

   //paints the background to a light cyan color
   backgroundPainter.paintBackground("LightCyan", 16);
   
   //paints the background stripes to a deep sky blue color
   backgroundPainter.paintBackgroundStripes("DeepSkyBlue", 16);

    //Instiantiated fire flower painter to paint the flower
    FireFlowerPainter ffp = new FireFlowerPainter();

    //paints the fire flower image
    ffp.paintFireFlower(); 
  }
}