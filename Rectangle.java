
public class Rectangle {
	public int width;
	public int height;
	
	public Rectangle() {
		
	}
	public void Rectengle(int w,int h) {
		width = w;
		height = h;
	}
	public int getArea() {
		return width*height;
	}
	public int getParimeter() {
		return width*4;
	}
	public String toString() {
		return "Width : "+width+" Height : "+height+" Area : "+getArea()+" Parimeter : "+getParimeter();
	}
	
}
