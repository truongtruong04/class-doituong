 public class classvadoituong2 {
    int length;
    int awidth;

    void insert(int l,int w){
        length=l;
        awidth=w;
    }

    void calculateArea(){System.out.println(length*awidth);}

    public static void main(String args[]){
        classvadoituong2 r1=new classvadoituong2(),r2=new classvadoituong2();

        r1.insert(100,5);
        r2.insert(36,15);

        r1.calculateArea();
        r2.calculateArea();
    }
}
