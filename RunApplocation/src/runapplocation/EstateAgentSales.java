
package runapplocation;

//Child class-Sub class
public class EstateAgentSales extends EstateAgent implements iEstateAgent  {

    public EstateAgentSales(String estateAgentName, double propertyPrice) {
        super(estateAgentName, propertyPrice);
      // propertyReport();
    }

   
   
   

   @Override
   public void propertyReport(){
       estateAgentCommission=0.2 *propertyPrice;//make sure use point not comma
       System.out.println("the estate agent name is\n"+getEstateAgentName()+"\nthe property sale price is:\n"+getPropertyPrice()
       +"\nthe estate agent commission is\n"+estateAgentCommission);
   }
}
