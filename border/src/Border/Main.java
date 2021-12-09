package Border;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		List<Identifiable> arr2=new ArrayList<>();
		while (!a.equals("End")) {
			
			String[] arr = a.split(" ");
			
			if(arr.length==2) {
				//Robot
				arr2.add(new Robot(arr[0],arr[1]));
				
			}
			else if(arr.length==3)
			{
				//citizen
				arr2.add(new Citizen(arr[0],Integer.parseInt(arr[1]),arr[2]));
			}
			else {
				//laino
				System.out.println("Ti si laino");
			}
			a = scan.nextLine();
		}
		String digits=scan.nextLine();
		
		for(Identifiable val:arr2) {
			String id=val.getId();
			
			String last=id.substring(id.length()-digits.length(),id.length() );
			if(digits.equals(last)) {
				System.out.println(id);
			}
		}
	}

}
