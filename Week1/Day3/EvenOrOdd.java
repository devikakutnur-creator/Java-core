import java.util.Scanner;
class EvenOrOdd{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of N");
int n=sc.nextInt();
if(n%2==0){
System.out.println("N is an even number");}
else{
System.out.println("N is an odd number");
}
}
}
