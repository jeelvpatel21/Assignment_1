/**
 * ACS-3913-770 - Assignment 1 F2026
 * Name: Jeelkumar Patel
 * Student Number: 3188975 
 */
import java.util.Random;
import javax.swing.JOptionPane;

public class PartBDriver {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("*** <an awesome fitness game name> ***");
        System.out.println("**************************************");

        PlayerData p = new PlayerData();
        HUD hud = new HUD(p);
        Achievements achievements = new Achievements(p);

        Random rand = new Random();
        String[] items = {"Lifting", "Running", "HIIT", "Steps"};
        String[] questions = {"Lift some weights?","Go for a run?","Do a HIIT workout?","Log some steps?"};
        String[] logs = {"* Strength session completed *","* Went for a run *","* High-intensity workout done *"};

        while (true) {
            boolean overtraining = false;
            
            if (p.getFitness() == 100) {
                overtraining = rand.nextInt(5) == 0;
            }

            int r;
            if (overtraining) {
                r = rand.nextInt(3);
            } else {
                r = rand.nextInt(items.length);
            }

            String question = questions[r];
            if (overtraining) {
                question = "*OVERTRAINING WARNING*\n" + question;
            }

            int result = JOptionPane.showConfirmDialog(null, question, null, JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.CLOSED_OPTION) {
                break;
            }

            if (overtraining) {
                System.out.println();
                if (result == JOptionPane.YES_OPTION) {
                    System.out.println(logs[r] + "\n");
                    System.out.println("*** Game over... Overtrained :( ***");
                } else {
                    System.out.println("Great choice - REST DAY!  Enjoy some ice cream :)\n");
                    System.out.println("*** Training complete! ***");
                }
                break;
            }
            
            if (result == JOptionPane.YES_OPTION) {
                if (items[r].equals("Steps")) {
                    p.enterSteps();
                } else {
                    p.workOut(items[r]);
                }
            }
        }
    }
}