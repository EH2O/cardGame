import java.util.Arrays;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {


        String[] Champions = {"Kael"};
        Object[] playersChamps = new Object[2];
        for (int i = 0; i < Champions.length; i++) {
            System.out.println(i+1 + ": " + Champions[i]);
        }
        int PlayerNum = 1;
        Scanner Choice = new Scanner(System.in);
        System.out.println("Player One choose your champion. By typing the correct number\n");
        Boolean Temp = true;
        playersChamps[0] = chooseChar(PlayerNum, Temp, Choice);
        Temp = true;
        System.out.println("Player Two choose you champion. By typing the correct number\n");
        playersChamps[1] = chooseChar(PlayerNum, Temp, Choice);




    }

    private static <T> T  chooseChar(int PlayerNum, boolean Temp, Scanner Choice) {
        Kael test = null;
        while (Temp) {

            String Answer = Choice.nextLine();
            if (isInt(Answer)) {
                if (Answer.equals("1")) {

                    PlayerNum++;
                    Temp = false;
                    test = new Kael();
                }
            } else {
                System.out.println("L");
            }

        }
        return (T) test;
    }

    public static boolean isInt(String answer){
        try {
            int test = Integer.parseInt(answer);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
