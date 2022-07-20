package Practice_Project2;

import java.util.Scanner;
import java.util.ArrayList;

public class emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> mailId = new ArrayList<String>();
		mailId.add("sakthi@gmail.com");
		mailId.add("sakthivel@yahoo.co.in");
		mailId.add("vsak17@outlook.com");
		mailId.add("sakthivs@gmail.com");
		mailId.add("sakthivelv20@gmail.com");
		System.out.println("Enter mail ID to search: ");
		id = sc.nextLine();
		if(mailId.contains(id)) {
			System.out.println("Mail ID found!");
		}
		else
		{
			System.out.println("Mail ID not found!");
		}

	}

}
