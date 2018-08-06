package graphics;

import java.util.ArrayList;
import jsnake.Field.*;
import jsnake.Head.direction;
import jsnake.*;

public class Screen extends javax.swing.JFrame {

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 400;
    private JField field;
    private java.util.ArrayList<JSnake> jSnakes;
    private int snakeNumber;

    public Screen() {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }
        initComponents();
        this.setBackground(java.awt.Color.BLACK);
        this.smartSetSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.centerFrame();
        this.setTitle("JSnake 1.1 by Oneiros");
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(Screen.class.getResource("snake.png")));
        this.field = new JField(FRAME_WIDTH, FRAME_HEIGHT);
        this.jSnakes = new ArrayList<JSnake>();
        this.snakeNumber = 2;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        optionsPanel = new javax.swing.JPanel();
        internalOptionPanel = new javax.swing.JPanel();
        resolutionPanel = new javax.swing.JPanel();
        resolutionLabel = new javax.swing.JLabel();
        resolutionRadioButton600x400 = new javax.swing.JRadioButton();
        resolutionRadioButton900x600 = new javax.swing.JRadioButton();
        resolutionRadioButton1200x800 = new javax.swing.JRadioButton();
        difficultPanel = new javax.swing.JPanel();
        difficultLabel = new javax.swing.JLabel();
        difficultRadioButtonEasy = new javax.swing.JRadioButton();
        difficultRadioButtonNormal = new javax.swing.JRadioButton();
        difficultRadioButtonHard = new javax.swing.JRadioButton();
        wallsPanel = new javax.swing.JPanel();
        wallsLabel = new javax.swing.JLabel();
        wallsRadioButtonNo = new javax.swing.JRadioButton();
        wallsRadioButtonPattern1 = new javax.swing.JRadioButton();
        wallsRadioButtonPattern2 = new javax.swing.JRadioButton();
        backButton = new javax.swing.JButton();
        resolutionButtonGroup = new javax.swing.ButtonGroup();
        difficultButtonGroup = new javax.swing.ButtonGroup();
        wallsButtonGroup = new javax.swing.ButtonGroup();
        chooseSingleSnakePanel = new javax.swing.JPanel();
        chooseSnakeTitle = new javax.swing.JLabel();
        snakeOptionsPanel = new javax.swing.JPanel();
        snakePreviewPanel = new javax.swing.JPanel();
        snakeColorComboBox = new javax.swing.JComboBox();
        snakePositionComboBox = new javax.swing.JComboBox();
        snakeControlComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        chooseMultiSnakesPanel = new javax.swing.JPanel();
        chooseSnakeTitle1 = new javax.swing.JLabel();
        chooseSnakesInternalPanel1 = new javax.swing.JPanel();
        snakeOptionsPanel1 = new javax.swing.JPanel();
        snakePreviewPanel1 = new javax.swing.JPanel();
        snakeColorComboBox1 = new javax.swing.JComboBox();
        snakePositionComboBox1 = new javax.swing.JComboBox();
        snakeControlComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        snakeOptionsPanel2 = new javax.swing.JPanel();
        snakePreviewPanel2 = new javax.swing.JPanel();
        snakeColorComboBox2 = new javax.swing.JComboBox();
        snakePositionComboBox2 = new javax.swing.JComboBox();
        snakeControlComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        snakeOptionsPanel3 = new javax.swing.JPanel();
        snakePreviewPanel3 = new javax.swing.JPanel();
        snakeColorComboBox3 = new javax.swing.JComboBox();
        snakePositionComboBox3 = new javax.swing.JComboBox();
        snakeControlComboBox3 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        snakeOptionsPanel4 = new javax.swing.JPanel();
        snakePreviewPanel4 = new javax.swing.JPanel();
        snakeColorComboBox4 = new javax.swing.JComboBox();
        snakePositionComboBox4 = new javax.swing.JComboBox();
        snakeControlComboBox4 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        startButton1 = new javax.swing.JButton();
        backButton2 = new javax.swing.JButton();
        snakeNumberComboBox = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        singlePlayerButton = new javax.swing.JButton();
        multiplayerButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();

        optionsPanel.setBounds(0, 0, 600, 400);
        optionsPanel.setBackground(new java.awt.Color(0, 0, 0));
        optionsPanel.setPreferredSize(new java.awt.Dimension(600, 400));

        internalOptionPanel.setBackground(new java.awt.Color(0, 0, 0));
        internalOptionPanel.setLayout(new java.awt.GridLayout(2, 2));

        resolutionPanel.setOpaque(false);
        resolutionPanel.setLayout(new java.awt.GridBagLayout());

        resolutionLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24));
        resolutionLabel.setForeground(new java.awt.Color(255, 0, 0));
        resolutionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resolutionLabel.setText("RESOLUTION");
        resolutionLabel.setAlignmentX(0.5F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        resolutionPanel.add(resolutionLabel, gridBagConstraints);

        resolutionRadioButton600x400.setBackground(new java.awt.Color(0, 0, 0));
        resolutionButtonGroup.add(resolutionRadioButton600x400);
        resolutionRadioButton600x400.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        resolutionRadioButton600x400.setForeground(new java.awt.Color(255, 255, 255));
        resolutionRadioButton600x400.setText("600x400");
        resolutionRadioButton600x400.setAlignmentX(0.5F);
        resolutionRadioButton600x400.setSelected(true);
        resolutionRadioButton600x400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolutionRadioButton600x400ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        resolutionPanel.add(resolutionRadioButton600x400, gridBagConstraints);

        resolutionRadioButton900x600.setBackground(new java.awt.Color(0, 0, 0));
        resolutionButtonGroup.add(resolutionRadioButton900x600);
        resolutionRadioButton900x600.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        resolutionRadioButton900x600.setForeground(new java.awt.Color(255, 255, 255));
        resolutionRadioButton900x600.setText("900x600");
        resolutionRadioButton900x600.setAlignmentX(0.5F);
        resolutionRadioButton900x600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolutionRadioButton900x600ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        resolutionPanel.add(resolutionRadioButton900x600, gridBagConstraints);

        resolutionRadioButton1200x800.setBackground(new java.awt.Color(0, 0, 0));
        resolutionButtonGroup.add(resolutionRadioButton1200x800);
        resolutionRadioButton1200x800.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        resolutionRadioButton1200x800.setForeground(new java.awt.Color(255, 255, 255));
        resolutionRadioButton1200x800.setText("1200x800");
        resolutionRadioButton1200x800.setAlignmentX(0.5F);
        resolutionRadioButton1200x800.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resolutionRadioButton1200x800.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        resolutionRadioButton1200x800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolutionRadioButton1200x800ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        resolutionPanel.add(resolutionRadioButton1200x800, gridBagConstraints);

        internalOptionPanel.add(resolutionPanel);

        difficultPanel.setBackground(new java.awt.Color(0, 0, 0));
        difficultPanel.setOpaque(false);
        difficultPanel.setLayout(new java.awt.GridBagLayout());

        difficultLabel.setBackground(new java.awt.Color(0, 0, 0));
        difficultLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24));
        difficultLabel.setForeground(new java.awt.Color(255, 0, 0));
        difficultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        difficultLabel.setText("DIFFICULT");
        difficultLabel.setAlignmentX(0.5F);
        difficultLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        difficultPanel.add(difficultLabel, gridBagConstraints);

        difficultRadioButtonEasy.setBackground(new java.awt.Color(0, 0, 0));
        difficultButtonGroup.add(difficultRadioButtonEasy);
        difficultRadioButtonEasy.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        difficultRadioButtonEasy.setForeground(new java.awt.Color(255, 255, 255));
        difficultRadioButtonEasy.setText("Easy");
        difficultRadioButtonEasy.setAlignmentX(0.5F);
        difficultRadioButtonEasy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        difficultRadioButtonEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultRadioButtonEasyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        difficultPanel.add(difficultRadioButtonEasy, gridBagConstraints);

        difficultRadioButtonNormal.setBackground(new java.awt.Color(0, 0, 0));
        difficultButtonGroup.add(difficultRadioButtonNormal);
        difficultRadioButtonNormal.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        difficultRadioButtonNormal.setForeground(new java.awt.Color(255, 255, 255));
        difficultRadioButtonNormal.setText("Normal");
        difficultRadioButtonNormal.setAlignmentX(0.5F);
        difficultRadioButtonNormal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        difficultRadioButtonNormal.setSelected(true);
        difficultRadioButtonNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultRadioButtonNormalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        difficultPanel.add(difficultRadioButtonNormal, gridBagConstraints);

        difficultRadioButtonHard.setBackground(new java.awt.Color(0, 0, 0));
        difficultButtonGroup.add(difficultRadioButtonHard);
        difficultRadioButtonHard.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        difficultRadioButtonHard.setForeground(new java.awt.Color(255, 255, 255));
        difficultRadioButtonHard.setText("Hard");
        difficultRadioButtonHard.setAlignmentX(0.5F);
        difficultRadioButtonHard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        difficultRadioButtonHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultRadioButtonHardActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        difficultPanel.add(difficultRadioButtonHard, gridBagConstraints);

        internalOptionPanel.add(difficultPanel);

        wallsPanel.setBackground(new java.awt.Color(0, 0, 0));
        wallsPanel.setOpaque(false);
        wallsPanel.setLayout(new java.awt.GridBagLayout());

        wallsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 24));
        wallsLabel.setForeground(new java.awt.Color(255, 0, 0));
        wallsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wallsLabel.setText("WALLS");
        wallsLabel.setAlignmentX(0.5F);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        wallsPanel.add(wallsLabel, gridBagConstraints);

        wallsRadioButtonNo.setBackground(new java.awt.Color(0, 0, 0));
        wallsButtonGroup.add(wallsRadioButtonNo);
        wallsRadioButtonNo.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        wallsRadioButtonNo.setForeground(new java.awt.Color(255, 255, 255));
        wallsRadioButtonNo.setText("No walls");
        wallsRadioButtonNo.setAlignmentX(0.5F);
        wallsRadioButtonNo.setSelected(true);
        wallsRadioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wallsRadioButtonNoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        wallsPanel.add(wallsRadioButtonNo, gridBagConstraints);

        wallsRadioButtonPattern1.setBackground(new java.awt.Color(0, 0, 0));
        wallsButtonGroup.add(wallsRadioButtonPattern1);
        wallsRadioButtonPattern1.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        wallsRadioButtonPattern1.setForeground(new java.awt.Color(255, 255, 255));
        wallsRadioButtonPattern1.setText("Pattern 1");
        wallsRadioButtonPattern1.setAlignmentX(0.5F);
        wallsRadioButtonPattern1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wallsRadioButtonPattern1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        wallsPanel.add(wallsRadioButtonPattern1, gridBagConstraints);

        wallsRadioButtonPattern2.setBackground(new java.awt.Color(0, 0, 0));
        wallsButtonGroup.add(wallsRadioButtonPattern2);
        wallsRadioButtonPattern2.setFont(new java.awt.Font("Trebuchet MS", 0, 13));
        wallsRadioButtonPattern2.setForeground(new java.awt.Color(255, 255, 255));
        wallsRadioButtonPattern2.setText("Pattern 2");
        wallsRadioButtonPattern2.setAlignmentX(0.5F);
        wallsRadioButtonPattern2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wallsRadioButtonPattern2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        wallsRadioButtonPattern2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wallsRadioButtonPattern2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        wallsPanel.add(wallsRadioButtonPattern2, gridBagConstraints);

        internalOptionPanel.add(wallsPanel);

        backButton.setText("Back");
        backButton.setAlignmentX(0.5F);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(backButton))
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(internalOptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)))
                .addContainerGap())
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(internalOptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addGap(17, 17, 17))
        );

        chooseSingleSnakePanel.setBackground(new java.awt.Color(0, 0, 0));
        chooseSingleSnakePanel.setPreferredSize(new java.awt.Dimension(600, 400));
        chooseSingleSnakePanel.setLocation(0, 0);
        chooseSingleSnakePanel.setSize(chooseSingleSnakePanel.getPreferredSize());
        chooseSingleSnakePanel.setLayout(new java.awt.GridBagLayout());

        chooseSnakeTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        chooseSnakeTitle.setForeground(new java.awt.Color(255, 0, 0));
        chooseSnakeTitle.setText("CUSTOMIZE YOUR SNAKE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 50;
        chooseSingleSnakePanel.add(chooseSnakeTitle, gridBagConstraints);

        snakeOptionsPanel.setBackground(new java.awt.Color(0, 0, 0));
        snakeOptionsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        snakeOptionsPanel.setLayout(new java.awt.GridBagLayout());

        snakePreviewPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout snakePreviewPanelLayout = new javax.swing.GroupLayout(snakePreviewPanel);
        snakePreviewPanel.setLayout(snakePreviewPanelLayout);
        snakePreviewPanelLayout.setHorizontalGroup(
            snakePreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        snakePreviewPanelLayout.setVerticalGroup(
            snakePreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        snakeOptionsPanel.add(snakePreviewPanel, gridBagConstraints);

        snakeColorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Blue", "Yellow", "Green" }));
        snakeColorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeColorComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        snakeOptionsPanel.add(snakeColorComboBox, gridBagConstraints);

        snakePositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Up", "Down", "Left", "Right" }));
        snakePositionComboBox.setSelectedIndex(2);
        snakePositionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakePositionComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        snakeOptionsPanel.add(snakePositionComboBox, gridBagConstraints);

        snakeControlComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arrows", "WASD", "IJKL", "KeyPad" }));
        snakeControlComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeControlComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        snakeOptionsPanel.add(snakeControlComboBox, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Position:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        snakeOptionsPanel.add(jLabel1, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Preview:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        snakeOptionsPanel.add(jLabel2, gridBagConstraints);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Control:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        snakeOptionsPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Color:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        snakeOptionsPanel.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        chooseSingleSnakePanel.add(snakeOptionsPanel, gridBagConstraints);

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(50, 300, 0, 0);
        chooseSingleSnakePanel.add(startButton, gridBagConstraints);

        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 300);
        chooseSingleSnakePanel.add(backButton1, gridBagConstraints);

        chooseMultiSnakesPanel.setBackground(new java.awt.Color(0, 0, 0));
        chooseMultiSnakesPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        chooseMultiSnakesPanel.setLocation(0, 0);
        chooseMultiSnakesPanel.setSize(chooseMultiSnakesPanel.getPreferredSize());
        chooseMultiSnakesPanel.setLayout(new java.awt.GridBagLayout());

        chooseSnakeTitle1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        chooseSnakeTitle1.setForeground(new java.awt.Color(255, 0, 0));
        chooseSnakeTitle1.setText("CUSTOMIZE YOUR SNAKES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        chooseMultiSnakesPanel.add(chooseSnakeTitle1, gridBagConstraints);

        chooseSnakesInternalPanel1.setLayout(new javax.swing.BoxLayout(chooseSnakesInternalPanel1, javax.swing.BoxLayout.LINE_AXIS));

        snakeOptionsPanel1.setBackground(new java.awt.Color(0, 0, 0));
        snakeOptionsPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        snakeOptionsPanel1.setLayout(new java.awt.GridBagLayout());

        snakePreviewPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout snakePreviewPanel1Layout = new javax.swing.GroupLayout(snakePreviewPanel1);
        snakePreviewPanel1.setLayout(snakePreviewPanel1Layout);
        snakePreviewPanel1Layout.setHorizontalGroup(
            snakePreviewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        snakePreviewPanel1Layout.setVerticalGroup(
            snakePreviewPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel1.add(snakePreviewPanel1, gridBagConstraints);

        snakeColorComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Blue", "Yellow", "Green" }));
        snakeColorComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeColorComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel1.add(snakeColorComboBox1, gridBagConstraints);

        snakePositionComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Up", "Down", "Left", "Right" }));
        snakePositionComboBox1.setSelectedIndex(2);
        snakePositionComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakePositionComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel1.add(snakePositionComboBox1, gridBagConstraints);

        snakeControlComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arrows", "WASD", "IJKL", "KeyPad" }));
        snakeControlComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeControlComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel1.add(snakeControlComboBox1, gridBagConstraints);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Position:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Preview:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Control:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Color:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel1.add(jLabel8, gridBagConstraints);

        chooseSnakesInternalPanel1.add(snakeOptionsPanel1);

        snakeOptionsPanel2.setBackground(new java.awt.Color(0, 0, 0));
        snakeOptionsPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        snakeOptionsPanel2.setLayout(new java.awt.GridBagLayout());

        snakePreviewPanel2.setBackground(java.awt.Color.blue);

        javax.swing.GroupLayout snakePreviewPanel2Layout = new javax.swing.GroupLayout(snakePreviewPanel2);
        snakePreviewPanel2.setLayout(snakePreviewPanel2Layout);
        snakePreviewPanel2Layout.setHorizontalGroup(
            snakePreviewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        snakePreviewPanel2Layout.setVerticalGroup(
            snakePreviewPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel2.add(snakePreviewPanel2, gridBagConstraints);

        snakeColorComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Blue", "Yellow", "Green" }));
        snakeColorComboBox2.setSelectedIndex(1);
        snakeColorComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeColorComboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel2.add(snakeColorComboBox2, gridBagConstraints);

        snakePositionComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Up", "Down", "Left", "Right" }));
        snakePositionComboBox2.setSelectedIndex(3);
        snakePositionComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakePositionComboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel2.add(snakePositionComboBox2, gridBagConstraints);

        snakeControlComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arrows", "WASD", "IJKL", "KeyPad" }));
        snakeControlComboBox2.setSelectedIndex(1);
        snakeControlComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeControlComboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel2.add(snakeControlComboBox2, gridBagConstraints);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Position:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel2.add(jLabel9, gridBagConstraints);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preview:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel2.add(jLabel10, gridBagConstraints);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Control:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel2.add(jLabel11, gridBagConstraints);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Color:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel2.add(jLabel12, gridBagConstraints);

        chooseSnakesInternalPanel1.add(snakeOptionsPanel2);

        snakeOptionsPanel3.setBackground(new java.awt.Color(0, 0, 0));
        snakeOptionsPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        snakeOptionsPanel3.setLayout(new java.awt.GridBagLayout());

        snakePreviewPanel3.setBackground(java.awt.Color.yellow);

        javax.swing.GroupLayout snakePreviewPanel3Layout = new javax.swing.GroupLayout(snakePreviewPanel3);
        snakePreviewPanel3.setLayout(snakePreviewPanel3Layout);
        snakePreviewPanel3Layout.setHorizontalGroup(
            snakePreviewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        snakePreviewPanel3Layout.setVerticalGroup(
            snakePreviewPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel3.add(snakePreviewPanel3, gridBagConstraints);

        snakeColorComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Blue", "Yellow", "Green" }));
        snakeColorComboBox3.setSelectedIndex(2);
        snakeColorComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeColorComboBox3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel3.add(snakeColorComboBox3, gridBagConstraints);

        snakePositionComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Up", "Down", "Left", "Right" }));
        snakePositionComboBox3.setSelectedIndex(0);
        snakePositionComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakePositionComboBox3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel3.add(snakePositionComboBox3, gridBagConstraints);

        snakeControlComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arrows", "WASD", "IJKL", "KeyPad" }));
        snakeControlComboBox3.setSelectedIndex(2);
        snakeControlComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeControlComboBox3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel3.add(snakeControlComboBox3, gridBagConstraints);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Position:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel3.add(jLabel13, gridBagConstraints);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Preview:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel3.add(jLabel14, gridBagConstraints);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Control:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel3.add(jLabel15, gridBagConstraints);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Color:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel3.add(jLabel16, gridBagConstraints);

        chooseSnakesInternalPanel1.add(snakeOptionsPanel3);

        snakeOptionsPanel4.setBackground(new java.awt.Color(0, 0, 0));
        snakeOptionsPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        snakeOptionsPanel4.setLayout(new java.awt.GridBagLayout());

        snakePreviewPanel4.setBackground(java.awt.Color.green);

        javax.swing.GroupLayout snakePreviewPanel4Layout = new javax.swing.GroupLayout(snakePreviewPanel4);
        snakePreviewPanel4.setLayout(snakePreviewPanel4Layout);
        snakePreviewPanel4Layout.setHorizontalGroup(
            snakePreviewPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        snakePreviewPanel4Layout.setVerticalGroup(
            snakePreviewPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel4.add(snakePreviewPanel4, gridBagConstraints);

        snakeColorComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Blue", "Yellow", "Green" }));
        snakeColorComboBox4.setSelectedIndex(3);
        snakeColorComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeColorComboBox4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel4.add(snakeColorComboBox4, gridBagConstraints);

        snakePositionComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Up", "Down", "Left", "Right" }));
        snakePositionComboBox4.setSelectedIndex(1);
        snakePositionComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakePositionComboBox4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel4.add(snakePositionComboBox4, gridBagConstraints);

        snakeControlComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arrows", "WASD", "IJKL", "KeyPad" }));
        snakeControlComboBox4.setSelectedIndex(3);
        snakeControlComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeControlComboBox4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel4.add(snakeControlComboBox4, gridBagConstraints);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Position:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel4.add(jLabel17, gridBagConstraints);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Preview:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel4.add(jLabel18, gridBagConstraints);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Control:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel4.add(jLabel19, gridBagConstraints);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Color:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        snakeOptionsPanel4.add(jLabel20, gridBagConstraints);

        chooseSnakesInternalPanel1.add(snakeOptionsPanel4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 20;
        chooseMultiSnakesPanel.add(chooseSnakesInternalPanel1, gridBagConstraints);

        startButton1.setText("Start");
        startButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(50, 300, 0, 0);
        chooseMultiSnakesPanel.add(startButton1, gridBagConstraints);

        backButton2.setText("Back");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 300);
        chooseMultiSnakesPanel.add(backButton2, gridBagConstraints);

        snakeNumberComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4" }));
        snakeNumberComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snakeNumberComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 0);
        chooseMultiSnakesPanel.add(snakeNumberComboBox, gridBagConstraints);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Number of players:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
        chooseMultiSnakesPanel.add(jLabel21, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        mainPanel.setLayout(new java.awt.GridBagLayout());

        singlePlayerButton.setBackground(new java.awt.Color(0, 0, 0));
        singlePlayerButton.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        singlePlayerButton.setForeground(new java.awt.Color(255, 0, 0));
        singlePlayerButton.setText("SINGLE PLAYER");
        singlePlayerButton.setBorder(null);
        singlePlayerButton.setBorderPainted(false);
        singlePlayerButton.setContentAreaFilled(false);
        singlePlayerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        singlePlayerButton.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/snake.png"))); // NOI18N
        singlePlayerButton.setFocusable(false);
        singlePlayerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                singlePlayerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                singlePlayerButtonMouseExited(evt);
            }
        });
        singlePlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singlePlayerButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        mainPanel.add(singlePlayerButton, gridBagConstraints);

        multiplayerButton.setBackground(new java.awt.Color(0, 0, 0));
        multiplayerButton.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        multiplayerButton.setForeground(new java.awt.Color(255, 0, 0));
        multiplayerButton.setText("MULTIPLAYER");
        multiplayerButton.setBorder(null);
        multiplayerButton.setBorderPainted(false);
        multiplayerButton.setContentAreaFilled(false);
        multiplayerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplayerButton.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/snake.png"))); // NOI18N
        multiplayerButton.setFocusable(false);
        multiplayerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                multiplayerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                multiplayerButtonMouseExited(evt);
            }
        });
        multiplayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayerButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        mainPanel.add(multiplayerButton, gridBagConstraints);

        optionsButton.setBackground(new java.awt.Color(0, 0, 0));
        optionsButton.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        optionsButton.setForeground(new java.awt.Color(255, 0, 0));
        optionsButton.setText("OPTIONS");
        optionsButton.setBorder(null);
        optionsButton.setBorderPainted(false);
        optionsButton.setContentAreaFilled(false);
        optionsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        optionsButton.setFocusable(false);
        optionsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionsButtonMouseExited(evt);
            }
        });
        optionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        mainPanel.add(optionsButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void singlePlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singlePlayerButtonActionPerformed
        this.field.setMode(gameMode.SINGLE);
        this.chooseSingleSnakePanel.setVisible(true);
        this.add(chooseSingleSnakePanel);
        this.jSnakes.add(new JSnake(respawn.LEFT, java.awt.Color.white, jsnake.Head.direction.RIGHT, JSnake.keyConfiguration.ARROWS));
        this.mainPanel.setVisible(false);
    }//GEN-LAST:event_singlePlayerButtonActionPerformed

    private void optionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsButtonActionPerformed
        this.mainPanel.setVisible(false);
        this.optionsPanel.setVisible(true);
        this.add(this.optionsPanel);
    }//GEN-LAST:event_optionsButtonActionPerformed

    private void resolutionRadioButton600x400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolutionRadioButton600x400ActionPerformed
        this.field.setSize(600, 400);
    }//GEN-LAST:event_resolutionRadioButton600x400ActionPerformed

    private void resolutionRadioButton900x600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolutionRadioButton900x600ActionPerformed
        this.field.setSize(900, 600);
    }//GEN-LAST:event_resolutionRadioButton900x600ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.mainPanel.setVisible(true);
        this.optionsPanel.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void resolutionRadioButton1200x800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolutionRadioButton1200x800ActionPerformed
        this.field.setSize(1200, 800);
    }//GEN-LAST:event_resolutionRadioButton1200x800ActionPerformed

    private void difficultRadioButtonHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultRadioButtonHardActionPerformed
        this.field.setTimer(60);
    }//GEN-LAST:event_difficultRadioButtonHardActionPerformed

    private void difficultRadioButtonNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultRadioButtonNormalActionPerformed
        this.field.setTimer(100);
    }//GEN-LAST:event_difficultRadioButtonNormalActionPerformed

    private void difficultRadioButtonEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultRadioButtonEasyActionPerformed
        this.field.setTimer(200);
    }//GEN-LAST:event_difficultRadioButtonEasyActionPerformed

    private void multiplayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplayerButtonActionPerformed
        this.field.setMode(gameMode.MULTI);
        this.chooseMultiSnakesPanel.setVisible(true);
        this.add(chooseMultiSnakesPanel);
        this.snakeOptionsPanel3.setVisible(false);
        this.snakeOptionsPanel4.setVisible(false);
        this.jSnakes.add(new JSnake(respawn.LEFT, java.awt.Color.white, jsnake.Head.direction.RIGHT, JSnake.keyConfiguration.ARROWS));
        this.jSnakes.add(new JSnake(respawn.RIGHT, java.awt.Color.blue, jsnake.Head.direction.LEFT, JSnake.keyConfiguration.WASD));
        this.jSnakes.add(new JSnake(respawn.UP, java.awt.Color.yellow, jsnake.Head.direction.DOWN, JSnake.keyConfiguration.IJKL));
        this.jSnakes.add(new JSnake(respawn.DOWN, java.awt.Color.green, jsnake.Head.direction.UP, JSnake.keyConfiguration.KP));
        this.mainPanel.setVisible(false);
    }//GEN-LAST:event_multiplayerButtonActionPerformed

    private void wallsRadioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wallsRadioButtonNoActionPerformed
        this.field.setWallLayout(wallLayouts.NO_WALLS);
    }//GEN-LAST:event_wallsRadioButtonNoActionPerformed

    private void wallsRadioButtonPattern1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wallsRadioButtonPattern1ActionPerformed
        this.field.setWallLayout(wallLayouts.PATTERN1);
    }//GEN-LAST:event_wallsRadioButtonPattern1ActionPerformed

    private void wallsRadioButtonPattern2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wallsRadioButtonPattern2ActionPerformed
        this.field.setWallLayout(wallLayouts.PATTERN2);
    }//GEN-LAST:event_wallsRadioButtonPattern2ActionPerformed

    private void snakeColorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeColorComboBoxActionPerformed
        setSnakeColor(0, snakeColorComboBox);
        this.snakePreviewPanel.setBackground(this.jSnakes.get(0).color);
    }//GEN-LAST:event_snakeColorComboBoxActionPerformed

    private void snakePositionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakePositionComboBoxActionPerformed
        setSnakePosition(0, snakePositionComboBox);
    }//GEN-LAST:event_snakePositionComboBoxActionPerformed

    private void snakeControlComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeControlComboBoxActionPerformed
        setSnakeControl(0, snakeControlComboBox);
    }//GEN-LAST:event_snakeControlComboBoxActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        this.mainPanel.setVisible(true);
        this.chooseSingleSnakePanel.setVisible(false);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        this.chooseSingleSnakePanel.setVisible(false);
        this.smartSetSize(this.field.getWidth(), this.field.getHeight());
        this.centerFrame();
        this.add(this.field);
        this.field.addSnake(this.jSnakes.get(0));
        this.field.gameStart();
    }//GEN-LAST:event_startButtonActionPerformed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        this.chooseMultiSnakesPanel.setVisible(false);
        this.mainPanel.setVisible(true);
    }//GEN-LAST:event_backButton2ActionPerformed

    private void startButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButton1ActionPerformed
        if (this.checkComboConflict(new javax.swing.JComboBox[]{this.snakeColorComboBox1, this.snakeColorComboBox2, this.snakeColorComboBox3, this.snakeColorComboBox4})) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: Snakes' colors Conflict.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(Screen.class.getResource("snake.png")));
        } else if (this.checkComboConflict(new javax.swing.JComboBox[]{this.snakePositionComboBox1, this.snakePositionComboBox2, this.snakePositionComboBox3, this.snakePositionComboBox4})) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: Snakes' positions Conflict.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(Screen.class.getResource("snake.png")));
        } else if (this.checkComboConflict(new javax.swing.JComboBox[]{this.snakeControlComboBox1, this.snakeControlComboBox2, this.snakeControlComboBox3, this.snakeControlComboBox4})) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: Snakes' control keys Conflict.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(Screen.class.getResource("snake.png")));
        } else {
            this.chooseMultiSnakesPanel.setVisible(false);
            this.smartSetSize(this.field.getWidth(), this.field.getHeight());
            this.centerFrame();
            this.add(this.field);
            for (int i = 0; i < this.snakeNumber; i++) {
                this.field.addSnake(this.jSnakes.get(i));
            }
            this.field.gameStart();
        }
    }//GEN-LAST:event_startButton1ActionPerformed

    private void snakeNumberComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeNumberComboBoxActionPerformed
        switch (snakeNumberComboBox.getSelectedIndex()) {
            case 0:
                this.snakeOptionsPanel3.setVisible(false);
                this.snakeOptionsPanel4.setVisible(false);
                this.snakeNumber = 2;
                break;
            case 1:
                this.snakeOptionsPanel3.setVisible(true);
                this.snakeOptionsPanel4.setVisible(false);
                this.snakeNumber = 3;
                break;
            case 2:
                this.snakeOptionsPanel3.setVisible(true);
                this.snakeOptionsPanel4.setVisible(true);
                this.snakeNumber = 4;
                break;
        }
    }//GEN-LAST:event_snakeNumberComboBoxActionPerformed

    private void snakeColorComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeColorComboBox1ActionPerformed
        this.setSnakeColor(0, snakeColorComboBox1);
        this.snakePreviewPanel1.setBackground(this.jSnakes.get(0).color);
    }//GEN-LAST:event_snakeColorComboBox1ActionPerformed

    private void snakeColorComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeColorComboBox2ActionPerformed
        this.setSnakeColor(1, snakeColorComboBox2);
        this.snakePreviewPanel2.setBackground(this.jSnakes.get(1).color);
    }//GEN-LAST:event_snakeColorComboBox2ActionPerformed

    private void snakeColorComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeColorComboBox3ActionPerformed
        this.setSnakeColor(2, snakeColorComboBox3);
        this.snakePreviewPanel3.setBackground(this.jSnakes.get(2).color);
    }//GEN-LAST:event_snakeColorComboBox3ActionPerformed

    private void snakeColorComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeColorComboBox4ActionPerformed
        this.setSnakeColor(3, snakeColorComboBox4);
        this.snakePreviewPanel4.setBackground(this.jSnakes.get(3).color);
    }//GEN-LAST:event_snakeColorComboBox4ActionPerformed

    private void snakePositionComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakePositionComboBox1ActionPerformed
        this.setSnakePosition(0, snakePositionComboBox1);
    }//GEN-LAST:event_snakePositionComboBox1ActionPerformed

    private void snakePositionComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakePositionComboBox2ActionPerformed
        this.setSnakePosition(1, snakePositionComboBox2);
    }//GEN-LAST:event_snakePositionComboBox2ActionPerformed

    private void snakePositionComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakePositionComboBox3ActionPerformed
        this.setSnakePosition(2, snakePositionComboBox3);
    }//GEN-LAST:event_snakePositionComboBox3ActionPerformed

    private void snakePositionComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakePositionComboBox4ActionPerformed
        this.setSnakePosition(3, snakePositionComboBox4);
    }//GEN-LAST:event_snakePositionComboBox4ActionPerformed

    private void snakeControlComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeControlComboBox1ActionPerformed
        this.setSnakeControl(0, snakeControlComboBox1);
    }//GEN-LAST:event_snakeControlComboBox1ActionPerformed

    private void snakeControlComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeControlComboBox2ActionPerformed
        this.setSnakeControl(1, snakeControlComboBox2);
    }//GEN-LAST:event_snakeControlComboBox2ActionPerformed

    private void snakeControlComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeControlComboBox3ActionPerformed
        this.setSnakeControl(2, snakeControlComboBox3);
    }//GEN-LAST:event_snakeControlComboBox3ActionPerformed

    private void snakeControlComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snakeControlComboBox4ActionPerformed
        this.setSnakeControl(3, snakeControlComboBox4);
    }//GEN-LAST:event_snakeControlComboBox4ActionPerformed

    private void singlePlayerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlePlayerButtonMouseEntered
        this.singlePlayerButton.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_singlePlayerButtonMouseEntered

    private void singlePlayerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singlePlayerButtonMouseExited
        this.singlePlayerButton.setForeground(java.awt.Color.red);
    }//GEN-LAST:event_singlePlayerButtonMouseExited

    private void multiplayerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplayerButtonMouseEntered
        this.multiplayerButton.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_multiplayerButtonMouseEntered

    private void multiplayerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplayerButtonMouseExited
        this.multiplayerButton.setForeground(java.awt.Color.red);
    }//GEN-LAST:event_multiplayerButtonMouseExited

    private void optionsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsButtonMouseEntered
        this.optionsButton.setForeground(java.awt.Color.white);
    }//GEN-LAST:event_optionsButtonMouseEntered

    private void optionsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsButtonMouseExited
        this.optionsButton.setForeground(java.awt.Color.red);
    }//GEN-LAST:event_optionsButtonMouseExited

    private void setSnakeColor(int pIndex, javax.swing.JComboBox pComboBox) {
        switch (pComboBox.getSelectedIndex()) {
            case 0:
                this.jSnakes.get(pIndex).color = java.awt.Color.WHITE;
                break;
            case 1:
                this.jSnakes.get(pIndex).color = java.awt.Color.BLUE;
                break;
            case 2:
                this.jSnakes.get(pIndex).color = java.awt.Color.YELLOW;
                break;
            case 3:
                this.jSnakes.get(pIndex).color = java.awt.Color.GREEN;
                break;
        }
    }

    private void setSnakePosition(int pIndex, javax.swing.JComboBox pComboBox) {
        switch (pComboBox.getSelectedIndex()) {
            case 0:
                this.jSnakes.get(pIndex).respawn = respawn.UP;
                this.jSnakes.get(pIndex).direction = direction.DOWN;
                break;
            case 1:
                this.jSnakes.get(pIndex).respawn = respawn.DOWN;
                this.jSnakes.get(pIndex).direction = direction.UP;
                break;
            case 2:
                this.jSnakes.get(pIndex).respawn = respawn.LEFT;
                this.jSnakes.get(pIndex).direction = direction.RIGHT;
                break;
            case 3:
                this.jSnakes.get(pIndex).respawn = respawn.RIGHT;
                this.jSnakes.get(pIndex).direction = direction.LEFT;
                break;
        }
    }

    private void setSnakeControl(int pIndex, javax.swing.JComboBox pComboBox) {
        switch (pComboBox.getSelectedIndex()) {
            case 0:
                this.jSnakes.get(pIndex).setKeyListener(JSnake.keyConfiguration.ARROWS);
                break;
            case 1:
                this.jSnakes.get(pIndex).setKeyListener(JSnake.keyConfiguration.WASD);
                break;
            case 2:
                this.jSnakes.get(pIndex).setKeyListener(JSnake.keyConfiguration.IJKL);
                break;
            case 3:
                this.jSnakes.get(pIndex).setKeyListener(JSnake.keyConfiguration.KP);
                break;
        }
    }

    private boolean checkComboConflict(javax.swing.JComboBox[] pComboBox) {
        for (int i = 0; i < this.snakeNumber; i++) {
            for (int j = i + 1; j < this.snakeNumber; j++) {
                if (pComboBox[i].getSelectedIndex() == pComboBox[j].getSelectedIndex()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void centerFrame() {
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int) (screenSize.getWidth() - this.getWidth()) / 2, (int) (screenSize.getHeight() - this.getHeight()) / 2);
    }

    public void smartSetSize(int pWidth, int pHeight) {
        this.setSize(this.getWidth() - this.getContentPane().getWidth() + pWidth, this.getHeight() - this.getContentPane().getHeight() + pHeight);
        this.getContentPane().setSize(pWidth, pWidth);
    }

    protected enum gameMode {

        SINGLE, MULTI
    }

    protected enum respawn {

        UP, DOWN, RIGHT, LEFT;
    }
    protected static int CELL;

    class JField extends javax.swing.JPanel {

        private class TimerAction implements java.awt.event.ActionListener {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                for (Snake s : field.getSnakes()) {
                    if (s.eatItself() || field.wallBang() || field.snakeBang()) {
                        timer.stop();
                    } else {
                        field.checkTeleport(s);
                        //Controllo se il serpente ha preso il cibo
                        for (Position f : field.getFoods()) {
                            if (s.head().getLocation().equals(f.getLocation())) {
                                f.setLocation(field.newFoodLocation());
                                s.eat();
                                Panel tail = new Panel(s.tail());
                                panels.add(tail);
                                add(tail);
                            }
                        }
                        s.move();
                    }
                }
                for (int i = 0; i < panels.size(); i++) {
                    panels.get(i).updateLocation();
                }
            }
        }

        private class TimerAction2 implements java.awt.event.ActionListener {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                for (Snake s : field.getSnakes()) {
                    if (s.eatItself() || field.wallBang() || field.snakeBang()) {
                        s.reset();
                        for (Panel p : panels) {
                            if (p == null) {
                                remove(p);
                            }
                        }
                    } else {
                        field.checkTeleport(s);
                        //Controllo se il serpente ha preso il cibo
                        for (Position f : field.getFoods()) {
                            if (s.head().getLocation().equals(f.getLocation())) {
                                f.setLocation(field.newFoodLocation());
                                s.eat();
                                Panel tail = new Panel(s.tail());
                                panels.add(tail);
                                add(tail);
                            }
                        }
                        s.move();
                    }
                }
                for (int i = 0; i < panels.size(); i++) {
                    panels.get(i).updateLocation();
                }
            }
        }
        private javax.swing.Timer timer;
        private Field field;
        private java.util.ArrayList<Panel> panels;
        private java.util.ArrayList<JSnake> snakes;
        private wallLayouts wallLayout;
        private int timerMilliseconds;

        public JField(int pWidth, int pHeight) {
            this.setLayout(null);
            this.setBounds(0, 0, pWidth, pHeight);
            this.setBackground(java.awt.Color.black);
            this.field = new Field();
            this.setWallLayout(wallLayouts.NO_WALLS);
            this.setTimer(100);
            this.panels = new java.util.ArrayList<Panel>();
            this.snakes = new java.util.ArrayList<JSnake>();
            this.timer = new javax.swing.Timer(100, new TimerAction());
        }

        public void setMode(gameMode mode) {
            if (mode == gameMode.SINGLE) {
                this.field.setSize(30, 20);
            } else {
                this.field.setSize(60, 40);
            }
            CELL = this.getWidth() / this.field.WIDTH_UNIT;
            this.timer.removeActionListener(this.timer.getActionListeners()[0]);
            this.timer.addActionListener(new TimerAction2());
        }

        public void gameStart() {
            for (JSnake j : this.snakes) {
                j.setSnake(this.field.WIDTH_UNIT, this.field.HEIGHT_UNIT);
                this.field.addSnake(j.snake);
                this.addKeyListener(j.keyListener);
            }
            this.field.setFoods(this.snakes.size());
            this.field.setWalls(this.wallLayout);
            this.timer.setDelay(this.timerMilliseconds);
            for (int i = 0; i < this.field.getSnakes().size(); i++) {
                Snake s = this.field.getSnakes().get(i);
                Panel heads = new Panel(s.head());
                this.panels.add(heads);
                this.add(heads);
            }
            for (Position f : this.field.getFoods()) {
                Panel foods = new Panel(f);
                this.panels.add(foods);
                this.add(foods);
            }
            for (Position w : this.field.getWalls()) {
                this.add(new Panel(w));
            }
            this.timer.start();
            requestFocus();
        }

        public void addSnake(JSnake pJSnake) {
            this.snakes.add(pJSnake);
        }

        public void setTimer(int timerMilliseconds) {
            this.timerMilliseconds = timerMilliseconds;
        }

        public void setWallLayout(wallLayouts wallLayout) {
            this.wallLayout = wallLayout;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton backButton2;
    private javax.swing.JPanel chooseMultiSnakesPanel;
    private javax.swing.JPanel chooseSingleSnakePanel;
    private javax.swing.JLabel chooseSnakeTitle;
    private javax.swing.JLabel chooseSnakeTitle1;
    private javax.swing.JPanel chooseSnakesInternalPanel1;
    private javax.swing.ButtonGroup difficultButtonGroup;
    private javax.swing.JLabel difficultLabel;
    private javax.swing.JPanel difficultPanel;
    private javax.swing.JRadioButton difficultRadioButtonEasy;
    private javax.swing.JRadioButton difficultRadioButtonHard;
    private javax.swing.JRadioButton difficultRadioButtonNormal;
    private javax.swing.JPanel internalOptionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton multiplayerButton;
    private javax.swing.JButton optionsButton;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.ButtonGroup resolutionButtonGroup;
    private javax.swing.JLabel resolutionLabel;
    private javax.swing.JPanel resolutionPanel;
    private javax.swing.JRadioButton resolutionRadioButton1200x800;
    private javax.swing.JRadioButton resolutionRadioButton600x400;
    private javax.swing.JRadioButton resolutionRadioButton900x600;
    private javax.swing.JButton singlePlayerButton;
    private javax.swing.JComboBox snakeColorComboBox;
    private javax.swing.JComboBox snakeColorComboBox1;
    private javax.swing.JComboBox snakeColorComboBox2;
    private javax.swing.JComboBox snakeColorComboBox3;
    private javax.swing.JComboBox snakeColorComboBox4;
    private javax.swing.JComboBox snakeControlComboBox;
    private javax.swing.JComboBox snakeControlComboBox1;
    private javax.swing.JComboBox snakeControlComboBox2;
    private javax.swing.JComboBox snakeControlComboBox3;
    private javax.swing.JComboBox snakeControlComboBox4;
    private javax.swing.JComboBox snakeNumberComboBox;
    private javax.swing.JPanel snakeOptionsPanel;
    private javax.swing.JPanel snakeOptionsPanel1;
    private javax.swing.JPanel snakeOptionsPanel2;
    private javax.swing.JPanel snakeOptionsPanel3;
    private javax.swing.JPanel snakeOptionsPanel4;
    private javax.swing.JComboBox snakePositionComboBox;
    private javax.swing.JComboBox snakePositionComboBox1;
    private javax.swing.JComboBox snakePositionComboBox2;
    private javax.swing.JComboBox snakePositionComboBox3;
    private javax.swing.JComboBox snakePositionComboBox4;
    private javax.swing.JPanel snakePreviewPanel;
    private javax.swing.JPanel snakePreviewPanel1;
    private javax.swing.JPanel snakePreviewPanel2;
    private javax.swing.JPanel snakePreviewPanel3;
    private javax.swing.JPanel snakePreviewPanel4;
    private javax.swing.JButton startButton;
    private javax.swing.JButton startButton1;
    private javax.swing.ButtonGroup wallsButtonGroup;
    private javax.swing.JLabel wallsLabel;
    private javax.swing.JPanel wallsPanel;
    private javax.swing.JRadioButton wallsRadioButtonNo;
    private javax.swing.JRadioButton wallsRadioButtonPattern1;
    private javax.swing.JRadioButton wallsRadioButtonPattern2;
    // End of variables declaration//GEN-END:variables
}
