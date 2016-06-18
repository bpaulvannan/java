package com.interview.puzzle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.interview.puzzle.FruitsAndBoxesPuzzle.Box;
import com.interview.puzzle.FruitsAndBoxesPuzzle.Fruits;

/**
 * Test cases to test Fruits and Boxes Puzzle
 * 
 * @author Paulvannan Balasubramanian
 *
 */
public class FruitsAndBoxesPuzzleTest {

	@Test
	public void testFixLabelsOnBoxes(){
		Box box1 = new Box(Fruits.APPLES_AND_ORANGES, Fruits.APPLES);
		Box box2 = new Box(Fruits.APPLES, Fruits.ORANGES);
		Box box3 = new Box(Fruits.ORANGES, Fruits.APPLES_AND_ORANGES);
		
		FruitsAndBoxesPuzzle puzzle = new FruitsAndBoxesPuzzle();
		puzzle.fixLabelsOnBoxes(box1, box2, box3);
		assertEquals(true, box1.isLabelMatches());
		assertEquals(true, box2.isLabelMatches());
		assertEquals(true, box3.isLabelMatches());
	}
}
