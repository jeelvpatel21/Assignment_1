public class HUD implements Observer {
    private PlayerData playerData;

    public HUD(PlayerData playerData) {
        this.playerData = playerData;
        playerData.registerObserver(this);
    }

    public void update() {
        String workout = playerData.getWorkout();
        int fitness = playerData.getFitness();
        int steps = playerData.getSteps();

        System.out.println();

        if (workout.equals("Lifting")) {
            System.out.println("* Strength session completed *");
        } else if (workout.equals("Running")) {
            System.out.println("* Went for a run *");
        } else if (workout.equals("HIIT")) {
            System.out.println("* High-intensity workout done *");
        } else if (workout.equals("1000 steps logged")
                || workout.equals("Steps")) {
            System.out.println("* 1000 steps logged *");
        }

        System.out.print("Fitness: [");

        for (int i = 0; i < 10; i++) {
            if (i < fitness / 10) {
                System.out.print("■");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println("] " + fitness + "%");
        System.out.println("Step count: " + steps);
    }
}