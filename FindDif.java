public class FindDif{

    public int[] averageDif(int[] arr){

  int sum = 0;
  int[] result = new int[arr.length];


   for(int i=0; i<arr.length; i++){
   
    sum+= arr[i];

   }

 int average = sum / arr.length;

  for(int i=0; i<arr.length; i++){

    if(arr[i] >= average){
        result[i] = arr[i] - average;
    }else{
        result[i] = average - arr[i];
    }
  }


   return result;
}
}