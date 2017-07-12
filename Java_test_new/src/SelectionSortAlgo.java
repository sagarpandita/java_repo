
public class SelectionSortAlgo {

	int start_c=0;
	int end_c;
	public void getArrayDetails(Integer [] arr){
		end_c=arr.length-1;
	}
	
	public void sortArray(Integer [] arr){
		getArrayDetails(arr);
		int min_val;
		int temp,pos=0;
		for (int j=0;j<=end_c;j++){
			min_val=arr[j];
			pos=j;
			//System.out.println(min_val);
			
			for (int i=j+1;i<=end_c;i++){
				
				if (arr[i]<min_val){
					//System.out.println("Entering Condition: "+arr[i]+"<" +min_val);
					min_val=arr[i];
					pos=i;
				}
			}
			temp=arr[j];
			arr[j]=arr[pos];
			arr[pos]=temp;
			
			/*System.out.println("array details after run: " +j);
			for (int x=0;x<=end_c;x++){
				System.out.println(arr[x]);
			}*/
		}
		
		for (int j=0;j<=end_c;j++){
			System.out.println(arr[j]);
		}

	}
}
