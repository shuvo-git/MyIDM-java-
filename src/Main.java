import idm.DownloadManager;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DownloadManager manager = new DownloadManager();
                manager.setVisible(true);
            }
        });
    }

}
