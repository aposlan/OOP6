public class oop {

	public static void main(String[] args) {
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
		double average = 0;
		int[][] arr = {
				{234,5,2,5,6}, 
				{37,12,74,24,74}, 
				{94,37,34,78,28}, 
				{87,32,76,23,65},
				{65,32,76,43,69}
		};
		for (int currentRow = 0; currentRow < arr.length; currentRow++) {
			for (int currentElement = 0; currentElement < arr[currentRow].length; currentElement++) {
				if (min > arr[currentRow][currentElement]) {
					min = arr[currentRow][currentElement];
				}
				if (max < arr[currentRow][currentElement]) {
					max = arr[currentRow][currentElement];
				}
				sum += arr[currentRow][currentElement];
				average = sum / arr[currentRow].length;
			}
			System.out.print("Average: " + average);
			System.out.print(" | Sum: " + sum);
			System.out.print(" | Min: " + min);
			System.out.print(" | Max: " + max);
			System.out.println();
			average = 0;
			sum = 0;
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
		
	}

}