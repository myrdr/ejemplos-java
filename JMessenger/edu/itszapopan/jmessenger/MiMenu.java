package edu.itszapopan.jmessenger;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;


public class MiMenu {
		//implements ActionListener, ItemListener {
		
    private JMenuBar  menuBar;
    private JMenu     menu;
    private JMenuItem menuItem;

    private MisAcciones al;

    public MiMenu(MisAcciones acciones) {
      al = acciones;
    }

    public JMenuBar createMenuBar() {
      //Create the menu bar.
      menuBar = new JMenuBar();

      //Build the first menu.
      menu = new JMenu("Archivo");
      menu.setMnemonic(KeyEvent.VK_A);

      menuBar.add(menu);

      /** Opción Salir **/
      menuItem = new JMenuItem("Nuevo Contacto", KeyEvent.VK_N);
      menuItem.setAccelerator( 
		      KeyStroke.getKeyStroke( 
			      KeyEvent.VK_N, ActionEvent.CTRL_MASK ) );
      menuItem.addActionListener(al);
      menu.add(menuItem);

      menu.addSeparator();

      /** Opción Salir **/
      menuItem = new JMenuItem("Sarlir", KeyEvent.VK_S);
      menuItem.setAccelerator( 
		      KeyStroke.getKeyStroke( 
			      KeyEvent.VK_X, ActionEvent.CTRL_MASK ) );
      menuItem.addActionListener(al);
      menu.add(menuItem);

      return menuBar;
    }

    /****
    public JMenuBar createMenuBarOld() {
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;


        //Build the first menu.
        menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item",
                                 KeyEvent.VK_T);
        //menuItem.setMnemonic(KeyEvent.VK_T); //used constructor instead
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        //menuItem.addActionListener(this);
        menu.add(menuItem);

        //ImageIcon icon = createImageIcon("/img/middle.gif");
        menuItem = new JMenuItem("Both text and icon", icon);
        menuItem.setMnemonic(KeyEvent.VK_B);
        //menuItem.addActionListener(this);
        menu.add(menuItem);

        menuItem = new JMenuItem(icon);
        menuItem.setMnemonic(KeyEvent.VK_D);
        //menuItem.addActionListener(this);
        menu.add(menuItem);

        //a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();

        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        //rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        //rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);

        //a group of check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        //cbMenuItem.addItemListener(this);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        //cbMenuItem.addItemListener(this);
        menu.add(cbMenuItem);

        //a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        //menuItem.addActionListener(this);
        submenu.add(menuItem);

        menuItem = new JMenuItem("Another item");
        //menuItem.addActionListener(this);
        submenu.add(menuItem);
        menu.add(submenu);

        //Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);

        return menuBar;
    }
***/


}

