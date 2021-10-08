public class Oppgave8medFasit {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;
        int i = 0;
        while (i < 100) {
            sum += i;
            i += 2;
            teller ++;
            //Rekkefølgen på de 3 linjene over er kjempeviktig!
        }
        double snitt = (double)sum / teller;
        System.out.println("Summen av tallene er: "+sum);
        System.out.println("Snittet av tallene er: "+snitt);
    }
}
