import java.util.ArrayList;

public class InventoryMang {
    // Inventory Management System for a Small Electronics Store using Objects and Classes
        private String name;
        private String Specification;
        private double cost;
        private int count;

     public InventoryMang (String name,String Specification,double cost,int count ){
        //constructor
         this.name = name;
         this.Specification= Specification;
         this.cost = cost;
         this.count = count;
     }
    public void display(){
       //function
        System.out.println(" Name : " + name);
                //"""
//                1. Product List - View list of all Products:
//                2. Product count - View number of quantities available for a specific Product
               // """

        System.out.println( "Specification: "+ Specification);
        System.out.println("Cost: "+ cost);
        System.out.println("Count: "+count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return Specification;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //public void itemArray (){
        ArrayList<InventoryMang> arr =new ArrayList<>();
    //}
    public void addItem (InventoryMang i){
        arr.add(i);
    }
    public void displayProductList(){
        for (InventoryMang j:arr){
            System.out.println(j.getSpecification());
        }
    }
    public void viewProductList(String a){
        for (InventoryMang j:arr){
            if (j.getName().equals(a)) {
                j.display();
            }
//            System.out.println(j.getSpecification());
        }
    }
}
