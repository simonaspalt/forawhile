public class Main {
    public static void main(String[] args)  {
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

        for (int i = 9; i <50 ; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("========== uzd 7 ==========");

        //Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei skaičius dalinasi iš 10 be liekanos
        // jo nespausdinkite. ( naudokite continue.) (atspausdinti visus porinus skaičius, išskyrus tuos
        // kurie dalinasi iš 10 be liekanos)







    }
}