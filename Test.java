class Test{
    public static void main(String args[]){
        System.out.println("Selection Sort");
        
        int arr[]={12,34,56,1,6,9};
        int temp=0;
        for(int i=0;i<arr.length;i++){
         
            //for selecting smallest element
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                  smallest=j;
                }
            }
            // Swapping smallest element to bigger element 
            temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}