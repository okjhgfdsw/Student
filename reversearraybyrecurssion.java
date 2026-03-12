public class Main
{
    
    public static void reverse(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
         reverse(arr,l+1,r-1);
    }
    public static void print(int []arr){
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
	public static void main(String[] args) {
    	    int arr[]={1,2,3,4,5};
		print(arr);
		reverse(arr,0,arr.length-1);
		print(arr);
	}
}
