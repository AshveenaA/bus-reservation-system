package org.example;
import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {

        ArrayList<Bus> buses =new ArrayList<Bus>();
        ArrayList<Booking> bookings =new ArrayList<Booking>();

        buses.add(new Bus(1,"ac",2));
        buses.add(new Bus(2,"non-ac",55));
        buses.add(new Bus(3,"ac",45));

        for(Bus b:buses)
        {
            b.displayBusInfo();
        }

        int userOpt=1;
        while(userOpt==1) {
            System.out.println("Enter 1 to book and 2 to exit");
            Scanner scanner = new Scanner(System.in);
            userOpt= scanner.nextInt();
            if(userOpt==1){
                Booking booking=new Booking();
                if (booking.isAvailable(buses, bookings))
                {
                    bookings.add(booking);
                    System.out.println("booking confirmed");

                }
                else{
                    System.out.println("no seats availabe");
                }

            }
        }
    }
}

