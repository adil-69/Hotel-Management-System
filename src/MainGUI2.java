import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
public class MainGUI2 extends javax.swing.JFrame {

    public MainGUI2() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        roomInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        customerInfo = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        employeeInfo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        administrator = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        roomBook = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel81 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel111 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel112 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        enterEmployee = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel99 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jCheckBox5 = new javax.swing.JCheckBox();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel100 = new javax.swing.JLabel();
        editEmployee = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel107 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel87 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jCheckBox4 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        restaurent = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton24 = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        bookingRoom = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Hôtelière");
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(880, 600));

        jPanel2.setBackground(new java.awt.Color(40, 55, 71));
        jPanel2.setAutoscrolls(true);
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_60.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Onyx", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 220, 111));
        jLabel3.setText("Gestion Hôtelière");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3)
        );

        jLabel3.getAccessibleContext().setAccessibleName("the champ hotel");
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setBackground(new java.awt.Color(40, 55, 71));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard_24.png"))); // NOI18N
        jLabel2.setText("Tableau De Bord");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room_24.png"))); // NOI18N
        jLabel4.setText("Résérver Une Chambre");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer_24.png"))); // NOI18N
        jLabel5.setText("Les clients");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee_24.png"))); // NOI18N
        jLabel6.setText("Les employeés");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin_24.png"))); // NOI18N
        jLabel7.setText("L'administrateur");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info_24.png"))); // NOI18N
        jLabel46.setText("A propos de chambre");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        jButton1.setText("Déconnexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° chambre", "Type", "prix (MAD/nuit)", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setText("Information du chambre");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel67.setText("Chambre N°:");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel68.setText("Type :");

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luxury Room", "AC Room", "N-AC Room", "Classic Room" }));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Ajouter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel69.setText("N° Chambre:");

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("Supprimer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel70.setText("Prix:");

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel77.setText("MAD/Nuit");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68)
                            .addComponent(jLabel70))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel69)
                                .addGap(32, 32, 32)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel77)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jButton4)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roomInfoLayout = new javax.swing.GroupLayout(roomInfo);
        roomInfo.setLayout(roomInfoLayout);
        roomInfoLayout.setHorizontalGroup(
            roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomInfoLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        roomInfoLayout.setVerticalGroup(
            roomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomInfoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.add(roomInfo, "card7");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setText("Information de client");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° chambre", "Nom", "N° téléphone", "Totale", "Argent soumis", "Check-In"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMaxWidth(75);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(80);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("Check Out");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel73.setText("chambre n°");

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("afficher les détailles");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton25.setText("Restaurant");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel73)
                .addGap(26, 26, 26)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(48, 48, 48))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(jButton13)
                    .addComponent(jButton8)
                    .addComponent(jButton25))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout customerInfoLayout = new javax.swing.GroupLayout(customerInfo);
        customerInfo.setLayout(customerInfoLayout);
        customerInfoLayout.setHorizontalGroup(
            customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerInfoLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        customerInfoLayout.setVerticalGroup(
            customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerInfoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.add(customerInfo, "card4");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Employee Information");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Employee Name ", "occupation", "N° téléphone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton14.setText("Ajouter employé");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton15.setText("ouvrir les détaille de l'employé");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout employeeInfoLayout = new javax.swing.GroupLayout(employeeInfo);
        employeeInfo.setLayout(employeeInfoLayout);
        employeeInfoLayout.setHorizontalGroup(
            employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeInfoLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        employeeInfoLayout.setVerticalGroup(
            employeeInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeInfoLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.add(employeeInfo, "card5");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Administrateur");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom d'utilisateur", " adresse mail ", "N° téléphone", "Genre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton17.setText("supprimer Tous");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel124.setBackground(new java.awt.Color(255, 0, 0));
        jLabel124.setForeground(new java.awt.Color(255, 0, 0));
        jLabel124.setText("Avertissement!");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel124)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton17)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout administratorLayout = new javax.swing.GroupLayout(administrator);
        administrator.setLayout(administratorLayout);
        administratorLayout.setHorizontalGroup(
            administratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administratorLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(administratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        administratorLayout.setVerticalGroup(
            administratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administratorLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.add(administrator, "card6");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setText("jLabel49");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel50.setText("Chambre N°");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel51.setText("Prénom");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel52.setText("ID Preuve");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel53.setText("ID N° ");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel54.setText("Email ");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel55.setText("Phone N°.");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton9.setText("Check");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel56.setText("Address");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel57.setText("Total Night");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNI", "contrat mariage ", "Passport", "Voter ID", "permis de conduite" }));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jCheckBox1.setText("Kids");

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("Check-In");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel71.setText("Submitted Money");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel72.setText(" ");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel78.setText("Nom");

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel81.setText("citoyen");

        jComboBox13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marrocain", "autres" }));

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel111.setText("Adultes");

        jComboBox14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel112.setText("Repas");

        jRadioButton5.setText("Non-Veg");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setSelected(true);
        jRadioButton6.setText("Veg");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel49)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(103, 103, 103)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(97, 97, 97)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(113, 113, 113)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel53)
                        .addGap(92, 92, 92)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(113, 113, 113)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel55)
                        .addGap(95, 95, 95)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(111, 111, 111)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel112))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(119, 119, 119)
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel111)
                                .addGap(126, 126, 126)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jRadioButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton5))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox14, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel72)))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel50))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel78))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55))))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel111))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox1)
                        .addComponent(jLabel57)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel71))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel112)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton5))
                        .addGap(26, 26, 26)
                        .addComponent(jButton10)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roomBookLayout = new javax.swing.GroupLayout(roomBook);
        roomBook.setLayout(roomBookLayout);
        roomBookLayout.setHorizontalGroup(
            roomBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomBookLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        roomBookLayout.setVerticalGroup(
            roomBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomBookLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel3.add(roomBook, "card8");

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setText("ajouter Employé");
        jPanel6.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel59.setText("Prénom");
        jPanel6.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 180, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 180, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel60.setText("Email ID");
        jPanel6.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel61.setText("Phone N°");
        jPanel6.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel6.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 180, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel62.setText("ID Preuve");
        jPanel6.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel6.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 180, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel63.setText("CIN");
        jPanel6.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel64.setText("Genre");
        jPanel6.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Féminin" }));
        jPanel6.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, -1));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNI", "contrat mariage ", "Passport", "Voter ID", "permis de conduite" }));
        jPanel6.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 180, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setText("Ajouter Employee");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("Reset");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 111, -1));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel89.setText("Nom ");
        jPanel6.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel6.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 180, -1));

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel90.setText("pére/marie Nom");
        jPanel6.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel6.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 180, -1));

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel96.setText("service nuit");
        jPanel6.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel97.setText("travail");
        jPanel6.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel98.setText("Addresse");
        jPanel6.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jComboBox11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Manager", "Accountant", "Worker", "Driver" }));
        jPanel6.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, -1));

        jComboBox12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Age", "18-25", "26-35", "36-50", "50+" }));
        jPanel6.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, -1));

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel99.setText("Salaire (MAD/Mois)");
        jPanel6.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel6.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jScrollPane9.setViewportView(jTextArea5);

        jPanel6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 180, -1));

        jCheckBox5.setText("identique à l'adresse permanante");
        jPanel6.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jRadioButton3.setText("oui");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Non");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel100.setText("Age");
        jPanel6.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        javax.swing.GroupLayout enterEmployeeLayout = new javax.swing.GroupLayout(enterEmployee);
        enterEmployee.setLayout(enterEmployeeLayout);
        enterEmployeeLayout.setHorizontalGroup(
            enterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterEmployeeLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        enterEmployeeLayout.setVerticalGroup(
            enterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterEmployeeLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.add(enterEmployee, "card9");

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel94.setText("Information Employé");
        jPanel13.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton21.setText("Maj Employeé");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel107.setText("ID");
        jPanel13.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton22.setText("Supprimer Employee");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 130, -1));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel74.setText("prénom");
        jPanel13.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField7.setEnabled(false);
        jPanel13.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 180, -1));

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel13.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 180, -1));

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel79.setText("Email ID");
        jPanel13.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel80.setText("Phone N°.");
        jPanel13.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel13.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 180, -1));

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel82.setText("ID Preuve");
        jPanel13.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField22.setEnabled(false);
        jPanel13.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 180, -1));

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel83.setText("service nuits");
        jPanel13.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel84.setText("Genre");
        jPanel13.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel85.setText("travail");
        jPanel13.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel86.setText("Addresse");
        jPanel13.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jComboBox7.setEnabled(false);
        jPanel13.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, -1));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Manager", "Accountant", "Worker", "Driver" }));
        jPanel13.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, -1));

        jComboBox9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Age", "18-25", "26-35", "36-50", "50+" }));
        jPanel13.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, -1));

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel87.setText("Salaire (MAD/mois)");
        jPanel13.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel13.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 180, -1));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel91.setText("Nom");
        jPanel13.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField27.setEnabled(false);
        jPanel13.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 180, -1));

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel93.setText("Pére/Marie Nom");
        jPanel13.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel13.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 180, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        jPanel13.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 180, -1));

        jCheckBox4.setText("identique à l'adresse permanante");
        jPanel13.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jRadioButton1.setText("oui");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel13.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        jRadioButton2.setText("Non");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel13.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel88.setText("ID Number");
        jPanel13.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel95.setText("Age");
        jPanel13.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jComboBox10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNI", "contrat mariage ", "Passport", "Voter ID", "permis de conduite"  }));
        jComboBox10.setEnabled(false);
        jPanel13.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 180, -1));

        javax.swing.GroupLayout editEmployeeLayout = new javax.swing.GroupLayout(editEmployee);
        editEmployee.setLayout(editEmployeeLayout);
        editEmployeeLayout.setHorizontalGroup(
            editEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEmployeeLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        editEmployeeLayout.setVerticalGroup(
            editEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEmployeeLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.add(editEmployee, "card10");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("Totale prix");

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Add");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton19.setText("Apply");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton20.setText("Delete");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("0");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("Chambre N°");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("101");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setText("Food Detail");

        jButton23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton23.setText("Commander");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel104.setText("Restaurant");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setText("Quantitie");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Price (MAD)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.getTableHeader().setReorderingAllowed(false);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(180);
            jTable5.getColumnModel().getColumn(0).setMaxWidth(180);
        }

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton24.setText("Ajouter");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("Food Name");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText(" ");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("Submitted Money");

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel110.setText("/- MAD");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(180);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(180);
        }

        jButton26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton26.setText("Reset");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel113.setText("/- MAD");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addGap(384, 384, 384))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton20)
                                .addGap(37, 37, 37)
                                .addComponent(jButton19)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel76)
                                            .addComponent(jLabel105)
                                            .addComponent(jLabel106)
                                            .addComponent(jLabel103))
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel101)
                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton24))))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel65)
                                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(jLabel66)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel113))
                                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel110)))
                                .addGap(0, 17, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jButton23)
                                        .addGap(81, 81, 81))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jButton26)
                                        .addGap(109, 109, 109))))))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel104)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(jLabel101))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(jLabel108))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel105)
                            .addComponent(jButton24)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel103)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel66)
                                .addComponent(jLabel113)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110))))
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton20)
                    .addComponent(jButton19)
                    .addComponent(jButton23))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout restaurentLayout = new javax.swing.GroupLayout(restaurent);
        restaurent.setLayout(restaurentLayout);
        restaurentLayout.setHorizontalGroup(
            restaurentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurentLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        restaurentLayout.setVerticalGroup(
            restaurentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(restaurentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(restaurent, "card11");

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Totale de Chambre :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Chambre résérver :");
        jLabel12.setToolTipText("");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Chambre Disponible :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 91, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Chambre disponible");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Chambre résérver");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Total chambre");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 78, 190, 7));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setText("choffeur");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 257, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel19.setText("Employee");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 231, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel20.setText("Manager");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 180, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel21.setText("ouvrier");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 283, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel22.setText("Total Employee");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 330, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel27.setText("Total Employee");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 330, -1, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 309, 192, 10));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Chambre disponible");
        jLabel17.setAutoscrolls(true);
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Chambre de Luxe");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Chambre Climatisée");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 77, -1, 20));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("chambre non climatisée");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Chambre Classique");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel32.setText("Luxury Room");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel33.setText("AC Room");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel34.setText("N-AC Room");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel35.setText("Classic Room");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Types  de Chambres");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 207, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("1. Chambre de Luxe:");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        jLabel38.setText("Queen lit, avec climat, Télévision, WiFi, Piscine, Parking");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("2. chambre climatisée:");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jLabel40.setText("Queen lit, sans climatisé, télévision, WiFi, Parking");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, 30));

        jLabel41.setText("Queen lit, télévision, WiFi");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("3. chambre non climatisée:");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("4. Chambre Classique:");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jLabel44.setText("Simple lit, TV");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel92.setText("Comptable");
        jPanel4.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 205, -1, -1));

        jLabel102.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel102.setText("ouvrier");
        jPanel4.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 257, -1, -1));

        jLabel115.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel115.setText("Employee");
        jPanel4.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 231, -1, -1));

        jLabel116.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel116.setText("Manager");
        jPanel4.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 180, -1, -1));

        jLabel117.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel117.setText("Driver");
        jPanel4.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 283, -1, -1));

        jLabel118.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel118.setText("comptable");
        jPanel4.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 205, -1, -1));

        jLabel45.setFont(new java.awt.Font("Zilla Slab Medium", 1, 24)); // NOI18N
        jLabel45.setText("Tableau De Bord");

        jButton16.setText("Refresh");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText(" ");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(212, 212, 212)
                .addComponent(jButton16)
                .addGap(120, 120, 120))
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel75)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel3.add(dashboard, "card2");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Luxury");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("N-AC");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("AC");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Classic");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("  Type de chambre :");

        javax.swing.GroupLayout bookingRoomLayout = new javax.swing.GroupLayout(bookingRoom);
        bookingRoom.setLayout(bookingRoomLayout);
        bookingRoomLayout.setHorizontalGroup(
            bookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingRoomLayout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addGroup(bookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bookingRoomLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookingRoomLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        bookingRoomLayout.setVerticalGroup(
            bookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingRoomLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(bookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jPanel3.add(bookingRoom, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        bookingRoom.setVisible(false);
        customerInfo.setVisible(false);
        employeeInfo.setVisible(false);
        roomInfo.setVisible(false);
        administrator.setVisible(false);
        enterEmployee.setVisible(false);
        editEmployee.setVisible(false);
        roomBook.setVisible(false);
        restaurent.setVisible(false);
        dashboard.setVisible(true);
        jLabel2.setForeground(new java.awt.Color(153, 255, 204));       
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dashboard.setVisible(false);
        customerInfo.setVisible(false);
        roomInfo.setVisible(false);
        employeeInfo.setVisible(false);
        administrator.setVisible(false);
        enterEmployee.setVisible(false);
        editEmployee.setVisible(false);
        roomBook.setVisible(false);
        restaurent.setVisible(false);
        bookingRoom.setVisible(true);
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));       
        jLabel4.setForeground(new java.awt.Color(153, 255, 204));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        dashboard.setVisible(false);
        employeeInfo.setVisible(false);
        roomInfo.setVisible(false);
        administrator.setVisible(false);
        bookingRoom.setVisible(false);
        enterEmployee.setVisible(false);
        roomBook.setVisible(false);
        restaurent.setVisible(false);
        editEmployee.setVisible(false);
        customerInfo.setVisible(true);
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));       
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(153, 255, 204));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dashboard.setVisible(false);
        administrator.setVisible(false);
        bookingRoom.setVisible(false);
        roomInfo.setVisible(false);
        customerInfo.setVisible(false);
        enterEmployee.setVisible(false);
        roomBook.setVisible(false);
        editEmployee.setVisible(false);
        restaurent.setVisible(false);
        employeeInfo.setVisible(true);
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));       
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(153, 255, 204));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dashboard.setVisible(false);
        bookingRoom.setVisible(false);
        customerInfo.setVisible(false);
        employeeInfo.setVisible(false);        
        roomInfo.setVisible(false);
        enterEmployee.setVisible(false);
        roomBook.setVisible(false);
        restaurent.setVisible(false);
        editEmployee.setVisible(false);
        administrator.setVisible(true);
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));       
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(153, 255, 204));
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainGUI.main.setVisible(true);
        MainGUI2.main2.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        bookingRoom.setVisible(false);
        customerInfo.setVisible(false);
        employeeInfo.setVisible(false);
        administrator.setVisible(false);
        dashboard.setVisible(false);
        enterEmployee.setVisible(false);
        roomBook.setVisible(false);
        restaurent.setVisible(false);
        editEmployee.setVisible(false);
        roomInfo.setVisible(true);
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));       
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setForeground(new java.awt.Color(153, 255, 204));
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        bookingRoom.setVisible(false);
        customerInfo.setVisible(false);
        employeeInfo.setVisible(false);
        administrator.setVisible(false);
        dashboard.setVisible(false);
        enterEmployee.setVisible(false);
        editEmployee.setVisible(false);
        roomInfo.setVisible(false);
        restaurent.setVisible(false);
        roomBook.setVisible(true);
        jLabel49.setText("AC Room");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        bookingRoom.setVisible(false);
        customerInfo.setVisible(false);
        employeeInfo.setVisible(false);
        administrator.setVisible(false);
        dashboard.setVisible(false);
        enterEmployee.setVisible(false);
        roomInfo.setVisible(false);
        restaurent.setVisible(false);
        editEmployee.setVisible(false);
        roomBook.setVisible(true);
        jLabel49.setText("Luxury Room");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bookingRoom.setVisible(false);
        customerInfo.setVisible(false);
        employeeInfo.setVisible(false);
        administrator.setVisible(false);
        dashboard.setVisible(false);
        enterEmployee.setVisible(false);
        editEmployee.setVisible(false);
        roomInfo.setVisible(false);
        restaurent.setVisible(false);
        roomBook.setVisible(true);
        jLabel49.setText("N-AC Room");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        bookingRoom.setVisible(false);
        customerInfo.setVisible(false);
        employeeInfo.setVisible(false);
        administrator.setVisible(false);
        dashboard.setVisible(false);
        enterEmployee.setVisible(false);
        roomInfo.setVisible(false);
        restaurent.setVisible(false);
        editEmployee.setVisible(false);
        roomBook.setVisible(true);
        jLabel49.setText("Classic Room");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
           Integer.parseInt(jTextField13.getText().trim());
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(null, "Price is must be digit.");
            return;
        }
        if (!"".equals(jTextField10.getText().trim()) && !"".equals(jTextField13.getText().trim())) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                String sql1;
                sql1 = "SELECT * from room WHERE no = '"+jTextField10.getText()+"'";
                Statement ptm1 = con.createStatement();
                ResultSet rs = ptm1.executeQuery(sql1);
                if (rs.next()) {
                    javax.swing.JOptionPane.showMessageDialog(null,"Room No. already exist");
                }
                else {
                    String sql = "INSERT INTO room VALUES (?,?,?,'Yes')";
                    PreparedStatement ptm = con.prepareStatement(sql);
                    ptm.setString(1, jTextField10.getText().trim());
                    ptm.setString(2,jComboBox6.getSelectedItem().toString());
                    ptm.setInt(3, Integer.parseInt(jTextField13.getText().trim()));
                    ptm.executeUpdate();
                    javax.swing.JOptionPane.showMessageDialog(null,"Successfully registered room details");
                    con.close();
                    jTextField10.setText("");
                    jComboBox6.setSelectedIndex(0);
                    jTextField13.setText("");
                    UpdateTable.update_table1();
                }
            }
            catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!"".equals(jTextField12.getText().trim())) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                String sql = "delete from room where no = ?";
                PreparedStatement ptm = con.prepareStatement(sql);
                ptm.setString(1, jTextField12.getText().trim());
                ptm.executeUpdate();
                javax.swing.JOptionPane.showMessageDialog(null,"Successfully remove");
                con.close();
                jTextField12.setText("");
                UpdateTable.update_table1();
            }
            catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        bookingRoom.setVisible(false);
        customerInfo.setVisible(false);
        employeeInfo.setVisible(false);
        administrator.setVisible(false);
        dashboard.setVisible(false);
        roomInfo.setVisible(false);
        roomBook.setVisible(false);
        editEmployee.setVisible(false);
        restaurent.setVisible(false);
        enterEmployee.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
           Integer.parseInt(jTextField24.getText().trim());
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(null, "Salary is must be digit.");
            return;
        }
        if ("Age".equals(jComboBox12.getSelectedItem()) || "".equals(jTextField25.getText().trim()) || "".equals(jTextField26.getText().trim()) || "".equals(jTextField8.getText().trim()) || "".equals(jTextField9.getText().trim()) || "".equals(jTextField11.getText().trim()) || "".equals(jTextField24.getText().trim()) || "".equals(jTextArea5.getText().trim())){
            javax.swing.JOptionPane.showMessageDialog(null,"Please write full detail...");
        }
        else {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                String sql = "insert into employee(firstName,lastName,fatherName,emailId,phoneNo,idProof,idNumber,gender,work,address,permanent,salary,age,nightDuty) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ptm = con.prepareStatement(sql);
                ptm.setString(1, jTextField25.getText().trim());
                ptm.setString(2, jTextField3.getText().trim());
                ptm.setString(3, jTextField26.getText().trim());
                ptm.setString(4, jTextField8.getText().trim());
                ptm.setString(5, jTextField9.getText().trim());
                ptm.setString(6, jComboBox5.getSelectedItem().toString());
                ptm.setString(7, jTextField11.getText().trim());                
                ptm.setString(8, jComboBox3.getSelectedItem().toString());
                ptm.setString(9, jComboBox11.getSelectedItem().toString());
                ptm.setString(10, jTextArea5.getText().trim());                
                if (jCheckBox5.isSelected())
                    ptm.setInt(11,1);
                else
                    ptm.setInt(11,0);
                ptm.setString(12, jTextField24.getText().trim());
                ptm.setString(13, jComboBox12.getSelectedItem().toString());
                if (jRadioButton3.isSelected())
                    ptm.setString(14, "Yes");
                else if (jRadioButton4.isSelected())
                    ptm.setString(14, "No");                
                ptm.executeUpdate();
                javax.swing.JOptionPane.showMessageDialog(null,"Successfully Saved Employee Data");
                jTextField25.setText("");
                jTextField3.setText("");
                jTextField26.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField11.setText("");
                jTextField24.setText("");
                jComboBox3.setSelectedIndex(0);
                jComboBox12.setSelectedIndex(0);
                jComboBox11.setSelectedIndex(0);
                jComboBox5.setSelectedIndex(0);
                jTextArea5.setText("");
                jCheckBox5.setSelected(false);
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(true);
                con.close();   
                UpdateTable.update_table3();
            }
            catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if (jTable3.getSelectedRow()>-1) {
            bookingRoom.setVisible(false);
            customerInfo.setVisible(false);
            employeeInfo.setVisible(false);
            administrator.setVisible(false);
            dashboard.setVisible(false);
            roomInfo.setVisible(false);
            roomBook.setVisible(false);
            enterEmployee.setVisible(false);
            restaurent.setVisible(false);
            editEmployee.setVisible(true);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                String sql = "select * from employee where empId = '"+jTable3.getModel().getValueAt(jTable3.getSelectedRow(),0)+"'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()){
                    jLabel107.setText(""+rs.getInt("empId"));
                    jTextField27.setText(rs.getString("firstName"));
                    jTextField7.setText(rs.getString("lastName"));
                    jTextField34.setText(rs.getString("fatherName"));
                    jTextField17.setText(rs.getString("emailId"));
                    jTextField21.setText(rs.getString("phoneNo"));
                    jTextField22.setText(rs.getString("idNumber"));
                    jTextField23.setText(""+rs.getInt("salary"));
                    jComboBox7.setSelectedItem(rs.getString("gender"));
                    jComboBox10.setSelectedItem(rs.getString("idProof"));
                    jComboBox9.setSelectedItem(rs.getString("age"));
                    jComboBox8.setSelectedItem(rs.getString("work"));
                    jTextArea4.setText(rs.getString("address"));
                    if (rs.getInt("permanent")==0)
                        jCheckBox4.setSelected(false);
                    else
                        jCheckBox4.setSelected(true);
                    if ("Yes".equals(rs.getString("nightDuty"))){
                        jRadioButton1.setSelected(true);
                        jRadioButton2.setSelected(false);
                    }
                    if ("No".equals(rs.getString("nightDuty"))){
                        jRadioButton1.setSelected(false);
                        jRadioButton2.setSelected(true); 
                    }
                }
                con.close();
            }
            catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        UpdateTable.update_dashBoard();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null, "Are you Sure?");
        if (confirm==0)
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                 String sql1 = "delete from employee";
                PreparedStatement ptm = con.prepareStatement(sql1);
                ptm.executeUpdate();
                String sql2 = "delete from room";
                PreparedStatement ptm2 = con.prepareStatement(sql2);
                ptm2.executeUpdate();
                String sql3 = "delete from account";
                PreparedStatement ptm3 = con.prepareStatement(sql3);
                ptm3.executeUpdate();
                String sql4 = "delete from customer";
                PreparedStatement ptm4 = con.prepareStatement(sql4);
                ptm4.executeUpdate();
                String sql5 = "delete from restaurant";
                PreparedStatement ptm5 = con.prepareStatement(sql5);
                ptm5.executeUpdate();
                administrator.setVisible(false);
                dashboard.setVisible(true);
                MainGUI.main.setVisible(true);
                MainGUI2.main2.setVisible(false);
                con.close();
            }
            catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTextField25.setText("");
        jTextField3.setText("");
        jTextField26.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField11.setText("");
        jTextField24.setText("");
        jComboBox3.setSelectedIndex(0);
        jComboBox12.setSelectedIndex(0);
        jComboBox11.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jTextArea5.setText("");
        jCheckBox5.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                 String sql = "update employee set firstName=?,lastName=?,fatherName=?,emailId=?,phoneNo=?,idProof=?,idNumber=?,gender=?,work=?,address=?,permanent=?,salary=?,age=?,nightDuty=? where empId = '"+jLabel107.getText()+"'";
            PreparedStatement ptm = con.prepareStatement(sql);
            ptm.setString(1, jTextField27.getText().trim());
            ptm.setString(2, jTextField7.getText().trim());
            ptm.setString(3, jTextField34.getText().trim());
            ptm.setString(4, jTextField17.getText().trim());
            ptm.setString(5, jTextField21.getText().trim());
            ptm.setString(6, jComboBox10.getSelectedItem().toString());
            ptm.setString(7, jTextField22.getText().trim());                
            ptm.setString(8, jComboBox7.getSelectedItem().toString());
            ptm.setString(9, jComboBox8.getSelectedItem().toString());
            ptm.setString(10, jTextArea4.getText().trim());                
            if (jCheckBox4.isSelected())
                ptm.setInt(11,1);
            else
                ptm.setInt(11,0);
            ptm.setString(12, jTextField23.getText().trim());
            ptm.setString(13, jComboBox9.getSelectedItem().toString());
            if (jRadioButton1.isSelected())
                ptm.setString(14, "Yes");
            else if (jRadioButton2.isSelected())
                ptm.setString(14, "No");                
            ptm.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(null,"Successfully update Employee Data");
            con.close();   
            UpdateTable.update_table3();
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        try {
           Integer.parseInt(jTextField15.getText().trim());
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(null, "Submitted money is must be digit.");
            return;
        }
        if ("".equals(jTextField1.getText().trim()) || "".equals(jTextField2.getText().trim()) || "".equals(jTextField4.getText().trim()) || "".equals(jTextField5.getText().trim()) || "".equals(jTextField6.getText().trim()) || "".equals(jTextField15.getText().trim()) || "".equals(jTextArea3.getText().trim())){
            javax.swing.JOptionPane.showMessageDialog(null,"Please write full detail...");
        }
        else {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                String sql1;
                sql1 = "SELECT * from room WHERE no = '"+jTextField1.getText().trim()+"' and type = '"+jLabel49.getText()+"' and available = 'yes'";
                Statement ptm1 = con.createStatement();
                ResultSet rs = ptm1.executeQuery(sql1);
                if (rs.next()) {
                    String sql = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement ptm = con.prepareStatement(sql);
                    ptm.setString(1, jTextField1.getText().trim());
                    ptm.setString(2, jLabel49.getText().trim());
                    ptm.setInt(3, Integer.parseInt(rs.getString("price"))*Integer.parseInt(jComboBox14.getSelectedItem().toString()));
                    ptm.setString(4, jTextField2.getText().trim());
                    ptm.setString(5, jTextField20.getText().trim());
                    ptm.setString(6, jComboBox1.getSelectedItem().toString());
                    ptm.setString(7, jTextField4.getText().trim());
                    ptm.setString(8, jTextField5.getText().trim());
                    ptm.setString(9, jTextField6.getText().trim());
                    ptm.setInt(10, Integer.parseInt(jComboBox2.getSelectedItem().toString()));
                    if (jCheckBox1.isSelected())
                        ptm.setInt(11,1);
                    else
                        ptm.setInt(11,0);
                    ptm.setInt(12, Integer.parseInt(jTextField15.getText().trim()));
                    ptm.setString(13, jTextArea3.getText().trim());
                    ptm.setString(14, jComboBox13.getSelectedItem().toString());
                    ptm.setString(15, java.util.Calendar.getInstance().getTime().toString());
                    ptm.setString(16, jComboBox14.getSelectedItem().toString());
                     if (jRadioButton5.isSelected())
                        ptm.setString(17, "Non-Veg");
                    else if (jRadioButton6.isSelected())
                        ptm.setString(17, "Veg");
                    ptm.executeUpdate();
                    javax.swing.JOptionPane.showMessageDialog(null,"Successfully check-in");
                    String sql2 = "UPDATE room SET available = 'No' WHERE no = '"+jTextField1.getText().trim()+"'";
                    PreparedStatement ptm2 = con.prepareStatement(sql2);
                    ptm2.executeUpdate();
                    jLabel72.setText("");
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField20.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField6.setText("");
                    jTextField15.setText("");
                    jTextArea3.setText("");
                    jCheckBox1.setSelected(false);
                    jRadioButton5.setSelected(false);
                    jRadioButton6.setSelected(true);
                    jComboBox1.setSelectedIndex(0);
                    jComboBox2.setSelectedIndex(0);
                    jComboBox13.setSelectedIndex(0);
                    jComboBox14.setSelectedIndex(0);
                    UpdateTable.update_table1();
                    UpdateTable.update_table2();
                }
                else {
                    javax.swing.JOptionPane.showMessageDialog(null,"Room is already booked by other customer...\nOr room is not exist...");
                }
                con.close();
            }
            catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!"".equals(jTextField1.getText().trim()))
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                 String sql1;
                sql1 = "SELECT * from room WHERE no = '"+jTextField1.getText().trim()+"' and type = '"+jLabel49.getText()+"' and available = 'yes'";
                Statement ptm1 = con.createStatement();
                ResultSet rs = ptm1.executeQuery(sql1);
                if (rs.next()) {
                    jLabel72.setText("prix - "+rs.getString("price")+"/- MAD/Nuits");
                }
                else {
                    javax.swing.JOptionPane.showMessageDialog(null,"la chambre souhaité n'existe ou peut etre occupé!!");
                }
                con.close();
            }
            catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if (javax.swing.JOptionPane.showConfirmDialog(null,"     Are you sure?    ") == 0)
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                String sql1 = "delete from employee where empId = '"+jLabel107.getText()+"'";
                PreparedStatement ptm = con.prepareStatement(sql1);
                ptm.executeUpdate();
                con.close();
                UpdateTable.update_table3();
                editEmployee.setVisible(false);
                employeeInfo.setVisible(true);
            }
            catch(ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if (jRadioButton4.isSelected())
            jRadioButton4.setSelected(false);
        if (!jRadioButton3.isSelected())
            jRadioButton4.setSelected(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if (jRadioButton3.isSelected())
            jRadioButton3.setSelected(false);
        if (!jRadioButton4.isSelected())
            jRadioButton3.setSelected(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton2.isSelected())
            jRadioButton2.setSelected(false);
        if (!jRadioButton1.isSelected())
            jRadioButton2.setSelected(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton1.isSelected())
            jRadioButton1.setSelected(false);
        if (!jRadioButton2.isSelected())
            jRadioButton1.setSelected(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (jTable2.getSelectedRow()>-1)
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                 String sql = "select * from customer where roomNo = '"+jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0)+"'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next())
                if (rs.getInt("kids")==1)
                javax.swing.JOptionPane.showMessageDialog(null,"Room Number - "+rs.getString("roomNo")+"\nRoom Type - "+rs.getString("type")+
                    "\nCustomer Name - "+rs.getString("firstName")+" "+rs.getString("lastName")+"\nID Proof - "+rs.getString("idProof")+
                    "\nID Number - "+rs.getString("idNumber")+"\nEmail ID - "+rs.getString("emailId")+"\nPhone No. - "+rs.getString("phoneNo")+
                    "\nAddress - "+rs.getString("address")+"\nCitizen - "+rs.getString("citizen")+"\nAdult - "+rs.getString("adult")+"\nkids - Yes"+"\nMeal - "+rs.getString("meal")+
                    "\nCheck-in Date - "+rs.getString("checkin")+"\nTotal Night Stay - "+rs.getString("nightStay")+"\nRoom Price - "+rs.getString("price")+"\nSubmitted Money - "+rs.getString("submittedMoney"));
                else
                javax.swing.JOptionPane.showMessageDialog(null,"Room Number - "+rs.getString("roomNo")+"\nRoom Type - "+rs.getString("type")+
                    "\nCustomer Name - "+rs.getString("firstName")+" "+rs.getString("lastName")+"\nID Proof - "+rs.getString("idProof")+
                    "\nID Number - "+rs.getString("idNumber")+"\nEmail ID - "+rs.getString("emailId")+"\nPhone No. - "+rs.getString("phoneNo")+
                    "\nAddress - "+rs.getString("address")+"\nCitizen - "+rs.getString("citizen")+"\nAdult - "+rs.getString("adult")+"\nkids - No"+"\nMeal - "+rs.getString("meal")+
                    "\nCheck-in Date - "+rs.getString("checkin")+"\nTotal Night Stay - "+rs.getString("nightStay")+"\nRoom Price - "+rs.getString("price")+"\nSubmitted Money - "+rs.getString("submittedMoney"));
                con.close();
            }
            catch(ClassNotFoundException | SQLException e ){
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!"".equals(jTextField16.getText().trim()))
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                  String sql1 = "delete from customer where roomNo = '"+jTextField16.getText().trim()+"'";
            PreparedStatement ptm = con.prepareStatement(sql1);
            ptm.executeUpdate();
            String sql2 = "UPDATE room SET available = 'Yes' WHERE no = '"+jTextField16.getText().trim()+"'";
            PreparedStatement ptm1 = con.prepareStatement(sql2);
            ptm1.executeUpdate();
            con.close();
            javax.swing.JOptionPane.showMessageDialog(null, "Check-out successfully");
            UpdateTable.update_table1();
            UpdateTable.update_table2();
            jTextField16.setText("");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        javax.swing.table.DefaultTableModel tbModel = (javax.swing.table.DefaultTableModel) jTable5.getModel();
        for (int i=1; i<=tbModel.getRowCount(); i++){
            try {
                Integer.parseInt(tbModel.getValueAt(i-1, 1).toString().trim());
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "Food Price is must be digit.");
                return;
            }
        }
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                 String sql1 = "delete from restaurant";
            PreparedStatement ptm = con.prepareStatement(sql1);
            ptm.executeUpdate();
            String sql2 = "insert into restaurant values (?,?)";
            PreparedStatement ptm1 = con.prepareStatement(sql2);
            for (int i=1; i<=tbModel.getRowCount(); i++){
                ptm1.setString(1,tbModel.getValueAt(i-1, 0).toString().trim());
                ptm1.setString(2,tbModel.getValueAt(i-1, 1).toString().trim());
                ptm1.executeUpdate();
            }
            food_checker = false;
            con.close();
            javax.swing.JOptionPane.showMessageDialog(null, "Enter Food Successfully");
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if ("".equals(jTextField14.getText().trim()))
            jTextField14.setText("0");
        try {
            Integer.parseInt(jTextField14.getText().trim());
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(null, "Submitted Money is must be digit.");
            return;
        }
        if (Integer.parseInt(jTextField14.getText().trim())<=Integer.parseInt(jLabel66.getText().trim())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
                String sql = "select price,submittedMoney from customer where roomNo = "+jLabel101.getText();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    int price = rs.getInt("price");
                    price+=Integer.parseInt(jLabel66.getText());
                    int money = rs.getInt("submittedMoney");
                    money+=Integer.parseInt(jTextField14.getText().trim());
                    String sql1 = "UPDATE customer set price = "+price+" , submittedMoney = "+money+" where roomNo = "+jLabel101.getText();
                    PreparedStatement ptm = con.prepareStatement(sql1);
                    ptm.executeUpdate();
                }
                con.close();
                ((javax.swing.table.DefaultTableModel)MainGUI2.jTable6.getModel()).setNumRows(0);
                active_food = false;
                jLabel108.setText("");
                jLabel66.setText("0");
                jTextField18.setText("");
                jTextField14.setText("");
                UpdateTable.update_table2();
            }
            catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            }
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Submitted money can be greator than total price");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if (jTable2.getSelectedRow()>-1) {
            bookingRoom.setVisible(false);
            customerInfo.setVisible(false);
            employeeInfo.setVisible(false);
            administrator.setVisible(false);
            dashboard.setVisible(false);
            roomInfo.setVisible(false);
            roomBook.setVisible(false);
            editEmployee.setVisible(false);
            enterEmployee.setVisible(false);
            restaurent.setVisible(true);
            javax.swing.table.DefaultTableModel tbModel = (javax.swing.table.DefaultTableModel) jTable2.getModel();
            jLabel101.setText(tbModel.getValueAt(jTable2.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        javax.swing.table.DefaultTableModel tbModel = (javax.swing.table.DefaultTableModel) jTable5.getModel();
        tbModel.addRow(new Object[]{"Food name", "price"});
        food_checker = true;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if (jTable5.getSelectedRow() >= 0) {
            javax.swing.table.DefaultTableModel tbModel = (javax.swing.table.DefaultTableModel) jTable5.getModel();
            tbModel.removeRow(jTable5.getSelectedRow());
            food_checker = true;
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        if (!food_checker){
            javax.swing.table.DefaultTableModel tbModel = (javax.swing.table.DefaultTableModel) jTable5.getModel();
            jLabel108.setText(tbModel.getValueAt(jTable5.getSelectedRow(), 0).toString()); 
            food_price = Integer.parseInt(tbModel.getValueAt(jTable5.getSelectedRow(), 1).toString());
            active_food = true;
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if (!food_checker && active_food){
            try {
               Integer.parseInt(jTextField18.getText().trim());
            }
            catch(NumberFormatException e){
                javax.swing.JOptionPane.showMessageDialog(null, "Quantity is must be digit.");
                return;
            }
            javax.swing.table.DefaultTableModel tbModel2 = (javax.swing.table.DefaultTableModel) jTable6.getModel();
            tbModel2.addRow(new String[] {jLabel108.getText(),jTextField18.getText(),String.valueOf(food_price)});
            jLabel66.setText(String.valueOf(Integer.parseInt(jLabel66.getText().trim())+(Integer.parseInt(jTextField18.getText().trim())*food_price)));            
            active_food = false;
            jLabel108.setText("");
            jTextField18.setText("");
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Please choose any food\nOtherwise apply food table...");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        ((javax.swing.table.DefaultTableModel)MainGUI2.jTable6.getModel()).setNumRows(0);
        active_food = false;
        jLabel108.setText("");
        jLabel66.setText("0");
        jTextField18.setText("");
        
     }//GEN-LAST:event_jButton26ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if (jRadioButton6.isSelected())
            jRadioButton6.setSelected(false);
        if (!jRadioButton5.isSelected())
            jRadioButton6.setSelected(true);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        if (jRadioButton5.isSelected())
            jRadioButton5.setSelected(false);
        if (!jRadioButton6.isSelected())
            jRadioButton5.setSelected(true);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    public static javax.swing.JFrame main2;
    private boolean food_checker = false;
    private boolean active_food = false;
    private int food_price;
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainGUI2.main2 = new MainGUI2();
                MainGUI2.main2.setVisible(true);
                UpdateTable.update_table1();
                UpdateTable.update_table2();
                UpdateTable.update_table3();
                UpdateTable.update_table4();
                UpdateTable.update_table5();
                UpdateTable.update_dashBoard();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel administrator;
    private javax.swing.JPanel bookingRoom;
    private javax.swing.JPanel customerInfo;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel editEmployee;
    private javax.swing.JPanel employeeInfo;
    private javax.swing.JPanel enterEmployee;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    protected static javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    protected static javax.swing.JLabel jLabel115;
    protected static javax.swing.JLabel jLabel116;
    protected static javax.swing.JLabel jLabel117;
    protected static javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel13;
    protected static javax.swing.JLabel jLabel14;
    protected static javax.swing.JLabel jLabel15;
    protected static javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    protected static javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    protected static javax.swing.JLabel jLabel32;
    protected static javax.swing.JLabel jLabel33;
    protected static javax.swing.JLabel jLabel34;
    protected static javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    protected static javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    protected static javax.swing.JTable jTable1;
    protected static javax.swing.JTable jTable2;
    protected static javax.swing.JTable jTable3;
    protected static javax.swing.JTable jTable4;
    protected static javax.swing.JTable jTable5;
    protected static javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel restaurent;
    private javax.swing.JPanel roomBook;
    private javax.swing.JPanel roomInfo;
    // End of variables declaration//GEN-END:variables
}
