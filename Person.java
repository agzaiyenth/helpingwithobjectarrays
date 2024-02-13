public class Person {
    String name;
    String surname;
    String email;
    public Person(String name,String surname,String email) {
        this.name=name;
        this.surname=surname;
        this.email=email;



    }
    public void information(){
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Surname : "+surname);
    }

}
