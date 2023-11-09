public class ChildClass extends ParentClass
{
    private int a=10;
    private int b=20;
    private int c;
    
    public int addNum()
    {
        c=a+b;
        super.displayData();
        return c;
    }
        
    
}
