
public class PointC extends PointAbstraction {

	//constructor
	public PointC(char typeCoord, double xOrRho, double yOrTheta){
		this.typeCoord=typeCoord;
		if (typeCoord=='C'){
			this.xOrRho=xOrRho;
			this.yOrTheta=yOrTheta;
		}
		else if (typeCoord=='P') {
			this.xOrRho=Math.cos(Math.toRadians(yOrTheta)) * xOrRho;
			this.yOrTheta=Math.sin(Math.toRadians(yOrTheta)) * xOrRho;
		}
		else {
			throw new IllegalArgumentException();

		}
	}
	
	
	//instance methods
	public double getX(){
		return xOrRho;
	}
	
	public double getY(){
		return yOrTheta;
	}
	
	public double getRho(){
		return Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2));
	}
	
	public double getTheta(){
		return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
	}
	
	
	
	
	public PointC rotatePoint(double rotation)
	  {
	    double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	        
	    return new PointC('C',
	      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
	      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	  }
	
}
