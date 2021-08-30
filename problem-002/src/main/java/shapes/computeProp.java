package project;
class polygon{
	int length,breadth,side,radius;
}
class Rectangle extends polygon 
{
    	public int getArea(int length,int breadth)
    	{
        return length * breadth;
    	}
    	public int getPerimeter(int length,int breadth) {
    	int res =length+breadth;
    	return 2*res;
    }
}
class Square extends polygon
{

  public int getArea(int side)
    {
        return side * side;
    }
   public int getPerimeter(int side) {
    	return 4*side;
    }
}

class Circle extends polygon
{
   public int getArea(int radius)
    {
        return (22/7) * radius * radius;
    }
    public int getPerimeter(int radius) {
    	return (22/7)*2*radius;
    }
}
public class computeProp{
		Rectangle r = new Rectangle();
        Square s = new Square();
        Circle c = new Circle();
        public void computeProperties1() {
        System.out.println("Perimeter of Rectangle : " + r.getPerimeter(10,4));
        System.out.println("Area of Rectangle : " + r.getArea(10,4));
        System.out.println("Perimeter of Square : " + s.getPerimeter(7));
        System.out.println("Area of Square : " + s.getArea(7));
        System.out.println("Perimeter of Circle : " + c.getPerimeter(3));
        System.out.println("Area of Circle : " + c.getArea(3));
    System.out.println();
	}
		
    public static void main(String arg[])
    {
    	computeProp t1 =new computeProp();
    	t1.computeProperties1();
    	
    }


	}
