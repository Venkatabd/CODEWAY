package Codeway;
import java.util.Scanner;

public class Studentgrade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter English mark");
		int eng=sc.nextInt();
		System.out.println("Enter Maths mark");
		int math=sc.nextInt();
		System.out.println("Enter Science mark");
		int Science=sc.nextInt();
		System.out.println("Enter Social mark");
		int Social=sc.nextInt();
		System.out.println("Enter Hindi mark");
		int Hindi=sc.nextInt();
		
		int total=(eng+math+Science+Social+Hindi);
		System.out.println("Total Marks:" +total);
		
		int avg=(eng+math+Science+Social+Hindi)/5;
		System.out.println("Average percentage is:" +avg+"%");
		
		
		if(total>=450)
		{
			System.out.println("A+ Grade Excellent");
			
			
		}
		else if(total>=400)
		{
			System.out.println("A Grade  Good");
			
			
		}
		else if(total>=350)
		{
			System.out.println("B+ Grade Improve Yourself");
			
		}
		else if(total>=300)
		{
			System.out.println("B Grade  Studywell");
			
		}
		
		
		
		
		
	}

}
