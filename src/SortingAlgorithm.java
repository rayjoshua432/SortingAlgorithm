
public class SortingAlgorithm {
	private int hold;
	private String all;
	private long startTime, stopTime, elapsedTime;
	
	public void display(int[] arr, int n) {
		for ( int i = 0; i < n; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	} 
	
	public String bubbleSort(int num[]) {
		all = "";
		startTime = System.nanoTime();
		for (int i = 0; i < num.length; i++) {
			System.out.println("\nPass #" + (i+1) + ":\n");
			for (int j = 0; j < num.length-1; j++) {
				if(num[j] >num[j+1]) {
					hold = num[j+1];
					num[j+1] = num[j];
					num[j] = hold;
				}
				System.out.println("Iteration #" + (j+1) + ": ");
				display(num, num.length);
			}
			System.out.print("\n");
			for (int val:num) {
				all += val+"\t";
			}
			all += "\n";
		}
		
		stopTime = System.nanoTime();
		elapsedTime = stopTime-startTime;
		all += "\nTime Efficiency:\t" + elapsedTime + " units";
		return all;
	}
	
	public String exchangeSort(int num[]) {
		int loop = 0;
		all = "";
		startTime = System.nanoTime();
		for ( int i = 0; i < num.length-1; i++) {
			System.out.println("\nPass #" + (i+1) + ":\n");
			for ( int j = (i+1); j < num.length; j++ ) {
				if (num[i] > num[j]) {
					int temp = num[j]; 
					num[j] = num[i]; 
					num[i] = temp;
				}
				loop ++;
				System.out.println("Iteration #" + loop + ": ");
				display(num, num.length);
			}
			loop = 0;
			for (int val:num) {
				all += val+"\t";
			}
			all += "\n";
		}
		
		stopTime = System.nanoTime();
		elapsedTime = stopTime-startTime;
		all += "\nTime Efficiency:\t" + elapsedTime + " units";
		return all;
	}
	
	public String selectionSort(int num[]) {
		int loop = 0;
		all = "";
		startTime = System.nanoTime();
		int low;
		for ( int i = 0; i < num.length; i++) {
			System.out.println("\nPass #" + (i+1) + ":\n");
			low = i;
			for ( int j = (i+1); j < num.length; j++) {
				if (num[low] > num[j]) {
					low = j;
				}
				loop++;
				System.out.println("Iteration #" + loop + ": ");
				display(num, num.length);
			}
			loop = 0;
			int temp = num[low]; 
			num[low] = num[i];  
			num[i] = temp; 
			
			for (int val:num) {
				all += val+"\t";
			}
			all += "\n";
		}
		stopTime = System.nanoTime();
		elapsedTime = stopTime-startTime;
		all += "\nTime Efficiency:\t" + elapsedTime + " units";
		return all;
	}
	
	public String insertionSort(int num[]) {
		int loop = 0;
		all = "";
		startTime = System.nanoTime();
		int key, i=0, j=0;
		for (i = 1; i < num.length; i++) {
			System.out.println("\nPass #" + i + ":\n");
			key = num[i]; // 48
			for ( j = (i-1); (j>=0 && num[j]>key); j--) {
				num[j+1] = num[j]; 				  	  
			}
			num[j+1] = key;
			loop++;
			System.out.println("Iteration #" + loop + ": ");
			display(num, num.length);
			
			loop = 0;
			for (int val:num) {
				all += val+"\t";
			}
			all += "\n";	
		}

		stopTime = System.nanoTime();
		elapsedTime = stopTime-startTime;
		all += "\nTime Efficiency:\t" + elapsedTime + " units";
		return all;
	}
}
