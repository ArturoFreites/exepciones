package g11.ejer6;

public class G11Ejer6 {

    public static void main(String[] args) {
        
        maxi max = new maxi();
        
        try
        {
            System.out.println(max.metodo());
        } catch (Exception e)
        {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
    }
}
