package mainlibrary;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class Chart extends JFrame{
private JButton bt1;
private JButton bt2;
private JButton bt3;

public Chart() {
   bt1 = new JButton();   //���� �� ������
   bt2 = new JButton();   //������ ���� ����
   bt3 = new JButton();

   
   //pch_INSERT
   setResizable(false); //pch : �� ���� ����
   javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
   getContentPane().setLayout(layout);
   layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addContainerGap(172, Short.MAX_VALUE)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addGap(254, 254, 254))))
       );
   layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(76, 76, 76)
               .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(34, 34, 34)
               .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
               .addGap(137, 137, 137))
       );
   //pch_END
   
   bt1.setText("연령 별 그래프");
   bt2.setText("장난감 인기순위");
   bt3.setText("뒤로 가기");
   setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
    bt1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             bt1ActionPerformed(evt);
         }
     });
    bt2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             bt2ActionPerformed(evt);
         }
     });
    bt3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bt3ActionPerformed(evt);
        }
    });
    
    
    this.setLayout(new FlowLayout());
    this.add(bt1);
    this.add(bt2);
    this.add(bt3);
    this.setSize(1000, 1000);
    
}
private void bt1ActionPerformed(java.awt.event.ActionEvent evt)
{
   PolylineBarChart.main(new String[]{});
}
private void bt2ActionPerformed(java.awt.event.ActionEvent evt)
{
   PopulityRanking.main(new String[]{});
}
private void bt3ActionPerformed(java.awt.event.ActionEvent evt)
{
   this.setVisible(false);
   MainLibrary.main(new String[]{});
}

   public static void main(String[] args) {
         new Chart().setVisible(true);
   }
   
}