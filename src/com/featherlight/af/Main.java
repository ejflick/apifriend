package com.featherlight.af;

import com.featherlight.af.ui.ApiFriendMenuBar;
import com.featherlight.af.ui.RequestPanel;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

  public static void main(String[] args) {
    try {
      // Set System L&F
      UIManager.setLookAndFeel(
          UIManager.getSystemLookAndFeelClassName());
    }
    catch (UnsupportedLookAndFeelException e) {
      // handle exception
    }
    catch (ClassNotFoundException e) {
      // handle exception
    }
    catch (InstantiationException e) {
      // handle exception
    }
    catch (IllegalAccessException e) {
      // handle exception
    }
    final var frame = new JFrame("ApiFriend");

    final var requestPanel = new RequestPanel();
    final var menuBar = new ApiFriendMenuBar();
    final var layout = new BorderLayout();

    frame.setJMenuBar(menuBar);
    frame.setLayout(layout);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1024, 768);

    frame.add(requestPanel, BorderLayout.WEST);

    frame.setVisible(true);
    frame.setLocationRelativeTo(null);

    requestPanel.init();
    menuBar.init();
  }

}
