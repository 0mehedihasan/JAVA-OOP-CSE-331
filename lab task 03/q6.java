/*

*/

class Train{
    int t_no;
    int departure_time;
    public static int total_after_train=0;
    public static int total_before_train=0;
    Train(int t_no,int departure_time)
    {
        this.t_no=t_no;
        this.departure_time=departure_time;
    }
    void journey()
    {
        if(departure_time>10)
        {
            total_after_train++;
        }
        else
        {
            total_before_train++;
        }
    }
}
class HelloWorld {
    public static void main(String[] args) {
       Train s1 = new Train(1, 13); //train no unnecsary
        Train s2 = new Train(3, 10);
        Train s3 = new Train(2, 8);
        
        s1.journey();
        s2.journey();
        s3.journey();
        
        System.out.println("Total trains started after 10 a.m.: " + Train.total_after_train);
           System.out.println("Total trains started after 10 a.m.: " + Train.total_before_train);

    }
}
