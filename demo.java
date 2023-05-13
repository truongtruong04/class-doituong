   public class demo {
    int ro;
    String name;

    void insertRecord(int r, String n){
        ro=r;
        name=n;
    }

    void displayInformation(){System.out.println(ro+" "+name);}

    public static void main(String args[]){
        demo s1=new demo();
        demo s2=new demo();

        s1.insertRecord(1,"Hến ");
        s2.insertRecord(22,"Trường ");

        s1.displayInformation();
        s2.displayInformation();

    }
}
