public class Main {
    public static void main(String[] args) {
        FTO fto = new FTO();
        fto.doMoves("L");
        String[] state = fto.getState();
        for (int i = 0; i < state.length; i++) {
            System.out.println(state[i]);
        }
    }
}
