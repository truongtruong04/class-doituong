public class lopvadoituong {

    int Giaxe;

    public lopvadoituong(String ten){
        System.out.println("Ten xe la :" + ten );
    }
    public void setGia( int gia ){
        Giaxe = gia;
    }

    public int getGia( ){
        System.out.println("Gia mua xe la :" + Giaxe );
        return Giaxe;
    }
    public static void main(String []args){
        lopvadoituong Xecuatoi = new lopvadoituong( "Toyota" );
        Xecuatoi.setGia( 1000000000 );

        Xecuatoi.getGia( );
        System.out.println("Gia tri bien :" + Xecuatoi.Giaxe );
    }
}