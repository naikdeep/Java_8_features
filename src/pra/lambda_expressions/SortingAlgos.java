package pra.lambda_expressions;

@FunctionalInterface
public interface SortingAlgos {
	
    int[] sort(int[] arr,int i);
    default void insert_last(int[] arr,int i) {
    	if ((i>0) && (arr[i]<arr[i-1])){
    		int temp =arr[i] ;
    		arr[i]=arr[i-1];
    		arr[i-1]=temp;
    		insert_last(arr,i-1);
    	}
    }
    
    public static void main(String[] args)
    
    {  
    	
    	SortingAlgos insertionSort=(int[] arr,int i)->{
    		if (i==0) {
    			i=arr.length-1;}
    		if(i>0) {
    		 insertionSort.sort(arr, i-1);
    		 insertionSort.insert_last(arr,i);
    		 }
    		return arr;
    		
    		 
    		};
    		int[] unsorted= {2,6,3,8,15,10};
    		System.out.println(insertionSort.sort(unsorted, 6));
    		
    		
    	};
    }
}
