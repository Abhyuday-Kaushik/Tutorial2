class GettersAndSetters
{
    int a;
    int b;
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a =a;
    }
    public int getB(){
        return b;
    }
    public void setB(int b)
    {
        this.b=b;
    }
    boolean compare(GettersAndSetters ob){
        return this.a==ob.a;
    }
}

public class Gfg{
    public static void main(String args[])
    {
        GettersAndSetters ob1=new GettersAndSetters();
        ob1.setA(23);
        GettersAndSetters ob2=new GettersAndSetters();
        ob2.setA(23);
        GettersAndSetters ob3=new GettersAndSetters();
        ob3.setA(46);
        System.out.println(ob1.compare(ob2));
        System.out.println(ob1.compare(ob3));
    }
}