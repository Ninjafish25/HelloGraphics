import javax.swing.*;

/**
 * A Java graphics program.
 * Tristan Fish
 */

public class HelloGraphicsMain {

    public static void main(String[] args) {
        //
        JFrame TristanFish = new JFrame("Tristan Fish");
        TristanFish.setSize(800,600);


        HelloGraphicsComponent tComp = new HelloGraphicsComponent();
        TristanFish.add(tComp);

        TristanFish.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TristanFish.setVisible(true);

    } // end main

} // end class HelloGraphics
