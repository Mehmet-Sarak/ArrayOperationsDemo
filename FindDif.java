public class FindDif{

    public float[] averageDif(int[] arr){

  float sum = 0;
  float[] result = new float[arr.length + 1];


   for(int i=0; i<arr.length; i++){
   
    sum+= arr[i];

   }

 float average = sum / arr.length;

  for(int i=0; i<arr.length; i++){

    if(arr[i] >= average){
        result[i] = arr[i] - average;
    }else{
        result[i] = average - arr[i];
    }
  }

  result[arr.length] = average;
   return result;
}
}