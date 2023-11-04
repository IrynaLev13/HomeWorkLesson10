public class User {
    private String login;
    Acсount acсount;

    public User(String login, String password) {
        this.login = login;
        acсount = new Acсount(password);
    }

    class Acсount {
        private String password;

        public Acсount(String password) {
            this.password = password;
        }

        void displayAcсount() {
            System.out.printf("Account Login successful! Login: %s \t Password: %s \n", login, password);


        }
    }
}



