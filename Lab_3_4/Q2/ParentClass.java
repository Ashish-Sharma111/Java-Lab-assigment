public class ParentClass {
    public static int sum1;
    public static int sum2;
    public static void main(String[] args){

        // NotAllowed:- Class Cast Exception Error
        // ParentClass obj = new ParentClass();
        // int sum = obj.addNum();


        // UpCasting
        ParentClass obj1 = new ChildClass();
        sum1 = ((ChildClass)obj1).addNum();
        System.out.println(sum1);
        


        // DownCasting
        ParentClass obj4 = new ChildClass();
        ChildClass obj2 = (ChildClass)obj4;
        sum2 = ((ChildClass)obj2).addNum();
        System.out.println(sum2);
        
    }
    public void displayData()
    {
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
