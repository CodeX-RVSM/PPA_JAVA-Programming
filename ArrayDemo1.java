


class ArrayDemo1 
{
    public static void main(String A[])     //Static
    {
        int Arr1[] = {10,20,30,40};

        System.out.println(Arr1[0]);
        System.out.println(Arr1[1]);
        System.out.println(Arr1[2]);
        System.out.println(Arr1[3]);

        System.out.println(Arr1.length);        //Dynamic

        int Arr2[] = new int[4];
        Arr2[0] = 10;
        Arr2[1] = 20;
        Arr2[2] = 30;
        Arr2[3] = 40;

    System.out.println(Arr2.length);

    }
    
}
