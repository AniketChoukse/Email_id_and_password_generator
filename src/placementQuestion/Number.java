package placementQuestion;

public class Number {
	public static void main(String[] args) {

        int num1=1;
        int num2=2;
        int num3=3;
        int t1=0;
        int t2=0;
       System.out.print(num1 + " "+num2+" "+num3+" ");
       for(int i=0 ;i<=10;i++)
       {
    	  t1=2*num2;
    	  System.out.print(t1+" ");
    	  num2=t1;
    	   
    	  t2= num1+num3;
    	  System.out.print(t2+" ");
    	  int temp=num3;
    	  num3=t2;
    	  num1=temp;
       }
	}
}
