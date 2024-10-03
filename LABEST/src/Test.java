class Test {
    public static void main(String[] args) {
        int ocu = 0;
        while (true) {
            if (0 == ocu++) {
                System.out.println("0");
                continue;
            }
            ocu = 1;
        }
    }
}
