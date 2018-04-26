
public class PointDev {
	public double x;
	public double y;
	public String name;
	
	public PointDev() {
		
	}
	public void SetXY(double x,double y,String n) {
		this.x = x;
		this.y = y;
		name = n;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public String toString() {
		return "X : "+x+" Y : "+y+" Name : "+ name;
	}
	public double distance() {
		return Math.sqrt(Math.pow(x-x, 2)+Math.pow(y-y, 2));
	}
	public double dotPoint() {
		return Math.pow(x-x, 2)+Math.pow(y-y, 2);
	}
}
