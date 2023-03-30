import java.util.Scanner;

class  Farmer
    
    {
        int pa;
        float td;
        float ri;
        float si;
        void input()
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("plese mention the amount required");
            pa = scan.nextInt();
            System.out.println("plese mention the time duration");
            td = scan.nextFloat();
            ri=8.5f;
            scan.close();
                
        }
        void compute()
        {
             si=(pa*ri*td)/100f;
        }
        void disp()
        {
            System.out.println("SI is :" +si);
        }
        
    }
        public class classFarmer
        {
            public static void main(String[] args)
            {
                Farmer f1=new Farmer();
                f1.input();
                f1.compute();
                f1.disp();

                Farmer f2=new Farmer();
                f2.input();
                f2.compute();
                f2.disp();
            }
        }
