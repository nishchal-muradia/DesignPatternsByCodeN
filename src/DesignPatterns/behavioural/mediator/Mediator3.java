package DesignPatterns.behavioural.mediator;

/*
Mediator3.java

Mediator can coordinate UI components.

LoginButton3 does not directly inspect TextBox3.
LoginDialog3 coordinates everything.
*/
public class Mediator3 {
    public static void main(String[] args) {
        LoginDialog3 dialog = new LoginDialog3();
        dialog.enterUsername("admin");
        dialog.enterPassword("secret");
        dialog.clickLogin();
    }
}

class LoginDialog3 {
    private final TextBox3 username = new TextBox3();
    private final TextBox3 password = new TextBox3();
    private final LoginButton3 loginButton = new LoginButton3(this);

    public void enterUsername(String value) {
        username.setValue(value);
    }

    public void enterPassword(String value) {
        password.setValue(value);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void loginRequested() {
        if (!username.getValue().isEmpty() && !password.getValue().isEmpty()) {
            System.out.println("Login allowed");
        } else {
            System.out.println("Login blocked");
        }
    }
}

class TextBox3 {
    private String value = "";

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class LoginButton3 {
    private final LoginDialog3 dialog;

    public LoginButton3(LoginDialog3 dialog) {
        this.dialog = dialog;
    }

    public void click() {
        dialog.loginRequested();
    }
}
