package StackTestJunit;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import StackPackage.TheStackClass;

public class TestStack {

	@Test
	public void testCreate() {
		TheStackClass tsc=TheStackClass.create();
		assertTrue(tsc.getArraySize()==100);
		
	}

	@Test
	public void testCreateInt() {
		TheStackClass tsc=TheStackClass.create(5000);
		assertTrue(tsc.getArraySize()==5000);
	}
	
	@Test
	public void testCreateIntNegative() {
		TheStackClass tsc=TheStackClass.create(-5000);
		assertTrue(tsc.getArraySize()==100);
	}

	@Test
	public void testTheStackClassInt() {
		
		TheStackClass tsc=new TheStackClass(10000);
		assertTrue(tsc.getArraySize()==10000);
	}

	@Test
	public void testTheStackClass() {
		TheStackClass tsc=new TheStackClass();
		assertTrue(tsc.getArraySize()==100);
	}

	@Test
	public void testPushOverload() {
		TheStackClass tsc=new TheStackClass(3);
		tsc.push(1);
		tsc.push(2);
		tsc.push(3);
		tsc.push(4);		
		assertTrue(tsc.getSize()==3);
	}
	
	@Test
	public void testPush() {
		TheStackClass tsc=new TheStackClass(4);
		tsc.push(1);
		tsc.push(2);
		tsc.push(3);
		tsc.push(3);		
		assertTrue(tsc.getSize()==4);

	}

	@Test
	public void testPop() {
		TheStackClass tsc=new TheStackClass(4);
		tsc.push(1);
		tsc.push(2);
		tsc.push(3);
		tsc.push(4);
		tsc.pop();
		tsc.pop();
		assertTrue(tsc.getSize()==2);
	}

	@Test
	public void testIsEmpty() {
		TheStackClass tsc=new TheStackClass(4);
		tsc.pop();
		assertTrue(tsc.getSize()==0);
	}

}
