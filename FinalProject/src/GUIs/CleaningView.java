/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tyler
 */
public class CleaningView extends javax.swing.JFrame {

    /**
     * Creates new form CleaningView
     *
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public CleaningView() throws ClassNotFoundException, SQLException {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:Hotel.db");
        //Statement s = connection.createStatement();
        //s.executeQuery("PRAGMA foreign_keys = on;");
    }

    public void load() throws SQLException {
        Statement statement = connection.createStatement();
        setTableData(statement.executeQuery("select * from cleans order by date DESC"));

        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery("select name from rm_type");
        ArrayList<String> types = new ArrayList<>();
        types.add("Any");
        while (rs.next()) {
            types.add(rs.getString("name"));
        }
        searchRmType.setModel(new DefaultComboBoxModel(types.toArray()));
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
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchSSN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        searchRmNum = new javax.swing.JTextField();
        searchSort = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        searchDate = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        searchSTime = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        searchRmType = new javax.swing.JComboBox();
        searchOccupied = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        insertSSN = new javax.swing.JTextField();
        insertRmNum = new javax.swing.JTextField();
        insertDate = new javax.swing.JFormattedTextField();
        schedule = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        insertSTime = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        insertOccupied = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        updateRmNum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        updateSSN = new javax.swing.JTextField();
        updateDate = new javax.swing.JFormattedTextField();
        update = new javax.swing.JButton();
        updateOccupied = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        updateSTime = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "Room Number", "Date", "Start Time", "Occupied"
            }
        )
        {public boolean isCellEditable(int row, int col) {return false;}}
    );
    table.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tableMouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(table);

    jLabel8.setText("Scheduled Cleanings");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(360, 360, 360)
                    .addComponent(jLabel8)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

    jLabel1.setText("Date (yyyy-MM-dd)");

    jLabel2.setText("SSN");

    jLabel3.setText("Room Number");

    searchSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date Descending", "Date Ascending", "SSN Descending", "SSN Ascending", "Room Number Descending", "Room Number Ascending", "Start Time Descending", "Start Time Ascending" }));

    jLabel4.setText("Sort By");

    refresh.setText("Refresh");
    refresh.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            refreshMouseClicked(evt);
        }
    });

    searchDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

    jLabel13.setText("Start Time");

    jLabel12.setText("Room Type");

    jLabel14.setText("Occupied");

    searchOccupied.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Yes", "No" }));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(searchSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(searchRmNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(searchSort, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(searchSTime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(searchRmType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(searchOccupied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refresh)))
            .addGap(105, 105, 105))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(searchSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(searchRmNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(searchSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(searchDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(searchSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12)
                .addComponent(refresh)
                .addComponent(jLabel14)
                .addComponent(searchRmType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(searchOccupied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(13, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Schedule New Cleaning"));

    insertDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

    schedule.setText("Schedule");
    schedule.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            scheduleMouseClicked(evt);
        }
    });

    jLabel6.setText("SSN");

    jLabel7.setText("Room Number");

    jLabel5.setText("Date (yyyy-MM-dd)");

    jLabel16.setText("Start Time");

    jLabel18.setText("Occupied");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(insertSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(insertRmNum, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(insertDate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(insertSTime, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addGap(103, 103, 103))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(insertOccupied, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addGap(655, 655, 655)
                    .addComponent(schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(insertSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7)
                .addComponent(insertRmNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5)
                .addComponent(insertDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel16)
                .addComponent(insertSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel18)
                .addComponent(insertOccupied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(schedule))
            .addContainerGap(16, Short.MAX_VALUE))
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected Row"));

    jLabel9.setText("Date (yyyy-MM-dd)");

    jLabel10.setText("SSN");

    jLabel11.setText("Room Number");

    updateDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

    update.setText("Update");
    update.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            updateMouseClicked(evt);
        }
    });

    jLabel19.setText("Start Time");

    jLabel21.setText("Occupied");

    delete.setText("Delete");
    delete.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            deleteMouseClicked(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(updateSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(updateRmNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(updateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel19)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(updateSTime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 97, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel21)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(updateOccupied, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update)
                    .addGap(18, 18, 18)
                    .addComponent(delete)))
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(updateSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11)
                .addComponent(updateRmNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9)
                .addComponent(updateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel19)
                .addComponent(updateSTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(update)
                .addComponent(jLabel21)
                .addComponent(updateOccupied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(delete))
            .addContainerGap(14, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleMouseClicked
        String insertQuery = "insert into cleans(essn, room_no, date, start_time, occupied) values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.clearParameters();
            if (!insertSSN.getText().isEmpty()
                    && !insertRmNum.getText().isEmpty()
                    && !insertDate.getText().isEmpty()
                    && !insertSTime.getText().isEmpty()
                    && Integer.parseInt(insertSSN.getText()) > 0
                    && Integer.parseInt(insertSSN.getText()) < 1000000000 //checks to see if it is a valid ssn
                    && Integer.parseInt(insertRmNum.getText()) > 0
                    && Integer.parseInt(insertRmNum.getText()) < 11000) { //checks to see if it is in a valid room number
                statement.setObject(1, insertSSN.getText());
                statement.setObject(2, insertRmNum.getText());
                statement.setObject(3, insertDate.getText());
                statement.setObject(4, insertSTime.getText());
                statement.setObject(5, insertOccupied.getText().toLowerCase().equals("yes") ? "1" : "0");
                statement.executeUpdate();
            } else {
                JOptionPane.showMessageDialog(null, "There is an error in the most recent scheduling request.");
            }
            String query = "select * from cleans order by date DESC";
            statement = connection.prepareStatement(query);
            setTableData(statement.executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(CleaningView.class.getName()).log(Level.SEVERE, null, ex);
        }
        insertSSN.setText("");
        insertRmNum.setText("");
        insertDate.setText("");
        insertSTime.setText("");
        insertOccupied.setText("");
    }//GEN-LAST:event_scheduleMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        updateSSN.setText((String) model.getValueAt(table.getSelectedRow(), 0));
        updateRmNum.setText((String) model.getValueAt(table.getSelectedRow(), 1));
        updateDate.setText((String) model.getValueAt(table.getSelectedRow(), 2));
        updateSTime.setText((String) model.getValueAt(table.getSelectedRow(), 3));
        updateOccupied.setText((String) model.getValueAt(table.getSelectedRow(), 4));
    }//GEN-LAST:event_tableMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        if (table.getSelectedRow() >= 0) {
            String updateQuery = "update cleans set essn = ?, room_no = ?, date = ?, start_time = ?, occupied = ? "
                    + "where essn = ? and room_no = ? and date = ? and start_time = ?";

            try {
                PreparedStatement statement = connection.prepareStatement(updateQuery);
                statement.clearParameters();
                if (!updateSSN.getText().isEmpty()
                        && !updateRmNum.getText().isEmpty()
                        && !updateDate.getText().isEmpty()
                        && !updateSTime.getText().isEmpty()
                        && Integer.parseInt(updateSSN.getText()) > 0
                        && Integer.parseInt(updateSSN.getText()) < 1000000000 //checks to see if it is a valid ssn
                        && Integer.parseInt(updateRmNum.getText()) > 0
                        && Integer.parseInt(updateRmNum.getText()) < 11000) {
                    statement.setObject(1, updateSSN.getText());
                    statement.setObject(2, updateRmNum.getText());
                    statement.setObject(3, updateDate.getText());
                    statement.setObject(4, updateSTime.getText());
                    statement.setObject(5, updateOccupied.getText().toLowerCase().equals("yes") ? "1" : "0");
                    statement.setObject(6, ((String) model.getValueAt(table.getSelectedRow(), 0)));
                    statement.setObject(7, ((String) model.getValueAt(table.getSelectedRow(), 1)));
                    statement.setObject(8, ((String) model.getValueAt(table.getSelectedRow(), 3)));
                    statement.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(null, "There is an error in the most recent scheduling request.");
                }
                String query = "select * from cleans order by date DESC";
                statement = connection.prepareStatement(query);
                setTableData(statement.executeQuery());
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(CleaningView.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateSSN.setText("");
            updateRmNum.setText("");
            updateDate.setText("");
            updateSTime.setText("");
            updateOccupied.setText("");
        }
    }//GEN-LAST:event_updateMouseClicked

    private void setTableData(ResultSet rs) throws SQLException {
        model.setRowCount(0);
        while (rs.next()) {
            String[] tuple = {
                rs.getString("essn"),
                rs.getString("room_no"),
                rs.getString("date"),
                rs.getString("start_time"),
                rs.getString("occupied").equals("1") ? "yes" : "no"
            };

            model.addRow(tuple);
        }
    }

    private String getOrder() {
        switch (searchSort.getSelectedIndex()) {
            case 1:
                return "date ASC";
            case 2:
                return "essn DESC";
            case 3:
                return "essn ASC";
            case 4:
                return "room_no DESC";
            case 5:
                return "room_no ASC";
            case 6:
                return "start_time DESC";
            case 7:
                return "start_time ASC";
            default:
                return "date DESC";
        }
    }

    private String generateCleansSearchQuery(ArrayList<String> params, String ssn,
            String num, String date, String sTime, String type, int occupied) {
        ArrayList<String> clauses = new ArrayList<>();

        String query = "select c.* from cleans as c";
        if (!type.equals("Any")) {
            query += ", room";
        }

        if (!ssn.equals("")) {
            clauses.add("essn = ?");
            params.add(ssn);
        }
        if (!num.equals("")) {
            clauses.add("room_no = ?");
            params.add(num);
        }
        if (!date.equals("")) {
            clauses.add("date = ?");
            params.add(date);
        }
        if (!sTime.equals("")) {
            clauses.add("start_time = ?");
            params.add(sTime);
        }
        if (occupied != 0) {
            clauses.add("occupied = ?");
            switch (occupied) {
                case 1:
                    params.add("1");
                    break;
                case 2:
                    params.add("0");
                    break;
                default:
                    break;
            }
        }

        if (!type.equals(
                "Any")) {
            clauses.add("room_no = rm_num and rm_type_id = ?");
            // sub 1 because things are offset by "any"
            params.add(Integer.toString(searchRmType.getSelectedIndex() - 1));
        }

        if (!clauses.isEmpty()) {
            query += " where " + String.join(" and ", clauses);
        }

        query += " order by " + getOrder();

        return query;
    }

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        String ssn = searchSSN.getText();
        String num = searchRmNum.getText();
        String date = searchDate.getText();
        String sTime = searchSTime.getText();
        String type = (String) searchRmType.getSelectedItem();
        int occupied = searchOccupied.getSelectedIndex();

        ArrayList<String> params = new ArrayList<>();
        String query = generateCleansSearchQuery(params, ssn, num, date, sTime, type, occupied);
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.clearParameters();
            for (int i = 0; i < params.size(); i++) {
                statement.setObject(i + 1, params.get(i));
            }
            ResultSet results = statement.executeQuery();
            setTableData(results);

        } catch (SQLException ex) {
            Logger.getLogger(CleaningView.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        searchSSN.setText("");
        searchRmNum.setText("");
        searchDate.setText("");
        searchSTime.setText("");
        searchRmType.setSelectedIndex(0);
    }//GEN-LAST:event_refreshMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        if (table.getSelectedRow() >= 0) {
            String deleteQuery = "delete from cleans where essn = ?";

            try {
                PreparedStatement statement = connection.prepareStatement(deleteQuery);
                statement.clearParameters();
                statement.setString(1, ((String) model.getValueAt(table.getSelectedRow(), 0)));
                statement.executeUpdate();

                String query = "select * from cleans order by date DESC";
                statement = connection.prepareStatement(query);
                setTableData(statement.executeQuery());
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(CleaningView.class.getName()).log(Level.SEVERE, null, ex);
            }
            updateSSN.setText("");
            updateRmNum.setText("");
            updateDate.setText("");
            updateSTime.setText("");
            updateOccupied.setText("");
        }
    }//GEN-LAST:event_deleteMouseClicked

    final private DefaultTableModel model;
    final private Connection connection;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JFormattedTextField insertDate;
    private javax.swing.JTextField insertOccupied;
    private javax.swing.JTextField insertRmNum;
    private javax.swing.JTextField insertSSN;
    private javax.swing.JTextField insertSTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton refresh;
    private javax.swing.JButton schedule;
    private javax.swing.JFormattedTextField searchDate;
    private javax.swing.JComboBox searchOccupied;
    private javax.swing.JTextField searchRmNum;
    private javax.swing.JComboBox searchRmType;
    private javax.swing.JTextField searchSSN;
    private javax.swing.JTextField searchSTime;
    private javax.swing.JComboBox searchSort;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    private javax.swing.JFormattedTextField updateDate;
    private javax.swing.JTextField updateOccupied;
    private javax.swing.JTextField updateRmNum;
    private javax.swing.JTextField updateSSN;
    private javax.swing.JTextField updateSTime;
    // End of variables declaration//GEN-END:variables
}
