// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointP extends PointAbstraction
{
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointP(char type, double xOrRho, double yOrTheta)
  {
    typeCoord = type;
    if (type == 'P') {
      this.xOrRho = xOrRho;
      this.yOrTheta = yOrTheta;
    }
    else if (type == 'C') {
      this.xOrRho = (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
      this.yOrTheta = Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
    }
    else
      throw new IllegalArgumentException();
  }
  
  
  //Instance methods **************************************************
 
 public char type() {
  return typeCoord;
 }
 
  public double getX()
  {
    return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getY()
  {
    return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }
  
  public double getRho()
  {
    return xOrRho;
  }
  
  public double getTheta()
  {
    return yOrTheta;
  }

/**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointC rotatePoint(double rotation) {
      double radRotation = Math.toRadians(rotation);
      double X = getX();
      double Y = getY();

      return new PointC('C',
          (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
          (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

}