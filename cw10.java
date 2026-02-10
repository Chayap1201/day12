class cw10 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 50000; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("StringBuilder Time: " + (end - start) + " ms");
    }
}
