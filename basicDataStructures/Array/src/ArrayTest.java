/**
 * rotate array
 **/

public class ArrayTest {

	public static int[] rotateArrayUsingTempArray(int[] inputArray, int rotations) {
		int[] temp = new int[rotations];
		for (int i = 0; i < rotations; i++) {
			temp[i] = inputArray[i];
		}
		for (int i = rotations, j = 0; i < inputArray.length; i++, j++) {
			inputArray[j] = inputArray[i];
		}
		for (int i = inputArray.length - rotations, j = 0; i < inputArray.length; i++, j++) {
			inputArray[i] = temp[j];
		}
		return inputArray;
	}

	public static int[] rotateArrayOneByOne(int[] inputArray, int rotations) {
		for (int i = 0; i < rotations; i++) {
			int temp = inputArray[0];
			for (int j = 0; j < inputArray.length-1; j++) {
				inputArray[j] = inputArray[j + 1];
			}
			inputArray[inputArray.length - 1] = temp;
		}
		return inputArray;
	}
}
