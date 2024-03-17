import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== uzd 1 ==========");

        //  Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }

        System.out.println("========== uzd 2 ==========");

//Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("========== uzd 3 ==========");

        //Sukurkite masyvą iš dešimties augalų pavadinimų.

        String[] plants = {"Azuolas", "Berzas", "Klevas", "Liepa", "Egle", "Uosis", "Sermuksnis", "Ramune", "Ruta", "Dobilas"};
        System.out.println(plants.length);

        System.out.println("========== uzd 4 ==========");

        // Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

        for (int i = 0; i < 10; i++) {
            System.out.println(plants[i]);
        }

        System.out.println("========== uzd 5 ==========");

        //Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio,
        // ir baigiant pirmuoju. (atvirkščias ciklas).

        for (int i = 9; i >= 0; i--) {
            System.out.println(plants[i]);
        }

        System.out.println("========== uzd 6 ==========");

        //  Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);

        for (int i = 9; i < 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("========== uzd 7 ==========");

        //Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei skaičius dalinasi iš 10 be liekanos
        // jo nespausdinkite. ( naudokite continue.) (atspausdinti visus porinus skaičius, išskyrus tuos
        // kurie dalinasi iš 10 be liekanos)

        for (int i = 9; i < 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("========== uzd 8 ==========");

        // Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite,
        // kiek kartų kintamasis i turėjo porinę reikšmę;

        int counter = -1;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                counter++;
            }

        }

        System.out.println(" i buvo porinis " + counter + " kartu");


        System.out.println("========== uzd 9 ==========");
        //Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai,
        // ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)


        counter = 0;

        for (int i = 0; i < plants.length; i++) {
            String plant = (String) plants[i];
            int w = plant.length();
            if (w < 5) {
                counter++;
            }
        }
        System.out.println("masyve yra " + counter + " zodziu trumpesniu nei 5 simboliai");
        counter = 0;
        for (int i = 0; i < plants.length; i++) {
            String plant = (String) plants[i];
            int w = plant.length();
            if (w > 7) {
                counter++;
            }
        }
        System.out.println("massyve yra " + counter + " zodziu ilgesniu nei 7 simboliai");

        System.out.println("========== uzd 10 ==========");

        ///Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai
        // bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)

        counter = 0;
        for (int i = 0; i < plants.length; i++) {
            String plant = (String) plants[i];
            int w = plant.length();
            if (w > 5 && w < 10) {
                counter++;
            }
        }

        System.out.println(" masyve yra " + counter + " zodziu tarp 5 ir 10 simbolių ilgio");


        System.out.println("========== sud 1 ==========");

        //Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus
        // tarpais ir suskaičiuokite kiek tarp jų yra didesnių už 150.  Skaičiai didesni
        // nei 275 turi būti atspausdinti skliausteliuose” [ ] “
        counter = 0;
        for (int i = 0; i < 300; i++) {
            int num = (int) (Math.round(Math.random() * 300));
            if (num < 275) {
                System.out.print(num + " ");
            } else {
                System.out.print("[" + num + "] ");
            }
            if (num > 150) {
                counter++;
            }

        }
        System.out.println();
        System.out.println("there are " + counter + " numbers larger than 150");


        System.out.println("========== sud 2 ==========");
        //Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi
        // iš 77 be liekanos. Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio
        // neturi būti.

        for (int i = 1; i <= 3000; i++) {
            if (i < 3000 - 77) {
                if (i % 77 == 0) {
                    System.out.print(i + ",");
                }
            } else if (i % 77 == 0) {
                System.out.print(i);
            }
        }


        System.out.println("========== sud 3 ==========");
        //Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”.
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
        //* * * * * * * * * * *
// KRATINES SUDARO HAS TO BE EVEN NUMBER!!!!!!!!! EVEN BETTER IF IT IS NUMBER % 4 == 0
        // 24 / 4 = 6 how many * into line
        // ((24 - (6 * 2)) / 2) + 1 = 7  how many * collum

        int x = 24; // x is given number of * in perimeter
        if (x % 4 == 0) {
            int line = (x / 4) + 1; // how many * in a line
            int collum = line; // how many * in a collum
            for (int i = 0; i < collum; i++) {
                for (int p = 0; p < line; p++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            //   System.out.println(collum);
        } else {
            int line = (x / 4) + 1;
            int collum = line + 1;
            for (int i = 0; i < collum; i++) {
                for (int p = 0; p < line; p++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            //  System.out.println(collum);
        }

        System.out.println("========== sud 5a ==========");

        //Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija,
        // kur 0 yra herbas, o 1 - skaičius. Monetos metimo rezultatus išvedame į ekraną
        // atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas. Suprogramuokite
        // tris skirtingus scenarijus kai monetos metimą stabdome:
        //a Iškritus herbui;
        //b Tris kartus iškritus herbui;
        //c Tris kartus iš eilės iškritus herbui;

        while (true) {
            int a = (int) (Math.round(Math.random()));
            if (a == 0) {
                System.out.println("H");
                break;
            } else {
                System.out.println("S");

            }
        }

        System.out.println("========== sud 5b ==========");
        //b Tris kartus iškritus herbui;
        counter = 0;
        while (true) {
            int a = (int) (Math.round(Math.random()));
            if (a == 0) {
                System.out.println("H");
                counter++;
            } else {
                System.out.println("S");
            }
            if (counter == 3) {
                break;}
        }

        System.out.println("========== sud 5c ==========");
        //c Tris kartus iš eilės iškritus herbui;
        counter = 0;
        while (true) {
            int a = (int) (Math.round(Math.random()));
            if (a == 0) {
                System.out.println("H");
                counter++;
            } else {
                System.out.println("S");
                counter = 0;
            }
            if (counter == 3) {
                break;}
        }


    }
}