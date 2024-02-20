import java.util.*;
public class PlaneManagement{

    //creating instance variables and array objects
    private static final Ticket [] tickets=new Ticket[52];
    private static int ticketCount=0;
    private static final int[][] seats = new int[4][];





    public static void main(String[] args) {

        System.out.println("Welcome to the Plane Management System");
        seats[0] = new int[14];
        seats[1] = new int[12];
        seats[2] = new int[12];
        seats[3] = new int[14];

        //CREATING DUMMY DATA

        String[] name={"Asra","Agzaiyenth","John","Peter","Abee"};
        String[] surname={"Ameer","Ganaraj","Stephan","Rashel","ameer"};
        String[] email={"ASra@gmail.com","aggi@.com","jonny@.com","peter@.com","abe@.com"};
        String[] DummyRowData={"A","A","C","B","D"};
        int[] DummySeats={1,2,5,4,6};
        int[] DummyPrice={200,200,200,200,150};


        //CREATING DUMMY OBJECTS AND INSERTING INTO THE TICKETS ARRAY(NOTE ONLY 5 Dummy TICKETS ARE PRINTED)
        for(int i=0;i<5;i++){
            Person DummyPerson=new Person(name[i],surname[i],email[i]);
            Ticket DummyTicket=new Ticket(DummyRowData[i],DummySeats[i],DummyPrice[i],DummyPerson);
            tickets[i]=DummyTicket;
            ticketCount++;
        }

        //IMPORTANT-USE THIS LOOP ONLY WHEN YOU WANT TO CHECK THE DUMMY DATA ELSE COMMENT IT
        for(int i=0;i<ticketCount;i++){
            Ticket ticket=tickets[i];
            ticket.printInfo();

        }


        /*
        Dummy Data looks like
        Person Information:
          Name: Asra
          Surname: Ameer
          Email: ASra@gmail.com
          Row: A Seat: 2
          Price: 200.0

        Person Information:
          Name: Agzaiyenth
          Surname: Ganaraj
          Email: aggi@.com
          Row: A Seat: 3
          Price: 200.0

        Person Information:
          Name: John
          Surname: Stephan
          Email: jonny@.com
          Row: C Seat: 6
          Price: 200.0

        Person Information:
          Name: Peter
          Surname: Rashel
          Email: peter@.com
          Row: B Seat: 5
          Price: 200.0

        Person Information:
          Name: Abee
          Surname: ameer
          Email: abe@.com
          Row: D Seat: 7
          Price: 150.0
         */


        /*
        * Task 1-Make the program to get user inputs,check if the Row given and seat given are available
        * in the tickets data,if true the print "User Data Available" else "No data found in that seat"
        * Task 2-After completing the task,now change that SPECIFIC index or element in the tickets array
        * to null (NOTE-you might get a error when u try to use a loop and print after words,its fine)
        * Task 3-now make the elements on the right side to move left
        *
        * Example-
        * before the change the tickets array might look like
        * ["asra's ticket","agzy's ticket","john's ticket","peter's ticket","abee's ticket"]
        * Lets assume user enters C row Seat 6
        * then Task 2 should make it like this
        * ["asra's ticket","agzy's ticket",null,"peter's ticket","abee's ticket"]
        * and Task 3 should turn it into this
        * ["asra's ticket","agzy's ticket","peter's ticket","abee's ticket",null]
        * note where the null stays in task 2 and 3
        * */

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Row : ");
        String row= scan.next();
        System.out.print("Enter the Seat number : ");
        int seat= scan.nextInt();

        //Enter your code here









    }
}