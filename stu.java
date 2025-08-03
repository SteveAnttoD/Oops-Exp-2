import java.util.Scanner;
public class stu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 5, count = 0;
		int[] a =new int[6];
		int[] result = new int[6];
		System.out.print("Enter the numbers:");
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		for(int i = 0; i<a.length;i++){
			if(a[i]<x){
				count++;
				result[i]=a[i];
			}
		}
		System.out.println("Count = "+count);	
		for(int i=0;i<count;i++){
		   System.out.print(result[i]+" ");
		}		
	}
}