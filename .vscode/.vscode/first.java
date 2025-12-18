class calculator{
    int a;//if we want to declare a variable ,then place it outside of method and inside the class
    public int add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}
public class first
{
    public static void main(String[] args){
        int num1=444;
        int num2=10;
        calculator calc=new calculator();
        int result=calc.add(num1,num2);
        System.out.println(result);
    }
}