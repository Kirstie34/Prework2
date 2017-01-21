import java.util.Scanner;

public class DiffInDates {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int userYear1;
		int userYear2;
		int userMonth1;
		int userMonth2;
		int userDay1;
		int userDay2;

		System.out.println("Enter date 1 in the format YYYY MM DD: ");
		System.out.println();

		userYear1 = scnr.nextInt();
		userMonth1 = scnr.nextInt();
		userDay1 = scnr.nextInt();

		System.out.println("Enter date 2 in the format YYYY MM DD: ");
		System.out.println();

		userYear2 = scnr.nextInt();
		userMonth2 = scnr.nextInt();
		userDay2 = scnr.nextInt();

		long userDate1InDays = ((userYear1 * 365) + (userMonth1 * 30)) + userDay1;
		long userDate2InDays = ((userYear2 * 365) + (userMonth2 * 30)) + userDay2;

		long diffInDates = userDate2InDays - userDate1InDays;

		long year = (diffInDates) / 365;
		long month = (diffInDates % 365) / 30;
		long day = (diffInDates % 365) % 30;

		System.out.println("The difference between the dates is: Years: " + year + " Months: " + month + " Days: " + day);

	}
}