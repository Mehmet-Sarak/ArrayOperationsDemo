public class MinMax{

    public int findMax(int[] arr){

 int max = Integer.MIN_VALUE;

  for(int i=0; i<arr.length; i++){

    max = Math.max(max,arr[i]);
  }

  return max;

  
}


public int findMin(int[] arr){

    int min = Integer.MAX_VALUE;
   
    for(int i=0; i<arr.length; i++){

        min = Math.min(min,arr[i]);
    }

    return min;
}

}