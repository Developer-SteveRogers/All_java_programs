import java.util.Scanner;
public class Atm {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = 500;
        int password =1234;
        System.out.println("WELCOME TO MY ATM\nHow can we help you\nPlease insert your choice :");
        while(true){
            
        System.out.println("1. Withdraw Money :\n2. Check Balance:\n3. Mini Statement:\n4. Change Password:\n5. Diposit money:\n6.Exit");
        int choice = sc.nextInt();
        switch(choice)
        {   
            case 1:
                System.out.println("how much money you want to withdraw");
                int withdrawmoney = sc.nextInt();
                if(withdrawmoney>money){
                    System.out.printf(" you can not withdraw %d Because you did not have enough money:",withdrawmoney);
                }
                else{
                    money = money-withdrawmoney;
                    System.out.println("now your money is:"+money);
                }
                break;
                
              

          case 2:
              System.out.println("Your current balance is:"+money);
              break;
          
          case 3:
              System.out.println("This function is not available for now But will be soon :)");
              break;
    
          case 4:
              System.out.println("if you want to change your password please enter your old password:");
              int oldpassword = sc.nextInt();
              if(oldpassword==password){
                  System.out.println("Now enter the new password you want to create:  (NOTE-> the  password must be 4 integer number)");
                  int newpassword = sc.nextInt();
                  password = oldpassword;
                  System.out.println("Your password is changed : Please Remember this password :)");
              }
                else{
                    System.out.println("Please Enter valid Password:");
                }
                break;
          
          case 5:
               System.out.println("Please enter how much money do you want to Diposit:");
               int dipositmoney = sc.nextInt();
               money = money+dipositmoney;
               System.out.println("Your money has sucsessfully diposit\n now your money is "+money);
               break;

          case 6: System.exit(0);
               break;
            
          default :
              System.out.println("please enter valid choice:  ");
        
       }
     
    }
  }
}
    

