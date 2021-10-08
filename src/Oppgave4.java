public class Oppgave4 {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;
        for (int i = 0; i < 100; i += 2) {
            sum += i;
            teller ++;
        }
        System.out.println("Summen av alle partallene mellom 0 og 100 er: "+sum);
        double gjennomsnitt = (double)sum / (double)teller;
        System.out.println("Gjennomsnittet av summen av partallene er: "+gjennomsnitt);
    }
}
