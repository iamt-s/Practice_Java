package ab;

import java.awt.*;
import java.util.Random;

public class MouseMover {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();  // Create a Robot instance
            Random random = new Random();  // Random generator for mouse positions

            // Get the screen dimensions
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;
            
               // Loop to move the mouse at intervals
            while (true) {
                // Generate random coordinates within the screen bounds
                int x = random.nextInt(screenWidth);   // Random X-coordinate
                int y = random.nextInt(screenHeight);  // Random Y-coordinate

                // Move the mouse to the random coordinates
                robot.mouseMove(x, y);

                // Print the current mouse position (optional)
                System.out.println("Moved to: (" + x + ", " + y + ")");

                // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(90000);
            }

        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
