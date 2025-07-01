import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args){
        Scanner bleh = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter a temperature you wanna convert: ");
        temp = bleh.nextDouble();

        System.out.print("Do you wanna convert it to celsius or fahrenheit ? (C/F): ");
        unit = bleh.next().toUpperCase();

        newtemp = (unit.equals("F")) ? (temp-32)*5/9 : (temp*5/9)+32;

        System.out.printf("%.2f°%s",newtemp,unit);
        bleh.close();
    }
}
