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

                /**
                 * R-based moves and rotations
                 */
                case "R":
                    doR(1);
                    break;
                case "R'":
                    doR(2);
                    break;
                case :
                    "BLs'":
                case "Rs":
                    doRs(1);
                    break;
                case "BLs":
                case "Rs'":
                    doRs(2);
                case "Rw":
                    doR(1);
                    doRs(1);
                    break;
                case "Rw'":
                    doR(2);
                    doRs(2);
                    break;
                case "Ro":
                    //TODO: Ro rotation
                    break;
                case "Ro'":
                    //TODO: Ro' rotation
                    break;

                /**
                 * U-based moves and rotations
                 */
                case "U":
                    //TODO: U move
                    break;
                case "U'":
                    //TODO: U' move
                    break;
                case "Ds'":
                case "E'":
                case "Us":
                    //TODO: Us move
                    break;
                case "Ds":
                case "E":
                case "Us'":
                    //TODO: Us' move
                    break;
                case "Uw":
                    //TODO: Uw move
                    break;
                case "Uw'":
                    //TODO: Uw' move
                    break;
                case "Uo":
                    //TODO: Uo rotation
                    break;
                case "Uo'":
                    //TODO: Uo' rotation
                    break;

                /**
                 * L-based moves and rotations
                 */
                case "L":
                    //Do L move
                    break;
                case "L'":
                    //Do L' move
                    break;
                case "BRs'":
                case "Ls":
                    //Do Ls move
                    break;
                case "BRs":
                case "Ls'":
                    //Do Ls' move
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

                /**
                 * F-based moves and rotations
                 */
                case "F":
                    //Do F move
                    break;
                case "F'":
                    //Do F' move
                    break;
                case "Bs'":
                case "S":
                case "Fs":
                    //Do Fs move
                    break;
                case "Bs":
                case "S'":
                case "Fs'":
                    //Do Fs' move
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

                /**
                 * D-based moves and rotations
                 */
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

                /**
                 * B-based moves and rotations
                 */
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

                /**
                 * BR-based moves and rotations
                 */
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

                /**
                 * BL-based moves and rotations
                 */
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

            //Top Corners
            temp = state[4];
            state[4] = state[18];
            state[18] = state[40];
            state[40] = temp;

            //Back Corners
            temp = state[45];
            state[45] = state[13];
            state[13] = state[67];
            state[67] = temp;

            //Right Corners
            temp = state[31];
            state[31] = state[27];
            state[27] = state[35];
            state[35] = temp;

            //Bottom Corners
            temp = state[36];
            state[36] = state[8];
            state[8] = state[26];
            state[26] = temp;

            //U Edges
            temp = state[7];
            state[7] = state[21];
            state[21] = state[37];
            state[37] = temp;

            //R Edges
            tmep = state[29];
            state[29] = state[32];
            state[32] = state[34];
            state[34] = temp;

            //Back Triangles
            temp = state[3];
            state[3] = state[20];
            state[20] = state[41];
            state[41] = temp;

            //Front Triangles
            temp = state[6];
            state[6] = state[25];
            state[25] = state[38];
            state[38] = temp;

            //Right Triangles
            temp = state[30];
            state[30] = state[28];
            state[28] = state[33];
            state[33] = temp;
        }
    }

    public void doRs(int times) {
        int temp;
        for (int i = 0; i < times; i++) {
            //UB Edges
            temp = state[2];
            state[2] = state[19];
            state[19] = state[42];
            state[42] = temp;

            //BU Edges
            temp = state[47];
            state[47] = state[16];
            state[16] = state[70];
            state[70] = temp;

            //UL Edges
            temp = state[5];
            state[5] = state[24];
            state[24] = state[39];
            state[39] = temp;

            //LU Edges
            temp = state[11];
            state[11] = state[65];
            state[65] = state[50];
            state[50] = temp;

            //U Triangles
            temp = state[1];
            state[1] = state[23];
            state[23] = state[43];
            state[43] = temp;

            //L Triangles
            temp = state[12];
            state[12] = state[66];
            state[66] = state[46];
            state[46] = temp;
        }
    }

}