/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.House;
import Model.Person;
import Model.PersonDirectory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author gauri
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    PersonDirectory directory;
    public CreateJPanel(PersonDirectory directory) {
        initComponents();
        this.directory = directory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbTitle = new javax.swing.JLabel();
        LbHouseNo = new javax.swing.JLabel();
        LbCity = new javax.swing.JLabel();
        comboboxcity = new javax.swing.JComboBox<>();
        LbCommunity = new javax.swing.JLabel();
        comboboxcommunity = new javax.swing.JComboBox<>();
        LbZipcode = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        LbName = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        LbAge = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        LbId = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        LbAddress1 = new javax.swing.JLabel();
        txtzip = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        Comboboxhouse = new javax.swing.JComboBox<>();
        Lbcontact = new javax.swing.JLabel();
        txtcon = new javax.swing.JTextField();
        LbNm = new javax.swing.JLabel();
        LbTN = new javax.swing.JLabel();
        LbZP = new javax.swing.JLabel();
        LbAg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 255));

        LbTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTitle.setText("Person Details");

        LbHouseNo.setBackground(new java.awt.Color(255, 255, 204));
        LbHouseNo.setText("HouseNo.:");

        LbCity.setBackground(new java.awt.Color(255, 255, 204));
        LbCity.setText("City:");

        comboboxcity.setBackground(new java.awt.Color(255, 255, 204));
        comboboxcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston" }));
        comboboxcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxcityActionPerformed(evt);
            }
        });

        LbCommunity.setBackground(new java.awt.Color(255, 255, 204));
        LbCommunity.setText("Community:");

        comboboxcommunity.setBackground(new java.awt.Color(255, 255, 204));
        comboboxcommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxcommunityActionPerformed(evt);
            }
        });

        LbZipcode.setBackground(new java.awt.Color(255, 255, 204));
        LbZipcode.setText("ZipCode:");

        txtage.setBackground(new java.awt.Color(255, 255, 204));
        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtageKeyReleased(evt);
            }
        });

        LbName.setBackground(new java.awt.Color(255, 255, 204));
        LbName.setText("Name:");

        txtname.setBackground(new java.awt.Color(255, 255, 204));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });

        LbAge.setBackground(new java.awt.Color(255, 255, 204));
        LbAge.setText("Age:");

        txtid.setBackground(new java.awt.Color(255, 255, 204));

        LbId.setBackground(new java.awt.Color(255, 255, 204));
        LbId.setText("Id:");

        txtaddress.setBackground(new java.awt.Color(255, 255, 204));

        LbAddress1.setBackground(new java.awt.Color(255, 255, 204));
        LbAddress1.setText("Address:");

        txtzip.setBackground(new java.awt.Color(255, 255, 204));
        txtzip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtzipKeyReleased(evt);
            }
        });

        savebtn.setBackground(new java.awt.Color(255, 255, 204));
        savebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        Comboboxhouse.setBackground(new java.awt.Color(255, 255, 204));

        Lbcontact.setBackground(new java.awt.Color(255, 255, 204));
        Lbcontact.setText("Contact:");

        txtcon.setBackground(new java.awt.Color(255, 255, 204));
        txtcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconKeyReleased(evt);
            }
        });

        LbNm.setForeground(new java.awt.Color(255, 51, 51));

        LbTN.setForeground(new java.awt.Color(255, 0, 0));

        LbZP.setForeground(new java.awt.Color(255, 0, 0));

        LbAg.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbcontact))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboboxcity, 0, 184, Short.MAX_VALUE)
                    .addComponent(comboboxcommunity, 0, 184, Short.MAX_VALUE)
                    .addComponent(txtage)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtid)
                    .addComponent(txtaddress)
                    .addComponent(txtzip, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comboboxhouse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcon))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LbTN, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LbAg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LbZP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LbNm, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(LbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboboxcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comboboxhouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbNm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbAg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LbAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LbZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LbZP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbTN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lbcontact)
                        .addComponent(txtcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addComponent(savebtn)
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        if(txtname.getText().isEmpty()||txtid.getText().isEmpty()||
          txtaddress.getText().isEmpty()||txtage.getText().isEmpty()||
          txtzip.getText().isEmpty()|| comboboxcity.getSelectedItem() ==null || 
          comboboxcommunity.getSelectedItem()==null || Comboboxhouse.getSelectedItem()==null )
           
        {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        }
        else{
        
        Person newPerson = directory.addPerson();
        String houseNo = Comboboxhouse.getSelectedItem().toString();
        newPerson.setPersonid(Integer.parseInt(txtid.getText()));
        newPerson.setPersonage(Integer.parseInt(txtage.getText()));
        newPerson.setPersonname(txtname.getText());
        newPerson.setContact(Integer.parseInt(txtcon.getText()));
        House house =new House();
        house.setCtyname(comboboxcity.getSelectedItem().toString());
        house.setComname(comboboxcommunity.getSelectedItem().toString());
        house.setHouseNo(Integer.parseInt(houseNo));
        house.setZipcode(Integer.parseInt(txtzip.getText()));
        house.setAddress(txtaddress.getText());
        newPerson.setHouse(house);
        JOptionPane.showMessageDialog(this, "Person Details added to Person Directory");
        
        
        txtname.setText("");
        txtage.setText("");
        txtid.setText("");
        txtaddress.setText("");
        txtzip.setText("");
        txtcon.setText("");
        comboboxcity.setSelectedItem(null);
        comboboxcommunity.setSelectedItem(null);
        Comboboxhouse.setSelectedItem(null);
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void comboboxcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxcityActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("Roxbury");
        model.addElement("Downtown");
        model.addElement("Quincy");
        comboboxcommunity.setModel(model);
    }//GEN-LAST:event_comboboxcityActionPerformed

    private void comboboxcommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxcommunityActionPerformed
        // TODO add your handling code here:
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        if(comboboxcommunity.getSelectedItem()!=null){
        if(comboboxcommunity.getSelectedItem().toString() == "Roxbury"){
            model.addElement("1001");
            model.addElement("1002");
            model.addElement("1003");
        }
        else if(comboboxcommunity.getSelectedItem().toString() == "Downtown"){
            model.addElement("2001");
            model.addElement("2002");
            model.addElement("2003");
        }
        else if(comboboxcommunity.getSelectedItem().toString() == "Quincy"){
            model.addElement("3001");
            model.addElement("3002");
            model.addElement("3003");
        }
        Comboboxhouse.setModel(model);
        }
    }//GEN-LAST:event_comboboxcommunityActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        String PATTERN;
        PATTERN = "^[A-Za-z][\\sA-za-z]{0,30}$";
        Pattern patt;
        patt = Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtname.getText());
        if(!match.matches()){
            LbNm.setText("Invalid Naming");
            
        }
        else{ 
       LbNm.setText(null);
        }
    }//GEN-LAST:event_txtnameKeyReleased

    private void txtconKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconKeyReleased
        // TODO add your handling code here:
        String PATTERN;
        PATTERN = "^[+0-9]{0,11}$";
        Pattern patt;
        patt = Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtcon.getText());
        if(!match.matches()){
            LbTN.setText("Invalid Contact");
            
        }
        else{ 
       LbTN.setText(null);
        }
    }//GEN-LAST:event_txtconKeyReleased

    private void txtzipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtzipKeyReleased
        // TODO add your handling code here:
        String PATTERN;
        PATTERN = "^[0-9]{0,8}$";
        Pattern patt;
        patt = Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtzip.getText());
        if(!match.matches()){
            LbZP.setText("Invalid Zipcode");
            
        }
        else{ 
       LbZP.setText(null);
        }
        
    }//GEN-LAST:event_txtzipKeyReleased

    private void txtageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyReleased
        // TODO add your handling code here:
        String PATTERN;
        PATTERN = "^[0-9]{0,2}$";
        Pattern patt;
        patt = Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtage.getText());
        if(!match.matches()){
            LbAg.setText("Invalid Age");
            
        }
        else{ 
       LbAg.setText(null);
        }
        
    }//GEN-LAST:event_txtageKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comboboxhouse;
    private javax.swing.JLabel LbAddress1;
    private javax.swing.JLabel LbAg;
    private javax.swing.JLabel LbAge;
    private javax.swing.JLabel LbCity;
    private javax.swing.JLabel LbCommunity;
    private javax.swing.JLabel LbHouseNo;
    private javax.swing.JLabel LbId;
    private javax.swing.JLabel LbName;
    private javax.swing.JLabel LbNm;
    private javax.swing.JLabel LbTN;
    private javax.swing.JLabel LbTitle;
    private javax.swing.JLabel LbZP;
    private javax.swing.JLabel LbZipcode;
    private javax.swing.JLabel Lbcontact;
    private javax.swing.JComboBox<String> comboboxcity;
    private javax.swing.JComboBox<String> comboboxcommunity;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcon;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtzip;
    // End of variables declaration//GEN-END:variables
}
