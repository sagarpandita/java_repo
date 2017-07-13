//import java.util.*;

public class RunClass {
	
	public static void main (String args[]){
		//BinarySearchTree tree = new BinarySearchTree();
		//tree.add(10);

		
		/*ArrayList<Integer> arr = new ArrayList<Integer>();
		Integer[] newInt =new Integer[] {1,2,4,3,5,5,6,8,1,1,3,2,1};
		arr.addAll(Arrays.asList(newInt));
		System.out.println(arr);*/
		//SearchVal sval = new SearchVal();
		//SearchVal.searchVal(arr, 5);
		
		Integer[] newInt =new Integer[] {80,4908,6,213342,5,945,3,9831,15,345,83743,99834};
		//int sc=0;
		//int ec= newSortedInt.length;
		//SearchVal.searchValSorted(newSortedInt,sc,ec,1);
		//BubbleSortAlgo bsa =new BubbleSortAlgo();
		//bsa.sortArray(newInt);
		//SelectionSortAlgo ssa = new SelectionSortAlgo();
		//ssa.sortArray(newInt);
		//InsertionSortAlgo isa =new InsertionSortAlgo();
		//isa.sortArray(newInt);
		MergeSortAlgo msa = new MergeSortAlgo();
		msa.sortArray(newInt);
	}
}
