
public class MainClass {
    public static void main(String[] args) {
        String internetSubeButonu = "İnternet Şubeye gir";
        double dolarDun = 8.20;
        double dolarBugün = 8.20;
        int vade = 36;
        boolean dustuMu = false;

        System.out.println(internetSubeButonu);

        if (dolarBugün < dolarDun) {
            System.out.println("Dolar Düştü Resmi");
        } else if (dolarBugün > dolarDun) {
            System.out.println("Dolar Yükseldi Resmi");
        } else {
            System.out.println("Dolar Eşittir Resmi");
        }
        System.out.println("--------------------------------------------------------------------------------------------");

        String kredi1 = "Hızlı Kredi";
        String kredi2 = "Mutlu Emekli Kredisi";
        String kredi3 = "Konut Kredisi";
        String kredi4 = "Çiftçi Kredisi";
        String kredi5 = "Msb Kredi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        System.out.println("--------------------------------------------------------------------------------------------");
        String[] krediler =
                {
                        "Hızlı Kredi",
                        "Mutlu Emekli Kredisi",
                        "Konut Kredisi",
                        "Çiftçi Kredisi",
                        "Msb Kredi"
                };

        //foreach
        for (String kredi : krediler) {
            System.out.println(kredi);
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------------");

    }
}