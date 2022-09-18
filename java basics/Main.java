interface studentDetails {
    String name;
    String contact;
    String sports; 
}
interface Exam implements studentDetails{
    public void name(){
        System.out.println("pavan");
    }
    public void contact(){
        System.out.println("Warangal");
    }    
}
class action implements studentDetails, Exam {
    public void sports(){
        System.out.println("cricket");
    }  
} 
class Main{
public static void main(String[] args) {
    Exam myObj = new Exam();
    action myObj1 = new action();
    myObj.name();
    myObj.contact();
    myObj1.sports();
    
}
}
        




