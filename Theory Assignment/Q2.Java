interface Electrified {
    int getChargeCapacity();
    double getCurrentCharge();
    void setCurrentCharge(double charge);
}

class Bicycle {
    private double frameSize;
    private int nGears;
    private int currentGear;

    public Bicycle(double frameSize, int nGears) {
        this.frameSize = frameSize;
        this.nGears = nGears;
        this.currentGear = 1; // Assuming default gear is 1
    }
}

class CargoBicycle extends Bicycle {
    private double maxLoad;
    private double currentLoad;

    public CargoBicycle(double frameSize, int nGears, double maxLoad) {
        super(frameSize, nGears);
        this.maxLoad = maxLoad;
        this.currentLoad = 0; // Assuming initially no load
    }
}

class ElectricBicycle extends Bicycle implements Electrified {
    private int batteryCapacity;
    private double currentCharge;

    public ElectricBicycle(double frameSize, int nGears, int batteryCapacity) {
        super(frameSize, nGears);
        this.batteryCapacity = batteryCapacity;
        this.currentCharge = 0; // Assuming initially empty battery
    }

    @Override
    public int getChargeCapacity() {
        return batteryCapacity;
    }

    @Override
    public double getCurrentCharge() {
        return currentCharge;
    }

    @Override
    public void setCurrentCharge(double charge) {
        if (charge >= 0 && charge <= batteryCapacity) {
            this.currentCharge = charge;
        } else {
            System.out.println("Invalid charge value.");
        }
    }
}

class ElectricCargoBicycle extends CargoBicycle implements Electrified {
    private int batteryCapacity;
    private double currentCharge;

    public ElectricCargoBicycle(double frameSize, int nGears, double maxLoad, int batteryCapacity) {
        super(frameSize, nGears, maxLoad);
        this.batteryCapacity = batteryCapacity;
        this.currentCharge = 0; // Assuming initially empty battery
    }

    @Override
    public int getChargeCapacity() {
        return batteryCapacity;
    }

    @Override
    public double getCurrentCharge() {
        return currentCharge;
    }

    @Override
    public void setCurrentCharge(double charge) {
        if (charge >= 0 && charge <= batteryCapacity) {
            this.currentCharge = charge;
        } else {
            System.out.println("Invalid charge value.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        ElectricBicycle electricBicycle = new ElectricBicycle(20.0, 6, 500);
        ElectricCargoBicycle electricCargoBicycle = new ElectricCargoBicycle(25.0, 7, 100, 750);

        System.out.println("Electric Bicycle Battery Capacity: " + electricBicycle.getChargeCapacity());
        System.out.println("Electric Bicycle Current Charge: " + electricBicycle.getCurrentCharge());
        electricBicycle.setCurrentCharge(300);
        System.out.println("Updated Electric Bicycle Current Charge: " + electricBicycle.getCurrentCharge());

        System.out.println("Electric Cargo Bicycle Battery Capacity: " + electricCargoBicycle.getChargeCapacity());
        System.out.println("Electric Cargo Bicycle Current Charge: " + electricCargoBicycle.getCurrentCharge());
        electricCargoBicycle.setCurrentCharge(600);
        System.out.println("Updated Electric Cargo Bicycle Current Charge: " + electricCargoBicycle.getCurrentCharge());
    }
}

