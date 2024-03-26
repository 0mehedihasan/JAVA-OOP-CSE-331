import java.util.Date;

class Customer {
    private String name;
    private boolean member;
    private String memberType;
    private Visit visit;

    public Customer(String name, Visit visit) {
        this.name = name;
        this.visit = visit;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        this.memberType = type;
    }

    public Visit getVisit() {
        return visit;
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Membership: " + (member ? memberType : "None"));
        visit.displayInfo();
    }
}

class Visit {
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Date date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    public void displayInfo() {
        System.out.println("Date: " + date);
        System.out.println("Service Expense: $" + serviceExpense);
        System.out.println("Product Expense: $" + productExpense);
        System.out.println("Total Expense: $" + getTotalExpense());
    }
}

class Discount {
    private static final double SERVICE_DISCOUNT_PREMIUM = 0.2;
    private static final double SERVICE_DISCOUNT_GOLD = 0.15;
    private static final double SERVICE_DISCOUNT_SILVER = 0.1;
    private static final double PRODUCT_DISCOUNT_PREMIUM = 0.1;
    private static final double PRODUCT_DISCOUNT_GOLD = 0.1;
    private static final double PRODUCT_DISCOUNT_SILVER = 0.1;

    public static double getServiceDiscountRate(String type) {
        switch (type) {
            case "Premium":
                return SERVICE_DISCOUNT_PREMIUM;
            case "Gold":
                return SERVICE_DISCOUNT_GOLD;
            case "Silver":
                return SERVICE_DISCOUNT_SILVER;
            default:
                return 0.0;
        }
    }

    public static double getProductDiscountRate(String type) {
        return 0.1; // Flat 10% discount for all membership types
    }
}

public class BeautySaloonTest {
    public static void main(String[] args) {
        Visit visit = new Visit(new Date());
        visit.setServiceExpense(300); // Assuming service expense is $100
        visit.setProductExpense(150);  // Assuming product expense is $50

        Customer customer = new Customer("Mehedi", visit);
        customer.setMember(true);
        customer.setMemberType("Premium");

        customer.displayInfo();

        double totalBill = calculateTotalBill(customer);
        System.out.println("Total Bill: $" + totalBill);
    }

    public static double calculateTotalBill(Customer customer) {
        double serviceExpense = customer.getVisit().getServiceExpense();
        double productExpense = customer.getVisit().getProductExpense();
        double totalServiceExpense = serviceExpense;
        double totalProductExpense = productExpense;

        if (customer.isMember()) {
            double serviceDiscountRate = Discount.getServiceDiscountRate(customer.getMemberType());
            double productDiscountRate = Discount.getProductDiscountRate(customer.getMemberType());

            totalServiceExpense = serviceExpense - (serviceExpense * serviceDiscountRate);
            totalProductExpense = productExpense - (productExpense * productDiscountRate);
        }

        return totalServiceExpense + totalProductExpense;
    }
}
