import Hospital.controler.LoginControler;
import Hospital.view.DoctorView;
import Hospital.view.LoginView;

public class Main{
    public static void main(String[] args){
        LoginView login = new LoginView();
        LoginControler controlLogin = new LoginControler(login);
        //DoctorView doctorView = new DoctorView();
    }
}
