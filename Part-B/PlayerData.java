/**
 * ACS-3913-770 - Assignment 1 F2026
 * Name: Jeelkumar Patel
 * Student Number: 3188975 
 */

import java.util.ArrayList;

public class PlayerData implements Subject {
    private int fitness;
    private String workout;
    private int steps;
    private ArrayList<Observer> observers;

    public PlayerData() {
        fitness = 10;
        workout = "Ready to train";
        steps = 0;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public int getFitness() {
        return fitness;
    }

    public String getWorkout() {
        return workout;
    }

    public int getSteps() {
        return steps;
    }

    public void workOut(String item) {
        this.workout = item;

        if (item.equals("Lifting")) {
            if (fitness + 10 > 100) fitness = 100;
            else fitness += 10;
        }
        else if (item.equals("Running")) {
            if (fitness + 20 > 100) fitness = 100;
            else fitness += 20;
        }
        else if (item.equals("HIIT")) {
            if (fitness + 30 > 100) fitness = 100;
            else fitness += 30;
        }
        notifyObservers();
    }

    public void enterSteps() {
        steps += 1000;
        workout = "1000 steps logged";
        notifyObservers();
    }
}