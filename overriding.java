class p{
    int l=10;
    void l(){
        System.out.println(l);
    }
}
class q extends p {
    int b=20;
    void l(){
        System.out.println(l*b);
    }
}
public class overriding{
    public static void main(String[] args) {
        q obj =new q();
        obj.l();
}
}