
public class BubbleSortAlgo {

	int start_c=0;
	int end_c;
	public void getArrayDetails(Integer [] arr){
		end_c=arr.length-1;
	}
	
	public void sortArray(Integer [] arr){
		getArrayDetails(arr);
		System.out.println("End point"+end_c);
		String arrD="";
		for (int j=0;j<=end_c;j++){
			arrD+=arr[j];
		}
		System.out.println("Arr details"+arrD);
		int temp;
		for (int x=0;x<end_c;x++){
			for (int i=0;i<end_c;i++){
				if (arr[i] > arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr [i+1]=temp;
				}
			}
		}

		for (int j=0;j<=end_c;j++){
			System.out.println(arr[j]);
		}
	}
}
