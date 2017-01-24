import java.util.*;

public class Sort{
	public Sort(){
		
	}
	
	public static void MergeSort(int[] a, int left, int right){
	    
	    if(left < right){
          	int middle = left + (right - left)/2;
          
          	MergeSort(a, left, middle);
          	MergeSort(a, middle + 1, right);
          	Merge(a, left, middle, right);
	    }
	}
  
  	public static void Merge(int[] a, int left, int middle, int right){
  	    int tSize = right - left + 1;
  		int[] temp = new int[a.length];
  		
  		int tIndex = left;
  		int leftIndex = left;
  		int rightIndex = middle + 1;
  		
  		while( leftIndex <= middle && rightIndex <= right){
  		    if(a[leftIndex] < a[rightIndex]){
  		        temp[tIndex] = a[leftIndex];
  		        tIndex++;
  		        leftIndex++;
  		    }
  		    else{
				temp[tIndex] = a[rightIndex];
				tIndex++;
				rightIndex++;
  		    }
  		}
  		while(leftIndex <= middle){
  		    temp[tIndex] = a[leftIndex];
  		    tIndex++;
  		    leftIndex++;
  		}
  		while(rightIndex <= right){
  		    temp[tIndex] = a[rightIndex];
  		    tIndex++;
  		    rightIndex++;
  		}
  		
  		for(int i = 0; i < tSize; i++, right--){
  		    a[right] = temp[right];
  		}
  	}
	
	public static void main(String[] args){
		int[] a = {3,5,1,6,8,11,20,5,4,4,3,6,7,5,12};
		MergeSort(a, 1, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}