class Drive49 {
    private double totalCapacity;
    public double used;
    private double free;

    public Drive49(double totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.used = 0;
        this.free = totalCapacity;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }

    public double getUsed() {
        return used;
    }

    public double getFree() {
        return free;
    }

    public void uploadFile(double fileSize) {
        if (fileSize <= free) {
            used += fileSize;
            free -= fileSize;
            System.out.println("File uploaded successfully.");
        } else {
            System.out.println("Not enough free space to upload the file.");
        }
    }

    public void upgradePlan(double additionalCapacity) {
        totalCapacity += additionalCapacity;
        free += additionalCapacity;
        System.out.println("Plan upgraded successfully. New total capacity: " + totalCapacity);
    }

    public void viewStatus() {
        System.out.println("Total Capacity: " + totalCapacity + "GB");
        System.out.println("Used: " + used + "GB");
        System.out.println("Free: " + free + "GB");
    }
}

public class Drive49Main {
    public static void main(String[] args) {
        Drive49 drive49 = new Drive49(10);
        Drive49User mehedi = new Drive49User("Mehedi", drive49);
        mehedi.viewStatus();
        mehedi.uploadFile(2);
        mehedi.viewStatus();
        mehedi.upgradePlan(5);
        mehedi.viewStatus();
    }
}

class Drive49User {
    private String name;
    private Drive49 drive49;

    public Drive49User(String name, Drive49 drive49) {
        this.name = name;
        this.drive49 = drive49;
    }

    public void uploadFile(double fileSize) {
        drive49.uploadFile(fileSize);
    }

    public void upgradePlan(double additionalCapacity) {
        drive49.upgradePlan(additionalCapacity);
    }

    public void viewStatus() {
        System.out.println("Status for user " + name + ":");
        drive49.viewStatus();
    }
}
