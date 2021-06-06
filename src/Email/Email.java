package Email;
import java.util.Scanner;
public class Email {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("                                                               Welcome_HR_Desk");   
     System.out.println("................................................................................................................................");
      System.out.println("TO_GENERATE_EMPLOYEE's_EM@IL.......        "); 
     System.out.println("Enter First Name : ");
        String firstName=sc.next();
        
        System.out.println("Enter Last Name : ");
        String lastName=sc.next();
        String company="ABC";
        
        System.out.println("Enter Department : ");
        System.out.println("Enter 1 for SALES       :");
        System.out.println("Enter 2 for DEVELOPMENT :");
        System.out.println("Enter 3 for HR          :");
        System.out.println("Enter 4 for ACCOUNT     :");
        System.out.println("Enter 0 for EXIT        :");
        
        int choice=sc.nextInt();
      
       String emailId=null;
        switch (choice)
        {
        case 1:
        	emailId=firstName +"."+ lastName + '@'+"sales."+company+".com";
        	break;
        	
        case 2:
        	emailId=firstName +"." + lastName + '@'+"Development."+company+".com";
        	break;
        case 3:
        	emailId=firstName+"." + lastName + '@'+"HR."+company+".com";
        	break;
        case 4:
        	emailId=firstName +"."+ lastName + '@'+"accounts."+company+".com";
        	break;
        case 0:
        	break;
        	
        	default :
        		System.out.println("Enter valid Department");
        }
        System.out.println("Your EmailID is : "+emailId);
        //  Here we ganerate a email id fron user input now generat a password
        
        if(emailId==null) {
        	System.out.println("Password can not be grnerated");
        }
        else {
        String s="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*+=";
        
        char[] ch=new char[10];
        for(int i=0; i<ch.length; i++)
        {
        	int random=(int) (Math.random()*s.length());
        	ch[i]=s.charAt(random);
        }
        String pass=new String(ch);
        System.out.println("Your Password is : "+pass);
        System.out.println(firstName +"YOUR EMAIL ID AND PASSWORD GENERATED SUCCESFULLY");
	}}
}
