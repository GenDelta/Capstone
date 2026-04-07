public class BubbleSort {
    public static void main(String[] args) {
        // int arr[] = {64,34,25,12,11,90};
        int arr[] = {11,12,13,14,15};
        boolean swapped = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}