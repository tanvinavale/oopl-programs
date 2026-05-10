import java.util.Scanner;

class HotelBooking
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // 2D array for hotel rooms
        int rooms[][] = new int[3][5];

        int choice, floor, room;

        do
        {
            System.out.println("\n===== HOTEL ROOM BOOKING SYSTEM =====");
            System.out.println("1. View Room Status");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    // View room status
                    for(int i = 0; i < 3; i++)
                    {
                        System.out.println("Floor " + (i + 1));

                        for(int j = 0; j < 5; j++)
                        {
                            if(rooms[i][j] == 0)
                            {
                                System.out.println("Room " + (j + 1) + " : Available");
                            }
                            else
                            {
                                System.out.println("Room " + (j + 1) + " : Booked");
                            }
                        }
                    }
                    break;

                case 2:
                    // Book room
                    System.out.print("Enter Floor Number (1-3): ");
                    floor = sc.nextInt();

                    System.out.print("Enter Room Number (1-5): ");
                    room = sc.nextInt();

                    if(floor >= 1 && floor <= 3 && room >= 1 && room <= 5)
                    {
                        if(rooms[floor - 1][room - 1] == 0)
                        {
                            rooms[floor - 1][room - 1] = 1;
                            System.out.println("Room Booked Successfully!");
                        }
                        else
                        {
                            System.out.println("Room Already Booked!");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Room Number!");
                    }
                    break;

                case 3:
                    // Cancel booking
                    System.out.print("Enter Floor Number (1-3): ");
                    floor = sc.nextInt();

                    System.out.print("Enter Room Number (1-5): ");
                    room = sc.nextInt();

                    if(floor >= 1 && floor <= 3 && room >= 1 && room <= 5)
                    {
                        if(rooms[floor - 1][room - 1] == 1)
                        {
                            rooms[floor - 1][room - 1] = 0;
                            System.out.println("Booking Cancelled!");
                        }
                        else
                        {
                            System.out.println("Room Already Available!");
                        }
                    }
                    else
                    {
                        System.out.println("Invalid Room Number!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}