package linkedList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest{
	private MyLinkedList<Integer> list1;

	@Before
	public void setUp() throws Exception{
		list1 = new MyLinkedList<>();
		list1.append(10);
		list1.append(20);
		list1.append(30);
		list1.append(40);
	}
	
	@Test
	public void testAdd_Size() {
		list1.add(5, 0);
		int expected = 5;
		int actual = list1.size();
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd_First() {
		list1.add(5, 0);
		String expected = "5 10 20 30 40 ";
		String actual = list1.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd_Second() {
		list1.add(15, 1);
		String expected = "10 15 20 30 40 ";
		String actual = list1.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void testAdd_SecondToLast() {
		list1.add(35, 3);
		String expected = "10 20 30 35 40 ";
		String actual = list1.toString();
		assertEquals(expected, actual);
	}

}