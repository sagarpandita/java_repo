
public class InsertionSortAlgo {

	int start_c=0;
	int end_c;
	//Integer[] newInt =new Integer[] {80,4908,6,213342,5,945,3,9831,15,345,83743,99834};
	public void getArrayDetails(Integer [] arr){
		end_c=arr.length-1;
	}
	
	public void sortArray(Integer [] arr){
		int temp,pos=0;
		getArrayDetails(arr);
		for (int i=1;i<=end_c;i++){
			//boolean flag=true;
			int j;
			temp=arr[i];
			boolean flag=false;
			for (j=i-1;j>=0;j--){
				
				if (arr[j]>temp){
					arr[j+1]=arr[j];
					pos=j;
					flag=true;
				}
				
			}
			
			if (flag){
				arr[pos]=temp;
			}
		
		}
		
		for (int j=0;j<=end_c;j++){
			System.out.println(arr[j]);
		}
	}
}
