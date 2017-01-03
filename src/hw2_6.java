/**
 *       passing data to method
 */

/**
 * @author Tim
 *
 */
public class hw2_6 {

  private int waitTime;
  
  /**
   * @param args
   */

  public hw2_6() {
    waitTime = 1;
  }

  public hw2_6( int w ) {
    waitTime = w;
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
 
  public static void main(String[] args) {

    hw2_6 myObj = new hw2_6( 4 );

    for( int i=0; i<4; i++ ) {

      myObj.print();

      myObj.waitHW( i );

    }
    
    System.out.println("Hello, World");
    
  }  //  end method main

}  //  end class hw2
