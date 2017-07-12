
public class MergeSortAlgo {

	int start_c=0;
	int end_c;
	int count_l1=0;
	int count_l2=0;
	
	//Integer[] newInt =new Integer[] {80,4908,6,213342,5,945,3,9831,15,345,83743,99834};
	public void getArrayDetails(Integer [] arr){
		end_c=arr.length;
		
	}
	
	public Integer[] merge(Integer[] arr1,Integer[] arr2){
		int min,max;
		Integer [] arrS=new Integer[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while (i<arr1.length && j<arr2.length){
			if (arr1[i]<=arr2[j]){
				arrS[k]=arr1[i];
				i++;
			}
			else {
				arrS[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		while (i<arr1.length){
			arrS[k]=arr1[i];
			i++;
			k++;
		}
		while (j<arr2.length){
			arrS[k]=arr2[j];
			j++;
			k++;
		}
		for (int x=0;x<arrS.length;x++){
			System.out.println(arrS[x]);
		}
		return arrS;
	}
	
	public Integer [] mergeSort(Integer[] arr,int start,int end){
		if (end==1){

			return arr;
		}
			
		
		int mid = (start+end)/2;
		Integer[] l1=new Integer[mid-start];
		Integer[] l2=new Integer[end-mid];
		
		for (int j=0;j<l1.length;j++){
			l1[j]=arr[j];
		}
		
		for (int j=0;j<l2.length;j++){
			l2[j]=arr[j+mid];
		}
		
		l1=mergeSort(l1,start,mid);
		l2=mergeSort(l2,0,end-mid);
		
		return merge(l1,l2);
		
	}
	
	public void sortArray(Integer [] arr){
		getArrayDetails(arr);
		Integer arrr[] = mergeSort(arr,start_c,end_c);
		
		for (int j=0;j<end_c;j++){
			System.out.println(arrr[j]);
		}
	}
}
