package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

// ======== a?adimos el siguiente codigo ======== 
import javax.swing.table.DefaultTableModel;
// ======== a?adimos el siguiente codigo ======== 



public class frmTabla extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable tblTabla;
    // ======== a?adimos el siguiente codigo ======== 
    private DefaultTableModel modelo;
    // ======== a?adimos el siguiente codigo ======== 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmTabla dialog = new frmTabla();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmTabla() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 416, 243);
		contentPanel.add(scrollPane);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);
		
        // ======== a?adimos el siguiente codigo ======== 
        modelo = new DefaultTableModel();
        modelo.addColumn("c?digo");
        modelo.addColumn("nombre");
        modelo.addColumn("nota 1");
        modelo.addColumn("nota 2");
        modelo.addColumn("promedio");
        tblTabla.setModel(modelo);

        modelo.setRowCount(0);
        Object[] fila = { 123, "Ana", 19, 15, 17.0 };
        modelo.addRow(fila);

        modelo.setRowCount(1);
        Object[] fila2 = { 427, "Juan", 15, 19, 16.5 };
        modelo.addRow(fila2);   

        modelo.setRowCount(2);
        Object[] fila3 = { 326, "Marco", 16, 11, 12.7 };
        modelo.addRow(fila3);         
        
        // ======== a?adimos el siguiente codigo ======== 		

	}
}
