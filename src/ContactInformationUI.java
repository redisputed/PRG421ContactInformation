
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author john
 */
public class ContactInformationUI extends javax.swing.JFrame
{

    ArrayList<Contact> contacts;
    DefaultTableModel model;
    ListSelectionModel listSelectionModel;

    /**
     * Creates new form ContactInformationUI
     */
    public ContactInformationUI()
    {
        this.model = new javax.swing.table.DefaultTableModel(
                new String[]
                {
                    "Contacts"
                }, 0
        );
        contacts = new ArrayList<>();
        initComponents();
        txtFirstName.requestFocus();
        setEnableNewEdit(false);
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlSelection = new javax.swing.JPanel();
        btnLoadFile = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClearContacts = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        pnlDetail = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblMiddleName = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblNickname = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblCellNumber = new javax.swing.JLabel();
        txtCellNumber = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblRequired = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoadFile.setText("Load File");

        btnSaveFile.setText("Save File");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });

        btnClearContacts.setText("Clear Contacts");
        btnClearContacts.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearContactsActionPerformed(evt);
            }
        });

        table.setModel(model);
        listSelectionModel = table.getSelectionModel();
        listSelectionModel.addListSelectionListener(new SharedListSelectionHandler());
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setSelectionModel(listSelectionModel);
        jScrollPane3.setViewportView(table);

        javax.swing.GroupLayout pnlSelectionLayout = new javax.swing.GroupLayout(pnlSelection);
        pnlSelection.setLayout(pnlSelectionLayout);
        pnlSelectionLayout.setHorizontalGroup(
            pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSelectionLayout.createSequentialGroup()
                        .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlSelectionLayout.createSequentialGroup()
                                .addComponent(btnExit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClearContacts))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSelectionLayout.createSequentialGroup()
                                .addComponent(btnLoadFile)
                                .addGap(18, 18, 18)
                                .addComponent(btnSaveFile)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSelectionLayout.setVerticalGroup(
            pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectionLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoadFile)
                    .addComponent(btnSaveFile))
                .addGap(18, 18, 18)
                .addGroup(pnlSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnClearContacts))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        lblFirstName.setText("*First Name");

        lblMiddleName.setText("Middle Name");

        lblLastName.setText("*Last Name");

        lblNickname.setText("Nickname");

        lblAge.setText("*Age");

        lblEmailAddress.setText("*Email Address");

        lblCellNumber.setText("Cell Number");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });

        lblRequired.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        lblRequired.setForeground(new java.awt.Color(153, 153, 153));
        lblRequired.setText("* denotes a required field");

        javax.swing.GroupLayout pnlDetailLayout = new javax.swing.GroupLayout(pnlDetail);
        pnlDetail.setLayout(pnlDetailLayout);
        pnlDetailLayout.setHorizontalGroup(
            pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblRequired)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDetailLayout.createSequentialGroup()
                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetailLayout.createSequentialGroup()
                                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlDetailLayout.createSequentialGroup()
                                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlDetailLayout.createSequentialGroup()
                                                .addComponent(lblFirstName)
                                                .addGap(111, 111, 111)
                                                .addComponent(lblMiddleName))
                                            .addGroup(pnlDetailLayout.createSequentialGroup()
                                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLastName)))
                                    .addGroup(pnlDetailLayout.createSequentialGroup()
                                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNickname)
                                            .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(162, 162, 162)
                                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAge)
                                            .addComponent(txtAge)))
                                    .addGroup(pnlDetailLayout.createSequentialGroup()
                                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlDetailLayout.createSequentialGroup()
                                                .addComponent(lblEmailAddress)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(pnlDetailLayout.createSequentialGroup()
                                                .addComponent(txtEmailAddress)
                                                .addGap(52, 52, 52)))
                                        .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCellNumber))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlDetailLayout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlDetailLayout.setVerticalGroup(
            pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(lblMiddleName)
                    .addComponent(lblLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDetailLayout.createSequentialGroup()
                        .addComponent(lblNickname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDetailLayout.createSequentialGroup()
                        .addComponent(lblAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetailLayout.createSequentialGroup()
                        .addComponent(lblEmailAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDetailLayout.createSequentialGroup()
                        .addComponent(lblCellNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRequired)
                .addGap(4, 4, 4)
                .addGroup(pnlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDetail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearInput()
    {
        txtFirstName.setText(null);
        txtMiddleName.setText(null);
        txtLastName.setText(null);
        txtNickname.setText(null);
        txtAge.setText(null);
        txtEmailAddress.setText(null);
        txtCellNumber.setText(null);

        txtFirstName.requestFocus();
        setEnableNewEdit(false);
    }

    private void getData()
    {
        String fname;
        String mname;
        String lname;
        String nname;
        String age;
        String email;
        String cell;

        try
        {
            fname = txtFirstName.getText();

            // if optional fields are null replace them with empty strings
            if (!"".equals(txtMiddleName.getText()))
            {
                mname = txtMiddleName.getText();
            }
            else
            {
                mname = "none";
            }

            lname = txtLastName.getText();

            if (!"".equals(txtNickname.getText()))
            {
                nname = txtNickname.getText();
            }
            else
            {
                nname = "none";
            }

            age = txtAge.getText();
            email = txtEmailAddress.getText();
            cell = txtCellNumber.getText();

            // create a contact object and add it to the ArrayList
            Contact person = new Contact(fname, mname, lname, nname, age, email, cell);

            contacts.add(person);

        }

        catch (IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Invalid Age",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (NullPointerException e)
        {
            JOptionPane.showMessageDialog(null,
                    "All input fields required",
                    "Input Required",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void clearTable()
    {
        model.setRowCount(0);
    }

    private void clearArray(ArrayList<Contact> c)
    {
        c.clear();
    }

    private void addDataToTable(ArrayList<Contact> c)
    {
        clearTable();
        model.setRowCount(c.size());

        int row = 0;
        for (Contact p : c)
        {

            table.setValueAt(p.getName(), row, 0);
            row++;
        }
    }

    private void displayContact(Contact p)
    {
        txtFirstName.setText(p.getFirstName());
        txtMiddleName.setText(p.getMiddleName());
        txtLastName.setText(p.getLastName());
        txtNickname.setText(p.getNickName());
        txtAge.setText(p.getAge());
        txtEmailAddress.setText(p.getEmailAddress());
        txtCellNumber.setText(p.getCellNumber());
        setEditable(false);
    }

    private void setEditable(Boolean state)
    {
        txtFirstName.setEditable(state);
        txtMiddleName.setEditable(state);
        txtLastName.setEditable(state);
        txtNickname.setEditable(state);
        txtAge.setEditable(state);
        txtEmailAddress.setEditable(state);
        txtCellNumber.setEditable(state);
    }

    private void setEnableNewEdit(Boolean state)
    {
        btnNew.setEnabled(state);
        btnEdit.setEnabled(state);
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveActionPerformed
    {//GEN-HEADEREND:event_btnSaveActionPerformed
        getData();
        addDataToTable(contacts);
        clearInput();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearContactsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearContactsActionPerformed
    {//GEN-HEADEREND:event_btnClearContactsActionPerformed
        clearInput();
        clearTable();
        clearArray(contacts);
    }//GEN-LAST:event_btnClearContactsActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        setEditable(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNewActionPerformed
    {//GEN-HEADEREND:event_btnNewActionPerformed
        clearInput();
        setEditable(true);
    }//GEN-LAST:event_btnNewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ContactInformationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ContactInformationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ContactInformationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ContactInformationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new ContactInformationUI().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearContacts;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoadFile;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNumber;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMiddleName;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblRequired;
    private javax.swing.JPanel pnlDetail;
    private javax.swing.JPanel pnlSelection;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables

    class SharedListSelectionHandler implements ListSelectionListener
    {

        @Override
        public void valueChanged(ListSelectionEvent e)
        {
            try
            {
                Contact person;
                person = contacts.get(table.getSelectedRow());
                displayContact(person);
                setEnableNewEdit(true);
            }
            catch (ArrayIndexOutOfBoundsException ex)
            {
                //do nothing
            }
        }

    }
}
