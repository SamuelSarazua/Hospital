package Hospital.controler;

import Hospital.view.LoginView;

public class LoginControler {

    private LoginView loginView;

    public LoginControler(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> controlDeLogin());
    }

    public void controlDeLogin() {
        System.out.println("Hola Login");
    }
}
