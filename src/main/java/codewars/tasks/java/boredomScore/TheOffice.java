package codewars.tasks.java.boredomScore;

public class TheOffice {
    /*
    Depending what people are doing with their time they can become more or less boring.
    Each department has a different boredom assessment score. Depending on the cumulative score of the team, return the appropriate sentiment:
    <=80: 'kill me now'
    < 100 & > 80: 'i can handle this'
    100 or over: 'party time!!'
    accounts = 1 finance = 2 canteen = 10 regulation = 3 trading = 6 change = 6 IS = 8 retail = 5 cleaning = 4 pissing about = 25
     */
    public static String boredom(Person[] staff) {
        int score = 0;
        int teamScore = 0;
        String message = "";

        for (int i = 0 ; i < staff.length; i++) {

            switch (staff[i].department) {
                case ("accounts"):
                    score = 1;
                    break;
                case ("finance"):
                    score = 2;
                    break;
                case ("canteen"):
                    score = 10;
                    break;
                case ("regulation"):
                    score = 3;
                    break;
                case ("trading"): case ("change"):
                    score = 6;
                    break;
                case ("IS"):
                    score = 8;
                    break;
                case ("retail"):
                    score = 5;
                    break;
                case ("cleaning"):
                    score = 4;
                    break;
                case ("pissing about"):
                    score = 25;
                    break;
                default:
                    System.out.println("There is no department" + staff[i].department);
            }
            teamScore += score;

        }
        if (teamScore <= 80 && teamScore > 0){
            message = "kill me now";
        } else if (teamScore > 80 && teamScore < 100){
            message = "i can handle this";
        }else if (teamScore >= 100){
            message = "party time!!";
        }

        System.out.println(message);
        return message;
    }

}
