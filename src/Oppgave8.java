public class Oppgave8 {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;
        int i = 0;
        while (i < 100) {
            i += 2;
            teller ++;
            sum += i;
        }
        double snitt = (double)sum / teller;
        System.out.println("Summen av tallene er: "+sum);
        System.out.println("Snittet av tallene er: "+snitt);
    }
}
