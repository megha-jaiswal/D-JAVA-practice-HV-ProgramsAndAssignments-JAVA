package Assignment;

public class MinMaxAvg {
    public static void main(String[] args) {
        int [] num={1,2,5,6,7,8,10,12,15};
        //for Min value calculation
        int i=0;
        for (i=0; i<num.length; i++){
        
            for (int j=0; j<i; j++){
                int j=i;
                break;
            }
            //int i=i;
            System.out.println("the element with value:" + j);
        }
    }
}
