package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] names = {"Joe", "Steve", "Deez", "abs", "carb"};
		//2. print the third element in the array
		System.out.println(names [2]);
		//3. set the third element to a different value
		names[2]="DEEZ";
		//4. print the third element again
		System.out.println(names [2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		int [] numbers = new int[50];
		//6. make an array of 50 integers
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i]= new Random().nextInt(50);
					
		}
		//7. use a for loop to make every value of the integer array a random number
		int num = numbers [0];
		//8. without printing the entire array, print only the smallest number in the array
		for (int i = 1; i < numbers.length; i++) {
			if (num >numbers [i]) {
				num= numbers [i];
			}
		}
		
		//9 print the entire array to see if step 8 was correct
		System.out.println(num);
		//10. print the largest number in the array.
		
		int bigNum=numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (bigNum<numbers [i]) {
				bigNum= numbers[i];
			}
		System.out.println(bigNum);
		}
	}
}
