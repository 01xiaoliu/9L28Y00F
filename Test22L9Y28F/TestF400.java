package Test22L9Y28F;

interface Fireable{
    void fire();
}
class Peraon implements Fireable{
    public void fire(){
        System.out.println("火娃会喷火");
    }
}
public class TestF400 {
    public static void main(String[] args) {
       //----接口实现多态----
        Fireable fireable =new Peraon();
        fireable.fire();
        //间接指向 接口引用作为形参
        callback(new Fireable(){
            public void fire(){
                System.out.println("水娃");
            }
        });
    }
    static void callback(Fireable fireable2){
        fireable2.fire();//接口回调
    }
}
