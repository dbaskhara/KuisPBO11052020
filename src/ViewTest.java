import java.awt.Color;
import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


public class ViewTest extends JFrame {

	JLabel lmicroteaching1 = new JLabel("Sebagai Apa Anda Mendaftar : ");
	JLabel lmicroteaching2 = new JLabel("Apakah Anda Sudah Siap : ");
	JLabel lmicroteaching3 = new JLabel("Anda Akan Mengajar : ");
	JLabel lmicroteaching4 = new JLabel("Tulis NIM Anda : ");
	JLabel ljaringan1 = new JLabel("Sebagai Apa Anda Mendaftar :");
	JLabel ljaringan2 = new JLabel("Apakah Anda Sudah Siap : ");
	JLabel ljaringan3 = new JLabel("Anda Akan Mengadmin");
	JLabel ljaringan4 = new JLabel("Tulis NIM Anda : ");
	JLabel ltulis1 = new JLabel("NIM : ");
	JLabel ltulis2 = new JLabel("Persamaan Kata Insomnia : ");
	JLabel ltulis3 = new JLabel("Lawan Kata Panjang : ");
	JLabel ltulis4 = new JLabel("Mobil – Ban = Pelari – : ");
	JLabel lcoding1 = new JLabel("NIM : ");
	JLabel lcoding2 = new JLabel("Fungsi  : ");
	JLabel lcoding3 = new JLabel("Fungsi Pengembalian :  ");
	JLabel lcoding4 = new JLabel("Fungsi Pangkat :  ");
	JLabel lwawancara1 = new JLabel("NIM Anda : ");
	JLabel lwawancara2 = new JLabel("Apakah Anda Serius : ");
	JLabel lwawancara3 = new JLabel("Apakah Anda Serius : ");
	JLabel lwawancara4 = new JLabel("NIM Anda : ");
	JLabel lnim = new JLabel("NIM : ");
	JLabel lhasil1 = new JLabel("Test 1 : ");
	JLabel lhasil2 = new JLabel("Test 2 : ");
	JLabel lhasil3 = new JLabel("Test 3 : ");
	JLabel lhasil4 = new JLabel("Test 4 : ");
	JLabel ltotalAkhir = new JLabel("Total Nilai : ");
	JLabel lnilaiAkhir = new JLabel("Nilai AKhir : ");
	JLabel lconclusion = new JLabel("Keterangan : ");
	JLabel lnimData = new JLabel("");
	JLabel lhasil1Data = new JLabel("");
	JLabel lhasil2Data = new JLabel("");
	JLabel lhasil3Data = new JLabel("");
	JLabel lhasil4Data = new JLabel("");
	JLabel ltotalAkhirData = new JLabel("");
	JLabel lnilaiAkhirData = new JLabel("");
	JLabel lconclusionData = new JLabel("");
	
	
	JTextField txttulis1 = new JTextField("");
	JTextField txttulis2 = new JTextField("");
	JTextField txttulis3 = new JTextField("");
	JTextField txttulis4 = new JTextField(""); 

	JButton bnext1aslab = new JButton("Lanjut");
	JButton bnext1admin = new JButton("Lanjut");
	JButton bnext2 = new JButton("Lanjut");
	JButton bnext3 = new JButton("Lanjut");
	JButton bnext4 = new JButton("Lanjut");
	
	public void hasil() {
		setLayout(null);
		add(lnim);
		add(lnimData);
		add(lhasil1);
		add(lhasil2);
		add(lhasil3);
		add(lhasil4);
		add(lhasil1Data);
		add(lhasil2Data);
		add(lhasil3Data);
		add(lhasil4Data);
		add(lnilaiAkhir);
		add(ltotalAkhir);
		add(lconclusion);
		add(lnilaiAkhirData);
		add(ltotalAkhirData);
		add(lconclusionData);
		
		lnim.setBounds(10,30,200,20);
		lhasil1.setBounds(10,60,200,20);
		lhasil2.setBounds(10,90,200,20);
		lhasil3.setBounds(10,120,200,20);
		lhasil4.setBounds(10,150,200,20);
		ltotalAkhir.setBounds(10,180,200,20);
		lnilaiAkhir.setBounds(10,210,200,20);
		lconclusion.setBounds(10,240,200,20);
		lnimData.setBounds(180,30,70,20);
		lhasil1Data.setBounds(180,60,70,20);
		lhasil2Data.setBounds(180,90,70,20);
		lhasil3Data.setBounds(180,120,70,20);
		lhasil4Data.setBounds(180,150,70,20);
		ltotalAkhirData.setBounds(180,180,200,20);
		lnilaiAkhirData.setBounds(180,210,200,20);
		lconclusionData.setBounds(180,240,200,20);
		
		setSize(300, 400);
    	setLocationRelativeTo(null);
    	setVisible(true);
	}
	
	public void testjaringan() {
		setLayout(null);
		add(ljaringan1);
		add(ljaringan2);
		add(ljaringan3);
		add(ljaringan4);
		add(txttulis1);
		add(txttulis2);
		add(txttulis3);
		add(txttulis4);
		add(bnext1admin);
		
		ljaringan1.setBounds(10,30,200,20);
		ljaringan2.setBounds(10,60,200,20);
		ljaringan3.setBounds(10,90,200,20);
		ljaringan4.setBounds(10,120,200,20);
		txttulis1.setBounds(180,30,70,20);
		txttulis2.setBounds(180,60,70,20);
		txttulis3.setBounds(180,90,70,20);
		txttulis4.setBounds(180,120,70,20);
		bnext1admin.setBounds(10,150,160,20);
		
		setSize(300, 250);
    	setLocationRelativeTo(null);
    	setVisible(true);
	}
	
	public void testmicroteaching() {
		setLayout(null);
		add(lmicroteaching1);
		add(lmicroteaching2);
		add(lmicroteaching3);
		add(lmicroteaching4);
		add(txttulis1);
		add(txttulis2);
		add(txttulis3);
		add(txttulis4);
		add(bnext1aslab);
		
		lmicroteaching1.setBounds(10,30,200,20);
		lmicroteaching2.setBounds(10,60,200,20);
		lmicroteaching3.setBounds(10,90,200,20);
		lmicroteaching4.setBounds(10,120,200,20);
		txttulis1.setBounds(180,30,70,20);
		txttulis2.setBounds(180,60,70,20);
		txttulis3.setBounds(180,90,70,20);
		txttulis4.setBounds(180,120,70,20);
		bnext1aslab.setBounds(10,150,160,20);
		
		setSize(300, 250);
    	setLocationRelativeTo(null);
    	setVisible(true);
	}
	
	public void tesTulis() {
		setLayout(null);
		add(ltulis1);
		add(ltulis2);
		add(ltulis3);
		add(ltulis4);
		add(txttulis1);
		add(txttulis2);
		add(txttulis3);
		add(txttulis4);
		add(bnext2);

		ltulis1.setBounds(10,30,200,20);
		ltulis2.setBounds(10,60,200,20);
		ltulis3.setBounds(10,90,200,20);
		ltulis4.setBounds(10,120,200,20);
		txttulis1.setBounds(180,30,70,20);
		txttulis2.setBounds(180,60,70,20);
		txttulis3.setBounds(180,90,70,20);
		txttulis4.setBounds(180,120,70,20);
		bnext2.setBounds(10,150,160,20);
		
    	setSize(300, 250);
    	setLocationRelativeTo(null);
    	setVisible(true);
	}
	
	public void testCoding() {
		setLayout(null);
		add(lcoding1);
		add(lcoding2);
		add(lcoding3);
		add(lcoding4);
		add(txttulis1);
		add(txttulis2);
		add(txttulis3);
		add(txttulis4);
		add(bnext3);
		
		lcoding1.setBounds(10,30,200,20);
		lcoding2.setBounds(10,60,200,20);
		lcoding3.setBounds(10,90,200,20);
		lcoding4.setBounds(10,120,200,20);
		txttulis1.setBounds(180,30,70,20);
		txttulis2.setBounds(180,60,70,20);
		txttulis3.setBounds(180,90,70,20);
		txttulis4.setBounds(180,120,70,20);
		bnext3.setBounds(10,150,160,20);
		
		setSize(300, 250);
    	setLocationRelativeTo(null);
    	setVisible(true);
	}
	
	public void testWawancara() {
		setLayout(null);
		add(lwawancara1);
		add(lwawancara2);
		add(lwawancara3);
		add(lwawancara4);
		add(txttulis1);
		add(txttulis2);
		add(txttulis3);
		add(txttulis4);
		add(bnext4);
		
		lwawancara1.setBounds(10,30,200,20);
		lwawancara2.setBounds(10,60,200,20);
		lwawancara3.setBounds(10,90,200,20);
		lwawancara4.setBounds(10,120,200,20);
		txttulis1.setBounds(180,30,70,20);
		txttulis2.setBounds(180,60,70,20);
		txttulis3.setBounds(180,90,70,20);
		txttulis4.setBounds(180,120,70,20);
		bnext4.setBounds(10,150,160,20);
		
		setSize(300, 250);
    	setLocationRelativeTo(null);
    	setVisible(true);
	}
	
	public String ambilJawaban1() {
		return txttulis1.getText();
	}
	
	public String ambilJawaban2() {
		return txttulis2.getText();
	}
	
	public String ambilJawaban3() {
		return txttulis3.getText();
	}
	
	public String ambilJawaban4() {
		return txttulis4.getText();
	}
	
}
