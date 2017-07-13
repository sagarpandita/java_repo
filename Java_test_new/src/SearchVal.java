import java.util.*;

public class SearchVal {
	public void searchVal(ArrayList<Integer> arr, int a){
		int first_instance=0;
		String all_instances="";
		//Integer x = new Integer(a);
		//System.out.println(x);
		first_instance=arr.indexOf(a);
		for (int i=0;i<arr.size();i++){
			//System.out.println(arr.get(i));
			if (arr.get(i)==a){
				all_instances=all_instances+i+",";
			}
			//System.out.println(all_instances);
		}
		all_instances=all_instances.substring(0, all_instances.length()-1);
		System.out.println("First Instance of the value is at "+first_instance+" location");
		System.out.println("All Instances of the value is at "+all_instances+" locations");
	}
	
	public static void searchValSorted(Integer[] arr, int start, int end,int a){
		int sc=start;
		int ec=end;
		System.out.println("Ini ec:"+ec); 
		ArrayList<Integer> res_arr= new ArrayList<Integer>();
		while (sc<=ec){
			int len=ec-sc;
			int cur_sc=sc+len/2;
			System.out.println("Cur Sec:"+cur_sc);
			if (arr[cur_sc]==a){
				 
				res_arr.add(cur_sc);
				break;
			}
			else if (arr[cur_sc]>a){
				ec=cur_sc-1;
				System.out.println("lower:"+ec);
				SearchVal.searchValSorted(arr,sc,ec,a);
			}
			else{
				sc=cur_sc+1;
				System.out.println("higher:"+sc);
				SearchVal.searchValSorted(arr,sc,ec,a);
			}
		}
		
		System.out.println(res_arr);
		//String x;
	}
}
