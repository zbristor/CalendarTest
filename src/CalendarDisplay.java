import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarDisplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int yr = sc.nextInt();
		System.out.println("Enter a month: ");
		int month = sc.nextInt();
		//Date is just a wrapper around a long milliseconds since 1970-01-01
		GregorianCalendar gc = new GregorianCalendar(yr,month,1);
		//System.out.println(gc.getFirstDayOfWeek());
	//	int day = gc.get(Calendar.DAY_OF_MONTH);
		int dayInWeek = (gc.get(Calendar.DAY_OF_WEEK));
		System.out.println(dayInWeek);
		String[] days = {"Sun","Mon","Tues","Wed","Thu","Fri","Sat"};
		for (int i=0; i<days.length; i++)
		{
			System.out.print(days[i]+"\t");
		}
System.out.println();
		switch(dayInWeek){
		case 1:
			int j;
			for (j=1; j<32; j++){
				if((1+j)%7!=0) {System.out.print(j + "\t");}
				else
					System.out.print(j); System.out.println();
			}
			break;
		
		case 2:
		System.out.println("\t");
		for (j=1; j<32; j++){
			if((j+2)%7!=0) {System.out.print(j + "\t");}
			else
				System.out.print(j); System.out.println();
		}
		break;
		case 3:
		System.out.println("\t\t");
		for (j=1; j<32; j++){
			if((j+3)%7!=0) {System.out.print(j + "\t");}
			else
				System.out.print(j); System.out.println();
		}
		break;
		case 4:
		System.out.println("\t\t\t");
		for (j=1; j<32; j++){
			if((j+4)%7!=0) {System.out.print(j + "\t");}
			else
				System.out.print(j); System.out.println();
		}
		break;
		case 5:
		System.out.println("\t\t\t\t");
		for (j=1; j<32; j++){
			if((j+5)%7!=0) {System.out.print(j + "\t");}
			else
				System.out.print(j); System.out.println();
		}
		break;
		case 6:
		System.out.println("\t\t\t\t\t");
		for (j=1; j<32; j++){
			if((j+6)%7!=0) {System.out.print(j + "\t");}
			else
				System.out.print(j); System.out.println();
		}
		break;
		case 7:
		//System.out.println("\t\t\t\t\t\t");
		for (j=1; j<32; j++){
			if((j+7)%7!=0) {System.out.print(j + "\t");}
			else
				System.out.print(j); System.out.println();
		}
		break;
	}
}
}		