import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
public class Menu {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String waiter1 = "";
		String waiter2 = "";
		double waiter1tips;
		double waiter2tips;
		String waitering;
		double total=0;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> item = new ArrayList<String>();
		ArrayList<Double> price = new ArrayList<Double>();
		ArrayList<Double> waitertip = new ArrayList<Double>();
		item.add("Beef");
		item.add("Chicken");
		item.add("Rice");
		item.add("Prok");
		item.add("Fish");
		price.add(13.5);
		price.add(11.5);
		price.add(6.5);
		price.add(12.5);
		price.add(10.5);
		
		
		waitering = getWaiter();
		System.out.println("you may chose to: ");
		System.out.println("order-order food from menu");
		System.out.println("And we have beef, chicken, rice, pork, and fish.");
		System.out.println("pay bill-view and pay bill");
		System.out.println("Thank you-to leave");
		String choice = scan.nextLine();
		
		while(scan.hasNext()){
			if(choice.equals("pay")){
				System.out.println("you have ordered: ");
				for(int a = 0; a <=order.size;a++){
						if(order.get(a).equal(item.get(a))){
							System.out.println(item.get(a)+" "+"and the price is"+" "+price.get(a));
							total = total+price.get(a);
						}
					}
				
				System.out.println("the total is"+total);
				System.out.println("please eneter the amount you want to pay");
				double pay = scan.nextInt();
				double tips = pay-total;
					if(waiter1.equals(waitering)){
						waiter1tips=waiter1tips+tips;
					}
					else{waiter2tips=waiter2tips+tips;}
					for(int i = 0;i>=order.size;i++){
						order.remove(i);
					}
			}
		}
		

				
			
			
		}
	private static String getWaiter(){
		String waiter1 = "";
		String waiter2 = "";
		Random rn = new Random();
		int random = rn.nextInt()%101;
		if(random%2==0){
			System.out.println("Hi, my name is"+waiter1+"i will be your waiter today");
			return waiter1;
		}
		else{
			System.out.println("Hi, my name is"+waiter2+"i will be your waiter today");
			return waiter2;
		}
	}

}
