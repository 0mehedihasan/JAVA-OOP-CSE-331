/*
Suppose you want to create a cloud storage service (e.g. google drive) named ‘Drive49’,

which has a Total_capacity of 10GB (in which there are two portions Used and Free). Each

time a new user creates an account to your service a new storage is constructed for the user.

For a new user Used portion should be assigned to zero and Free portion should be assigned

to 10. A user can Upload a file of a certain Size to his ‘Drive49’ storage. Uploading a file

will increase the Used portion by the Size of the file and decrease the Free portion by the

same amount of space. A user can extend the Total_capacity of his ‘Drive49’ by upgrading

(Upgrade) his user plan. He can also View the status of his storage (Total_capacity, Used,

Free). Now show the process of creating your ‘Drive49’ service and a User of the service.

Also create a user and upgrade the used plan and finally show that users status.
  */
public class Drive49Demo {
    public static void main(String[] args) {
        Drive49 driveService = new Drive49(10);

        driveService.uploadFile(3);
        driveService.viewStatus();

        driveService.upgradePlan(5);
        driveService.viewStatus();
    }
}

class Drive49 {
    int tcap;
    int used;
    int free;

    Drive49(int tcap) {
        this.tcap = tcap;
        this.used = 0;
        this.free = tcap;
    }

    void uploadFile(int fileSize) {
        if (fileSize <= free) {
            used += fileSize;
            free -= fileSize;
            System.out.println("File uploaded successfully.");
        } else {
            System.out.println("Not enough free space to upload the file.");
        }
    }

    void upgradePlan(int addcap) {
        tcap += addcap;
        free += addcap;
        System.out.println("Plan upgraded successfully.");
    }

    void viewStatus() {
        System.out.println("Total Capacity: " + tcap + "GB");
        System.out.println("Used: " + used + "GB");
        System.out.println("Free: " + free + "GB");
    }
}
