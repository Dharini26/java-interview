package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class computePropTest {
	Rectangle r=new Rectangle();
	Square s=new Square();
	Circle c=new Circle();
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(28,r.getPerimeter(10, 4));
		assertEquals(40,r.getArea(10, 4));
		assertEquals(28,s.getPerimeter(7));
		assertEquals(49,s.getArea(7));
		assertEquals(18,c.getPerimeter(3));
		assertEquals(27,c.getArea(3));
	}

}
