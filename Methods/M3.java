class rectangle{
    int l,w;
    int area(int l,int w){
        return l*w;
    }
    int perimeter(int l,int w){
        return 2*(l+w);
    }

}
class Square{
    int side;
     int area(int side){
         return side*side;
   
   }
    int perimeter(int side){
        return side*4;
    }
}
 public class M3{
      public static void main(String[] args){
         rectangle r = new rectangle(); 
         Square s = new Square();
         System.out.println("area of sqaure is :"+s.area(5));
         System.out.println("perimeter of square is:"+s.perimeter(5));
     System.out.println("area of rectangle is :"+r.area(5,5));
         System.out.println("perimeter of reactangle is:"+r.perimeter(5,5));
      }
 } 
    
