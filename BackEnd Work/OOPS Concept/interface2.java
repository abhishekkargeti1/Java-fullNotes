interface My
{
  void show();
  
}
interface My1
{
  void show();
}
class interface2 implements My,My1
{
  public void show()
  {
    System.out.println("Hello Show Method");
  }
  
  public static void main(String[] args)
  {
    My m = new interface2();
    My1 m1 = new interface2();
    m.show();
    m1.show();
  }
}