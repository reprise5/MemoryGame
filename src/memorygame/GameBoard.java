package memorygame;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author reprise
 */
public class GameBoard extends javax.swing.JFrame {

    /**
     * Creates new form GameBoard
     */
    public GameBoard() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tile11 = new javax.swing.JButton();
        Tile14 = new javax.swing.JButton();
        Tile12 = new javax.swing.JButton();
        Tile13 = new javax.swing.JButton();
        Tile22 = new javax.swing.JButton();
        Tile23 = new javax.swing.JButton();
        Tile21 = new javax.swing.JButton();
        Tile24 = new javax.swing.JButton();
        Tile31 = new javax.swing.JButton();
        Tile32 = new javax.swing.JButton();
        Tile41 = new javax.swing.JButton();
        Tile42 = new javax.swing.JButton();
        Tile43 = new javax.swing.JButton();
        Tile44 = new javax.swing.JButton();
        Tile33 = new javax.swing.JButton();
        Tile34 = new javax.swing.JButton();
        ScoreScreen = new javax.swing.JTextField();
        ScoreScreenLabel = new javax.swing.JLabel();
        startGameButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        DebugCheck = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        QuitMenuItem = new javax.swing.JMenuItem();
        GameMenu = new javax.swing.JMenu();
        resetBoardMenuItem = new javax.swing.JMenuItem();
        save4x4Score = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4x4 Memory Game");
        setResizable(false);

        Tile11.setEnabled(false);
        Tile11.setFocusable(false);
        Tile11.setMaximumSize(new java.awt.Dimension(32, 10));
        Tile11.setMinimumSize(new java.awt.Dimension(32, 10));
        Tile11.setPreferredSize(new java.awt.Dimension(30, 10));
        Tile11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile11ActionPerformed(evt);
            }
        });

        Tile14.setEnabled(false);
        Tile14.setFocusable(false);
        Tile14.setName(""); // NOI18N
        Tile14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile14ActionPerformed(evt);
            }
        });

        Tile12.setEnabled(false);
        Tile12.setFocusable(false);
        Tile12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile12ActionPerformed(evt);
            }
        });

        Tile13.setEnabled(false);
        Tile13.setFocusable(false);
        Tile13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile13ActionPerformed(evt);
            }
        });

        Tile22.setEnabled(false);
        Tile22.setFocusable(false);
        Tile22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile22ActionPerformed(evt);
            }
        });

        Tile23.setEnabled(false);
        Tile23.setFocusable(false);
        Tile23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile23ActionPerformed(evt);
            }
        });

        Tile21.setEnabled(false);
        Tile21.setFocusable(false);
        Tile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile21ActionPerformed(evt);
            }
        });

        Tile24.setEnabled(false);
        Tile24.setFocusable(false);
        Tile24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile24ActionPerformed(evt);
            }
        });

        Tile31.setEnabled(false);
        Tile31.setFocusable(false);
        Tile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile31ActionPerformed(evt);
            }
        });

        Tile32.setEnabled(false);
        Tile32.setFocusable(false);
        Tile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile32ActionPerformed(evt);
            }
        });

        Tile41.setEnabled(false);
        Tile41.setFocusable(false);
        Tile41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile41ActionPerformed(evt);
            }
        });

        Tile42.setEnabled(false);
        Tile42.setFocusable(false);
        Tile42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile42ActionPerformed(evt);
            }
        });

        Tile43.setEnabled(false);
        Tile43.setFocusable(false);
        Tile43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile43ActionPerformed(evt);
            }
        });

        Tile44.setEnabled(false);
        Tile44.setFocusable(false);
        Tile44.setVerifyInputWhenFocusTarget(false);
        Tile44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile44ActionPerformed(evt);
            }
        });

        Tile33.setEnabled(false);
        Tile33.setFocusable(false);
        Tile33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile33ActionPerformed(evt);
            }
        });

        Tile34.setEnabled(false);
        Tile34.setFocusable(false);
        Tile34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile34ActionPerformed(evt);
            }
        });

        ScoreScreen.setEditable(false);
        ScoreScreen.setBackground(new java.awt.Color(204, 204, 255));
        ScoreScreen.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ScoreScreen.setText("0");
        ScoreScreen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ScoreScreen.setEnabled(false);
        ScoreScreen.setFocusable(false);

        ScoreScreenLabel.setFont(new java.awt.Font("FreeSerif", 1, 14)); // NOI18N
        ScoreScreenLabel.setText("SCORE:");

        startGameButton.setText("START");
        startGameButton.setToolTipText("");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        QuitButton.setText("QUIT");
        QuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitButtonActionPerformed(evt);
            }
        });

        DebugCheck.setText("Debug");
        DebugCheck.setToolTipText("");
        DebugCheck.setEnabled(false);

        FileMenu.setText("File");

        QuitMenuItem.setText("Quit");
        QuitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(QuitMenuItem);

        jMenuBar1.add(FileMenu);

        GameMenu.setText("Game");

        resetBoardMenuItem.setText("Reset Board");
        resetBoardMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBoardMenuItemActionPerformed(evt);
            }
        });
        GameMenu.add(resetBoardMenuItem);

        save4x4Score.setText("Save Score...");
        save4x4Score.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save4x4Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save4x4ScoreActionPerformed(evt);
            }
        });
        GameMenu.add(save4x4Score);

        jMenuBar1.add(GameMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DebugCheck)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(Tile11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Tile41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(Tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Tile42, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tile43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tile44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Tile34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ScoreScreenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ScoreScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(startGameButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(QuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScoreScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(ScoreScreenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(startGameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QuitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tile44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(DebugCheck)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // = = = = = = = = = = START GAME BUTTON = = = = = = = = = =
    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        System.out.println("============NEW=GAME============");
        PrevID_Guess1 = 100;
        PrevID_Guess2 = 100;
        ID_Guess1 = 100;
        ID_Guess2 = 100;
        match = false;
        count = 0;
        score = 0;
        sScore = "0";
        accuracy = 0;
        totalPairs = 0;
        correctPairs = 0;
        
        ScoreScreen.setText(sScore);
        
        //Re-Enable the buttons.
        Tile11.setEnabled(true);
        Tile12.setEnabled(true);
        Tile13.setEnabled(true);
        Tile14.setEnabled(true);
        Tile21.setEnabled(true);
        Tile22.setEnabled(true);
        Tile23.setEnabled(true);
        Tile24.setEnabled(true);
        Tile31.setEnabled(true);
        Tile32.setEnabled(true);
        Tile33.setEnabled(true);
        Tile34.setEnabled(true);
        Tile41.setEnabled(true);
        Tile42.setEnabled(true);
        Tile43.setEnabled(true);
        Tile44.setEnabled(true);
        
        //Set the icons to be Blank.
        wipeBoard();
        
        //generate random #'s and assign them to shapes as IDs.
        tileControl.initShuffle4x4Tiles();
        for (int i = 0; i<= 15; i++){
            System.out.print(i + ": ");
            int type = tileControl.get4x4TileType(i);
            
            //will show all the shapes on the buttons, for debugging reasons.
            //check the box, and THEN click start for it to work. 
            if (DebugCheck.isSelected()){
                showTileShape(i, type);
            }
        }
        System.out.println();
        
    }//GEN-LAST:event_startGameButtonActionPerformed

    //Tile 1,1 | ID 0 - Press
    private void Tile11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile11ActionPerformed
        int ID = 0;
        int type;
        
        System.out.print("1,1 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile11ActionPerformed

    //Tile 1,2 | ID 1 - Press
    private void Tile12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile12ActionPerformed
        int ID = 1;
        int type;
        
        System.out.print("1,2 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile12ActionPerformed

    //Tile 1,3 | ID 2 - Press
    private void Tile13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile13ActionPerformed
        int ID = 2;
        int type;
         
        System.out.print("1,3 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile13ActionPerformed

    //Tile 1,4 | ID 3 - Press
    private void Tile14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile14ActionPerformed
        int ID = 3;
        int type;
         
        System.out.print("1,4 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile14ActionPerformed

    //Tile 2,1 | ID 4 - Press
    private void Tile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile21ActionPerformed
        int ID = 4;
        int type;
        
        System.out.print("2,1 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile21ActionPerformed

    //Tile 2,2 | ID 5 - Press
    private void Tile22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile22ActionPerformed
        int ID = 5;
        int type;
        
        System.out.print("2,2 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile22ActionPerformed

    //Tile 2,3 | ID 6 - Press
    private void Tile23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile23ActionPerformed
        int ID = 6;
        int type;
       
        System.out.print("2,3 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile23ActionPerformed

    //Tile 2,4 | ID 7 - Press
    private void Tile24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile24ActionPerformed
        int ID = 7;
        int type;
             
        System.out.print("2,4 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile24ActionPerformed

    //Tile 3,1 | ID 8 - Press
    private void Tile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile31ActionPerformed
        int ID = 8;
        int type;
        
        System.out.print("3,1 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile31ActionPerformed

    //Tile 3,2 | ID 9 - Press
    private void Tile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile32ActionPerformed
        int ID = 9;
        int type;   
        
        System.out.print("3,2 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile32ActionPerformed

    //Tile 3,3 | ID 10 - Press
    private void Tile33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile33ActionPerformed
        int ID = 10;
        int type;
        
        System.out.print("3,3 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile33ActionPerformed

    //Tile 3,4 | ID 11 - Press
    private void Tile34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile34ActionPerformed
        int ID = 11;
        int type;
        
        System.out.print("3,4 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile34ActionPerformed

    //Tile 4,1 | ID 12 - Press
    private void Tile41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile41ActionPerformed
        int ID = 12;
        int type;      
        
        System.out.print("4,1 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile41ActionPerformed

    //Tile 4,2 | ID 13 - Press
    private void Tile42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile42ActionPerformed
        int ID = 13;
        int type;
        
        System.out.print("4,2 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile42ActionPerformed

    //Tile 4,3 | ID 14 - Press
    private void Tile43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile43ActionPerformed
        int ID = 14;
        int type;
          
        System.out.print("4,3 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile43ActionPerformed

    //Tile 4,4 | ID 15 - Press
    private void Tile44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile44ActionPerformed
        int ID = 15;
        int type;   
        
        System.out.print("4,4 -- ");
        type = tileControl.get4x4TileType(ID);
        buttonPress(ID, type);
    }//GEN-LAST:event_Tile44ActionPerformed

    //File>Quit | Reset the board as if it had never been opened, and then close it.  doesn't quit program.
    private void QuitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitMenuItemActionPerformed
        System.out.println("========================\n"
                 + "*** 4 x 4  C L O S E ***\n"
                 + "========================");
        resetBoardMenuItemActionPerformed(evt);
        this.dispose();
    }//GEN-LAST:event_QuitMenuItemActionPerformed
    
    //Quit Button, Reset the board as if it had never been opened, and close it.  doesn't quit program.
    private void QuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitButtonActionPerformed
        QuitMenuItemActionPerformed(evt);
    }//GEN-LAST:event_QuitButtonActionPerformed

    //Saves score to text file.
    private void save4x4ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save4x4ScoreActionPerformed
       
        
        
        
    }//GEN-LAST:event_save4x4ScoreActionPerformed

    //resets the whole game board to a fresh start as if it had never been opened.
    private void resetBoardMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBoardMenuItemActionPerformed
        wipeBoard();
        PrevID_Guess1 = 100;
        PrevID_Guess2 = 100;
        ID_Guess1 = 100;
        ID_Guess2 = 100;
        match = false;
        count = 0;
        score = 0;
        sScore = "0";
        ScoreScreen.setText(sScore);
        accuracy = 0;
        correctPairs = 0;
        totalPairs = 0;
        
        buttonEnabledSwitch(false, 0);
        buttonEnabledSwitch(false, 1);
        buttonEnabledSwitch(false, 2);
        buttonEnabledSwitch(false, 3);
        buttonEnabledSwitch(false, 4);
        buttonEnabledSwitch(false, 5);
        buttonEnabledSwitch(false, 6);
        buttonEnabledSwitch(false, 7);
        buttonEnabledSwitch(false, 8);
        buttonEnabledSwitch(false, 9);
        buttonEnabledSwitch(false, 10);
        buttonEnabledSwitch(false, 11);
        buttonEnabledSwitch(false, 12);
        buttonEnabledSwitch(false, 13);
        buttonEnabledSwitch(false, 14);
        buttonEnabledSwitch(false, 15);
    }//GEN-LAST:event_resetBoardMenuItemActionPerformed

    //===================================OTHER DEFINED SUBROUTINES==================================
    
    // will display an icon on the button based on the shape_code that the button asks for prior to calling this sub.
    private void showTileShape(int ID, int type){
        //first define an array list filled with imageicons for tiles. their index is = to their shape code.
        //so to read from it, just pass type to this ArrayList to get the right icon/shape.
        ArrayList<ImageIcon> shapes = new ArrayList();
        shapes.add(Circle);
        shapes.add(Cross);
        shapes.add(Diamond);
        shapes.add(Donut);
        shapes.add(Eclipse);
        shapes.add(Square);
        shapes.add(Star);
        shapes.add(X);

        //now based on the ID passed, the tile at that case will search the array using type, and set the icon to the one it matches.
        switch(ID){
            case 0: 
                Tile11.setIcon(shapes.get(type));
                break;
            case 1:
                Tile12.setIcon(shapes.get(type));
                break;
            case 2:
                Tile13.setIcon(shapes.get(type));
                break;
            case 3:
                Tile14.setIcon(shapes.get(type));
                break;
            case 4:
                Tile21.setIcon(shapes.get(type));
                break;
            case 5:
                Tile22.setIcon(shapes.get(type));
                break;
            case 6:
                Tile23.setIcon(shapes.get(type));
                break;
            case 7:
                Tile24.setIcon(shapes.get(type));
                break;
            case 8:
                Tile31.setIcon(shapes.get(type));
                break;
            case 9:
                Tile32.setIcon(shapes.get(type));
                break;
            case 10:
                Tile33.setIcon(shapes.get(type));
                break;
            case 11:
                Tile34.setIcon(shapes.get(type));
                break;
            case 12:
                Tile41.setIcon(shapes.get(type));
                break;
            case 13:
                Tile42.setIcon(shapes.get(type));
                break;
            case 14:
                Tile43.setIcon(shapes.get(type));
                break;
            case 15:
                Tile44.setIcon(shapes.get(type));
                break;
        }
    }
    
    //Sets the icons to all of the buttons to BlankTile.png. Doesn't reset the actual game.
    private void wipeBoard(){
        Tile11.setIcon(Blank);
        Tile12.setIcon(Blank);
        Tile13.setIcon(Blank);
        Tile14.setIcon(Blank);
        Tile21.setIcon(Blank);
        Tile22.setIcon(Blank);
        Tile23.setIcon(Blank);
        Tile24.setIcon(Blank);
        Tile31.setIcon(Blank);
        Tile32.setIcon(Blank);
        Tile33.setIcon(Blank);
        Tile34.setIcon(Blank);
        Tile41.setIcon(Blank);
        Tile42.setIcon(Blank);
        Tile43.setIcon(Blank);
        Tile44.setIcon(Blank);
    }
    
    //do the 2 buttons chosen have matching shapes?
    private boolean testMatch(int type1, int type2){
        boolean match = false;
        
        if (type1 == type2){
            match = true;
        }
        
        return match;
    }
    
    //Hide the shape and set icon to blank a particular button/Tile.
    private void hideSelectedTile(int ID){
        switch(ID){
            case 0:
                Tile11.setIcon(Blank);
                break;
            case 1:
                Tile12.setIcon(Blank);
                break;
            case 2:
                Tile13.setIcon(Blank);
                break;
            case 3: 
                Tile14.setIcon(Blank);
                break;
            case 4:
                Tile21.setIcon(Blank);
                break;
            case 5:
                Tile22.setIcon(Blank);
                break;
            case 6:
                Tile23.setIcon(Blank);
                break;
            case 7:
                Tile24.setIcon(Blank);
                break;
            case 8:
                Tile31.setIcon(Blank);
                break;
            case 9:
                Tile32.setIcon(Blank);
                break;
            case 10:
                Tile33.setIcon(Blank);
                break;
            case 11:
                Tile34.setIcon(Blank);
                break;
            case 12:
                Tile41.setIcon(Blank);
                break;
            case 13:
                Tile42.setIcon(Blank);
                break;
            case 14:
                Tile43.setIcon(Blank);
                break;
            case 15:
                Tile44.setIcon(Blank);
                break;       
        }
    }
    
    //enable or disable a button. (enable when it's blank [again], & disable when a shape is showing.)
    private void buttonEnabledSwitch(boolean state, int ID){
        switch(ID){
            case 0:
                Tile11.setEnabled(state);
                break;
            case 1:
                Tile12.setEnabled(state);
                break;
            case 2:
                Tile13.setEnabled(state);
                break;
            case 3:
                Tile14.setEnabled(state);
                break;
            case 4:
                Tile21.setEnabled(state);
                break;
            case 5:
                Tile22.setEnabled(state);
                break;
            case 6:
                Tile23.setEnabled(state);
                break;
            case 7:
                Tile24.setEnabled(state);
                break;
            case 8:
                Tile31.setEnabled(state);
                break;
            case 9:
                Tile32.setEnabled(state);
                break;
            case 10:
                Tile33.setEnabled(state);
                break;
            case 11:
                Tile34.setEnabled(state);
                break;
            case 12:
                Tile41.setEnabled(state);
                break;
            case 13:
                Tile42.setEnabled(state);
                break;
            case 14:
                Tile43.setEnabled(state);
                break;
            case 15:
                Tile44.setEnabled(state);
                break;    
        }                
    }
    
    //Check for a win or loss - if all buttons are pressed, make decision based on score.
    private void checkEndGame(){
        if (!Tile11.isEnabled() && !Tile12.isEnabled() && !Tile13.isEnabled() && !Tile14.isEnabled() && 
                !Tile21.isEnabled() && !Tile22.isEnabled() && !Tile23.isEnabled() && !Tile24.isEnabled() &&
                !Tile31.isEnabled() && !Tile32.isEnabled() && !Tile33.isEnabled() && !Tile34.isEnabled() &&
                !Tile41.isEnabled() && !Tile42.isEnabled() && !Tile43.isEnabled() && !Tile44.isEnabled()){
        
            accuracy = correctPairs / totalPairs * 100;
            accuracy = Math.round (accuracy * 10.0) / 10.0; 
            System.out.println("============GAME=OVER===========\n"
                        + "Total Pairs: " + totalPairs + " Correct Pairs: " + correctPairs + "\n"
                        + "Accuracy: " + accuracy + "%\n"
                        + "Score: " + score);
            
            if (score > 0){
                JOptionPane.showMessageDialog(rootPane,
                "                        Congratulations!        \n"
                + "You finished the game successfully with " + accuracy  + "% accuracy, \n"
                + "And a final score of " + score + "!\n", 
                "You Win!", 
                WIDTH, WIN);
            }
            else{
                JOptionPane.showMessageDialog(rootPane,
                "                               Nice Try!\n"
                + "you finished the game with " + accuracy + "% accuracy.\n"
                + "However your score is " + score + ".\n"
                + "You need a score greater than 0 to win.  Try again!", 
                "You Lose!", 
                WIDTH, LOSS);
            }
        }
    }
    
    //every tile that is pressed on the board uses this in order to make decisions in the game.
    private void buttonPress(int ID, int type){
        if (count == 0){
            System.out.println("(0)COUNT: " + count);
            showTileShape(ID, type);
            ID_Guess1 = ID;
            type_Guess1 = type;
            System.out.println("GUESS 1 ** Location1: " + ID + ", Shape_Code: " + type);
            count++;
            
            //supposed to clear the 2 wrong tiles from the time before
            if (!match){
                hideSelectedTile(PrevID_Guess1);
                hideSelectedTile(PrevID_Guess2);
            }
        }
        else if (count == 1){
            System.out.println("(1)COUNT: " + count);
            showTileShape(ID, type);
            ID_Guess2 = ID;
            type_Guess2 = type;
            PrevID_Guess1 = ID_Guess1;
            PrevID_Guess2 = ID_Guess2;
            
            System.out.println("GUESS 2 ** Location2: " + ID + ", Shape_Code: " + type);
            
            //before matching test if the same tile was pressed twice.  that's cheating.
            if (ID_Guess1 == ID_Guess2){
                JOptionPane.showMessageDialog(
                    rootPane,
                    "You cannot pick the same tile twice.\n" + 
                    "That's considered cheating. Pick 2 distinct tiles.", 
                    "Invalid Move", WIDTH, null
                );
                hideSelectedTile(ID_Guess1);
                ID_Guess1 = 100;
                ID_Guess2 = 100;
                PrevID_Guess1 = 100;
                PrevID_Guess2 = 100;
                buttonEnabledSwitch(true,ID_Guess1);
            }
            else {
                match = testMatch(type_Guess1, type_Guess2);

                if (!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                    totalPairs++;
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                    
                    correctPairs++;
                    totalPairs++;
                    
                    checkEndGame();
                }
            }
            count = 0;
        }  
    }
    //form's main
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox DebugCheck;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu GameMenu;
    private javax.swing.JButton QuitButton;
    private javax.swing.JMenuItem QuitMenuItem;
    private javax.swing.JTextField ScoreScreen;
    private javax.swing.JLabel ScoreScreenLabel;
    private javax.swing.JButton Tile11;
    private javax.swing.JButton Tile12;
    private javax.swing.JButton Tile13;
    private javax.swing.JButton Tile14;
    private javax.swing.JButton Tile21;
    private javax.swing.JButton Tile22;
    private javax.swing.JButton Tile23;
    private javax.swing.JButton Tile24;
    private javax.swing.JButton Tile31;
    private javax.swing.JButton Tile32;
    private javax.swing.JButton Tile33;
    private javax.swing.JButton Tile34;
    private javax.swing.JButton Tile41;
    private javax.swing.JButton Tile42;
    private javax.swing.JButton Tile43;
    private javax.swing.JButton Tile44;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem resetBoardMenuItem;
    private javax.swing.JMenuItem save4x4Score;
    private javax.swing.JButton startGameButton;
    // End of variables declaration//GEN-END:variables

    //GLOBALS
    TileControl tileControl = new TileControl();
   
    ImageIcon Circle    = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Circle.png"));
    ImageIcon Cross     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Cross.png"));
    ImageIcon Diamond   = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Diamond.png"));
    ImageIcon Donut     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Donut.png"));
    ImageIcon Eclipse   = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Eclipse.png"));
    ImageIcon Square    = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Square.png"));
    ImageIcon Star      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/Star.png"));
    ImageIcon X         = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/X.png"));
    ImageIcon Blank     = new javax.swing.ImageIcon(getClass().getResource("/memorygame/MGshapes/blankTile.png"));
    ImageIcon WIN       = new javax.swing.ImageIcon(getClass().getResource("/memorygame/win-loss/WIN.png"));
    ImageIcon LOSS      = new javax.swing.ImageIcon(getClass().getResource("/memorygame/win-loss/LOSS.png"));
    
    int count = 0;                              //1 for first tile flipped, 2 for second.  if 2, check match.
    int ID_Guess1 = 100, ID_Guess2 = 100;       //the locations of the 2 tiles the user guessed.  if !match, remove icons at these 2 locations.
    int type_Guess1, type_Guess2;               //the ShapeCodes for the 2 guesses.  used for testing a match. 
    boolean match;                              //catches the result from testMatch sub.
    int score;                                  //saves the player's score
    String sScore;                              //to be sent to the label.
    int PrevID_Guess1;                          //these 2 are used to store the 2 tiles from the LAST matching, to know which (locations) to 
    int PrevID_Guess2;                          //return to blanks when a new matching has started.
    double totalPairs;                          //Keeps track of how many pairs happened. used to calculate accuracy %.
    double correctPairs;                        //Keeps track of CORRECT pairs that occur. used to calculate accuracy %.
    double accuracy;
}
