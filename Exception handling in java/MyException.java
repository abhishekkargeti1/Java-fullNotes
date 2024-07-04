class MyException extends Exception
{
  String msg;
  MyException(String msg)
  {
    this.msg = msg;
  }
  
  @Override
  public String toString() {
    return msg;
  }
  
  
  
}
