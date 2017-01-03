/**
 *         array, delaration, initialization
 *         loop over all elements in array
 *         automatic int to String
 *         String concatenation
 */

/**
 * @author Tim
 *
 */
public class hw2_7 {

  private int waitTime;
  
  private int [] waitTimeArray;

  /**
   * @param args
   */

  public hw2_7() {
    waitTime = 1;
    waitTimeArray = new int[] { 4, 3, 2, 1 };
  }

  public hw2_7( int w ) {
    waitTime = w;
    waitTimeArray = new int[] { 4, 3, 2, 1 };
  }

  public void waitHW() {
    try {
      Thread.sleep( waitTime * 1000 );
    } catch (InterruptedException interruptedException) {
      interruptedException.printStackTrace();
    }
  }

  public void waitHW( int w ) {
    try {
      Thread.sleep( w * 1000 );
    } catch (InterruptedException interruptedException) {
      interruptedException.printStackTrace();
    }
  }

  public void print() {
    System.out.println("hello, world");
  }

  public void print( int id ) {
    System.out.println( id + "  hello, world" );
  }
 
  public static void main(String[] args) {

    hw2_7 myObj = new hw2_7( 4 );

    for( int wt : myObj.waitTimeArray ) {

      myObj.print( wt );

      myObj.waitHW( wt );

    }
    
    System.out.println("Hello, World");
    
  }  //  end method main

}  //  end class hw2
