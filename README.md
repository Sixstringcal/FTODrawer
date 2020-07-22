# FTODrawer
This is an application to draw the states on an FTO (Face Turning Octahedron).
Currently, this is a command-line Java application that will display the U layer and the relevant information for the Last 3 Triples step as well as a full scramble image.

There are plans to make this a GUI application.

You can edit your color scheme in the Main.java file.  Change the colors in the colors String array to whatever you would like.  The order of the faces are as follows:
U, L, F, R, BR, B, BL, D faces (using standard notation).

You will first be prompted to type "1" or "2" to do a full scramble image or an L3T image.  You will be prompted to then input a scramble.  You are more than welcome to use any valid moves separated by spaces with the exception of T rotations.  T rotations will come eventually.
You will then be prompted for a name for the image file.  It will have a .svg extension.  Please don't include an extension in the name.  If you would like something named "test.svg", type in "test".
