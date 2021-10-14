class Cellphone{
    public void ringing(){
      System.out.println("Your phone is ringing:");
    }
    public void calling(){
    System.out.println("Your phone is calling:");

    }
    public void vibrating(){
    System.out.println("Your phone is vibrating:");
    }
}
public class M2{
    public static void main(String[] args){
        Cellphone c = new Cellphone();
        Cellphone b = new Cellphone();
        c.ringing();
        c.calling();
        c.vibrating();
        b.calling();
    }

}