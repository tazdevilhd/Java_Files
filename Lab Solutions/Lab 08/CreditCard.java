/**
   This class represents a credit card.
*/

public class CreditCard
{
   private Money balance;     // Current balance
   private Money creditLimit; // Approved credit limit
   private Person owner;      // Owner of the credit card

   /**
      Constructor
      @param A reference to a Person object.
      @param A reference to a Money object.
   */

   public CreditCard(Person newCardholder, Money limit)
   {
      owner = newCardholder;
      balance = new Money(0);
      creditLimit = new Money(limit);
   }

   /**
      The getBalance method
      @return A Money object containing the balance.
   */

   public Money getBalance()
   {
      return new Money(balance);
   }

   /**
      The getCreditLimit method
      @return A Money object containing the credit limit.
   */

   public Money getCreditLimit()
   {
      return new Money(creditLimit);
   }

   /**
      The getPersonals method
      @return A String containing information
              about the owner.
   */

   public String getPersonals()
   {
      return owner.toString();
   }

   /**
      The charge method
      @param A reference to a Money object containing
             the charge amount.
   */

   public void charge(Money amount)
   {
      Money temp = new Money(balance.add(amount));

      if(temp.compareTo(creditLimit) > 0)
         System.out.println("Exceeds credit limit");
      else
      {
         balance = temp;
         System.out.println("Charge: " + amount);
      }
   }

   /**
      The payment method
      @return A reference to a Money object containing
              the payment amount.
   */

   public void payment(Money amount)
   {
      balance = balance.subtract(amount);
      System.out.println("Payment: " + amount);
   }
}