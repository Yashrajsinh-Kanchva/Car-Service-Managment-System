
import java.util.Scanner;

//class named CAR which stores details of car.
class Car {

    int customer_id;
    static int ID = 1;
    String car_company;
    String car_model;
    int car_manufactured_year;
    String car_registration_number;
    int car_mileage;
    Scanner sc = new Scanner(System.in);

    // car_set() method set details of car.
    void car_set() {
        System.out.print("Enter Car Company Name: ");
        car_company = sc.nextLine();
        System.out.print("Enter Car Model: ");
        car_model = sc.nextLine();
        System.out.print("Enter Car Registration Number(eg. GJ 01 XY 1234): ");
        car_registration_number = sc.nextLine();
        System.out.print("Enter Car Manufactured Year: ");
        car_manufactured_year = sc.nextInt();
        System.out.print("Enter Car Mileage: ");
        car_mileage = sc.nextInt();
    }

    // car_display() method display car details
    void car_display() {
        System.out.println("Car Company Name: " + car_company);
        System.out.println("Car Model: " + car_model);
        System.out.println("Car Registration Number: " + car_registration_number);
        System.out.println("Car Manufactured Year: " + car_manufactured_year);
        System.out.println("Car Mileage: " + car_mileage);
    }

    // this method update car details
    void update_car_details(Customer[] customer) {
        System.out.println("Enter Customer ID: ");
        int id = sc.nextInt();
        boolean b = true;
        for (int i = 0; i < customer.length; i++) {
            if (customer[i].customer_id == id) {
                customer[i].car_set();
                b = true;
            } else {
                b = false;
            }
        }
        if (!b) {
            System.out.println("Invalid Customer's ID :(");
        }
    }
}

// CUSTOMER class extents CAR class----> inheritance
class Customer extends Car {

    String customer_name, customer_address;
    String customer_mobile_number;
    Scanner sc = new Scanner(System.in);

    // customer_set() method set details of customer.
    void customer_set() {
        customer_id = ID++;
        System.out.print("Enter Customer Name: ");
        customer_name = sc.nextLine();
        System.out.print("Enter Customer Address: ");
        customer_address = sc.nextLine();
        boolean check_mobile_no;
        do {
            System.out.print("Enter Customer Mobile Number: ");
            customer_mobile_number = sc.nextLine();
            check_mobile_no = true;
            if (customer_mobile_number.length() == 10) {
                check_mobile_no = true;
            } else {
                check_mobile_no = false;
            }
        } while (!check_mobile_no);
    }

    // customer_display() method display details of customer.
    void customer_display() {
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Customer Address: " + customer_address);
        System.out.println("Customer Mobile Number: " + customer_mobile_number + "\n");
    }

    // this method update car details
    void update_customer_details(Customer[] customer) {
        System.out.print("Enter Customer ID whose details you want to update: ");
        int id = sc.nextInt();
        boolean b = true;
        for (int i = 0; i < customer.length; i++) {
            if (customer[i].customer_id == id) {
                customer[i].customer_set();
                b = true;
            } else {
                b = false;
            }
        }
        if (!b) {
            System.out.println("Invalid Customer's ID :(");
        }
    }
}

// Servicerecord extends customer class & it extents car class-----> inheritance
class ServiceRecord extends Customer {

    String service_date, service_type, service_description;
    double service_cost;
    Scanner sc = new Scanner(System.in);
    int serviceCount = 0;
    ServiceRecord[] serviceRecords = new ServiceRecord[100];

    // to initialize default value
    ServiceRecord() {
        service_type = " ";
        service_description = " ";
        service_cost = 0;
        service_date = service_date = " ";
    }

    // to initilialize value of variables
    ServiceRecord(String service_type, String service_description, double service_cost, String service_date) {
        this.service_type = service_type;
        this.service_description = service_description;
        this.service_cost = service_cost;
        this.service_date = service_date;
    }
    int no_of_service;

    // this method records service of different customer
    void record_new_service() {
        System.out.print("Enter no. of service: ");
        no_of_service = sc.nextInt();
        sc.nextLine();
        Double service_cost = 0.0;
        for (int i = 0; i < no_of_service; i++) {
            System.out.println("-----Enter details of service no. " + (i + 1) + "-----");
            System.out.print("Enter service date in dd/mm/yyyy form: ");
            String service_date = sc.nextLine();
            boolean check_service_type = true;
            while (check_service_type) {
                System.out.println("1) Regular car service(1000 rs)\n2) Full car service(2500 rs)\n3)Specific car service");
                System.out.print("Enter Service Type Choice: ");
                int service_type = sc.nextInt();
                switch (service_type) {
                    case 1:
                        service_cost = 1000.0;
                        break;
                    case 2:
                        service_cost = 2500.0;
                        break;
                    case 3:
                        System.out.print("Enter Service Cost: ");
                        service_cost = sc.nextDouble();
                        sc.nextLine();
                        break;
                    default:
                        System.out.println("Invalid choice :(");
                }
                check_service_type = false;
            }
            sc.nextLine();
            System.out.print("Enter Service Description: ");
            String service_description = sc.nextLine();
            sc.nextLine();
            ServiceRecord newRecord = new ServiceRecord(service_type, service_description, service_cost, service_date);
            serviceRecords[serviceCount++] = newRecord;
            System.out.println("-----Service recorded successfully-----\n");
        }
    }

    // it records new services
    void record_new_service1() {
        System.out.print("Enter no. of service: ");
        no_of_service = sc.nextInt();
        sc.nextLine();
        Double service_cost = 0.0;
        for (int i = 0; i < no_of_service; i++) {
            System.out.println("-----Enter details of service no. " + (i + 1) + "-----");
            System.out.print("Enter service date in dd/mm/yyyy form: ");
            String service_date = sc.nextLine();
            boolean check_service_type = true;
            while (check_service_type) {
                System.out.println("1) Regular car service(1000rs)\n2) Full car service(2500 rs)\n3)Specific car service");
                System.out.print("Enter Service Type Choice: ");
                int n = sc.nextInt();
                switch (n) {
                    case 1:
                        serviceRecords[i].service_type = "Regular service";
                        service_cost = 1000.0;
                        break;
                    case 2:
                        serviceRecords[i].service_type = "Full service";
                        service_cost = 2500.0;
                        break;
                    case 3:
                        serviceRecords[i].service_type = "Specific service";
                        System.out.print("Enter Service Cost: ");
                        service_cost = sc.nextDouble();
                        sc.nextLine();
                        break;
                    default:
                        System.out.println("Invalid choice :(");
                }
                check_service_type = false;
            }
            sc.nextLine();
            System.out.print("Enter Service Description: ");
            String service_description = sc.nextLine();
            ServiceRecord newRecord = new ServiceRecord(service_type, service_description, service_cost, service_date);
            serviceRecords[serviceCount++] = newRecord;
            System.out.println("-----Service recorded successfully-----\n");
        }
    }

    //this display service details
    void display_service_details() {
        if (serviceCount == 0) {
            System.out.println("No service records found.");
            return;
        }

        System.out.println("-------- Service Records --------");
        for (int i = 0; i < serviceCount; i++) {
            System.out.println("-----service no. " + (i + 1) + "-----");
            System.out.println("Description: " + serviceRecords[i].service_description);
            System.out.println("Cost: $" + serviceRecords[i].service_cost);
            System.out.println("Date: " + serviceRecords[i].service_date);
            System.out.println("--------------------");
        }
    }

    double totalCost;

    //this calculate total cost of all service 
    void total_service_cost() {
        totalCost = 0;
        for (int i = 0; i < serviceCount; i++) {
            totalCost += serviceRecords[i].service_cost;
        }
    }
}

// main class
class ServiceCentre extends ServiceRecord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of customer: ");
        int n = sc.nextInt();
        ServiceCentre[] service = new ServiceCentre[n];

        //inputes
        for (int i = 0; i < service.length; i++) {
            service[i] = new ServiceCentre();
            System.out.println("******** CUSTOMER-" + (i + 1) + " ********");
            System.out.println("Enter Details of Customer");
            service[i].customer_set();
            System.out.println("-----Customer details stored successfully-----\n");
            service[i].car_set();
            System.out.println("-----Car details stored successfully-----\n");
            service[i].record_new_service();
            System.out.println("-----Service Records stored successfully-----\n");
            service[i].total_service_cost();
        }
        int choice;
        Customer c = new Customer();

        // display main menu
        do {
            System.out.println("1) Update Customer Details.");
            System.out.println("2) Update Car Details.");
            System.out.println("3) Display All Customers Detail with Car Details");
            System.out.println("4) Add New Records");
            System.out.println("5) Generate Service Report");
            System.out.println("6) Exit. \n");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    c.update_customer_details(service);
                    System.out.println("-----Customer updated details stored successfully-----\n");
                    break;
                case 2:
                    c.update_car_details(service);
                    System.out.println("-----Car updated details stored successfully-----\n");
                    break;
                case 3:
                    System.out.println("********DETAILS OF ALL CUSTOMERS WITH CAR********");
                    for (int i = 0; i < service.length; i++) {
                        System.out.println("------Details of Customer-" + (i + 1) + "------");
                        service[i].customer_display();
                        service[i].car_display();
                        System.out.println("--------------------\n");
                    }
                    break;
                case 4:
                    System.out.print("Enter Customer Id for which you want to record new service: ");
                    int id_for_newrecord = sc.nextInt();
                    for (int i = 0; i < service.length; i++) {
                        if (id_for_newrecord == service[i].customer_id) {
                            service[i].record_new_service1();
                            service[i].total_service_cost();
                            System.out.println("--------------------\n");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter Customer id for which you want to generate service report: ");
                    int id_for_service_report = sc.nextInt();
                    for (int i = 0; i < service.length; i++) {
                        if (id_for_service_report == service[i].customer_id) {
                            service[i].display_service_details();
                            System.out.println("Total cost: " + service[i].totalCost);
                        }
                    }
                    break;
                case 6:
                    System.out.println("THANK YOU:)");
                    break;
                default:
                    System.out.println("Invalid choice :(");

            }
        } while (choice != 6);
    }
}
