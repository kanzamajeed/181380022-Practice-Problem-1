public class RunheartRate{
    public static void main(String[] args) {
        HeartRate hr=new HeartRate("abc","xyz",12,02,2010);
        int age=hr.Age();
        System.out.println(age+"  is age");
        double maxhr=hr.MaxHeartRate();
        System.out.println(maxhr+ " is Max HeartRate");
        double thr=hr.TargetHeartRate();
        System.out.println(thr+" is Target HearRate");
    }
}
