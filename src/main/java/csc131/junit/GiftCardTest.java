package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;

		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
		
	}
	
    @Test
    public void getBalance()
    {
        double balance;     
        double tolerance = 0.001;
        GiftCard card;
        int issuingStore;
        
        issuingStore = 1337;
        balance = 100.00;
        card = new GiftCard(issuingStore, balance);

        assertEquals("getBalance()", balance, card.getBalance(), tolerance);
    }
    
    @Test
    public void deduct()
    {
        double balance;     
        GiftCard card;
        int issuingStore;
        String RemainingBal;
        double deduction;
        double deducted;
        
        
        issuingStore = 1337;
        balance = 100.00;
        deduction = 10.00;
        card = new GiftCard(issuingStore, balance);
        deducted = balance - deduction;
        RemainingBal = "Remaining Balance: " + String.format("%6.2f", deduction);
        
        assertEquals("deduct(10.00)", RemainingBal, card.deduct(deducted));

    }
}