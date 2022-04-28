package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    JFrame frame;
    JMenuBar menuBar;

    // panel
    JPanel panelHome00;
    JPanel panelEinfugen01;
    JPanel panelLoeschne02;
    JPanel panelAnzeigen03;
    JPanel panelAenderung04;
    JPanel panelPerssitenz05;

    //label
    JLabel label00;
    JLabel label01;
    JLabel label02;
    JLabel label03;
    JLabel label04;
    JLabel label05;

    // menu
    JMenu home00 = new JMenu("Home");
    JMenuItem jMenuItemHome00 = new JMenuItem();
    JMenuItem jMenuItemEinfugen01 = new JMenu("Einfugen");
    JMenuItem jMenuItemAnzeigen02 = new JMenu("Anzeigen");
    JMenuItem jMenuItemLoeschen03 = new JMenu("Loeschen");
    JMenuItem jMenuItemAenderen04 = new JMenu("Aenderen");
    JMenuItem jMenuItemPersistenz05 = new JMenu("Persistenz");



    public GUI() {


        //  einfugen.addActionListener((ActionListener) panel01);

        init();




    }




    private void init() {


        frame = new JFrame();
        menuBar = new JMenuBar();

        frame.setJMenuBar(menuBar);
        // panel
        panelHome00 = new JPanel();
        panelEinfugen01 = new JPanel();
        panelLoeschne02 = new JPanel();
        panelAnzeigen03 = new JPanel();
        panelAenderung04 = new JPanel();
        panelPerssitenz05 = new JPanel();

        //label
        label00 = new JLabel();
        label01 = new JLabel();
        label02 = new JLabel();
        label03 = new JLabel();
        label04 = new JLabel();
        label05 = new JLabel();

        // menu
        home00 = new JMenu("Home");
        jMenuItemHome00 = new JMenu();
        jMenuItemEinfugen01 = new JMenu();
        jMenuItemAnzeigen02 = new JMenu();
        jMenuItemLoeschen03 = new JMenu();
        jMenuItemAenderen04 = new JMenu();
        jMenuItemPersistenz05 = new JMenu();





        //panel
        panelHome00.setName("panelHome00");
        panelHome00.setBackground(Color.LIGHT_GRAY);
        panelHome00.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panelHome00.setLayout(new GridLayout(0, 1));


        panelEinfugen01.setName("panelEinfugen01");
        panelEinfugen01.setBackground(Color.CYAN);
        panelEinfugen01.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panelEinfugen01.setLayout(new GridLayout(0, 1));


        panelLoeschne02.setName("panelLoeschne02");
        panelLoeschne02.setBackground(Color.DARK_GRAY);
        panelLoeschne02.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panelLoeschne02.setLayout(new GridLayout(0, 1));

        panelAnzeigen03.setName("panelAnzeigen03");
        panelAnzeigen03.setBackground(Color.BLUE);
        panelAnzeigen03.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panelAnzeigen03.setLayout(new GridLayout(0, 1));

        panelAenderung04.setName("panelAenderung04");
        panelAenderung04.setBackground(Color.YELLOW);
        panelAenderung04.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panelAenderung04.setLayout(new GridLayout(0, 1));

        panelPerssitenz05.setName("panelPerssitenz05");
        panelPerssitenz05.setBackground(Color.GREEN);
        panelPerssitenz05.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panelPerssitenz05.setLayout(new GridLayout(0, 1));



        panelHome00.setName("panelHome00"); // NOI18N
        //label  home
        label00.setText("This is a Home");
        label00.setName("label00"); // NOI18N

        GroupLayout groupLayout00 = new GroupLayout(panelHome00);
        panelHome00.setLayout(groupLayout00);
        groupLayout00.setHorizontalGroup(groupLayout00.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout00.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label00)
                        .addContainerGap(199, Short.MAX_VALUE))
        );

        groupLayout00.setVerticalGroup(
                groupLayout00.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout00.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(label00)
                                .addContainerGap(164, Short.MAX_VALUE))
        );

        // label einfugen

        panelEinfugen01.setName("panelEinfugen01");// NOI18N
        label01.setText("this is einfugen ");
        label01.setName("label01");// NOI18N
        GroupLayout groupLayout01 = new GroupLayout(panelEinfugen01);
        panelEinfugen01.setLayout(groupLayout01);
        groupLayout01.setHorizontalGroup(groupLayout01.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout01.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label01)
                        .addContainerGap(199, Short.MAX_VALUE))
        );

        groupLayout01.setVerticalGroup(
                groupLayout01.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout01.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(label01)
                                .addContainerGap(164, Short.MAX_VALUE))
        );


        panelLoeschne02.setName("panelLoeschne02");
        label02.setText("this is Loeschen");
        label02.setName("label02");
        GroupLayout groupLayout02 = new GroupLayout(panelLoeschne02);
        panelLoeschne02.setLayout(groupLayout02);

        groupLayout02.setHorizontalGroup(groupLayout02.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout02.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label02)
                        .addContainerGap(199, Short.MAX_VALUE))
        );

        groupLayout02.setVerticalGroup(
                groupLayout02.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout02.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(label02)
                                .addContainerGap(164, Short.MAX_VALUE))
        );


        panelAnzeigen03.setName("panelAnzeigen03");
        label03.setText("this is Anzeigen");
        label03.setName("label03");
        GroupLayout groupLayout03 = new GroupLayout(panelAnzeigen03);
        panelAnzeigen03.setLayout(groupLayout03);
        groupLayout03.setHorizontalGroup(groupLayout03.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout03.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label03)
                        .addContainerGap(199, Short.MAX_VALUE))
        );

        groupLayout03.setVerticalGroup(
                groupLayout03.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout03.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(label03)
                                .addContainerGap(164, Short.MAX_VALUE))
        );

        panelAenderung04.setName("panelAenderung04");
        label04.setText("this is the Aenderung");
        label04.setName("label04");
        GroupLayout groupLayout04 = new GroupLayout(panelAenderung04);
        panelAenderung04.setLayout(groupLayout04);

        groupLayout04.setHorizontalGroup(groupLayout04.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout04.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label04)
                        .addContainerGap(199, Short.MAX_VALUE))
        );

        groupLayout04.setVerticalGroup(
                groupLayout04.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout04.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(label04)
                                .addContainerGap(164, Short.MAX_VALUE))
        );

        panelPerssitenz05.setName("panelPerssitenz05");
        label05.setText("this is the Persistenz");
        label05.setName("label05");
        GroupLayout groupLayout05 = new GroupLayout(panelPerssitenz05);
        panelPerssitenz05.setLayout(groupLayout05);
        groupLayout05.setHorizontalGroup(groupLayout05.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout05.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(label05)
                        .addContainerGap(199, Short.MAX_VALUE))
        );

        groupLayout05.setVerticalGroup(
                groupLayout05.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout05.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(label05)
                                .addContainerGap(164, Short.MAX_VALUE))
        );







        menuBar.setName("MenuBar");
        home00.setName("Option");

        jMenuItemHome00.setText("Home");
        jMenuItemHome00.setName("JjMenuItemHome00");


        jMenuItemHome00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setjMenuItemHome00(e);
            }
        });
        home00.add(jMenuItemHome00);


        jMenuItemEinfugen01.setText("Einfugen");
        jMenuItemEinfugen01.setName("jMenuItemEinfugen01");

        jMenuItemEinfugen01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event01) {

                setjMenuItemEinfugen01(event01);
            }

        });

        home00.add(jMenuItemEinfugen01);

        jMenuItemAnzeigen02.setText("Anzeigen");
        jMenuItemAnzeigen02.setName("jMenuItemAnzeigen02");
        jMenuItemAnzeigen02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setjMenuItemAnzeigen02(e);
            }
        });
        home00.add(jMenuItemAnzeigen02);

        jMenuItemLoeschen03.setText("Loeschen");
        jMenuItemLoeschen03.setName("jMenuItemLoeschen03");
        jMenuItemLoeschen03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setjMenuItemLoeschen03(e);
            }
        });
        home00.add(jMenuItemLoeschen03);

        jMenuItemAenderen04.setText("Aenderen");
        jMenuItemAenderen04.setName("JMIAenderung");
        jMenuItemAenderen04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setjMenuItemAenderen04(e);
            }
        });

        home00.add(jMenuItemAenderen04);

        jMenuItemPersistenz05.setText("Persistenz");
        jMenuItemPersistenz05.setName("jMenuItemPersistenz05");
        jMenuItemPersistenz05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setjMenuItemPersistenz05(e);
            }
        });

        home00.add(jMenuItemPersistenz05);

        menuBar.add(home00);
       // setJMenuBar(menuBar);

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelHome00, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelEinfugen01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelLoeschne02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelAnzeigen03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelAenderung04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelPerssitenz05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelHome00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelEinfugen01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelLoeschne02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelAnzeigen03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelAenderung04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(panelPerssitenz05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frame.pack();

        //frame
        // frame.add(panel00,BorderLayout.CENTER);
        // frame.add(panel01,BorderLayout.CENTER);



        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Media Play");
        frame.setVisible(true);


    }




    private void setjMenuItemEinfugen01(ActionEvent envent01) {
        panelHome00.setVisible(false);
        panelEinfugen01.setVisible(true);
        panelLoeschne02.setVisible(false);
        panelAnzeigen03.setVisible(false);
        panelAenderung04.setVisible(false);
        panelPerssitenz05.setVisible(false);
    }

    private void setjMenuItemAnzeigen02(ActionEvent envent02) {
        panelHome00.setVisible(false);
        panelEinfugen01.setVisible(false);
        panelLoeschne02.setVisible(true);
        panelAnzeigen03.setVisible(false);
        panelAenderung04.setVisible(false);
        panelPerssitenz05.setVisible(false);
    }

    private void setjMenuItemLoeschen03(ActionEvent envent03) {
        panelHome00.setVisible(false);
        panelEinfugen01.setVisible(false);
        panelLoeschne02.setVisible(false);
        panelAnzeigen03.setVisible(true);
        panelAenderung04.setVisible(false);
        panelPerssitenz05.setVisible(false);
    }

    private void setjMenuItemAenderen04(ActionEvent envent04) {
        panelHome00.setVisible(false);
        panelEinfugen01.setVisible(false);
        panelLoeschne02.setVisible(false);
        panelAnzeigen03.setVisible(false);
        panelAenderung04.setVisible(true);
        panelPerssitenz05.setVisible(false);
    }

    private void setjMenuItemPersistenz05(ActionEvent envent05) {
        panelHome00.setVisible(false);
        panelEinfugen01.setVisible(false);
        panelLoeschne02.setVisible(false);
        panelAnzeigen03.setVisible(false);
        panelAenderung04.setVisible(false);
        panelPerssitenz05.setVisible(true);
    }

    private void setjMenuItemHome00(ActionEvent envent00) {
        panelHome00.setVisible(true);
        panelEinfugen01.setVisible(false);
        panelLoeschne02.setVisible(false);
        panelAnzeigen03.setVisible(false);
        panelAenderung04.setVisible(false);
        panelPerssitenz05.setVisible(false);
    }





    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }




        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI();
            }
        });

    }



}




