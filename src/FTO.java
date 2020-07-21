public class FTO {

    private int[] state = new int[72];

    public FTO() {

        //Creates a solved FTO.
        for (int i = 0; i < 72; i++) {
            state[i] = i;
        }
    }

    public void doMoves(String scramble) {
        String[] moves = scramble.split(" ");
        for (int i = 0; i < moves.length; i++) {
            switch (moves[i]) {
                case "R":
                    doR(1);
                    break;
                case "R'":
                    doR(2);
                    break;
                case "Rw":
                    //Do Rw move
                    break;
                case "Rw'":
                    //Do Rw' move
                    break;
                case "Ro":
                    //Do Ro rotation
                    break;
                case "Ro'":
                    //Do Ro' rotation
                    break;
                case "U":
                    //Do U move
                    break;
                case "U'":
                    //Do U' move
                    break;
                case "Uw":
                    //Do Uw move
                    break;
                case "Uw'":
                    //Do Uw' move
                    break;
                case "Uo":
                    //Do Uo rotation
                    break;
                case "Uo'":
                    //Do Uo' rotation
                    break;
                case "L":
                    //Do L move
                    break;
                case "L'":
                    //Do L' move
                    break;
                case "Lw":
                    //Do Lw move
                    break;
                case "Lw'":
                    //Do Lw' move
                    break;
                case "Lo":
                    //Do Lo rotation
                    break;
                case "Lo'":
                    //Do Lo' rotation
                    break;
                case "F":
                    //Do F move
                    break;
                case "F'":
                    //Do F' move
                    break;
                case "Fw":
                    //Do Fw move
                    break;
                case "Fw'":
                    //Do Fw' move
                    break;
                case "Fo":
                    //Do Fo rotation
                    break;
                case "Fo'":
                    //Do Fo' rotation
                    break;
                case "D":
                    //Do D move
                    break;
                case "D'":
                    //Do D' move
                    break;
                case "Dw":
                    //Do Dw move
                    break;
                case "Dw'":
                    //Do Dw' move
                    break;
                case "Do":
                    //Do Do rotation
                    break;
                case "Do'":
                    //Do Do' rotation
                    break;
                case "B":
                    //Do B move
                    break;
                case "B'":
                    //Do B' move
                    break;
                case "Bw":
                    //Do Bw move
                    break;
                case "Bw'":
                    //Do Bw' move
                    break;
                case "Bo":
                    //Do Bo rotation
                    break;
                case "Bo'":
                    //Do Bo' rotation
                    break;
                case "BR":
                    //Do BR move
                    break;
                case "BR'":
                    //Do BR' move
                    break;
                case "BRw":
                    //Do BRw move
                    break;
                case "BRw'":
                    //Do BRw' move
                    break;
                case "BRo":
                    //Do BRo rotation
                    break;
                case "BRo'":
                    //Do BRo' rotation
                    break;
                case "BL":
                    //Do BL move
                    break;
                case "BL'":
                    //Do BL' move
                    break;
                case "BLw":
                    //Do BLw move
                    break;
                case "BLw'":
                    //Do BLw' move
                    break;
                case "BLo":
                    //Do BLo rotation
                    break;
                case "BLo'":
                    //Do BLo' rotation
                    break;
                default:
                    throw new IllegalArgumentException("The move " + moves[i] + " is not supported.");
            }
        }
    }

    public void doR(int times) {
        int temp;
        for (int i = 0; i < times; i++) {

            //Top Corner
            temp = state[4];
            state[4] = state[18];
            state[18] = state[40];
            state[40] = temp;

            //Back Corner
            temp = state[45];
            state[45] = state[13];
            state[13] = state[67];
            state[67] = temp;

            //Right Corner
            temp = state[31];
            state[31] = state[27];
            state[27] = state[35];
            state[35] = temp;

            //Bottom Corner
            temp = state[36];
            state[36] = state[8];
            state[8] = state[26];
            state[26] = temp;
        }
    }

}
