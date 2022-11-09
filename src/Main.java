public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int number = 0;
        String season = "Winter";
        System.out.println("---------------IF--------------");
        main.enum1();
        System.out.println("\n---------------WHILE--------------");
        main.enum2(number);
        System.out.println("---------------DO WHILE--------------");
        main.enum3(number);
        System.out.println("---------------FOR--------------");
        main.enum4();
        System.out.println("---------------SWITCH--------------");
        main.enum5(season);
    }

    public void enum1() {
        // Using an if, create a condition that compares whether the numeroIf variable is positive, negative, or 0.
        //Hint: Numbers less than 0 are negative and numbers greater than 0 are positive.
        //generate a random number from -10 to 10

        int randomNumber = Main.getRandomNumber(-10, 10);
        int numeroIf = randomNumber;
        String cadena = "";
        if (numeroIf > 0) cadena = "positive";
        if (numeroIf < 0) cadena = "negative";
        if (numeroIf == 0) cadena = "0";
        System.out.println("The number " + randomNumber + " is " + cadena);


    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void enum2(int numberWhile) {
        //create a loop of type 'while', this loop will have to have as condition
        while (numberWhile < 3) {
            //Increment the value of the variable by one each time it is executed.
            numberWhile++;
            //Display it on the screen each time it is executed.
            System.out.println(numberWhile);

        }
        //Display it on the screen each time it is executed.
    }

    public void enum3(int numberWhile) {
        //For the Do While loop, you must create the same structure as in the While loop, but it must only be executed once.
        do {
            numberWhile++;
            System.out.println(numberWhile);

        }
        while (numberWhile < 3);
    }

    public void enum4() {

        for (int numberFor = 0; numberFor <= 3; numberFor++) {
            System.out.println(numberFor);
        }


    }

    public void enum5(String season) {
//Finally, for the Switch, you must create the season variable, and different cases for the four seasons of the year. Depending on the value of the season variable, a message should be sent by console informing of the season in which it is. You will also have to set a default for when the value of the variable is not a season.
        switch (season) {
            //Winter
            case "Winter":
                System.out.println("We are in the 'Winter' season");
                break;
            //Spring
            case "Spring":
                System.out.println("We are in the 'Spring' season");
                break;
            //Summer
            case "Summer":
                System.out.println("We are in the 'Summer' season");

                break;
            //Autumn
            case "Autumn":
                System.out.println("We are in the 'Autumn' season");

                break;
            default:
                System.out.println("the value of the variable is not a season.");
        }
    }

}
