package org.example;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking
{
    String passengerName;
    int busNo;
    Date date;

    public Booking() throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of passenger");
        passengerName = scan.next();
        System.out.println("Enter bus no");
        busNo = scan.nextInt();
        System.out.println("Enter date of travel");
        String dateInput = scan.next();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy");
        date = df.parse(dateInput);
    }

        public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> bookings)
        {
            int capacity=0;
            for(Bus b:buses){
                if(b.getBusNo()==busNo)
                {
                    capacity= b.getCapacity();
                }

            }
            int booked=0;
            for(Booking b:bookings)
            {
                if(b.busNo==busNo && b.date.equals(date))
                {
                    booked++;
                }
            }
            return booked<capacity?true:false;

    }
}
