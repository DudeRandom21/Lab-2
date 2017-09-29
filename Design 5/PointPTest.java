import java.io.*;
import java.util.Random;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;


public class PointPTest
{
  private static final int TEST_COUNT = 100000;

  private static Random gener = new Random();

  private static PointP[] point = new PointP[TEST_COUNT];
  //Class methods *****************************************************

  /**
   * This method is responsible for the creation of the PointCP
   * object. 
   * If the user does not enter a valid sequence at the command line,
   * the program will prompte him or her.
   *
   * @param args[0] The coordinate type.  P for polar and C for
   *                cartesian.
   * @param args[1] The value of X or RHO.
   * @param args[2] The value of Y or THETA.
   */
   
   
   
   //class variables
   private static final int runCount=31;
   private static long[] runArray=new long[runCount];
   private static long t1, t2;
   
   
  public static void main(String[] args)
  {
	  

	//method testConstruction('C')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testConstruction('C');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 1: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");

	
	
	//method testConstruction('P')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testConstruction('P');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 2: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");
	
	  
	//method testGetXGetY('C')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testGetXGetY('C');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 3: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");	  
	

	//method testGetXGetY('P')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testGetXGetY('P');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 4: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");


	//method testGetRhoGetTheta('C')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testGetRhoGetTheta('C');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 5: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");
	
	
	//method testGetRhoGetTheta('P')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testGetRhoGetTheta('P');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 6: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");

	
	//method testConvertStorage('C')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testConvertStorage('C');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 7: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");
	

	//method testConvertStorage('P')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testConvertStorage('P');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 8: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");


	//method testGetDistance('C')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testGetDistance('C');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 9: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");


	//method testGetDistance('P')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testGetDistance('P');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 10: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");


	//method testRotatePoint('C')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testRotatePoint('C');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 11: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");


	//method testRotatePoint('P')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testRotatePoint('P');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 12: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");


	//method testToString('C')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testToString('C');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 13: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");


	//method testToString('P')
	//runs happening
	for(int i=0;i<runCount;i++){
		//starttime
		t1 = System.nanoTime();
		//instances happening
		testToString('P');
		//end time
		t2 = System.nanoTime();
		//run times appended to array
		runArray[i]=t2-t1;
	}
	//get min,median,max of array
	Arrays.sort(runArray);
	System.out.println("Min,median,max time for method 14: " + runArray[0] + ", "+runArray[15]+", "+runArray[30]+"ns");
	
	
    // long t1 = System.nanoTime();
    // System.out.println("Average time for construction in Cartesian: " + testConstruction('C') + "ns");
    // System.out.println("Average time for construction in Polar: " + testConstruction('P') + "ns");
    // System.out.println("Average time for getX and getY in Cartesian: " + (testGetXGetY('C') ) + "ns");
    // System.out.println("Average time for getX and getY in Polar: " + (testGetXGetY('P') ) + "ns");
    // System.out.println("Average time for getRho and getTheta in Cartesian: " + (testGetRhoGetTheta('C') ) + "ns");
    // System.out.println("Average time for getRho and getTheta in Polar: " + (testGetRhoGetTheta('P') ) + "ns");
    // System.out.println("Average time for convertStorage: " + (testConvertStorage('C') ) + "ns");
    // System.out.println("Average time for convertStorage: " + (testConvertStorage('P') ) + "ns");
    // System.out.println("Average time for getDistance in Cartesian: " + (testGetDistance('C') - 2 ) + "ns");
    // System.out.println("Average time for getDistance in Polar: " + (testGetDistance('P') - 2 ) + "ns");
    // System.out.println("Average time for rotatePoint in Cartesian: " + (testRotatePoint('C') ) + "ns");
    // System.out.println("Average time for rotatePoint in Polar: " + (testRotatePoint('P') ) + "ns");
    // System.out.println("Average time for toString in Cartesian: " + (testToString('C') ) + "ns");
    // System.out.println("Average time for toString in Polar: " + (testToString('P') ) + "ns");
    // long t2 = System.nanoTime();

    // System.out.println("Total Elapse time for " + 14 * TEST_COUNT + " tests: " + (t2 - t1)/1000000000 + "s");




  }

  
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
