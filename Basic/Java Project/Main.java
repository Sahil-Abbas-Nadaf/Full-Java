import java.util.Scanner;

class Bill {
    void bills() {
        float ticket, VipService, Wifi, EBaggage, ProSeat, meals, EMERGENCY_SERVICE, PetTransport, update, SEquipments, SpecialService, TOT, GST;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n* Biling Details:-  ");
        System.out.print("Flight Ticket charges = ");
        ticket = sc.nextFloat();
        sc.nextLine(); // consume newline
        System.out.print("VIP/CIP Service charges = ");
        VipService = sc.nextFloat();
        sc.nextLine();
        System.out.print("In-Flight Wi-Fi charges = ");
        Wifi = sc.nextFloat();
        sc.nextLine();
        System.out.print("Extra Baggage charges = ");
        EBaggage = sc.nextFloat();
        sc.nextLine();
        System.out.print("Preferred Seat Selection charges = ");
        ProSeat = sc.nextFloat();
        sc.nextLine();
        System.out.print("Medical Service charges = ");
        EMERGENCY_SERVICE = sc.nextFloat();
        sc.nextLine();
        System.out.print("Special Meals charges = ");
        meals = sc.nextFloat();
        sc.nextLine();
        System.out.print("Pet Transportation charges = ");
        PetTransport = sc.nextFloat();
        sc.nextLine();
        System.out.print("Rescheduling And Cancellation charges = ");
        update = sc.nextFloat();
        sc.nextLine();
        System.out.print("Sporting Equipment charges = ");
        SEquipments = sc.nextFloat();
        sc.nextLine();
        System.out.print("Special Assistance for Elderly or Disabled Passenger charges = ");
        SpecialService = sc.nextFloat();
        sc.nextLine();

        System.out.println("\n************************ Total Bill **********************");
        System.out.println("Flight Ticket charges = " + ticket);
        System.out.println("VIP/CIP Service charges = " + VipService);
        System.out.println("In-Flight Wi-Fi charges = " + Wifi);
        System.out.println("Extra Baggage charges  = " + EBaggage);
        System.out.println("Preferred Seat Selection charges = " + ProSeat);
        System.out.println("Special Meals charges = " + meals);
        System.out.println("Medical Service charges = " + EMERGENCY_SERVICE);
        System.out.println("Pet Transportation charges = " + PetTransport);
        System.out.println("Rescheduling And Cancellation charges = " + update);
        System.out.println("Sporting Equipment charges = " + SEquipments);
        System.out.println("Special Assistance for Elderly or Disabled Passenger charges = " + SpecialService);
        GST = (ticket + VipService + Wifi + EBaggage + ProSeat + meals + EMERGENCY_SERVICE + PetTransport + update + SEquipments + SpecialService) * 0.18f;
        TOT = (ticket + VipService + Wifi + EBaggage + ProSeat + meals + EMERGENCY_SERVICE + PetTransport + update + SEquipments + SpecialService) + GST;
        System.out.println("Total bill = " + TOT);
        do {
            System.out.print("If you are sure to book the ticket then click 'S' for Submit otherwise 'N' for Not: ");
            ch = sc.next().charAt(0);

            if (ch == 'S' || ch == 's') {
                System.out.println("Ticket is Successfully Booked!");
                break;
            } else if (ch == 'N' || ch == 'n') {
                System.out.println("Ticket Booking is cancelled.");
                break;
            } else {
                System.out.println("Incorrect choice!");
            }
        } while (ch != 'S' && ch != 's' && ch != 'N' && ch != 'n');
        System.out.println("__________________________________________________________");
    }
}

class Customer {
    public String name, passportNo;
    public String address;
    public String gender;
    public int CustId, age;
    public int mobNo;

    void info() {
        System.out.println("\n--------------------* Passenger Information *----------------------\n");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Passenger ID: ");
        CustId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Passenger Name: ");
        name = sc.nextLine();
        System.out.print("Enter Passenger Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        mobNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Passport Number: ");
        passportNo = sc.nextLine();
        System.out.print("Enter Nationality: ");
        address = sc.nextLine();
        System.out.println("_________________________________________________________________");
    }

    public void docdisplay() {
        System.out.println("Passenger ID        :  " + CustId);
        System.out.println("Name of Passenger   :  " + name);
        System.out.println("Age                 :  " + age);
        System.out.println("Gender              :  " + gender);
        System.out.println("Mobile No           :  " + mobNo);
        System.out.println("Passport Number     :  " + passportNo);
        System.out.println("Address             :  " + address);
        System.out.println("-------------------------------------------------------------");
    }
}

class Employee {
    public String Ename, qualification, address, Egender;
    public int experience, Eage, EId;
    public float EMobNo;

    void docInfo() {
        System.out.println("\n-------------------* Employee Information *-----------------\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        EId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        Ename = sc.nextLine();
        System.out.print("Enter Employee Age: ");
        Eage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        Egender = sc.nextLine();
        System.out.print("Enter Qualification: ");
        qualification = sc.nextLine();
        System.out.print("Enter years of Experience: ");
        experience = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.println("_______________________________________________________________");
    }

    public void docddisplay() {
        System.out.println("Employee ID         :  " + EId);
        System.out.println("Employee Name       :  " + Ename);
        System.out.println("Employee Age        :  " + Eage);
        System.out.println("Gender              :  " + Egender);
        System.out.println("Qualification       :  " + qualification);
        System.out.println("Years of Experience :  " + experience);
        System.out.println("Address             :  " + address);
        System.out.println("--------------------------------------------------------");
    }
}

class FB {
    public int id;
    public String name,passNo, gender, nationality,Fcode,source,desti,takeof;
    public float mob_No;
    

    void book() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n----------------------- Ticket Booking------------------------");
        System.out.println("* Passenger Details:-  ");
        System.out.print("Enter Passenger Id: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Passenger Name : ");
        name = sc.nextLine();
        System.out.print("Mobile Number : ");
        mob_No = sc.nextFloat();
        sc.nextLine();
        System.out.print("Flight Code : ");
        Fcode = sc.nextLine();
        System.out.print("Gender : ");
        gender = sc.nextLine();
        System.out.print("Passport Number : ");
        passNo = sc.nextLine();
        System.out.print("Nationality : ");
        nationality = sc.nextLine();
        System.out.print("Source : ");
        source = sc.nextLine();
        System.out.print("Destination : ");
        desti = sc.nextLine();
        System.out.print("Flight take of : ");
        takeof = sc.nextLine();
    }
}

class Facilities {
    void faci() {
        System.out.println("------------* Facilities Available In Our Air India *-------------");
        System.out.println(" 1. In-Flight Entertainment And Full AC Service.");
        System.out.println(" 2. Meals And Beverages.");
        System.out.println(" 3. Wi-Fi And Connectivity.");
        System.out.println(" 4. Emergency Service.");
        System.out.println(" 5. Comfortable Seating.");
        System.out.println(" 6. Refund Policies.");
        System.out.println(" 7. Service Provided 24 Hours.");
        System.out.println("___________________________________________________________________");
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Customer[] customers = new Customer[10];
        Employee[] employees = new Employee[10];
        int customerCount = 0;
        int employeeCount = 0;

        System.out.println("\t\t\t\t\t********************* Airline Management **********************");
        System.out.println("\t\t\t\t\t------------------------  Air India ---------------------------");
        System.out.println("\t\t\t\t\t---------------* Your Satisfaction, Our Priority *-------------");
        
        do{ 
            System.out.println("\n******************* MENU ******************");
            System.out.println("1) Manage Passenger\n2) Manage Employee\n3) Display Passengers Info\n4) Display Employees Info\n5) Ticket Booking\n6) Facilities\n7) Exit6");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of Customers to add: ");
                    int numCustomers = sc.nextInt();
                    for (int i = 0; i < numCustomers; i++) {
                        customers[customerCount] = new Customer();
                        customers[customerCount].info();
                        customerCount++;
                    }
                    break;

                case 2:
                    System.out.print("Enter the number of Employees to add: ");
                    int numEmployees = sc.nextInt();
                    for (int i = 0; i < numEmployees; i++) {
                        employees[employeeCount] = new Employee();
                        employees[employeeCount].docInfo();
                        employeeCount++;
                    }
                    break;

                case 3:
                    System.out.print("Enter the number of Customers you want to display the history of: ");
                    int numToDisplay = sc.nextInt();
                    for (int i = 0; i < numToDisplay; i++) {
                        if (i < customerCount) {
                            customers[i].docdisplay();
                        } else {
                            System.out.println("No more customer records available.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the number of Employees you want to display the information of: ");
                    int numdocdisplay = sc.nextInt();
                    for (int i = 0; i < numdocdisplay; i++) {
                        if (i < employeeCount) {
                            employees[i].docddisplay();
                        } else {
                            System.out.println("No more employee records available.");
                        }
                    }
                    break;

                case 5:
                    FB FlightBooking = new FB();
                    FlightBooking.book();
                    Bill bill = new Bill();
                    bill.bills();
                    break;

                case 6:
                    Facilities facilities = new Facilities();
                    facilities.faci();
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 7);
    }
}