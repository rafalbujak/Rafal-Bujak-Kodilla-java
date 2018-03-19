package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    // TODO

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test

    public void testOddNumbersExterminatorEmptyList(){
         /*
        check if the class behaves correctly when the list is empty
         */

        // Given
        OddNumbersExterminator exterminatorTest = new OddNumbersExterminator();
        // When
        ArrayList <Integer> newArrayListForClassOddNumbersExterminator = new ArrayList<>();
        ArrayList <Integer> results = new ArrayList<>();
        // Then
        Assert.assertEquals(exterminatorTest.exterminate(newArrayListForClassOddNumbersExterminator), results);


    }

    @Test

    public void testOddNumbersExterminatorNormalList(){


         /*
        check if the class behaves correctly when the list contains even and odd numbers
         */


        // Given
        OddNumbersExterminator exterminatorTest = new OddNumbersExterminator();

        // When
        ArrayList <Integer> testExterminator = new ArrayList<>();
        ArrayList <Integer> tempArray = new ArrayList<>();
        ArrayList <Integer> results = new ArrayList<>();

        // initialization ArrayList for test

        testExterminator.add(2);
        testExterminator.add(1);
        testExterminator.add(3);
        testExterminator.add(4);
        testExterminator.add(5);
        testExterminator.add(4);
        testExterminator.add(5);
        testExterminator.add(9);


        for (int i = 0; i < testExterminator.size(); i++){

            if (testExterminator.get(i) % 2 == 0){
                int temp;
                temp = testExterminator.get(i);
                tempArray.add(temp);
            }
        }
        // New Array List for checking result of Test



        // Checking if return result is OK

        results = exterminatorTest.exterminate(tempArray);


        // Then

        Assert.assertEquals(exterminatorTest.exterminate(testExterminator), results);

    }
}
