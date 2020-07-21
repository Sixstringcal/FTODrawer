import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String[] colors = new String[]{
            "white", "purple", "red", "green", "pink", "blue", "orange", "black"
    };

    public static void main(String[] args) {
        FTO fto = new FTO();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a scramble");
        String input = scanner.nextLine();
        fto.doMoves(input);
        System.out.println("Please enter a filename (ignore extension)");
        int[] state = fto.getState();

        try {
            FileWriter myWriter = new FileWriter(scanner.nextLine() + ".svg");
            myWriter.write(getSVG(fto.getState()));
            myWriter.close();
            System.out.println("Success!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    public static String getSVG(int[] state) {
        String returnedString = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<svg version=\"1.1\" id=\"Layer_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\"\n" +
                "\t viewBox=\"0 0 98 98\" style=\"enable-background:new 0 0 98 98;\" xml:space=\"preserve\">\n" +
                "<style type=\"text/css\">\n" +
                "\t.st0{fill:#FFFFFF;stroke:#808080;stroke-width:5;}\n" +
                "\t.st1{fill:#FFFFFF;stroke:#808080;stroke-width:0.1;}\n" +
                "\t.st2{fill:#FFFFFF;stroke:#808080;}\n" +
                "</style>\n" +
                "<polygon class=\"st0\" points=\"19.4,26.1 79.4,26.1 49.4,78\"/>\n" +
                "<polygon id=\"0\" points=\"19.4,26.1 39.4,26.1 29.4,43.4\"\n" +
                "\tstyle=\"fill:" + colors[state[0]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"1\" points=\"39.4,26.1 29.4,43.4 49.4,43.4\"\n" +
                "\tstyle=\"fill:" + colors[state[1]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"2\" points=\"39.4,26.1 49.4,43.4 59.4,26.1\"\n" +
                "\tstyle=\"fill:" + colors[state[2]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"3\" points=\"49.4,43.4 59.4,26.1 69.4,43.4\"\n" +
                "\tstyle=\"fill:" + colors[state[3]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"4\" points=\"59.4,26.1 69.4,43.4 79.4,26.1\"\n" +
                "\tstyle=\"fill:" + colors[state[4]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"5\" points=\"29.4,43.4 39.4,60.7 49.4,43.4\"\n" +
                "\tstyle=\"fill:" + colors[state[5]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"6\" points=\"39.4,60.7 49.4,43.4 59.4,60.7\"\n" +
                "\tstyle=\"fill:" + colors[state[6]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"7\" points=\"49.4,43.4 59.4,60.7 69.4,43.4\"\n" +
                "\tstyle=\"fill:" + colors[state[7]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "<polygon id=\"8\" points=\"39.4,60.7 49.4,78 59.4,60.7\"\n" +
                "\tstyle=\"fill:" + colors[state[8]] + ";stroke:gray;stroke-width:.1\"/>\n" +
                "\n" +
                "<polygon id=\"9\" points=\"20.7,48.4 16.4,50.9 6.4,33.6 10.7,31.1\"\n" +
                "\tstyle=\"fill:" + colors[state[9]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"11\" points=\"30.7,65.7 26.4,68.2 16.4,50.9 20.7,48.4\"\n" +
                "\tstyle=\"fill:" + colors[state[11]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"13\" points=\"40.7,83 36.4,85.5 26.4,68.2 30.7,65.7\"\n" +
                "\tstyle=\"fill:" + colors[state[13]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "\n" +
                "\n" +
                "<polygon points=\"49.4 85 46.9 89.3301 49.4 93.6602 51.9 89.3301\"\n" +
                "\tstyle=\"fill:white;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"18\" points=\"49.4 85 46.9 89.3301 51.9 89.3301\"\n" +
                "\tstyle=\"fill:" + colors[state[18]] + ";stroke:gray;stroke-width:.5\"/>\n" +
                "<polygon id=\"20\" points=\"46.9 89.3301 51.9 89.3301 49.4 93.6602\"\n" +
                "\tstyle=\"fill:" + colors[state[20]] + ";stroke:gray;stroke-width:.5\"/>\n" +
                "\n" +
                "<polygon id=\"27\" points=\"67.8,65.6 72.2,68.1 62.2,85.4 57.8,82.9\"\n" +
                "\tstyle=\"fill:" + colors[state[27]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"29\" points=\"77.8,48.3 82.2,50.8 72.2,68.1 67.8,65.6\"\n" +
                "\tstyle=\"fill:" + colors[state[29]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"31\" points=\"87.8,31 92.2,33.5 82.2,50.8 77.8,48.3\"\n" +
                "\tstyle=\"fill:" + colors[state[31]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "\n" +
                "<polygon points=\"85.4 22.6478 90.4 22.6478 92.9 18.3177 87.9 18.3177\"\n" +
                "\tstyle=\"fill:white;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"36\" points=\"85.4 22.6478 90.4 22.6478 87.9 18.3177\"\n" +
                "\tstyle=\"fill:" + colors[state[36]] + ";stroke:gray;stroke-width:.5\"/>\n" +
                "<polygon id=\"38\" points=\"90.4 22.6478 87.9 18.3177 92.9 18.3177\"\n" +
                "\tstyle=\"fill:" + colors[state[38]] + ";stroke:gray;stroke-width:.5\"/>\n" +
                "\n" +
                "<polygon id=\"45\" points=\"59.4,16.1 59.4,11.1 79.4,11.1 79.4,16.1\"\n" +
                "\tstyle=\"fill:" + colors[state[45]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"47\" points=\"39.4,16.1 39.4,11.1 59.4,11.1 59.4,16.1\"\n" +
                "\tstyle=\"fill:" + colors[state[47]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"49\" points=\"19.4,16.1 19.4,11.1 39.4,11.1 39.4,16.1\"\n" +
                "\tstyle=\"fill:" + colors[state[49]] + ";stroke:gray;stroke-width:1\"/>\n" +
                "\n" +
                "<polygon points=\"13.4 22.6478 10.9 18.3177 5.9 18.3177 8.4 22.6478\"\n" +
                "\tstyle=\"fill:white;stroke:gray;stroke-width:1\"/>\n" +
                "<polygon id=\"54\" points=\"13.4 22.6478 10.9 18.3177 8.4 22.6478\"\n" +
                "\tstyle=\"fill:" + colors[state[54]] + ";stroke:gray;stroke-width:.5\"/>\n" +
                "<polygon id=\"56\" points=\"10.9 18.3177 8.4 22.6478 5.9 18.3177\"\n" +
                "\tstyle=\"fill:" + colors[state[56]] + ";stroke:gray;stroke-width:.5\"/>\n" +
                "\n" +
                "</svg>\n";
        return returnedString;
    }
}
