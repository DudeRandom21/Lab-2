// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;
import java.util.Random;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTest
{
  private static final int TEST_COUNT = 100000000;

  private static Random gener = new Random();
  //Class methods *****************************************************

  /**
   * This method is responsible for the creation of the PointCP
   * object.  This can be done in two ways; the first, by using the
   * command line and running the program using <code> java 
   * PointCPTest &lt;coordtype (c/p)&gt; &lt;X/RHO&gt; &lt;Y/THETA&gt;
   * </code> and the second by getting the program to prompt the user.
   * If the user does not enter a valid sequence at the command line,
   * the program will prompte him or her.
   *
   * @param args[0] The coordinate type.  P for polar and C for
   *                cartesian.
   * @param args[1] The value of X or RHO.
   * @param args[2] The value of Y or THETA.
   */
  public static void main(String[] args)
  {
    int cConstTime = testConstruction('C');
    int pConstTime = testConstruction('P');
    System.out.println("Average time for construction in Cartesian: " + cConstTime + "ns");
    System.out.println("Average time for construction in Polar: " + pConstTime + "ns");
    System.out.println("Average time for getX and getY in Cartesian: " + (testGetXGetY('C') - cConstTime) + "ns");
    System.out.println("Average time for getX and getY in Polar: " + (testGetXGetY('P') - cConstTime) + "ns");




// you need to store the value of the construction time
// you haven't finished the testGetXGetY






  }

  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointCP
   * object.
   *
   * @return A PointCP constructed using information obtained 
   *         from the user.
   * @throws IOException If there is an error getting input from
   *         the user.
   */
  
  public static int testConstruction(char type)
  {
    PointCP point; 
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT; i++)
    {
      point = new PointCP(type, gener.nextDouble(), gener.nextDouble());
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/TEST_COUNT);
  }

  public static int testGetXGetY(char type)
  {
    PointCP point; 
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT; i++)
    {
      point = new PointCP(type, gener.nextDouble(), gener.nextDouble());
      point.getX();
      point.getY();
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/TEST_COUNT);
  }
}
