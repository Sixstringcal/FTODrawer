# FTODrawer
This is an application to draw the states on an FTO (Face Turning Octahedron).
Currently, this is a Simple GUI Java application that will display the U layer and the relevant information for the Last 3 Triples step as well as a full scramble image.

This uses the notation that is used by CSTimer, QQTimer, and described in [Ben Streeter's YouTube Video](https://www.youtube.com/watch?v=2DbLKqfds0c).

You can run the program through FTODrawer.jar.

You can edit your color scheme in the colors.txt file.  Change the colors in the colors String array to whatever you would like.  The order of the faces are as follows:
U, L, F, R, BR, B, BL, D faces (using the previously specified notation).

You can select either full scramble images or L3T images with the radio buttons on the top.  The default is a full scramble image.
Type your scramble into the text box labeled "Scramble".

Type the file without the extension in the text box labeled "Save File as:".

Click the "Save Image" button to save the image.

This image will be saved in the root of the FTODrawer folder as an SVG.

The FTODrawer .jar file is present in the Dependencies folder along with the other dependencies necessary to run the project.  The .jar will not render the images in live-time, so if you want to run with live images (and png output support), please run this in your IDE of choice and list the dependencies in the Dependencies folder (ignoring FTODrawer.jar).