package mainlibrary;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.font.*;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ChartMenu extends JFrame{
private JButton bt1;
private JButton bt2;
private JButton bt3;

public ChartMenu() {
   setResizable(false);
   bt1 = new JButton();   
   bt2 = new JButton();   
   bt3 = new JButton();
   this.setLayout(new GridLayout(0, 1));    //n행 1열
   bt1.setText("연령 별 그래프");
   bt2.setText("장난감 인기순위");
   bt3.setText("뒤로 가기");
   bt1.setFont(new Font("배달의민족 도현",Font.ITALIC,25));
   bt1.setBackground(Color.WHITE);
   bt2.setFont(new Font("배달의민족 도현",Font.ITALIC,25));
   bt2.setBackground(Color.WHITE);
   bt3.setFont(new Font("배달의민족 도현",Font.ITALIC,25));
   bt3.setBackground(Color.WHITE);
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
   // bt1.
    this.add(bt1);
    this.add(bt2);
    this.add(bt3);
    this.setSize(500, 600);
    
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
         new ChartMenu().setVisible(true);
   }
}
