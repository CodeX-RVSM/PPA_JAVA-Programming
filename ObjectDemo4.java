class Student implements Cloneable
{
    public String Name;
    public int Age;
    public int Marks;

    public Student(String A, int B, int C)
    {
        this.Name = A;
        this.Age = B;
        this.Marks = C; 

    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class ObjectDemo4

{
    public static void main(String A[])
    {
        {
            Student sobj = new Student("Sagar",21,89);
        }
    }
}
