package com.interview.puzzle;

/**
 * In front of you are three boxes. One contains only apples, one contains only oranges 
 * and one contains a mix of apples and oranges. Each box is labeled, like this:
 * 
 * Box 1: “apples”
 * Box 2: “oranges”
 * Box 3: “apples & oranges”
 * 
 * Unfortunately, all three boxes are mislabeled. You should fix those labels.
 * 
 * Here’s the challenge: You get to choose one, and only one, box. 
 * You should take a randomly selected piece of fruit from your chosen box 
 * and check what is the fruit.  After that, you will be able to accurately 
 * and definitively relabel all three boxes.
 * 
 * @author Paulvanann Balasubramanian
 *
 */
public class FruitsAndBoxesPuzzle {
	public enum Fruits{
		APPLES, ORANGES, APPLES_AND_ORANGES;
	}
	public static class Box{
		private Fruits fruits;
		private Fruits label;
		public Box(Fruits fruits, Fruits label){
			this.fruits = fruits;
			this.label = label;
		}
		public Fruits getFruits() {
			return fruits;
		}
		public void setFruits(Fruits fruits) {
			this.fruits = fruits;
		}
		public Fruits getLabel() {
			return label;
		}
		public void setLabel(Fruits label) {
			this.label = label;
		}
		public boolean isLabelMatches(){
			return this.fruits == this.label;
		}
		@Override
		public String toString() {
			return "Box [fruits=" + fruits + ", label=" + label + "]";
		}
	}
	
	/**
	 * Create an array of three boxes.
	 * Place the box with APPLES_AND_ORANGES at position 0
	 *    We know that all labels and fruits are misplaced.
	 *    So if you pick a fruit from Box[0], it will be either APPLES or ORANGES 
	 * Swap the labels of Box[0] and Box[1]
	 * If the label of Box[0] is same as fruit
	 *    THEN Swap labels of Box[1] AND Box[2]
	 *    ELSE Swap labels of Box[0] AND Box[2]
	 *  
	 * @param box1
	 * @param box2
	 * @param box3
	 */
	public void fixLabelsOnBoxes(Box box1, Box box2, Box box3){
		Box[] boxes = new Box[3];
		boxes[0] = box1;
		boxes[1] = box2;
		boxes[2] = box3;
		Box tmpBox = boxes[0];
		//Move APPLES_AND_ORANGES to first position
		for(int i=1;i<3;i++){
			if(boxes[i].getLabel() == Fruits.APPLES_AND_ORANGES){
				boxes[0] = boxes[i];
				boxes[i] = tmpBox;
				break;
			}
		}
		swapLabels(boxes[0], boxes[1]);
		if(boxes[0].isLabelMatches()){
			swapLabels(boxes[1],boxes[2]);
		}else{
			swapLabels(boxes[0],boxes[2]);
		}
	}
	private void swapLabels(Box box1, Box box2){
		Fruits tmpLabel = box1.getLabel();
		box1.setLabel(box2.getLabel());
		box2.setLabel(tmpLabel);
	}
} 
