/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package M7._swimmingpool;

public class App {
    

    public static void main(String[] args) {
        
    }

    public int calcualteprice(int time, String weekday, int age, boolean group, boolean member ) throws Exception {
        float  price = 200;
        boolean unreasonableage = (age<3 || age>75);
        boolean unreasonabletime = (time<5 || time>22);
        
        if(unreasonableage || unreasonabletime)
            throw new Exception();
        
        if(weekday.equalsIgnoreCase("Saturday") || weekday.equalsIgnoreCase("sunday")) {
            price = 250;
        }
        else {
            if(!member){
                if(group) {
                    price *= 0.7;
                }
                else if(age<12 || age>=60 || time<7){
                    price *= 0.8;
                }
            }
        }
        
        if(member) {
            price *= 0.5;
        }
        
        return (int)price;
    }
}
