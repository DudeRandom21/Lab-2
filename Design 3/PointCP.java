
public class PointCP {
	
	//class variables
	private double xCoord;
	private double yCoord;
	
	
	private char typeCoord;
	
	
	//constructor
	public PointCP(char typeCoord, double xCoord, double yCoord){
		this.typeCoord=typeCoord;
		if (typeCoord=='C'){
			this.xCoord=xCoord;
			this.yCoord=yCoord;
		}
		else{
			this.xCoord=Math.cos(Math.toRadians(yCoord)) * xCoord;
			this.yCoord=Math.sin(Math.toRadians(yCoord)) * xCoord;
		}
	}
	
	
	//instance methods
	public double getX(){
		return xCoord;
	}
	
	public double getY(){
		return yCoord;
	}
	
	public double getRho(){
		return Math.sqrt(Math.pow(xCoord, 2) + Math.pow(yCoord, 2));
	}
	
	public double getTheta(){
		return Math.toDegrees(Math.atan2(yCoord, xCoord));
	}

	
	
	
	public void convertStorageToPolar(){
		typeCoord = 'P';
//    if(typeCoord != 'P')
//    {
//      //Calculate RHO and THETA
//      double temp = getRho();
//      yOrTheta = getTheta();
//      xOrRho = temp;
//      
//      typeCoord = 'P';  //Change coord type identifier
//    }
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
    public void convertStorageToCartesian(){
    	typeCoord = 'C';
//    if(typeCoord != 'C')
//    {
//      //Calculate X and Y
//      double temp = getX();
//      yOrTheta = getY();
//      xOrRho = temp;
//   
//      typeCoord = 'C';	//Change coord type identifier
//    }
  }
	
	
	
	
	public double getDistance(PointCP pointB){
	    // Obtain differences in X and Y, sign is not important as these values
	    // will be squared later.
	    double deltaX = getX() - pointB.getX();
	    double deltaY = getY() - pointB.getY();
	    
	    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}
	
	
	public PointCP rotatePoint(double rotation)
	  {
	    double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	        
	    return new PointCP('C',
	      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
	      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	  }
	
	public String toString(){
		return "Stored as " + (typeCoord == 'C' 
			       ? "Cartesian  (" + getX() + "," + getY() + ")"
			       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
	}
	
}
