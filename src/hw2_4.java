/**
 *       private member
 *       public methods
 *       constructor & initialization
 */

/**
 * @author Tim
 *
 */
public class hw2_4 {

  private int waitTime;
  
  /**
   * @param args
   */
  
  public hw2_4() {
    waitTime = 1;
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

    hw2_4 myObj = new hw2_4();

    for( int i=0; i<4; i++ ) {

      myObj.print();
      myObj.waitHW();

    }
    
    System.out.println("Hello, World");
    
  }  //  end method main

}  //  end class hw2
