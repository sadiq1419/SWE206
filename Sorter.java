
public class Sorter {
	static void swap(int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static int[] selectionSort(int[] array){
		int min;
		for (int i=0; i < array.length; i++) {
			min = i;
			for (int j=i; j<array.length; j++) {
				if(array[min] > array[j])
					min = j;
			}
			swap(array, i, min);
		}
		return array;
}

public static int[] insertionSort(int[] array){
	for (int i=1; i<array.length; i++) {
		for (int j=0; j<i; j++) {
			if(array[i] < array[j]){
				for(int k = i; k>j; k--){
					swap(array, k, k-1);
				}
				break;
			}
		}
	}
	return array;
}
}