package Creational.Singleton;

public class User {

    /**
     * Violation of SRP

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void saveUser(){

        // Code to save user to database
        System.out.println("User saved to database.");
    }

    public void sendEmail(String message) {

        // Code to send email
        System.out.println("Email sent to " + email + "with message: " + message);
    }

    //getter and setter

     */


    private String name;
    private String email;

    public User (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class UserRepository {
    public void saveUser(User user) {
        //code to save user to database
        System.out.println("User " + user.getName() + " saved to database.");
    }
}

class EmailService {

    public void sendEmail(User user, String message) {

        System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
    }
}
class Main {
    public static void main(String[] args) {

        User user = new User ("Juan Carlos Cortez", "juank@gmail.com");

        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(user);

        EmailService emailService = new EmailService();
        emailService.sendEmail(user, "Welcome to our platform");
    }
}


