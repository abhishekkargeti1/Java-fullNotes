public class JaggedArray 
{

  public static void main(String[] args) 
  {
    
    int arr[][] = new int[2][];
    
    arr[0] = new int[3];
    arr[1] = new int[2];
    
    int count = 0;
    
    for(int i=0 ; i<arr.length ; i++)
    {
      for(int j=0 ; j<arr[i].length ; j++)
      {
        arr[i][j] = count++;
      }
    }
    
    System.out.println("Contents of 2D Jagged Array");
    
    for(int j=0 ; j<arr.length ; j++)
    {
      for(int i=0 ; i<arr[j].length ; i++)
      {
        System.out.print(arr[j][i]+" ");
      }
      
      System.out.println();
    }
  }

}
    

