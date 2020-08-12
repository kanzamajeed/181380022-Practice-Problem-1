public class HeartRate{
    private String firstName;
    private String lastname;
    private String dateofBirth;
    private int day;
    private int month;
    private int year;

    public HeartRate(){

    }

    public HeartRate(String fn,String ln,int d,int m,int y){
        firstName=fn;
        lastname=ln;
        this.setdateofBirth(d,m,y);

    }
    public void setFirstName(String fn){
        firstName=fn;
    }

    public void setLastName(String ln){
        lastname=ln;
    }
    public void setdateofBirth(int d,int m,int y) {
        day=d;
        month=m;
        year=y;
        dateofBirth = day+" "+month+" "+year;
    }
    public String getdateofBirth() {
        return dateofBirth;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastname;
    }
    public int Age(){
        int age=2020-this.year;
        return age;

    }
    public double MaxHeartRate(){

        double range=Age()-220;
        return range;

    }
    public double TargetHeartRate(){

        int range=(50/100)-(80/100);
        double target=range*MaxHeartRate();
        return target;



    }
}