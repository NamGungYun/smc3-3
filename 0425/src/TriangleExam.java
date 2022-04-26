
public class TriangleExam {

	public static void main(String[] args) {
		
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : "+tr.getArea());
		tr.setSize(7.5, 9.2);
		System.out.println("º¯°æµÈ »ï°¢ÇüÀÇ ³ÐÀÌ : "+ tr.getArea());
		
	}

}
class Triangle{
	double bottom;
	double height;
	public Triangle(double b, double h){
		this.bottom = b;
		this.height = h;
	}
	public void setSize(double b, double h) {
		this.bottom = b;
		this.height = h;
	}
	public double getArea() {
		return bottom*height/2;
	}
}