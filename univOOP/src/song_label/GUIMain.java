package song_label;

import javax.swing.JFrame;

public class GUIMain {
    public static void startGUI() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
    	JFrame mainFrame = new JFrame("TableSelectionDemo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        SongListPanel newContentPane = new SongListPanel();
        newContentPane.addComponentsToPane();
        mainFrame.getContentPane().add(newContentPane);

        //Display the window.
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}
