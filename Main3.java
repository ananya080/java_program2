import java.util.Scanner;
public class Main3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int numRows= sc.nextInt();
for(int i=1;i<numRows;i++){
for(int j=1;j<numRows-1;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print((k%2==0)?"0":"1");
}
System.out.println();
}
}
}
