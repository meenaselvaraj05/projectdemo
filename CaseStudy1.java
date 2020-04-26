
public class CaseStudy1 {

	public static void main(String[] args) {
		int priceOfTicket = 400;
		int numberOfTickets = 20;
		float reduction = 0.1f;
		double billingAmount;
	if (numberOfTickets>10) {
		billingAmount = (numberOfTickets*priceOfTicket)-(numberOfTickets*priceOfTicket*reduction);	
	}
	else {
		billingAmount = numberOfTickets*priceOfTicket;
	}
		System.out.println("Billing Amount "  + billingAmount );
		
	}

}
