public class Feladat01 {

    public int feladat01(String[] szinek){

        int osszes = 0; //lehetséges keverékek száma
        int szinekSzama = szinek.length; //elérhető színek

        if(szinekSzama > 1){
            
            //ismétlés nélküli kombinációk
            for(int i = szinekSzama; i > 1; i--){

                osszes += fakt(szinekSzama)/(fakt(i) * fakt(szinekSzama - i));

            }

        }

        return osszes;

    }

    private int fakt(int szam){

        //faktoriális kiszámítása

        int fakt = 1;

        while(szam > 1){
            fakt *= szam;
            szam--;
        }

        return fakt;

    }

}
