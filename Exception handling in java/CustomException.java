public class CustomException {
  
  
  static void div(int x,int y) throws MyException
  {
    if(y==0)
    {
      throw new MyException("Cannot Divide By zero");
    }
    else
    {
      System.out.println("Result is : "+(x/y));
    }
  }
  

  public static void main(String[] args) {
    
    try {
      div(10,0);
    } catch (MyException e) {
      
      System.out.println(e);
    }

  }

}