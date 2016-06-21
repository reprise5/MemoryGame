package memorygame;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        GameMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory Tiles -  Memory Game");

        Tile11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile11.setEnabled(false);
        Tile11.setFocusable(false);
        Tile11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile11ActionPerformed(evt);
            }
        });

        Tile14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile14.setEnabled(false);
        Tile14.setFocusable(false);
        Tile14.setName(""); // NOI18N
        Tile14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile14ActionPerformed(evt);
            }
        });

        Tile12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile12.setEnabled(false);
        Tile12.setFocusable(false);
        Tile12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile12ActionPerformed(evt);
            }
        });

        Tile13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile13.setEnabled(false);
        Tile13.setFocusable(false);
        Tile13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile13ActionPerformed(evt);
            }
        });

        Tile22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile22.setEnabled(false);
        Tile22.setFocusable(false);
        Tile22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile22ActionPerformed(evt);
            }
        });

        Tile23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile23.setEnabled(false);
        Tile23.setFocusable(false);
        Tile23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile23ActionPerformed(evt);
            }
        });

        Tile21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile21.setEnabled(false);
        Tile21.setFocusable(false);
        Tile21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile21ActionPerformed(evt);
            }
        });

        Tile24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile24.setEnabled(false);
        Tile24.setFocusable(false);
        Tile24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile24ActionPerformed(evt);
            }
        });

        Tile31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile31.setEnabled(false);
        Tile31.setFocusable(false);
        Tile31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile31ActionPerformed(evt);
            }
        });

        Tile32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile32.setEnabled(false);
        Tile32.setFocusable(false);
        Tile32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile32ActionPerformed(evt);
            }
        });

        Tile41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile41.setEnabled(false);
        Tile41.setFocusable(false);
        Tile41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile41ActionPerformed(evt);
            }
        });

        Tile42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile42.setEnabled(false);
        Tile42.setFocusable(false);
        Tile42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile42ActionPerformed(evt);
            }
        });

        Tile43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile43.setEnabled(false);
        Tile43.setFocusable(false);
        Tile43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile43ActionPerformed(evt);
            }
        });

        Tile44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile44.setEnabled(false);
        Tile44.setFocusable(false);
        Tile44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile44ActionPerformed(evt);
            }
        });

        Tile33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
        Tile33.setEnabled(false);
        Tile33.setFocusable(false);
        Tile33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tile33ActionPerformed(evt);
            }
        });

        Tile34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memorygame/blankTile.png"))); // NOI18N
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

        startGameButton.setText("** START GAME **");
        startGameButton.setToolTipText("");
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });

        FileMenu.setText("File");

        jMenuItem1.setText("Quit");
        FileMenu.add(jMenuItem1);

        jMenuBar1.add(FileMenu);

        GameMenu.setText("Game");
        jMenuBar1.add(GameMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tile41, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Tile42, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tile43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tile44, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Tile34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Tile11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScoreScreenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScoreScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startGameButton)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ScoreScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ScoreScreenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Tile43, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile42, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile44, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Tile41, javax.swing.GroupLayout.PREFERRED_SIZE, 106, Short.MAX_VALUE))
                .addGap(37, 37, 37))
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
        
        //Set the icons to be Blank.  (TEMPORARY)
        wipeBoard();
        
        //generate random #'s and assign them to shapes as IDs.
        tileControl.initShuffleTiles();
        for (int i = 0; i<= 15; i++){
            System.out.print(i + ": ");
            int type = tileControl.getTileType(i);
        }
        System.out.println();
        
    }//GEN-LAST:event_startGameButtonActionPerformed

    //Tile 1,1 | ID 0 - Press
    private void Tile11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile11ActionPerformed
        int ID = 0;
        int type;
        
        System.out.print("1,1 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile11ActionPerformed

    //Tile 1,2 | ID 1 - Press
    private void Tile12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile12ActionPerformed
        int ID = 1;
        int type;
        
        System.out.print("1,2 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile12ActionPerformed

    //Tile 1,3 | ID 2 - Press
    private void Tile13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile13ActionPerformed
        int ID = 2;
        int type;
         
        System.out.print("1,3 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile13ActionPerformed

    //Tile 1,4 | ID 3 - Press
    private void Tile14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile14ActionPerformed
        int ID = 3;
        int type;
         
        System.out.print("1,4 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile14ActionPerformed

    //Tile 2,1 | ID 4 - Press
    private void Tile21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile21ActionPerformed
        int ID = 4;
        int type;
        
        System.out.print("2,1 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile21ActionPerformed

    //Tile 2,2 | ID 5 - Press
    private void Tile22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile22ActionPerformed
        int ID = 5;
        int type;
        
        System.out.print("2,2 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile22ActionPerformed

    //Tile 2,3 | ID 6 - Press
    private void Tile23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile23ActionPerformed
        int ID = 6;
        int type;
       
        System.out.print("2,3 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile23ActionPerformed

    //Tile 2,4 | ID 7 - Press
    private void Tile24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile24ActionPerformed
        int ID = 7;
        int type;
             
        System.out.print("2,4 -- ");
        type = tileControl.getTileType(ID);

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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile24ActionPerformed

    //Tile 3,1 | ID 8 - Press
    private void Tile31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile31ActionPerformed
        int ID = 8;
        int type;
        
        System.out.print("3,1 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile31ActionPerformed

    //Tile 3,2 | ID 9 - Press
    private void Tile32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile32ActionPerformed
        int ID = 9;
        int type;   
        
        System.out.print("3,2 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile32ActionPerformed

    //Tile 3,3 | ID 10 - Press
    private void Tile33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile33ActionPerformed
        int ID = 10;
        int type;
        
        System.out.print("3,3 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile33ActionPerformed

    //Tile 3,4 | ID 11 - Press
    private void Tile34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile34ActionPerformed
        int ID = 11;
        int type;
        
        System.out.print("3,4 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile34ActionPerformed

    //Tile 4,1 | ID 12 - Press
    private void Tile41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile41ActionPerformed
        int ID = 12;
        int type;      
        
        System.out.print("4,1 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile41ActionPerformed

    //Tile 4,2 | ID 13 - Press
    private void Tile42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile42ActionPerformed
        int ID = 13;
        int type;
        
        System.out.print("4,2 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile42ActionPerformed

    //Tile 4,3 | ID 14 - Press
    private void Tile43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile43ActionPerformed
        int ID = 14;
        int type;
          
        System.out.print("4,3 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile43ActionPerformed

    //Tile 4,4 | ID 15 - Press
    private void Tile44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tile44ActionPerformed
        int ID = 15;
        int type;   
        
        System.out.print("4,4 -- ");
        type = tileControl.getTileType(ID);
        
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

                if(!match){
                    System.out.println("     *No Match.*     ");
                    score = score - 2;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);
                }
                else{
                    System.out.println("     *MATCH!*     ");
                    score = score + 5;
                    sScore = Integer.toString(score);
                    ScoreScreen.setText(sScore);

                    buttonEnabledSwitch(false, ID_Guess1);
                    buttonEnabledSwitch(false, ID_Guess2);
                }
            }
            count = 0;
        }
    }//GEN-LAST:event_Tile44ActionPerformed

    // will display an icon on the button based on the shape_code that the button asks for prior to calling this sub.
    public void showTileShape(int ID, int type){
        //first need to know which button to flip (ID), then what to change it to (type).
            if (ID == 0){
                switch(type){
                    case 0:
                        Tile11.setIcon(Circle);
                        break;
                    case 1:
                        Tile11.setIcon(Cross);        
                        break;
                    case 2:
                        Tile11.setIcon(Diamond);
                        break;
                    case 3:
                        Tile11.setIcon(Donut);
                        break;
                    case 4:
                        Tile11.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile11.setIcon(Square);
                        break;
                    case 6:
                        Tile11.setIcon(Star);
                        break;
                    case 7:
                        Tile11.setIcon(X);
                        break;
                }
            }
            else if (ID == 1){
                switch(type){
                    case 0:
                        Tile12.setIcon(Circle);
                        break;
                    case 1:
                        Tile12.setIcon(Cross);
                        break;
                    case 2:
                        Tile12.setIcon(Diamond);
                        break;
                    case 3:
                        Tile12.setIcon(Donut);
                        break;
                    case 4:
                        Tile12.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile12.setIcon(Square);
                        break;
                    case 6:
                        Tile12.setIcon(Star);
                        break;
                    case 7:
                        Tile12.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 2){
                switch(type){
                    case 0:
                        Tile13.setIcon(Circle);
                        break;
                    case 1:
                        Tile13.setIcon(Cross);
                        break;
                    case 2:
                        Tile13.setIcon(Diamond);
                        break;
                    case 3:
                        Tile13.setIcon(Donut);
                        break;
                    case 4:
                        Tile13.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile13.setIcon(Square);
                        break;
                    case 6:
                        Tile13.setIcon(Star);
                        break;
                    case 7:
                        Tile13.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 3){
                switch(type){
                    case 0:
                        Tile14.setIcon(Circle);
                        break;
                    case 1:
                        Tile14.setIcon(Cross);
                        break;
                    case 2:
                        Tile14.setIcon(Diamond);
                        break;
                    case 3:
                        Tile14.setIcon(Donut);
                        break;
                    case 4:
                        Tile14.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile14.setIcon(Square);
                        break;
                    case 6:
                        Tile14.setIcon(Star);
                        break;
                    case 7:
                        Tile14.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 4){
                switch(type){
                    case 0:
                        Tile21.setIcon(Circle);
                        break;
                    case 1:
                        Tile21.setIcon(Cross);
                        break;
                    case 2:
                        Tile21.setIcon(Diamond);
                        break;
                    case 3:
                        Tile21.setIcon(Donut);
                        break;
                    case 4:
                        Tile21.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile21.setIcon(Square);
                        break;
                    case 6:
                        Tile21.setIcon(Star);
                        break;
                    case 7:
                        Tile21.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 5){
                switch(type){
                    case 0:
                        Tile22.setIcon(Circle);
                        break;
                    case 1:
                        Tile22.setIcon(Cross);
                        break;
                    case 2:
                        Tile22.setIcon(Diamond);
                        break;
                    case 3:
                        Tile22.setIcon(Donut);
                        break;
                    case 4:
                        Tile22.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile22.setIcon(Square);
                        break;
                    case 6:
                        Tile22.setIcon(Star);
                        break;
                    case 7:
                        Tile22.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 6){
                switch(type){
                    case 0:
                        Tile23.setIcon(Circle);
                        break;
                    case 1:
                        Tile23.setIcon(Cross);
                        break;
                    case 2:
                        Tile23.setIcon(Diamond);
                        break;
                    case 3:
                        Tile23.setIcon(Donut);
                        break;
                    case 4:
                        Tile23.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile23.setIcon(Square);
                        break;
                    case 6:
                        Tile23.setIcon(Star);
                        break;
                    case 7:
                        Tile23.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 7){
                switch(type){
                    case 0:
                        Tile24.setIcon(Circle);
                        break;
                    case 1:
                        Tile24.setIcon(Cross);
                        break;
                    case 2:
                        Tile24.setIcon(Diamond);
                        break;
                    case 3:
                        Tile24.setIcon(Donut);
                        break;
                    case 4:
                        Tile24.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile24.setIcon(Square);
                        break;
                    case 6:
                        Tile24.setIcon(Star);
                        break;
                    case 7:
                        Tile24.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 8){
                switch(type){
                    case 0:
                        Tile31.setIcon(Circle);
                        break;
                    case 1:
                        Tile31.setIcon(Cross);
                        break;
                    case 2:
                        Tile31.setIcon(Diamond);
                        break;
                    case 3:
                        Tile31.setIcon(Donut);
                        break;
                    case 4:
                        Tile31.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile31.setIcon(Square);
                        break;
                    case 6:
                        Tile31.setIcon(Star);
                        break;
                    case 7:
                        Tile31.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 9){
                switch(type){
                    case 0:
                        Tile32.setIcon(Circle);
                        break;
                    case 1:
                        Tile32.setIcon(Cross);
                        break;
                    case 2:
                        Tile32.setIcon(Diamond);
                        break;
                    case 3:
                        Tile32.setIcon(Donut);
                        break;
                    case 4:
                        Tile32.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile32.setIcon(Square);
                        break;
                    case 6:
                        Tile32.setIcon(Star);
                        break;
                    case 7:
                        Tile32.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 10){
                switch(type){
                    case 0:
                        Tile33.setIcon(Circle);
                        break;
                    case 1:
                        Tile33.setIcon(Cross);
                        break;
                    case 2:
                        Tile33.setIcon(Diamond);
                        break;
                    case 3:
                        Tile33.setIcon(Donut);
                        break;
                    case 4:
                        Tile33.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile33.setIcon(Square);
                        break;
                    case 6:
                        Tile33.setIcon(Star);
                        break;
                    case 7:
                        Tile33.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 11){
                switch(type){
                    case 0:
                        Tile34.setIcon(Circle);
                        break;
                    case 1:
                        Tile34.setIcon(Cross);
                        break;
                    case 2:
                        Tile34.setIcon(Diamond);
                        break;
                    case 3:
                        Tile34.setIcon(Donut);
                        break;
                    case 4:
                        Tile34.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile34.setIcon(Square);
                        break;
                    case 6:
                        Tile34.setIcon(Star);
                        break;
                    case 7:
                        Tile34.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 12){
                switch(type){
                    case 0:
                        Tile41.setIcon(Circle);
                        break;
                    case 1:
                        Tile41.setIcon(Cross);
                        break;
                    case 2:
                        Tile41.setIcon(Diamond);
                        break;
                    case 3:
                        Tile41.setIcon(Donut);
                        break;
                    case 4:
                        Tile41.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile41.setIcon(Square);
                        break;
                    case 6:
                        Tile41.setIcon(Star);
                        break;
                    case 7:
                        Tile41.setIcon(X);
                        break; 
                }       
            }
             else if (ID == 13){
                switch(type){
                    case 0:
                        Tile42.setIcon(Circle);
                        break;
                    case 1:
                        Tile42.setIcon(Cross);
                        break;
                    case 2:
                        Tile42.setIcon(Diamond);
                        break;
                    case 3:
                        Tile42.setIcon(Donut);
                        break;
                    case 4:
                        Tile42.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile42.setIcon(Square);
                        break;
                    case 6:
                        Tile42.setIcon(Star);
                        break;
                    case 7:
                        Tile42.setIcon(X);
                        break; 
                }       
            }
             else if (ID == 14){
                switch(type){
                    case 0:
                        Tile43.setIcon(Circle);
                        break;
                    case 1:
                        Tile43.setIcon(Cross);
                        break;
                    case 2:
                        Tile43.setIcon(Diamond);
                        break;
                    case 3:
                        Tile43.setIcon(Donut);
                        break;
                    case 4:
                        Tile43.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile43.setIcon(Square);
                        break;
                    case 6:
                        Tile43.setIcon(Star);
                        break;
                    case 7:
                        Tile43.setIcon(X);
                        break; 
                }       
            }
            else if (ID == 15){
                switch(type){
                    case 0:
                        Tile44.setIcon(Circle);
                        break;
                    case 1:
                        Tile44.setIcon(Cross);
                        break;
                    case 2:
                        Tile44.setIcon(Diamond);
                        break;
                    case 3:
                        Tile44.setIcon(Donut);
                        break;
                    case 4:
                        Tile44.setIcon(Eclipse);
                        break;
                    case 5:
                        Tile44.setIcon(Square);
                        break;
                    case 6:
                        Tile44.setIcon(Star);
                        break;
                    case 7:
                        Tile44.setIcon(X);
                        break; 
                }       
            }
    }
    
    //Sets the icons to all of the buttons to BlankTile.png. Doesn't reset the actual game.
    public void wipeBoard(){
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
    public boolean testMatch(int type1, int type2){
        boolean match = false;
        
        if (type1 == type2){
            match = true;
        }
        
        return match;
    }
    
    //Hide the shape and set icon to blank a particular button/Tile.
    public void hideSelectedTile(int ID){
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
    public void buttonEnabledSwitch(boolean state, int ID){
        if (state){
            //then enable the button at the passed ID.
            switch(ID){
                case 0:
                    Tile11.setEnabled(true);
                    break;
                case 1:
                    Tile12.setEnabled(true);
                    break;
                case 2:
                    Tile13.setEnabled(true);
                    break;
                case 3:
                    Tile14.setEnabled(true);
                    break;
                case 4:
                    Tile21.setEnabled(true);
                    break;
                case 5:
                    Tile22.setEnabled(true);
                    break;
                case 6:
                    Tile23.setEnabled(true);
                    break;
                case 7:
                    Tile24.setEnabled(true);
                    break;
                case 8:
                    Tile31.setEnabled(true);
                    break;
                case 9:
                    Tile32.setEnabled(true);
                    break;
                case 10:
                    Tile33.setEnabled(true);
                    break;
                case 11:
                    Tile34.setEnabled(true);
                    break;
                case 12:
                    Tile41.setEnabled(true);
                    break;
                case 13:
                    Tile42.setEnabled(true);
                    break;
                case 14:
                    Tile43.setEnabled(true);
                    break;
                case 15:
                    Tile44.setEnabled(true);
                    break;    
            }
        }
        else{
            //then disable the button at the passed ID.
            switch(ID){
                case 0:
                    Tile11.setEnabled(false);
                    
                    break;
                case 1:
                    Tile12.setEnabled(false);
                    break;
                case 2:
                    Tile13.setEnabled(false);
                    break;
                case 3:
                    Tile14.setEnabled(false);
                    break;
                case 4:
                    Tile21.setEnabled(false);
                    break;
                case 5:
                    Tile22.setEnabled(false);
                    break;
                case 6:
                    Tile23.setEnabled(false);
                    break;
                case 7:
                    Tile24.setEnabled(false);
                    break;
                case 8:
                    Tile31.setEnabled(false);
                    break;
                case 9:
                    Tile32.setEnabled(false);
                    break;
                case 10:
                    Tile33.setEnabled(false);
                    break;
                case 11:
                    Tile34.setEnabled(false);
                    break;
                case 12:
                    Tile41.setEnabled(false);
                    break;
                case 13:
                    Tile42.setEnabled(false);
                    break;
                case 14:
                    Tile43.setEnabled(false);
                    break;
                case 15:
                    Tile44.setEnabled(false);
                    break;    
            }             
        }   
    }
    
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
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu GameMenu;
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
    private javax.swing.JMenuItem jMenuItem1;
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
    
    int count = 0;                              //1 for first tile flipped, 2 for second.  if 2, check match.
    int ID_Guess1 = 100, ID_Guess2 = 100;       //the locations of the 2 tiles the user guessed.  if !match, remove icons at these 2 locations.
    int type_Guess1, type_Guess2;               //the ShapeCodes for the 2 guesses.  used for testing a match. 
    boolean match;                              //catches the result from testMatch sub.
    int score;                                  //saves the player's score
    String sScore;                              //to be sent to the label.
    int PrevID_Guess1;                          //these 2 are used to store the 2 tiles from the LAST matching, to know which (locations) to 
    int PrevID_Guess2;                          //return to blanks when a new matching has started.
}
