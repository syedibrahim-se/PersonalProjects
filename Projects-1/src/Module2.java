public class Module2 {

    public void cseEng() {

        String cse[] = {"chemistry", "Physical chemistry", "Bio chemistry", "Inorganic chemistry", "Polymer chemistry"};

        System.out.println("The Books Available in CSE Department are as Follow");
        for (int i = 0; i < cse.length; i++) {
            System.out.println(cse[i]);
        }
    }
        public void civilEng(){
            String civil[]={"Mechanics","Dynamics","Solid state physics","Astro physics","Electromagnetism"};
            System.out.println("The Books Available in CIVIL Department are as Follow");
            for(int i=0;i<civil.length;i++){

                System.out.println(civil[i]);
            }
        }
        public void eeeEng(){

        String eee[]={"Zoology","Botany","Medical science"};
            System.out.println("The Books are Available in EEE Department");
        for(int i=0;i<eee.length;i++) {
            System.out.println(eee[i]);

            }
        }


}
