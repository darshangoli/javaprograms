class LinearSearch{

    public static int linearsearch(int[] arr, int targetValue){
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==targetValue){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {5,3,4,6,9,8,7};
        int targetValue = 4;
        int result = linearsearch(arr, targetValue);

        if(result != 1){
            System.out.println("Target found at index " +result);
        }
        else{
            System.out.println("Targrt element not found");
        }
    }
}