class User {
    private String name ;
    private String address;
    private int mobilenumber;

    public String getAddress() {
        return address;
    }
}

class Mobilenumber {
    private int mobilenumber;
    public Mobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }
}
         
class Restaurant{
    private String location;
    public int rating;  

    public Restaurant(String location, int rating,) {
        this.location = location;
        this.rating = rating;
    }

class Location {
    private String location;
    public location(String location){ 
    }

    public String getLocation() {
        return location;
    }
}
 
class Rating{
    private int rating;
    public rating(int rating){
    }
    
    public int getRating() {
        return rating;
    }
}

class Angappar extends Restaurant{
    private int rating;
    private String[] menuItems;
    private int[] menuPrices;
    
    public Angappar(String location , int rating , String type){
        super(location, rating, type);
        this.menuItems = new String[]{"rice", "mutton", "chicken65", "fish", "prawn", "chettinad"}; 
        this.menuPrices = new int[]{120, 100, 80, 130, 75, 100};
       }
}

class Chocohut extends Restaurant{
    private int rating;
    private String type;
    private String[] menuItems;
    private int[] menuPrices;
    
    public Chocohut(String location , int rating , String type){
        super(location, rating, type);
        this.menuItems = new String[]{"icecream", "cake", "sweets", "juice", "brownie", "gulabjamun"}; 
        this.menuPrices = new int[]{30, 50, 65, 40, 60, 25};
       }
}
 
class Juicetime extends Restaurant{
    private int rating;
    private String type;
    private String[] menuItems;
    private int[] menuPrices;
    
    public Juicetime(String location , int rating , String type){
        super(location, rating, type);
        this.menuItems = new String[]{"falooda", "jigarthanda", "milkshakes", "freshjuices", "sharjah"}; 
        this.menuPrices = new int[]{120, 100, 80, 130, 75, 100};
       }
}


public class ZomotoApp { 
    public static void main(String[] args){
        name n = new name(Navin);
        address a = new address(tirunelveli);
        mobilenumber m = new mobilenumber(9080194116);
  
         
        Angappar hotel1 = new Angappar("vannarapettai" , 8 , "SouthIndian");
        Chocohut hotel2 = new Chocohut("palayamkottai" , 9 , "Desert");
        Juicetime hotel3 = new Juicetime("ktcNagar" , 7 , "juices") ;
        
        String[] AngapparmenuItems = hotel1.getmenuItems();
        int[] AngapparmenuPrices = hotel1.getmenuPrices();
        String[] ChocohutmenuItems = hotel2.getmenuItems();
        int[] ChocohutmenuPrices = hotel2.getmenuPrices();
        String[] JuicetimemenuItens = hotel3.getmenuItems();
        int[] JuicetimemenuItems = hotel3.getmenuPrices();

        for (int i = 0; i < AngapparmenuItems.length; i++) {
            System.out.println(angapparMenuItems[i] + AngapparmenuPrices[i]);
        }
        for (int i = 0; i < ChocohutmenuItems.length; i++) {
            System.out.println(chocohutMenuItems[i] + ChocohutmenuPrices[i]);
        }
        for (int i = 0; i < JuicetimemenuItems.length; i++) {
            System.out.println(JuicetimeMenuItems[i] + JuicetimemenuPrices[i]);
        }
    }
}






    

     