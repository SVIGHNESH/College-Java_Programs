enum Laptop{
    Macbook(84320),VICTUs(34873),Legion(38479),ThinkPad(4937);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
    
}
public class EnumClass {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        
        // System.out.println("The Price of the " + lap + " is "+lap.getPrice());
        // lap.setPrice(850000);
        // System.out.println("The Price of the new " + lap + " is "+lap.getPrice());


        for(Laptop ss : Laptop.values()){
            System.out.println("The Price of the " + ss + " is " + ss.getPrice());

        }
    }
}
