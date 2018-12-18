/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  /** Method to test the keepOnlyBlue method **/

  public static void testKeepOnlyBlue() {
    Picture bike = new Picture("blueMotorcycle.jpg");
    bike.keepOnlyBlue();
    bike.explore();
  }

  public static void testNegate() {
    Picture butterfly = new Picture("butterfly1.jpg");
    butterfly.negate();
    butterfly.explore();
  }

  public static void testGrayscale() {
    Picture swan = new Picture("swan.jpg");
    swan.grayscale();
    swan.explore();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("water.jpg");
    water.fixUnderwater();
    water.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture cat = new Picture("caterpillar.jpg");
    cat.mirrorVerticalRightToLeft();
    cat.explore();
  }

  public static void testMirrorHorizontalTopToBottom() {
    Picture gorge = new Picture("swan.jpg");
    gorge.mirrorHorizontalTopToBottom();
    gorge.explore();
  }

  public static void testMirrorHorizontalBottomToTop() {
    Picture gorge = new Picture("swan.jpg");
    gorge.mirrorHorizontalBottomToTop();
    gorge.explore();
  }

  public static void testMirrorArms() {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void testMirrorGull() {
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testFixUnderwater();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorHorizontalTopToBottom();
    //testMirrorHorizontalBottomToTop();
    //testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}