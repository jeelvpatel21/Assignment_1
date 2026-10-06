/**
 * ACS-3913-770 - Assignment 1 F2026
 * Name: Jeelkumar Patel
 * Student Number: 3188975 
 */

public class Achievements implements Observer {
    private PlayerData playerData;
    private boolean metconMachine;
    private boolean peakFitness;
    private boolean stepGoal;

    public Achievements(PlayerData playerData) {
        this.playerData = playerData;
        metconMachine = false;
        peakFitness = false;
        stepGoal = false;
        playerData.registerObserver(this);
    }

    public void update() {
        String workout = playerData.getWorkout();
        int fitness = playerData.getFitness();
        int steps = playerData.getSteps();

        if (workout.equals("HIIT") && !metconMachine) {
            metconMachine = true;
            System.out.println("*** Achievement unlocked: Metcon Machine! ***");
        }

        if (fitness == 100 && !peakFitness) {
            peakFitness = true;
            System.out.println("*** Achievement unlocked: Peak Fitness! ***");
        }

        if (steps >= 10000 && !stepGoal) {
            stepGoal = true;
            System.out.println("*** Achievement unlocked: Step Goal Reached! ***");
        }
    }
}