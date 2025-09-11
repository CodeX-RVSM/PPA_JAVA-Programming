import Marvellous.Circle;

import Marvellous.Infosystems.Square;

class PackageDemo 
{
    public static void main(String Arg[])
    {
        Circle cobj = new Circle();
        foat Ans = 0.0f;

        Ans = cobj.CircleArea(10.5f);

        System.out.println("Area of circle is : "+Ans);
        
        Square sobj = new Square();
        Ans = sobj.SquareArea(10.5f);

        System.out.println("Area of square is : "+Ans);
    }
    
}
