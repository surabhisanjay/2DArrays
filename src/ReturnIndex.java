public class ReturnIndex {
    public static void main(String[] args) {
        int[] array = {1,2,5,8};
        returnIndex(array,3);
        returnIndex(array,6);
    }
    public static void returnIndex(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if (arr[i]==target){
                System.out.println(i);
            }
            if(target > arr[i]&& target < arr[i+1]) {
                    System.out.println(i + 1);
                }
            if ( target > arr[arr.length-1] ){
                    System.out.println(arr.length-1);
                }
            }
        }

    }

