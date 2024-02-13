public class Ticket {
    String row;
    int seat;
    Person person;

    public Ticket(String row, int seat, Person person) {
        this.row = row;
        this.seat = seat;
        this.person = person;
    }

    public void ticket_information(){
        new Person(person.name, person.surname, person.email).information();
        System.out.printf("Row :%s \nSeat :%d ",row,seat);


    }
}
