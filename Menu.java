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
		String waiter1 = "LeBron James";
		String waiter2 = "Kevin Durant";
		double waiter1tips=0;
		double waiter2tips=0;
		String waitering;
		double total=0;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> item = new ArrayList<String>();
		ArrayList<Double> price = new ArrayList<Double>();
		ArrayList<Double> waitertip = new ArrayList<Double>();
                ArrayList<String> order = new ArrayList<String>();
		item.add("Beef");
		item.add("Chicken");
		item.add("Rice");
		item.add("Pork");
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
		System.out.println("pay-view and pay bill");
		System.out.println("Thank you-to leave");
		String choice = scan.nextLine();
                
                for(int i = 0; i<20; i++){
                if (choice.equals("order")){
                    System.out.println("What would you like to order?");
                     Scanner sc = new Scanner(System.in);
                     String food = sc.nextLine();
                    
                    
                     if (food.equals("Beef")){
                                order.add(item.get(0));
                                total = total + price.get(0);
                                System.out.println("You have ordered beef");
                                choice = scan.nextLine();
                            }
                           else if (food.equals("Chicken")){
                                order.add(item.get(1));
                                total = total + price.get(1);
                                System.out.println("You have ordered chicken");
                                choice = scan.nextLine();
                            }
                            
                           else if (food.equals("Rice")){
                                order.add(item.get(2));
                                total = total + price.get(2);
                            System.out.println("You have ordered rice");
                            choice = scan.nextLine();
                            }
                          else  if (food.equals("Pork")){
                                order.add(item.get(3));
                                total = total + price.get(3);
                        System.out.println("You have ordered pork");
                        choice = scan.nextLine();
                            }
                          else if (food.equals("Fish")){
                                order.add(item.get(4));
                                total = total + price.get(4);
                                System.out.println("You have ordered fish");
                                choice = scan.nextLine();
                            }
                            else {
                                System.out.println("That item is not on the menu");
                                choice = scan.nextLine();
                            }
                }
                
                    
                
		
                
			if(choice.equals("pay")){
				
				System.out.println("the subtotal is "+total);
                                double hsttotal = total*1.12;
                                System.out.println("the after tax total is "+hsttotal);
				System.out.println("please enter the amount you want to pay");                            
                                Scanner money = new Scanner(System.in);
                                double payamount = money.nextDouble();
                                   
                                System.out.println("You are paying: "+payamount);
				
                                double tips = payamount-hsttotal;
                                System.out.println("the tip is: "+tips);
					if(waiter1.equals(waitering)){
						waiter1tips=waiter1tips+tips;
                                                System.out.println("Lebron's Tip is: "+waiter1tips);
					}
					else{waiter2tips=waiter2tips+tips;
                                                 System.out.println("Kevin's Tip is: "+waiter2tips);
                                        }
					for(int j = 0;j>=order.size();j++){
						order.remove(j);
					}
			}
                     
                          
                }        
		}
	private static String getWaiter(){
		String waiter1 = "Lebron James";
		String waiter2 = "Kevin Durant";
		Random rn = new Random();
		int random = rn.nextInt()%101;
		if(random%2==0){
			System.out.println("Hi, my name is "+waiter1+" i will be your waiter today");
			return waiter1;
		}
		else{
			System.out.println("Hi, my name is "+waiter2+" i will be your waiter today");
			return waiter2;
		}
	}

}