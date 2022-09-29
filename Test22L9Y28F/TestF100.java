package Test22L9Y28F;

class Outter{
    private String name="凤姐";
    public  int add(int a, int b){return new Inner().addFun(a,b);}
    public class Inner{
        private String name="刘亦菲";
        public int age=18;
        public int addFun(int a,int b){
//            System.out.println(age);
//            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outter.this.name);
            return a+b; }}
}
public class TestF100 {
    public static void main(String[] args) {
        //-----实例化外部类对象------
        Outter o =new Outter();
        System.out.println(o.add(1,3));
        //-----直接实例化内部类对象------
        Outter.Inner ii = new Outter().new Inner();
        System.out.println(ii.addFun(3,2));
        System.out.println(ii.age);
    }
}
