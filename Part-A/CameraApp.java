/**
 * ACS-3913-770 - Assignment 1 F2026
 * Name: Jeelkumar Patel
 * Student Number: 3188975 
 */

public abstract class CameraApp{
    private ShareStrategy shareStrategy;
    public CameraApp(){
    }
    
    public CameraApp(ShareStrategy s){
        this.shareStrategy = s;
    }
    
    public abstract void edit();
    
    public void capture(){
        System.out.println("Capture a photo");
    }
    
    public void save(){
        System.out.println("Save a photo");
    }
    
    public void share(){
        shareStrategy.share();
        //System.out.println("Share a photo via email");
    }
    
    public void setShareStrategy(ShareStrategy s){
        this.shareStrategy = s;
    }
}
