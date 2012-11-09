
public class waitertips {

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
	

}
