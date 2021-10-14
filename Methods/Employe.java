public class Employe{
 private int id;
 private String name;   
    
 public String getname(){
    return name;
  }
 public void setName(){
    this.name = "yogesh";
}
public String setName(String n){
  return this.name = n;
  }

}
class M4{
    
    public static void main(String[] args){
        Employe E= new Employe();
        System.out.println(E.getname());
        System.out.println(E.setName("yogi"));
      
}
}