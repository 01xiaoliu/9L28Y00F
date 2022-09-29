package Test22L9Y28F;

class Outter300{
    private String name="芙蓉";
    public void show(){
        String name="李芙蓉";
       // System.out.println(name);
        final String addt ="湖南";
        class opo{
            private String name ="王芙蓉";
            public void opi(){
                System.out.println(name);
                System.out.println(Outter300.this.name);
                System.out.println(addt);
            }
        }
        new opo().opi();//
    }
}
public class TestF300 {
    public static void main(String[] args) {
        new Outter300().show();
        System.out.println();
    }
}
