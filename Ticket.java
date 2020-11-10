import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author Joshua Smith
 * 
 */
public class Ticket
{
    // Attributes
    
    private String destination;
    
    private int price;
    
    private Date issueDateTime;
    
    /**
     * Constructor for objects of class Ticket setting the
     * desitnation and price.  The date will contain
     * the current system date and time
     */
    public Ticket(String destination, int price)
    {
     this.destination = destination;
     this.price = price;
     
     issueDateTime = new Date();
    }
    public String returnDestination()
    {
        return destination;
    }
    public int returnPrice()
    {
        return price;
    }
    public String toString()
    {
        return destination+" " + price+ " " + issueDateTime;
    
    }
    public void print()
    {
         System.out.println("Ticket" + destination + "Price : " + price +
         "Issued" + issueDateTime);  
     
    }
}