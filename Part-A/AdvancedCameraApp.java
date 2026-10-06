/**
 * ACS-3913-770 - Assignment 1 F2026
 * Name: Jeelkumar Patel
 * Student Number: 3188975 
 */
public class AdvancedCameraApp extends CameraApp{
    public AdvancedCameraApp(){
        setShareStrategy(new Text());
    }
    
    public void edit(){
        System.out.println("Advanced photo editing");
    }
}
