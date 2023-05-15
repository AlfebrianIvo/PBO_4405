package week4;

public class Nilai
{
    public static void main(String[] args)
    {
        Scanner inp = new
        Scanner(system.in);
        float nilai = inp.nextfloat();

        Nilai n1 = new Nilai();
        char huruf = n1.getNilHuruf(nilai);
        char getNilHuruf(float n1);
        {
            return ....;
        }
        String getPredikat(char huruf){
            switch(huruf)
            {
                case 'A':predikat="Apik";
                    break;
                case 'B':predikat="Baik";
                    break;
                case 'C':predikat="Cukup";
                    break;
                case 'D':predikat="Dablek";
                    break;
                default:predikat="Elek";
            }
            return predikat;
        }
        System.out.println("Nilai Huruf : "+getNilHuruf(nilaiAkhir));
        System.out.println("Predikat    : "+getPredikat(Huruf));
        
    }
}