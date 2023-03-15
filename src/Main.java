public class Main {
    public static void main(String[] args) {

        //Definiera variabel för om det regnar
        boolean rain = true;
        //Definiera variabel för om det kommer att regna inom en timme
        boolean rain1hFromNow = false;
        //Definiera variabel för om du behöver paraply
        boolean willNeedUmbrella = rain || rain1hFromNow;
        //Skriv ut om du behöver paraply
        System.out.println("Behöver jag paraply? "+ willNeedUmbrella);
    }
}
