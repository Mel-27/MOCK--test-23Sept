
package runapplocation;

//Abstract class-Parent class
public abstract class EstateAgent {
    
    protected String estateAgentName;
   
    protected double propertyPrice;
    protected double estateAgentCommission;

 // public abstract void propertyReport();
    //constructor 
    public EstateAgent(String estateAgentName, double propertyPrice) {
        this.estateAgentName = estateAgentName;
        this.propertyPrice = propertyPrice;
        
    }
    //Get methods
     public String getEstateAgentName() {
        return estateAgentName;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public double getEstateAgentCommission() {
        return estateAgentCommission;
    }
    
}
