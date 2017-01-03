/**
 *                Time
 */

/**
 * @author Tim
 *
 */
public class hw2_3 {

  /**
   * @param args
   */
  public static void main(String[] args) {

    int waitTime = 10;

    for(int i=0;i<4;i++) {
      System.out.println("hello, world");
      try {
        Thread.sleep( 1000 );
      } catch (InterruptedException interruptedException) {
          interruptedException.printStackTrace();
      }
    }

    System.out.println("Hello, World");

  }  //  end method main

}  //  end class hw2
