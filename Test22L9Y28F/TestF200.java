package Test22L9Y28F;

class Outter200{
    private String name ="王二";
    private static String adde ="深圳";
    public static class oio{
        String name2 ="凤姐";
        private static String adde ="东莞";
        public void test(){
            System.out.println(name2);
            System.out.println(adde);
        }
    }
}
public class TestF200 {
    public static void main(String[] args) {
        Outter200.oio op = new Outter200.oio();
        op.test();
    }
}
