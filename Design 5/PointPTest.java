// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;
import java.util.Random;
import java.lang.reflect.InvocationTargetException;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointPTest
{
  private static final int TEST_COUNT = 10000000;

  private static Random gener = new Random();

  private static PointP[] point = new PointP[TEST_COUNT];
  //Class methods *****************************************************

  /**
   * This method is responsible for the creation of the PointP
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
    System.out.println("Average time for construction in Cartesian: " + testConstruction('C') + "ns");
    System.out.println("Average time for construction in Polar: " + testConstruction('P') + "ns");
    System.out.println("Average time for getX and getY in Cartesian: " + (testGetXGetY('C') ) + "ns");
    System.out.println("Average time for getX and getY in Polar: " + (testGetXGetY('P') ) + "ns");
    System.out.println("Average time for getRho and getTheta in Cartesian: " + (testGetRhoGetTheta('C') ) + "ns");
    System.out.println("Average time for getRho and getTheta in Polar: " + (testGetRhoGetTheta('P') ) + "ns");
    System.out.println("Average time for convertStorage: " + (testConvertStorage('C') ) + "ns");
    System.out.println("Average time for convertStorage: " + (testConvertStorage('P') ) + "ns");
    System.out.println("Average time for getDistance in Cartesian: " + (testGetDistance('C') - 2 ) + "ns");
    System.out.println("Average time for getDistance in Polar: " + (testGetDistance('P') - 2 ) + "ns");
    System.out.println("Average time for rotatePoint in Cartesian: " + (testRotatePoint('C') ) + "ns");
    System.out.println("Average time for rotatePoint in Polar: " + (testRotatePoint('P') ) + "ns");
    System.out.println("Average time for toString in Cartesian: " + (testToString('C') ) + "ns");
    System.out.println("Average time for toString in Polar: " + (testToString('P') ) + "ns");
  }

  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointP
   * object.
   *
   * @return A PointP constructed using information obtained 
   *         from the user.
   * @throws IOException If there is an error getting input from
   *         the user.
   */
  
  public static int testConstruction(char type)
  {
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT; i++)
    {
      point[i] = new PointP(type, gener.nextDouble(), gener.nextDouble());
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/TEST_COUNT);
  }

  public static int testGetXGetY(char type)
  {
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT; i++)
    {
      point[i].getX();
      point[i].getY();
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/TEST_COUNT);
  }

  public static int testGetRhoGetTheta(char type)
  {
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT; i++)
    {
      point[i].getRho();
      point[i].getTheta();
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/TEST_COUNT);
  }

  public static int testConvertStorage(char type)
  {
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT; i++)
    {
      if (type == 'C')
        point[i].convertStorageToPolar();
      else
        point[i].convertStorageToCartesian();
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/TEST_COUNT);
  }

  public static int testGetDistance(char type)
  {
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT-1; i++)
    {
      point[i].getDistance(point[i+1]);
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/(TEST_COUNT-1));
  }

  public static int testRotatePoint(char type)
  {
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT; i++)
    {
      point[i].rotatePoint(gener.nextDouble());
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/TEST_COUNT);
  }

  public static int testToString(char type)
  {
    long t1, t2;

    t1 = System.nanoTime();
    for(int i = 0; i < TEST_COUNT; i++)
    {
      point[i].toString();
    }
    t2 = System.nanoTime();

    return (int) ((t2 - t1)/TEST_COUNT);
  }
}
