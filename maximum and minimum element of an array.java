public class Main
{
	public static void main(String[] args) {
		int arr[] = {3,6,8,4,5};
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
		    if(arr[i]<min){
		        min = arr[i];
		    }
		    if(arr[i]>max){
		        max = arr[i];
		    }
		}
		System.out.println("Maximum value is "+ max);
		System.out.println("Minimum value is "+ min);
	}
}
