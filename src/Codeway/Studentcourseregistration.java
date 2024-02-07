package Codeway;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Studentcourseregistration {
	private int courseid;
	public Studentcourseregistration()
	{
		this.courseid=courseid;
	}
	
	  public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	private List<Studentcourseregistration>student=new ArrayList<>();
	
	public void courseremoval(int courseid) {
		 student.removeIf(t -> t.getCourseid()==courseid);		
	}

	public static void main(String[] args) {
		Studentcourseregistration scr=new Studentcourseregistration();
		Scanner sc=new  Scanner(System.in);
		int capacity =10;
		int avaliableslots=10;
		boolean flag=true;
		while(flag)
		{
//		System.out.println("STUDENT COURSE REGISTRATION SYSTEM");
		System.out.println("\n1.Course details\n2.Students Details\n3.Course Lists\n4.Student registration\n5.Course removal\n6.exit");
	     switch(sc.nextInt())
	     {
	     case 1:
	     {
	    	 System.out.println("Avaliable courses");
	    	 System.out.println("\n1.Core Java Course  Code:001 Title:Java Programming and OOPS concepts Capacity:20 Schedule:Morning 9AM-1PM ");
	    	 System.out.println("\n2.Python  Code:002 Title:Programming and OOPS concepts Capacity:50 Schedule:Evening 4PM-7PM ");
//	    	 System.out.println("\n3.Mern Stack Course  Code:003 Title:ReactJS,Monogo DB,Node JS concepts Capacity:10 Schedule:Morning 8AM-12Am ");
	     }
	     break;
	     case 2:
	     {
	    	 System.out.println("Enter Student details");
	    	 System.out.println("student id");
	    	 sc.nextInt();
	    	 System.out.println("Enter Student name");
	    	 sc.next();
	     }
	     break;
	     case 3:
	     {
	    	 System.out.println("\n1. Core Java \n2.Python");
	    	
	     }
	     break;
	     case 4:
	     {
	    	 System.out.println("Student Registration");
//	    	 System.out.println("\n1. Core Java \n2.Python");
	    	 
	    	 System.out.println("student id");
	    	 sc.nextInt();
	    	 System.out.println("Enter Student name");
	    	 sc.next();
	    	 if(avaliableslots>0)
	    	 {
	    		 System.out.println("Registered\t" + avaliableslots + " Slots "
	    		 		+ "only avaliable");
	    		 avaliableslots--;
	    	 }
	    	 else
	    	 {
	    		 System.out.println("full");
	    	 }
	    	 
	     }
	     break;
	     case 5:
	     {
	    	 System.out.println("Enter course id to remove");
	    	 int courseid=sc.nextInt();
	    	 sc.nextLine();
	    	 scr.courseremoval(courseid);
	    	 System.out.println(courseid+"removed Successfully");
	    	 
	     }
	     break;
	     case 6:
	     {
	    	 flag=false;
	    	 System.out.println("Please enter correct option");
	     }
	     break;
	     default:
	     {
	    	 System.out.println("Invalid option");
	    	 
	     }
	     break;
	}
	}
	}
	
}
