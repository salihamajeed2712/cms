
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.table.DefaultTableModel;

public class Teacher extends javax.swing.JFrame {
String latestAnnouncementTemp=null;
    int maths, english, urdu, computer, total;
    String mgrade, egrade, ugrade, cgrade, totalgrade, cemail;
    
    Thread thread1 = new Thread(){//calMathsGrade()
    public void run(){
           
        if (maths < 50) {
            mgrade = "F";
            g1.setText(mgrade);
        } else if (maths >= 50 && maths < 55) {
            mgrade = "D";
            g1.setText(mgrade);
        } else if (maths >= 55 && maths < 60) {
            mgrade = "D+";
            g1.setText(mgrade);
        } else if (maths >= 60 && maths < 65) {
            mgrade = "C";
            g1.setText(mgrade);
        } else if (maths >= 65 && maths < 70) {
            mgrade = "C+";
            g1.setText(mgrade);
        } else if (maths >= 70 && maths < 75) {
            mgrade = "B";
            g1.setText(mgrade);
        } else if (maths >= 75 && maths < 80) {
            mgrade = "B+";
            g1.setText(mgrade);
        } else if (maths >= 80 && maths < 85) {
            mgrade = "A";
            g1.setText(mgrade);
        } else if (maths >= 85) {
            mgrade = "A+";
            g1.setText(mgrade);
        }

    }//end of run method
    };//end of thread 1

    Thread thread2 = new Thread(){
    public void run(){//calEngGrade
           
        if (english < 50) {
            egrade = "F";
            g2.setText(egrade);
        } else if (english >= 50 && english < 55) {
            egrade = "D";
            g2.setText(egrade);
        } else if (english >= 55 && english < 60) {
            egrade = "D+";
            g2.setText(egrade);
        } else if (english >= 60 && english < 65) {
            egrade = "C";
            g2.setText(egrade);
        } else if (english >= 65 && english < 70) {
            egrade = "C+";
            g2.setText(egrade);
        } else if (english >= 70 && english < 75) {
            egrade = "B";
            g2.setText(egrade);
        } else if (english >= 75 && english < 80) {
            egrade = "B+";
            g2.setText(egrade);
        } else if (english >= 80 && english < 85) {
            egrade = "A";
            g2.setText(egrade);
        } else if (english >= 85) {
            egrade = "A+";
            g2.setText(egrade);
        }
        
        }//end of run method
    };//end of thread 2
    
    Thread thread3 = new Thread(){
          public void run() {//urdu grades

        if (urdu < 50) {
            ugrade = "F";
            g3.setText(ugrade);
        } else if (urdu >= 50 && urdu < 55) {
            ugrade = "D";
            g3.setText(ugrade);
        } else if (urdu >= 55 && urdu < 60) {
            ugrade = "D+";
            g3.setText(ugrade);
        } else if (urdu >= 60 && urdu < 65) {
            ugrade = "C";
            g3.setText(ugrade);
        } else if (urdu >= 65 && urdu < 70) {
            ugrade = "C+";
            g3.setText(ugrade);
        } else if (urdu >= 70 && urdu < 75) {
            ugrade = "B";
            g3.setText(ugrade);
        } else if (urdu >= 75 && urdu < 80) {
            ugrade = "B+";
            g3.setText(ugrade);
        } else if (urdu >= 80 && urdu < 85) {
            ugrade = "A";
            g3.setText(ugrade);
        } else if (urdu >= 85) {
            ugrade = "A+";
            g3.setText(ugrade);
        }

    }//end of run method
    };//end of thread 3
    
    Thread thread4 = new Thread(){
         public void run() {//computer grades

        if (computer < 50) {
            cgrade = "F";
            g4.setText(cgrade);
        } else if (computer >= 50 && computer < 55) {
            cgrade = "D";
            g4.setText(cgrade);
        } else if (computer >= 55 && computer < 60) {
            cgrade = "D+";
            g4.setText(cgrade);
        } else if (computer >= 60 && computer < 65) {
            cgrade = "C";
            g4.setText(cgrade);
        } else if (computer >= 65 && computer < 70) {
            cgrade = "C+";
            g4.setText(cgrade);
        } else if (computer >= 70 && computer < 75) {
            cgrade = "B";
            g4.setText(cgrade);
        } else if (computer >= 75 && computer < 80) {
            cgrade = "B+";
            g4.setText(cgrade);
        } else if (computer >= 80 && computer < 85) {
            cgrade = "A";
            g4.setText(cgrade);
        } else if (computer >= 85) {
            cgrade = "A+";
            g4.setText(cgrade);
        }

    }//end  of run method
     };//end of thread 4

    Thread thread5 = new Thread(){
         public void run() {//total grades
        totalmarks.setText(total + "");
        if (total < 200) {
            totalgrade = "F";
            tgrade.setText(totalgrade);
        } else if (total >= 200 && total < 220) {
            totalgrade = "D";
            tgrade.setText(totalgrade);
        } else if (total >= 220 && total < 240) {
            totalgrade = "D+";
            tgrade.setText(totalgrade);
        } else if (total >= 240 && total < 260) {
            totalgrade = "C";
            tgrade.setText(totalgrade);
        } else if (total >= 260 && total < 280) {
            totalgrade = "C+";
            tgrade.setText(totalgrade);
        } else if (total >= 280 && total < 300) {
            totalgrade = "B";
            tgrade.setText(totalgrade);
        } else if (total >= 300 && total < 320) {
            totalgrade = "B+";
            tgrade.setText(mgrade);
        } else if (total >= 340 && total < 360) {
            totalgrade = "A";
            tgrade.setText(totalgrade);
        } else if (total >= 360) {
            totalgrade = "A+";
            tgrade.setText(totalgrade);
        }

    }//end ofrun method
    };//end of thread 4

   

  

    public Teacher() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        Signout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        parent = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        MakeAnnouncement = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        ann = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        latann = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        anntable = new javax.swing.JTable();
        a1 = new javax.swing.JButton();
        UploadMarks = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        semail = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        g1 = new javax.swing.JLabel();
        g2 = new javax.swing.JLabel();
        g3 = new javax.swing.JLabel();
        g4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        totalmarks = new javax.swing.JLabel();
        tgrade = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        Markslist = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        markslist = new javax.swing.JTable();
        AllClass = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        allclass = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setText("Dashboard");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 131, -1));

        b2.setText("Make Announcement");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 131, -1));

        b3.setText("All Class");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, -1));

        b4.setText("Upload Marks ");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 131, -1));

        b5.setText("Marks List");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 131, -1));

        Signout.setText("Signout");
        Signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoutActionPerformed(evt);
            }
        });
        jPanel1.add(Signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 131, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/man icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 43, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hi, Noushin");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 149, 178, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        parent.setBackground(new java.awt.Color(255, 153, 0));
        parent.setLayout(new java.awt.CardLayout());

        dashboard.setBackground(new java.awt.Color(255, 153, 0));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sparkle Learn School");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 17, -1, -1));

        dashboard.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 18, 280, 60));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Overall progress");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, 130, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-analytics.gif"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, -1));

        dashboard.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 313, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-checklist.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        dashboard.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 80));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Notes");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jLabel12.setText("topic revision addition");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, -1));

        jLabel47.setText("winter holidays work");
        jLabel47.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, -1));

        jLabel13.setText("assignmnet subtraction");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 150, -1));

        jLabel48.setText("....");
        jLabel48.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, -1));

        dashboard.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 227, 180, 200));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Name");
        dashboard.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 123, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Noushin Mazhar");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dashboard.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 123, 157, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Email");
        dashboard.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 162, 39, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("noushin@furc.edu.pk");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dashboard.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 162, 157, -1));

        parent.add(dashboard, "card2");

        MakeAnnouncement.setBackground(new java.awt.Color(255, 153, 0));
        MakeAnnouncement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Make Announcement");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        MakeAnnouncement.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 14, -1, 60));

        ann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annActionPerformed(evt);
            }
        });
        MakeAnnouncement.add(ann, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 107, 381, 35));

        jLabel20.setText("Make new announcements here");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        MakeAnnouncement.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 86, 356, 15));

        jLabel21.setText("Edit latest announcements here");
        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        MakeAnnouncement.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 170, 356, 15));

        latann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latannActionPerformed(evt);
            }
        });
        MakeAnnouncement.add(latann, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 191, 383, 35));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MakeAnnouncement.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 60, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Re-Announce");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MakeAnnouncement.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 114, 40));

        anntable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Your all previous Announcements"
            }
        ));
        jScrollPane1.setViewportView(anntable);

        MakeAnnouncement.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 281, 383, 205));

        a1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        a1.setText("Announce");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        MakeAnnouncement.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 90, 30));

        parent.add(MakeAnnouncement, "card8");

        UploadMarks.setBackground(new java.awt.Color(255, 153, 0));
        UploadMarks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Upload Marks");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        UploadMarks.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Subject");
        UploadMarks.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 117, 54, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Marks");
        UploadMarks.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 117, 54, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("enter candidate email");
        UploadMarks.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 160, -1));

        semail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Students emails"
            }
        ));
        jScrollPane3.setViewportView(semail);

        UploadMarks.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 239, 260));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Maths");
        UploadMarks.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 159, 54, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("English");
        UploadMarks.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 203, 54, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Urdu");
        UploadMarks.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 258, 54, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Computer");
        UploadMarks.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 312, -1, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        UploadMarks.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 155, 54, 30));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        UploadMarks.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 203, 54, 30));

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        UploadMarks.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 254, 54, 30));

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        UploadMarks.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 308, 54, 30));

        g1.setText("....");
        UploadMarks.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 162, -1, -1));

        g2.setText("....");
        UploadMarks.add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 210, -1, -1));

        g3.setText("....");
        UploadMarks.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 261, -1, -1));

        g4.setText("....");
        UploadMarks.add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 315, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel36.setText("You can copy emails from here, it can help you to enter marks ");
        UploadMarks.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 260, 34));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Total");
        UploadMarks.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 356, 50, -1));

        totalmarks.setText(".......");
        UploadMarks.add(totalmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 359, 46, -1));

        tgrade.setText("....");
        UploadMarks.add(tgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 359, -1, -1));

        jButton4.setText("Calculate and Upload Marks");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        UploadMarks.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 190, 30));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        UploadMarks.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 240, 30));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setText("Grades");
        UploadMarks.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 117, 54, -1));

        parent.add(UploadMarks, "card5");

        Markslist.setBackground(new java.awt.Color(255, 153, 0));
        Markslist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("View Marks List");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Markslist.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("All Students List");
        Markslist.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        markslist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Maths", "English", "Urdu", "Computer", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(markslist);

        Markslist.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 126, -1, 343));

        parent.add(Markslist, "card6");

        AllClass.setBackground(new java.awt.Color(255, 153, 0));
        AllClass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Your All Class Students");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        AllClass.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        allclass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Student Name", "Father Name"
            }
        ));
        jScrollPane2.setViewportView(allclass);

        AllClass.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 82, -1, 372));

        parent.add(AllClass, "card7");

        getContentPane().add(parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 590, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        parent.removeAll();
        parent.add(dashboard);
        parent.repaint();
        parent.revalidate();
    }//GEN-LAST:event_b1ActionPerformed

    private void SignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoutActionPerformed
        // TODO add your handling code here:
        login lg = new login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignoutActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        parent.removeAll();
        parent.add(MakeAnnouncement);
        parent.repaint();
        parent.revalidate();

        String arr[] = new String[1];
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from announcement ");
                DefaultTableModel dtm = (DefaultTableModel) anntable.getModel();

                while (rs.next()) {

                    arr[0] = rs.getString(1);
                    dtm.addRow(arr);

                }//end of while

            }//end of inner try
        }//end if outer try
        catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_b2ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        parent.removeAll();
        parent.add(Markslist);
        parent.repaint();
        parent.revalidate();
        
        String arr[]=new String[6];
         try{  
        Class.forName("com.mysql.jdbc.Driver");  
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","")) {
           Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("select * from result ");
              DefaultTableModel dtm = (DefaultTableModel)markslist.getModel();
             
                    while(rs.next()){
                        
                     arr[0]=rs.getString(1);
                     arr[1]=rs.getString(2);
                     arr[2]=rs.getString(3);
                     arr[3]=rs.getString(4);
                     arr[4]=rs.getString(5);
                     arr[5]=rs.getString(6);
                     dtm.addRow(arr);
                       
                    }//end of while
                    
      
            
         }//end of inner try
    }//end if outer try
            catch(Exception e){ System.out.println(e);}
        
        
        
        
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        parent.removeAll();
        parent.add(UploadMarks);
        parent.repaint();
        parent.revalidate();
        String arr[]= new String[1];
         try{  
        Class.forName("com.mysql.jdbc.Driver");  
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","")) {
           Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("select email from accepted_requests ");
              DefaultTableModel dtm = (DefaultTableModel)semail.getModel();
             
                    while(rs.next()){
                        
                      arr[0]= rs.getString(1);
                      dtm.addRow(arr);
                    }//end of while
                    
      
            
         }//end of inner try
    }//end if outer try
            catch(Exception e){ System.out.println(e);}
        
        
        
    }//GEN-LAST:event_b4ActionPerformed

    private void annActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_annActionPerformed

    private void latannActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latannActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latannActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "")) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from announcement ");

                while (rs.next()) {
                    // Set the text of a component to the value of the first column in the result set
                    latann.setText(rs.getString(1));
                    latestAnnouncementTemp=rs.getString(1);
                }//end of while

            }//end of inner try
        }//end if outer try
        catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String temp;
        temp = latann.getText();
        
        
               
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","")) {
           Statement stmt=con.createStatement();
        
        stmt.executeUpdate("UPDATE announcement SET nannouncement= '"+temp+"' WHERE nannouncement='"+latestAnnouncementTemp+"' ");
        JOptionPane.showMessageDialog(null,"Announcement Updated ");
        
        

         }//end of inner try
    }//end if outer try
          catch(Exception e){ System.out.println(e);}


    }//GEN-LAST:event_jButton3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       boolean isEmail=false; 
       
        signUp su=new signUp();
        isEmail=su.isValidEmail(email.getText());
        
        if(email.getText().isEmpty() || !isEmail || t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "DATA MISSING ");

        }
        else{
        
        cemail = email.getText();
        maths = Integer.parseInt(t1.getText());
        english = Integer.parseInt(t2.getText());
        urdu = Integer.parseInt(t3.getText());
        computer = Integer.parseInt(t4.getText());
        total = maths + english + urdu + computer;
        
        thread1.start();//mathGrades
        thread2.start();//EnglishGrades
        thread3.start();//UrduGrade
        thread4.start();//CompGrade
        thread5.start();//TotalGrade

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "")) {
                Statement stmt = con.createStatement();

                stmt.executeUpdate("INSERT into result VALUES ( '" + cemail + "' , '" + maths + "' , '" + english + "' , '" + urdu + "' , '" + computer + "' , '" + total + "' , '" + mgrade + "', '" + egrade + "', '" + ugrade + "', '" + cgrade + "' , '" + totalgrade + "'     ) ");
             
                JOptionPane.showMessageDialog(null, "Result Uploaded ");

            }//end of inner try
        }//end if outer try
        catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        totalmarks.setText(null);

        g1.setText(null);
        g2.setText(null);
        g3.setText(null);
        g4.setText(null);
        tgrade.setText(null);
        email.setText(null);
        
     }//end of outer else 


    }//GEN-LAST:event_jButton4ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        String Announcement;
        Announcement = ann.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "")) {
                Statement stmt = con.createStatement();
                // query to insert the Announcement into the 'Announcement' table
                stmt.executeUpdate("INSERT into Announcement VALUES ( '" + Announcement + "') ");
                // Display a JOptionPane message indicating successful announcement upload
                JOptionPane.showMessageDialog(null, "announcement uploaded ");

            }//end of inner try
        }//end if outer try
        catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_a1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        parent.removeAll();
        parent.add(AllClass);
        parent.repaint();
        parent.revalidate();

        String arr[] = new String[3];
                
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","")) {
           Statement stmt=con.createStatement();
         DefaultTableModel dtm = (DefaultTableModel)allclass.getModel();
        ResultSet rs = stmt.executeQuery("select * from accepted_requests");

                while (rs.next()) {
                   arr[0]=rs.getString(6);
                   arr[1]=rs.getString(1);
                   arr[2]=rs.getString(2);
                   dtm.addRow(arr);
                }//end of while

           

         }//end of inner try
    }//end if outer try
          catch(Exception e){ System.out.println(e);}

    }//GEN-LAST:event_b3ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AllClass;
    private javax.swing.JPanel MakeAnnouncement;
    private javax.swing.JPanel Markslist;
    private javax.swing.JButton Signout;
    private javax.swing.JPanel UploadMarks;
    private javax.swing.JButton a1;
    private javax.swing.JTable allclass;
    private javax.swing.JTextField ann;
    private javax.swing.JTable anntable;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JPanel dashboard;
    private javax.swing.JTextField email;
    private javax.swing.JLabel g1;
    private javax.swing.JLabel g2;
    private javax.swing.JLabel g3;
    private javax.swing.JLabel g4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField latann;
    private javax.swing.JTable markslist;
    private javax.swing.JPanel parent;
    private javax.swing.JTable semail;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JLabel tgrade;
    private javax.swing.JLabel totalmarks;
    // End of variables declaration//GEN-END:variables
}
