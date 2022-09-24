class A{
    int l=10;
    void length(){
        System.out.println(l);
    }
}
class B extends A {
    int b=20;
    void b(){
        System.out.println(l*b);
    }
}
class C extends B{
    int h=7;
    void area(){
        System.out.println(l*b*h);
    }
}
public class multiple{
    public static void main(String[] args) {
        C obj =new C();
        obj.length();
        obj.b();
        obj.area();
}
}