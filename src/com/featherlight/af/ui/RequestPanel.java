package com.featherlight.af.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTree;

public class RequestPanel extends JPanel {

  private final JButton addButton;
  private final JButton deleteButton;
  private final JList<String> requestList;
  private final Box buttonBox;
  private final BorderLayout layout;

  public RequestPanel() {
//    this.requestList = new JList<>(new String[]{"GET Dummy", "POST Lorem ipsum"});

    this.requestList = new JList<>();
    this.addButton = new JButton("Add");
    this.deleteButton = new JButton("Delete");
    this.buttonBox = Box.createHorizontalBox();
    this.layout = new BorderLayout();
  }

  public void init() {
    this.addButton.addActionListener(this::showAddModal);
    this.deleteButton.addActionListener(this::deleteSelected);

    // TODO: Remove buttons
    buttonBox.add(addButton);
    buttonBox.add(deleteButton);

    setLayout(layout);

    add(requestList, BorderLayout.CENTER);
//    add(buttonBox, BorderLayout.SOUTH);
  }

  private void showAddModal(ActionEvent actionEvent) {

  }

  private void deleteSelected(ActionEvent actionEvent) {

  }

}
