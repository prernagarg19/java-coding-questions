import java.util.Scanner;

class PowerCalc {
    public double pow(double base, double exponent) {
        if(exponent == 0) 
            return 1;
        return base * pow(base, exponent-1);
    }
}

public class PowerProblem {
    public static void main(String[] args) {
        PowerCalc p = new PowerCalc();
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        double res = p.pow(base, exponent);
        System.out.println(res);
        
    }    
}
