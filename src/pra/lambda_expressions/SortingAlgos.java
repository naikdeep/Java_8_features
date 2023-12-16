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
     public static void main(String[] args) {
    	 System.out.println("my name is naik");
    	 
     }
    
    }

