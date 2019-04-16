
package car.sys;

import java.util.Scanner
public class CarSys {

    int id ;
    String name;
    static int counter=0;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        CarSys c1=new CarSys();
       System.out.println("Enter the Car ID:");
       c1.id=input.nextInt();
       input.nextLine();
       System.out.println("Enter the Car Name:");
       c1.name=input.nextLine();
       CarSys.counter++;
       System.out.println("Total cars:"+CarSys.counter);
            }   
}
