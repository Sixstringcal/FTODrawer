public class Main {

    public static String[] colors = new String[]{
            "white", "purple", "red", "green", "pink", "blue", "orange", "black"
    };

    public static void main(String[] args) {
        FTO fto = new FTO();
        fto.doMoves("R' L R L'");
        int[] state = fto.getState();
        System.out.println(getSVG(state));



    }

    public static String getSVG(int[] state) {
        String returnedString = "<svg id=\"Layer_1\" data-name=\"Layer 1\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 98 98\"><defs>\n" +
                "  </defs>\n" +
                "  <polygon\n" +
                "    id=\"0\"\n" +
                "    points=\"50 10 40 27.3205 60 27.3205\"\n" +
                "    style=\"fill:" + colors[state[0]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "  <polygon\n" +
                "    id=\"1\"\n" +
                "    points=\"40 27.3205 30 44.641 50 44.641\"\n" +
                "    style=\"fill:" + colors[state[5]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "  <polygon\n" +
                "    id=\"2\"\n" +
                "    points=\"40 27.3205 50 44.641 60 27.3205\"\n" +
                "    style=\"fill:" + colors[state[1]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "  <polygon\n" +
                "    id=\"3\"\n" +
                "    points=\"50 44.641 60 27.3205 70 44.641\"\n" +
                "    style=\"fill:" + colors[state[2]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "  <polygon\n" +
                "    id=\"4\"\n" +
                "    points=\"30 44.641 20 61.9615 40 61.9615\"\n" +
                "    style=\"fill:" + colors[state[8]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "  <polygon\n" +
                "    id=\"5\"\n" +
                "    points=\"30 44.641 40 61.9615 50 44.461\"\n" +
                "    style=\"fill:" + colors[state[6]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "  <polygon\n" +
                "    id=\"6\"\n" +
                "    points=\"40 61.9615 50 44.461 60 61.9615\"\n" +
                "    style=\"fill:" + colors[state[7]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "  <polygon\n" +
                "    id=\"7\"\n" +
                "    points=\"50 44.461 60 61.9615 70 44.461\"\n" +
                "    style=\"fill:" + colors[state[3]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "  <polygon\n" +
                "    id=\"8\"\n" +
                "    points=\"60 61.9615 70 44.461 80 61.9615\"\n" +
                "    style=\"fill:" + colors[state[4]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "</svg>";
        return returnedString;
    }
}
