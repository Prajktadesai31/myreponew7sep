

class Assignment
{

  public static void main(String[] args)
  {
   
    int x=10;

    int y=x;  // y<----x

    System.out.println("x= " +x +" " +"y= " +y);

    x+=5;  // x=x+5;
   
    System.out.println("x= " +x); //15
    
     x-=3; //x=x-3
    System.out.println("x= " +x); //12

    x*=2; //x=x*2
    System.out.println("x= " +x); //24

    x/=4;
    System.out.println("x= " +x); //6

    x%=4;
    System.out.println("x= " +x); //2

  }

} 
