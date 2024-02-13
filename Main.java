import java.util.*;
public class Main {
    public int user_menu(){
        System.out.println("*".repeat(50));
        System.out.println("*"+" ".repeat(18)+"MENU OPTIONS"+" ".repeat(18)+"*");
        System.out.println("*".repeat(50));
        System.out.println(" ".repeat(5)+"1) Buy a seat");
        System.out.println(" ".repeat(5)+"2) Cancel a seat");
        System.out.println(" ".repeat(5)+"3) Find first available seat");
        System.out.println(" ".repeat(5)+"4) Show seating plan");
        System.out.println(" ".repeat(5)+"5) Print tickets information and total sales");
        System.out.println(" ".repeat(5)+"6) Search ticket");
        System.out.println(" ".repeat(5)+"0) Quit");
        System.out.println("*".repeat(50));
        System.out.print("Please select an option: ");
        int response=new Scanner(System.in).nextInt();
        return response;
    }

    public void cancel_seat(int seats[][]){
        System.out.print("Please Enter the row letter: ");
        String row_letter=new Scanner(System.in).next().toLowerCase();
        System.out.print("Enter the Seat number: ");
        int seat_number=new Scanner(System.in).nextInt();
        System.out.println( row_letter+" "+seat_number);
        switch (row_letter){
            case "a":
                if(seat_number>0 && seat_number<15){
                    if(seats[0][seat_number-1]==1){
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" has succesfully Cancelled.");
                        seats[0][seat_number-1]=0;
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is available already.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "b":
                if(seat_number>0 && seat_number<13){
                    if(seats[1][seat_number-1]==1){
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" has succesfully Cancelled.");
                        seats[1][seat_number-1]=0;
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is available already.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "c":
                if(seat_number>0 && seat_number<13){
                    if(seats[2][seat_number-1]==1){
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" has succesfully Cancelled.");
                        seats[2][seat_number-1]=0;
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is available already.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "d":
                if(seat_number>0 && seat_number<15){
                    if(seats[3][seat_number-1]==1){
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" has succesfully Cancelled.");
                        seats[3][seat_number-1]=0;
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is available already.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            default:
                System.out.println(row_letter.toUpperCase()+" row doesn't Exist!");
        }


    }
    public void buy_seat(int seats[][]){
        System.out.print("Please Enter the row letter: ");
        String row_letter=new Scanner(System.in).next().toLowerCase();
        System.out.print("Enter the Seat number: ");
        int seat_number=new Scanner(System.in).nextInt();
        System.out.println( row_letter+" "+seat_number);
        switch (row_letter){
            case "a":
                if(seat_number>0 && seat_number<15){
                    if(seats[0][seat_number-1]==0){
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" has succesfully purchased");
                        seats[0][seat_number-1]=1;
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is not available.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "b":
                if(seat_number>0 && seat_number<13){
                    if(seats[1][seat_number-1]==0){
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" has succesfully purchased");
                        seats[1][seat_number-1]=1;
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is not available.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "c":
                if(seat_number>0 && seat_number<13){
                    if(seats[2][seat_number-1]==0){
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" has succesfully purchased");
                        seats[2][seat_number-1]=1;
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is not available.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            case "d":
                if(seat_number>0 && seat_number<15){
                    if(seats[3][seat_number-1]==0){
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" has succesfully purchased");
                        seats[3][seat_number-1]=1;
                    }else{
                        System.out.println("Seat "+row_letter.toUpperCase()+" "+seat_number+" is not available.");

                    }
                }else{
                    System.out.println("Enter a correct Seat number.");
                }
                break;
            default:
                System.out.println(row_letter.toUpperCase()+" row doesn't Exist!");
        }

    }

    public void find_first_available(int seats[][]){
        int x=0;
        int n;
        boolean state=false;
        String row_letter=" ";
        for(int row[]:seats){
            switch(x){
                case 0:
                    row_letter="A";
                    break;
                case 1:
                    row_letter="B";
                    break;
                case 2:
                    row_letter="C";
                    break;
                case 3:
                    row_letter="D";
                    break;
                default:
                    System.out.println("Error Row letter ");

            }
            n=0;
            for(int seat:row){
                if(seat==0){

                    System.out.println("Seat in row "+row_letter+" with seat number "+n+" is available" );
                    state=true;
                    break;
                }
                n++;
            }
            if(state){
                break;
            }
            x++;
        }
    }

    public void show_seating_plan(int seats[][]){
        int x=0;
        for (int row[]:seats){
            if(x==2){
                System.out.println();
            }
            for(int n:row){
                if(n==0){
                    System.out.print("O");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
            x++;
        }
    }

    public static void main(String[] args) {
        Person obj=new Person();
        System.out.println("Welcome to the Plane Management System");
        int seats[][] = new int[4][];
        seats[0] = new int[14];
        seats[1] = new int[12];
        seats[2] = new int[12];
        seats[3] = new int[14];
        int response;

        do{
            response=new Main().user_menu();
            switch(response){
                case 0: System.out.println("Quiting"); break;
                case 1: new Main().buy_seat(seats); break;
                case 2: new Main().cancel_seat(seats); break;
                case 3: new Main().find_first_available(seats); break;
                case 4: new Main().show_seating_plan(seats); break;

            }
        }while (response!=0);


    }
}