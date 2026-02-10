class cw9 {
    public static void main(String[] args) {

        String email = "test@gmail.com";

        if (email.contains(" ")) {
            System.out.println("Invalid");
            return;
        }

        int atFirst = email.indexOf('@');
        int atLast = email.lastIndexOf('@');

        if (atFirst == -1 || atFirst != atLast) {
            System.out.println("Invalid");
            return;
        }

        if (atFirst == 0) {
            System.out.println("Invalid");
            return;
        }

        int dotPos = email.indexOf('.', atFirst);

        if (dotPos == -1) {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Valid");
    }
}
