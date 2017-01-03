/**
 *      custom initialization in constructor
 */

/**
 * @author Tim
 *
 */
public class hw2_5 {

  private int waitTime;
  
  /**
   * @param args
   */

  public hw2_5() {
    waitTime = 1;
  }

  public hw2_5( int w ) {
    waitTime = w;
  }

  public void waitHW() {
    try {
      Thread.sleep( waitTime * 1000 );
    } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
    }    
  }

  public void print() {
    System.out.println("hello, world");
  }
 
  public static void main(String[] args) {

    hw2_5 myObj = new hw2_5( 4 );

    for( int i=0; i<4; i++ ) {

      myObj.print();

      myObj.waitHW();

    }
    
    System.out.println("Hello, World");
    
  }  //  end method main

}  //  end class hw2
