public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.colorCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();		
   }
}