//장난감 추가
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static mainlibrary.LibrarianSuccess.ThisLogined;

/**
 *
 * @Age bikash
 */
public class ToyForm extends javax.swing.JFrame {

	/**
	 * Creates new form ToyForm
	 */
	public ToyForm() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		// jLabel5 = new javax.swing.JLabel();
		// jLabel6 = new javax.swing.JLabel();
		// jLabel7 = new javax.swing.JLabel();
		ToyName = new javax.swing.JTextField();
		Company = new javax.swing.JTextField();
		Age = new javax.swing.JTextField();
		Type = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
		jLabel1.setText("장난감 이름");

		jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
		jLabel3.setText("제조 회사");

		jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
		jLabel4.setText("연령");

		ToyName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ToyNameActionPerformed(evt);
			}
		});

		Company.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CompanyActionPerformed(evt);
			}
		});

		Age.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AgeActionPerformed(evt);
			}
		});

		Type.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TypeActionPerformed(evt);
			}
		});

		/*
		 * Count.addActionListener(new java.awt.event.ActionListener() { public void
		 * actionPerformed(java.awt.event.ActionEvent evt) { CountActionPerformed(evt);
		 * } });
		 */

		jButton1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
		jButton1.setText("장난감 추가");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("뒤로가기");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
		jLabel2.setText("분류");

		Type.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TypeActionPerformed(evt);
			}
		});

		setResizable(false); // pch : 창 크기 고정
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(71, 71, 71).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								// .addComponent(jLabel5)
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel1)
														.addGap(34, 34, 34))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup().addComponent(jLabel3).addGap(52,
																52, 52)))
										.addGroup(
												layout.createSequentialGroup().addComponent(jLabel4).addGap(75, 75, 75))
										.addComponent(jLabel2))
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(Age, javax.swing.GroupLayout.DEFAULT_SIZE, 349,
														Short.MAX_VALUE)
												.addComponent(Company, javax.swing.GroupLayout.DEFAULT_SIZE, 349,
														Short.MAX_VALUE)
												.addComponent(ToyName, javax.swing.GroupLayout.DEFAULT_SIZE, 349,
														Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup()
														 .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE,
														 68, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(36, 36, 36)
														.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
																143, javax.swing.GroupLayout.PREFERRED_SIZE))
												/*
												 * .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, 68,
												 * javax.swing.GroupLayout.PREFERRED_SIZE)
												 */
												.addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, 184,
														javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addGroup(layout.createSequentialGroup().addGap(109, 109, 109)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				/* .addComponent(jLabel6).addComponent(jLabel7) */
				))).addContainerGap(129, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE).addComponent(jButton2).addGap(313, 313, 313)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(141, 141, 141)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(ToyName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(31, 31, 31)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel4).addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel3).addComponent(Company, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(32, 32, 32)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						// .addGap(25, 25, 25).addComponent(jLabel5).addGap(26, 26, 26)
						/*
						 * .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
						 * TRAILING) .addComponent(jLabel6) .addComponent(Count,
						 * javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						 * javax.swing.GroupLayout.PREFERRED_SIZE))
						 */
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										/*
										 * .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
										 * BASELINE) .addComponent(jLabel7).addComponent(Type,
										 * javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										 * javax.swing.GroupLayout.PREFERRED_SIZE))
										 */
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13,
												Short.MAX_VALUE)
										.addComponent(jButton2).addGap(57, 57, 57)))));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void ToyNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ToyNameActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_ToyNameActionPerformed

	private void CompanyActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CompanyActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_CompanyActionPerformed

	private void AgeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AgeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_AgeActionPerformed

	/*
	 * private void ToyNumActionPerformed(java.awt.event.ActionEvent evt) {//
	 * GEN-FIRST:event_ToyNumActionPerformed // TODO add your handling code here:
	 * }// GEN-LAST:event_ToyNumActionPerformed
	 * 
	 * private void CountActionPerformed(java.awt.event.ActionEvent evt) {//
	 * GEN-FIRST:event_CountActionPerformed // TODO add your handling code here: }//
	 * GEN-LAST:event_CountActionPerformed
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		// TODO add your handling code here:
		this.dispose();
		ThisLogined.setVisible(true);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		String ToyN = ToyName.getText();
		String TypeN = Type.getText();
		String AgeN = Age.getText();
		String CompanyN = Company.getText();
		if (ToyDao.ToyNameValidate(CompanyN)) {
			//?
		} else {
//			if (ToyDao.AddToyName(CompanyN) != 0) {
//				; // JOptionPane.showMessageDialog(ToyForm.this, "Sorry, Company can't be
//					// added!","Company Error!", JOptionPane.ERROR_MESSAGE);
//			}
		}
		if (ToyDao.SaveToy(ToyN, TypeN, AgeN, CompanyN) != 0) {
			JOptionPane.showMessageDialog(ToyForm.this, "장난감이 추가되었습니다!", "장난감 추가 성공!", JOptionPane.ERROR_MESSAGE);
			ToyName.setText("");
			Type.setText("");
			Age.setText("");
			Company.setText("");
		} else
			JOptionPane.showMessageDialog(ToyForm.this, "장난감이 추가되지 않았습니다!", "장난감 추가 실패!", JOptionPane.ERROR_MESSAGE);

	}// GEN-LAST:event_jButton1ActionPerformed

	private void TypeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TypeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_TypeActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ToyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ToyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ToyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ToyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ToyForm().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField Age;
	private javax.swing.JTextField ToyName;
	private javax.swing.JTextField Type;
	private javax.swing.JTextField Company;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	// private javax.swing.JLabel jLabel5;
	// private javax.swing.JLabel jLabel6;
	// private javax.swing.JLabel jLabel7;
	// End of variables declaration//GEN-END:variables
}
