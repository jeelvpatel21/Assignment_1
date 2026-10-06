/**
 * ACS-3913-770 - Assignment 1 F2026
 * Name: Jeelkumar Patel
 * Student Number: 3188975 
 */
public class BasicCameraApp extends CameraApp{
    public BasicCameraApp(){
        setShareStrategy(new Email());
    }
    
    public void edit(){
        System.out.println("Basic photo editing");
    }
}
