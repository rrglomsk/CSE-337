
package hangman;

/**
 * Rachel Glomski
 * CSE 337 
 * Assignment 1 - Hangman
 */

public class HangmanTest extends javax.swing.JFrame {

    private String word;
    private boolean started;
    private String[] guessingWord;
    private String[] wordArray;
    private int tryCount = 0;
    
    String[] wordList = {"BANANA","FIREWORKS","CYLINDER","KEYBOARD","MOUSE",
        "MONITOR","CAMERA","TECHNOLOGY","DESK","STYROFOAM","CHAIR","TEXTBOOK",
        "BACKPACK","AARDVARK","BUTTON","SOFTWARE","RADIO","POTATO","TELEVISION",
        "CARPET","CLOUD","BICYCLE","GOGGLES","TABLE","MICROWAVE","LIZARD",
        "RACCOON","OCTOPUS","JAVA","REINDEER","COOKIES","SQUIRREL","ELEPHANT"};

    public HangmanTest() {
        initComponents();
    }

    public void setWord(String word){
        this.word = word;
    }
    
    //puts word into an array
    public void setWordArray(String word){
        this.wordArray = word.split("(?!^)");
    }
    
    //Determines if game has started
    public void setStart(Boolean bool){
        this.started = bool;
    }
    
    //Creates -'s for the word to be guessed
    public void createBlank(int a){
        this.guessingWord = new String[a];
        for(int x = 0; x < a; x++){
            guessingWord[x] = "-";
        }
    }
    
    //Compares guessed letter against word
    public void letterCheck(String guess){
        for (int i = 0; i < word.length(); i++){
            if (wordArray[i].compareTo(guess) == 0){
                guessingWord[i] = guess;
            }
        } 
    }
    
    //Prints the current state of the word and updates try count
    public void reprint(){
        String display = "";
        for (int i=0;i<word.length();i++){
        display += guessingWord[i] + " ";}
        lblWordSpace.setText(display);
        lblTries.setText(tryCount + " tries");
        }
    
    public void startGame(){
            int random = (int)(Math.random() * wordList.length);
            btnStart.setText("Stop Game");
            setWord(wordList[random]);
            createBlank(word.length());
            setWordArray(word);
            setStart(true);
            reprint();
            lblTries.setOpaque(true);
    }
    
    public void stopGame(){
            setStart(false);
            lblTries.setText("");
            lblTries.setOpaque(false);
            tryCount = 0;
            lblWordSpace.setText("X X X X X X X X X X X X X X X X");
            btnStart.setText("Start Game");
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        btnJ = new javax.swing.JButton();
        btnL = new javax.swing.JButton();
        btnK = new javax.swing.JButton();
        btnP = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnM = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnO = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnQ = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnV = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnY = new javax.swing.JButton();
        btnZ = new javax.swing.JButton();
        btnU = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        lblWordSpace = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblTries = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnA.setText("A");
        btnA.setMaximumSize(new java.awt.Dimension(50, 50));
        btnA.setMinimumSize(new java.awt.Dimension(50, 50));
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnB.setText("B");
        btnB.setMaximumSize(new java.awt.Dimension(50, 50));
        btnB.setMinimumSize(new java.awt.Dimension(50, 50));
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnC.setText("C");
        btnC.setMaximumSize(new java.awt.Dimension(50, 50));
        btnC.setMinimumSize(new java.awt.Dimension(50, 50));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnD.setText("D");
        btnD.setMaximumSize(new java.awt.Dimension(50, 50));
        btnD.setMinimumSize(new java.awt.Dimension(50, 50));
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnE.setText("E");
        btnE.setMaximumSize(new java.awt.Dimension(50, 50));
        btnE.setMinimumSize(new java.awt.Dimension(50, 50));
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnF.setText("F");
        btnF.setMaximumSize(new java.awt.Dimension(50, 50));
        btnF.setMinimumSize(new java.awt.Dimension(50, 50));
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnG.setText("G");
        btnG.setMaximumSize(new java.awt.Dimension(50, 50));
        btnG.setMinimumSize(new java.awt.Dimension(50, 50));
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        btnH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnH.setText("H");
        btnH.setMaximumSize(new java.awt.Dimension(50, 50));
        btnH.setMinimumSize(new java.awt.Dimension(50, 50));
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnI.setText("I");
        btnI.setMaximumSize(new java.awt.Dimension(50, 50));
        btnI.setMinimumSize(new java.awt.Dimension(50, 50));
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        btnJ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnJ.setText("J");
        btnJ.setMaximumSize(new java.awt.Dimension(50, 50));
        btnJ.setMinimumSize(new java.awt.Dimension(50, 50));
        btnJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJActionPerformed(evt);
            }
        });

        btnL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnL.setText("L");
        btnL.setMaximumSize(new java.awt.Dimension(50, 50));
        btnL.setMinimumSize(new java.awt.Dimension(50, 50));
        btnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLActionPerformed(evt);
            }
        });

        btnK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnK.setText("K");
        btnK.setMaximumSize(new java.awt.Dimension(50, 50));
        btnK.setMinimumSize(new java.awt.Dimension(50, 50));
        btnK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKActionPerformed(evt);
            }
        });

        btnP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnP.setText("P");
        btnP.setMaximumSize(new java.awt.Dimension(50, 50));
        btnP.setMinimumSize(new java.awt.Dimension(50, 50));
        btnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPActionPerformed(evt);
            }
        });

        btnN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnN.setText("N");
        btnN.setMaximumSize(new java.awt.Dimension(50, 50));
        btnN.setMinimumSize(new java.awt.Dimension(50, 50));
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });

        btnM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnM.setText("M");
        btnM.setMaximumSize(new java.awt.Dimension(50, 50));
        btnM.setMinimumSize(new java.awt.Dimension(50, 50));
        btnM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMActionPerformed(evt);
            }
        });

        btnT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnT.setText("T");
        btnT.setMaximumSize(new java.awt.Dimension(50, 50));
        btnT.setMinimumSize(new java.awt.Dimension(50, 50));
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });

        btnO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnO.setText("O");
        btnO.setMaximumSize(new java.awt.Dimension(50, 50));
        btnO.setMinimumSize(new java.awt.Dimension(50, 50));
        btnO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOActionPerformed(evt);
            }
        });

        btnS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnS.setText("S");
        btnS.setMaximumSize(new java.awt.Dimension(50, 50));
        btnS.setMinimumSize(new java.awt.Dimension(50, 50));
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnQ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQ.setText("Q");
        btnQ.setMaximumSize(new java.awt.Dimension(50, 50));
        btnQ.setMinimumSize(new java.awt.Dimension(50, 50));
        btnQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQActionPerformed(evt);
            }
        });

        btnR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnR.setText("R");
        btnR.setMaximumSize(new java.awt.Dimension(50, 50));
        btnR.setMinimumSize(new java.awt.Dimension(50, 50));
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnV.setText("V");
        btnV.setMaximumSize(new java.awt.Dimension(50, 50));
        btnV.setMinimumSize(new java.awt.Dimension(50, 50));
        btnV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVActionPerformed(evt);
            }
        });

        btnW.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnW.setText("W");
        btnW.setMaximumSize(new java.awt.Dimension(50, 50));
        btnW.setMinimumSize(new java.awt.Dimension(50, 50));
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });

        btnX.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnX.setText("X");
        btnX.setMaximumSize(new java.awt.Dimension(50, 50));
        btnX.setMinimumSize(new java.awt.Dimension(50, 50));
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });

        btnY.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnY.setText("Y");
        btnY.setMaximumSize(new java.awt.Dimension(50, 50));
        btnY.setMinimumSize(new java.awt.Dimension(50, 50));
        btnY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYActionPerformed(evt);
            }
        });

        btnZ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnZ.setText("Z");
        btnZ.setMaximumSize(new java.awt.Dimension(50, 50));
        btnZ.setMinimumSize(new java.awt.Dimension(50, 50));
        btnZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZActionPerformed(evt);
            }
        });

        btnU.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnU.setText("U");
        btnU.setMaximumSize(new java.awt.Dimension(50, 50));
        btnU.setMinimumSize(new java.awt.Dimension(50, 50));
        btnU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStart.setText("Start Game");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        lblWordSpace.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblWordSpace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWordSpace.setText("X X X X X X X X X X X X X X X X");
        lblWordSpace.setToolTipText("");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome to Hangman");

        lblTries.setBackground(new java.awt.Color(102, 102, 102));
        lblTries.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTries.setForeground(new java.awt.Color(240, 240, 240));
        lblTries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTries, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(lblTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 147, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblWordSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTries, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblWordSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnK, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        if (started == true){
           String letterGuessed = "C";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMActionPerformed
        if (started == true){
           String letterGuessed = "M";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnMActionPerformed

    private void btnUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUActionPerformed
        if (started == true){
           String letterGuessed = "U";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnUActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        if (btnStart.getText().compareTo("Start Game") == 0) {
            startGame();
        }
        else {
            stopGame();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
       if (started == true){
           String letterGuessed = "A";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint(); 
       }
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
       if (started == true){
           String letterGuessed = "B";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
       }
    }//GEN-LAST:event_btnBActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        if (started == true){
           String letterGuessed = "D";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        if (started == true){
           String letterGuessed = "E";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        if (started == true){
           String letterGuessed = "F";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        if (started == true){
           String letterGuessed = "G";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        if (started == true){
           String letterGuessed = "H";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnHActionPerformed

    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        if (started == true){
           String letterGuessed = "I";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnIActionPerformed

    private void btnJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJActionPerformed
        if (started == true){
           String letterGuessed = "J";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnJActionPerformed

    private void btnKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKActionPerformed
        if (started == true){
           String letterGuessed = "K";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnKActionPerformed

    private void btnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLActionPerformed
        if (started == true){
           String letterGuessed = "L";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnLActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        if (started == true){
           String letterGuessed = "N";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnNActionPerformed

    private void btnOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOActionPerformed
        if (started == true){
           String letterGuessed = "O";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnOActionPerformed

    private void btnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPActionPerformed
        if (started == true){
           String letterGuessed = "P";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnPActionPerformed

    private void btnQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQActionPerformed
        if (started == true){
           String letterGuessed = "Q";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnQActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        if (started == true){
           String letterGuessed = "R";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnRActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        if (started == true){
           String letterGuessed = "S";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnSActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        if (started == true){
           String letterGuessed = "T";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnTActionPerformed

    private void btnVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVActionPerformed
        if (started == true){
           String letterGuessed = "V";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnVActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        if (started == true){
           String letterGuessed = "W";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnWActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        if (started == true){
           String letterGuessed = "X";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnXActionPerformed

    private void btnYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYActionPerformed
        if (started == true){
           String letterGuessed = "Y";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnYActionPerformed

    private void btnZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZActionPerformed
        if (started == true){
           String letterGuessed = "Z";
           letterCheck(letterGuessed);
           tryCount += 1;
           reprint();  
        }
    }//GEN-LAST:event_btnZActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HangmanTest().setVisible(true);
            
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnO;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnZ;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTries;
    private javax.swing.JLabel lblWordSpace;
    // End of variables declaration//GEN-END:variables
}
