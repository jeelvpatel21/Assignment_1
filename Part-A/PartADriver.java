/**
 * ACS-3913-770 - Assignment 1 F2026
 * Name: Jeelkumar Patel
 * Student Number: 3188975 
 */

public class PartADriver{
    public static void main(String[] args){
        CameraApp camera = new AdvancedCameraApp();

        camera.capture();
        camera.save();
        camera.share();
        camera.edit();        

        camera.setShareStrategy(new Instagram());
        camera.share();
    }
}