package exceptionsExample;

public class ExceptionsExample {
	public int[] arr1;
	public int[] arr2;
	
	public ExceptionsExample(int[] arr1, int[] arr2) {
		this.arr1 = arr1;
		this.arr2 = arr2;
	}
	//create method who returns array and his parameters are another two arrays
	public int[] devideArrays (int[] a1, int[] a2) {
		//new array has a smaller length from 1st parameter or 2nd
		int[] newArr;
		try {
			newArr = new int[a1.length];
		} catch (NullPointerException e) {
			newArr = new int[0];
			System.out.println("You didn't initiate first array!");
		}
		//use try-cathc block for division by zerro
		int j = 0;
		while(true) {
			try {
				//each cells on new array created by cell from 1st param divided by cell from 2nd
				for (int i = j; i < newArr.length; i++) {
					newArr[i] = a1[i] / a2[i];
					j++;
				}
				break;
			} catch (ArithmeticException e) {
				newArr[j] = 0;
				j++;
			} catch (IndexOutOfBoundsException e) {
				newArr = new int[a2.length];
				j = 0;
			} catch (NullPointerException e) {
					a1 = new int[0];
					a2 = new int[0];
					System.out.println("You didn't initiate arrays!");
			}
		}
		return newArr;
	}
}
