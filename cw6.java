class cw6 {
    public static void main(String[] args) {

        String s = "swiss";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("None");
    }
}
