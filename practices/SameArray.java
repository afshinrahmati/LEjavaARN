class SameArray{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {44,3,2,1};
        boolean result = true;
        for(int i = 0 ; i < arr1.length ; i++){
             result = contains(arr1, arr2[i]);
            if(!result){
                break;
            }
            
        }
                System.out.println(result);
 
    }
    public static boolean contains(int[] arr,int v){

        boolean result = false;
        for(int r : arr){
            if(r==v){
                result = true;
                break;
            }
        }

       return result;
    }


}