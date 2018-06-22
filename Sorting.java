import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sorting implements Comparable<E>{
private <E> void swap(E[] inputArray, int i, int j) {
    if (i != j) {
        E temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}

	public <E extends Comparable<E>> void sortArray(E[] inputArray)
	{
		
		for(int i=0;i<inputArray.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<inputArray.length;j++)
			{
				if (inputArray[j].compareTo(inputArray[min])<=0) {
                    min = j;
                }
			}
			swap(inputArray,i,min);
		}
	}
public static void main(String args[]) {
	
	Sorting firstsort = new Sorting();

    Integer[] arr = {3,4,1,5};
    System.out.println("before sorting int: "+ Arrays.toString(arr));
    firstsort.sortArray(arr);
    
}
}

	
	
