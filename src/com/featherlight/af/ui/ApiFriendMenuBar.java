package com.featherlight.af.ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class ApiFriendMenuBar extends JMenuBar {

  private final JMenu fileMenu;

  public ApiFriendMenuBar() {
    this.fileMenu = new JMenu("File");
  }

  public void init() {
    this.add(fileMenu);
  }

}
