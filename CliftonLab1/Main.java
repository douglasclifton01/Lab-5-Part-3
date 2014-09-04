import java.util.Scanner;
import java.io.*;

public class Main {

    static int length;
    static int width;
    
    public static void main(String[] args) {

        do {
 
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter The Length Of The Room");
            length = keyboard.nextInt();

            System.out.println("Enter The Width Of The Room");
            width = keyboard.nextInt();          

            RoomDimension roomdem = new RoomDimension();
            roomdem.roomLength(length);
            roomdem.roomWidth(width);
            RoomCarpet roomcarp = new RoomCarpet();
            roomcarp.setRoomDimension(roomdem);
            System.out.println("Room dimensions: ");
            System.out.println("Length: " + length + " Width: " + width + " Area: " + roomdem.getArea());
            System.out.println("Carpet cost:$" + roomcarp.getAmount());
        }
        while(false);
        } 
    }