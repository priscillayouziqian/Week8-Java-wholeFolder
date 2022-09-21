public class Mars {
    public static void main(String[] args){
        String ColonyName = "SpaceX";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        //Food = Food - (population * 0.75), because everyone eats 0.75 meals per day
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);

        System.out.println(ShipFood);

        ShipFood = ShipFood + (ShipFood * 0.5);

        ShipPopulation = ShipPopulation + 5;

        String LandingLocation = "The Plain";

        /*  DOT DOCUMENT
         * Function name: xxx
         * @param name (String)
         * @return (String)
         *
         * Inside the function:
         *  1, pass in the string and returns it.
         */


        if(LandingLocation.equalsIgnoreCase("the plain")){
            System.out.println("Bbzzz Landing on the Plain");
        }else{
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        Landing = LandingCheck(100);


    }
    private static boolean LandingCheck(int Loops) throws InterruptedException{
        for(int i = 0; i <= Loops; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Keep Center");
            }else if(i % 5 == 0){
                System.out.println("Right");
            }else if(i % 3 == 0){
                System.out.println("Left");
            }else{
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
    }
    return false;


}
