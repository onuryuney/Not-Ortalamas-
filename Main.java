import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int mat, geo, fizik, kimya, beden;
        Scanner inp=new Scanner(System.in);

        System.out.print("mat notu; ");
        mat=inp.nextInt();
        System.out.print("geo notu; ");
        geo=inp.nextInt();
        System.out.print("fizik notu; ");
        fizik=inp.nextInt();
        System.out.print("kimya notu; ");
        kimya=inp.nextInt();
        System.out.print("beden notu; ");
        beden=inp.nextInt();

        int sum=(mat+geo+fizik+kimya+beden);
        double result=sum/5.0;


        System.out.println("ortalama; "+result);
    }

}
