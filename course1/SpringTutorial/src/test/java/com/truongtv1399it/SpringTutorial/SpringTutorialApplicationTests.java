package com.truongtv1399it.SpringTutorial;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringTutorialApplicationTests {

	@Autowired
	private Algorithm BBSort;

	@Autowired
	private Algorithm treeSort;

	@Test
	void testBBSort() {
		int[] number = {1,2,3,4,5};
		int result = BBSort.sum(number);
		System.out.println(result);
		int expectedResult = 15;
		Assert.assertEquals(expectedResult,result);
	}

	@Test
	void testBBSortNoParameter() {
		int[] number = {};
		int result = BBSort.sum(number);
		System.out.println(result);
		int expectedResult = 0;
		Assert.assertEquals(expectedResult,result);
	}

	@Test
	void testTreeSort() {
		int[] number = {1,2,3,4,5};
		int result = treeSort.sum(number);
		System.out.println(result);
		int expectedResult = 0;
		Assert.assertEquals(expectedResult,result);
	}

	@BeforeEach
	void beforeEach(){
		System.out.println("Before each");
	}

	@AfterEach
	void afterEach(){
		System.out.println("After each");
	}

	@BeforeAll
	static void beforeAll(){
		System.out.println("Before all");
	}

	@AfterAll
	static void afterAll(){
		System.out.println("After all");
	}

}
