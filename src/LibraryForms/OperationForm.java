/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryForms;

import LibraryModels.Book;
import LibraryModels.Operation;
import LibraryModels.Client;
import LibraryUtils.BookDAO;
import LibraryUtils.ClientDAO;
import LibraryUtils.OperationsDAO;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Shejadelin
 */
public class OperationForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form OperationForm
     */
   private String clientid;
     private String client;
     private String book;
     private Date date;
     private String category;
    DefaultTableModel model;
 
    
    public OperationForm() {
        initComponents();
         model = (DefaultTableModel) check_in.getModel();
         
        TableCheck();
     
        comboBook();
        comboClient();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        check_in = new javax.swing.JTable();
        IN1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        CID = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Cname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Csearch = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        Cphoto = new javax.swing.JLabel();
        CLIENT = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        BID = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Bname = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Aname = new javax.swing.JTextField();
        Bsearch = new javax.swing.JButton();
        BOOK = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        DATE1 = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        DATE = new com.toedter.calendar.JDateChooser();
        jPanel17 = new javax.swing.JPanel();
        Print = new javax.swing.JButton();
        PDF = new javax.swing.JButton();
        Excel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        checkin = new javax.swing.JRadioButton();
        checkout = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("OPERATIONS");

        check_in.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client ID", "Client", "Book", "Date", "Operation Category"
            }
        ));
        jScrollPane4.setViewportView(check_in);

        IN1.setText("SUBMIT");
        IN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IN1ActionPerformed(evt);
            }
        });

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setText("Client ID:");

        CID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDActionPerformed(evt);
            }
        });

        jLabel22.setText("Client Name:");

        jLabel23.setText("Client's picture:");

        Csearch.setText("SEARCH");
        Csearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsearchActionPerformed(evt);
            }
        });

        jLabel24.setText("Available IDs:");

        Cphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CLIENT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLIENTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(CID, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Csearch)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel24))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(CLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(CID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Csearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(Cphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setText("Book ID:");

        jLabel26.setText("Book Name:");

        jLabel27.setText("Book Author:");

        Bsearch.setText("SEARCH");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });

        jLabel28.setText("available IDs:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BID, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bsearch)
                .addGap(27, 27, 27)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BOOK, 0, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(BID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(25, 25, 25)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(Bname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(Aname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel29.setText("From:");

        jLabel30.setText("To:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(38, 38, 38)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DATE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(213, 213, 213))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DATE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        PDF.setText("Export to PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });

        Excel.setText("Export to Excel");
        Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Excel)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Print, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(PDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(133, 133, 133))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(checkin);
        checkin.setText("Check IN");

        buttonGroup1.add(checkout);
        checkout.setText("Check OUT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(checkin)
                .addGap(115, 115, 115)
                .addComponent(checkout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkin)
                    .addComponent(checkout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IN1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IN1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IN1ActionPerformed
clientid=CID.getText();
client = Cname.getText();
      book = Bname.getText()+" by "+Aname.getText();
      
      date = DATE.getDate();
      
      
      if(checkin.isSelected()){
       category = "Checked In";
        
        }
        else if(checkout.isSelected()){
        category = "Checked Out";
        }
        else{
        category = null;
        
        }
      
      Operation check = new Operation(clientid,client,book,date,category);
      OperationsDAO O=new OperationsDAO();
      O.insert(check);
      
      JOptionPane.showMessageDialog(this,"Data Successfully Recorded!!");
      model.insertRow(model.getRowCount(), new Object []{clientid,client,book,date,category});
      CID.setText("");
      Bname.setText("");
      Aname.setText("");
      DATE1.setDate(null);
      DATE.setDate(null);
      Cname.setText("");
       checkin.setSelected(false);
      checkout.setSelected(false);
     


        // TODO add your handling code here:
    }//GEN-LAST:event_IN1ActionPerformed

    private void CIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIDActionPerformed

    private void CsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsearchActionPerformed

String id=CID.getText();
String name="";
String path="";

ClientDAO c= new ClientDAO();
List<Client> list= c.select();
for(Client person : list){
    if(id.equals(person.getRegid())){
    name=person.getFirstName()+" "+person.getLastName();
    path=person.getPhotoPath();
    }
    
  
}
Cname.setText(name);


ImageIcon img = new ImageIcon(path);
            Image image = img.getImage().getScaledInstance(Cphoto.getWidth(),Cphoto.getHeight(),Image.SCALE_SMOOTH);
            Cphoto.setIcon(new ImageIcon(image));




        // TODO add your handling code here:
    }//GEN-LAST:event_CsearchActionPerformed

    private void CLIENTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLIENTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLIENTActionPerformed

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed

String id=BID.getText();
String tittle="";
String author="";

BookDAO b= new BookDAO();
List<Book> list= b.select();
for(Book bo : list){
    if(id.equals(bo.getBookid())){
    tittle=bo.getTitle();
    author=bo.getAuthor();
    }
    else{
        JOptionPane.showMessageDialog(this, "Please Enter a valid ID,   Check in the combobox to view valid IDs ");
    }
    

}
Bname.setText(tittle);
Aname.setText(author);

        // TODO add your handling code here:
    }//GEN-LAST:event_BsearchActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed

try {
           check_in.print(JTable.PrintMode.NORMAL);
           
           // TODO add your handling code here:
       } catch (PrinterException ex) {
           Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_PrintActionPerformed

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
DefaultTableModel mdOut = (DefaultTableModel) check_in.getModel();
      Paragraph p=null;
         try{
             PdfPTable tb= new PdfPTable(5);
             PdfPCell c1 = new  PdfPCell(new Phrase("Client ID"));
             tb.addCell(c1);
              c1 = new  PdfPCell(new Phrase("Book Name"));
             tb.addCell(c1);
             c1 = new  PdfPCell(new Phrase("Author"));
             tb.addCell(c1);
              c1 = new  PdfPCell(new Phrase("Status"));
             tb.addCell(c1);
             c1 = new  PdfPCell(new Phrase("Return date"));
             tb.addCell(c1);
             tb.setHeaderRows(1);
             
            String file ="C:\\Users\\USER\\Desktop\\Hibernate\\report.pdf" ;
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(file));
            doc.open();
            for(int i=0; i<mdOut.getRowCount();i++)
          {
              
              for(int j=0;j<mdOut.getColumnCount();j++)
              {
                 tb.addCell(mdOut.getValueAt(i, j).toString()+"\t");
                 
                
                 
                 
              }
          
          }
            doc.add(tb);
            doc.close();
            JOptionPane.showMessageDialog(null, "PDF created");
        }catch(Exception e)
        {
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_PDFActionPerformed

    private void ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcelActionPerformed

        FileOutputStream excelFout =null;
            BufferedOutputStream excelBout = null;
            XSSFWorkbook excelJTableExporter=null;
        JFileChooser excelFileChooser= new JFileChooser();
        excelFileChooser.setDialogTitle("Save As");
        FileNameExtensionFilter fnef= new FileNameExtensionFilter("EXCEL FILES","xls","xlsx","xlsm");
        excelFileChooser.setFileFilter(fnef);
        excelFileChooser.showSaveDialog(null);
        int excelChooser = excelFileChooser.showSaveDialog(null);
        if(excelChooser == JFileChooser.APPROVE_OPTION){
            
            try { 
                 excelJTableExporter =new XSSFWorkbook();
                XSSFSheet excelSheet =excelJTableExporter.createSheet("JTable Sheet");
                for(int i =0; i<check_in.getRowCount();i++){
                    XSSFRow excelRow = excelSheet.createRow(i);
                    for( int j =0; j<check_in.getColumnCount();j++){
                        XSSFCell excelCell = excelRow.createCell(j);
                        excelCell.setCellValue(check_in.getValueAt(i, j).toString());
                    }
                }   
                excelFout = new FileOutputStream(excelFileChooser.getSelectedFile() + ".xlsx");
                excelBout = new BufferedOutputStream(excelFout);
                excelJTableExporter.write(excelBout);
                JOptionPane.showMessageDialog(null, "Done!!");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (excelBout!=null) {
                        excelBout.close();
                    }
                     
                    if (excelFout!=null) {
                        excelFout.close();
                    }
                    
                    if (excelJTableExporter!=null) {
                        excelJTableExporter.close();
                    } 
                    
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
        }                
        // TODO add your handling code here:
    }//GEN-LAST:event_ExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aname;
    private javax.swing.JTextField BID;
    private javax.swing.JComboBox<String> BOOK;
    private javax.swing.JTextField Bname;
    private javax.swing.JButton Bsearch;
    private javax.swing.JTextField CID;
    private javax.swing.JComboBox<String> CLIENT;
    private javax.swing.JTextField Cname;
    private javax.swing.JLabel Cphoto;
    private javax.swing.JButton Csearch;
    private com.toedter.calendar.JDateChooser DATE;
    private com.toedter.calendar.JDateChooser DATE1;
    private javax.swing.JButton Excel;
    private javax.swing.JButton IN1;
    private javax.swing.JButton PDF;
    private javax.swing.JButton Print;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable check_in;
    private javax.swing.JRadioButton checkin;
    private javax.swing.JRadioButton checkout;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

public void TableCheck(){
OperationsDAO c= new OperationsDAO();
List<Operation> list= c.select();
for(Operation check : list){
  clientid=check.getId();
    client=check.getClient();
     book=check.getBook();
     date=check.getDate();
    category=check.getOperationCategory();
    
   
  model.insertRow(model.getRowCount(), new Object []{clientid,client,book,date,category});  
}
}



 private void comboBook(){
        
       
       
           BookDAO b= new BookDAO();
            List<Book> list= b.select();
            for(Book bk : list){
               String id=bk.getBookid();
               
               
               BOOK.addItem(id);
              
               
           }
           
       
       
    }
 private void comboClient(){
        
       
       ClientDAO c= new ClientDAO();
            List<Client> list= c.select();
            for(Client cl : list){
               String id = cl.getRegid();
              
               CLIENT.addItem(id);
              ;
            }
          
       
    }
}
