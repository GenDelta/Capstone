package Task2;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {12,9,8,6,4};
        int duplicate[]=new int[5];
        int c = 0;
        for(int i=4;i>=0;i--){
            duplicate[c] = arr[i];
            c++;
        }
        for(int i=0;i<5;i++){
            System.out.print(duplicate[i]+" ");
        }
    }
}
