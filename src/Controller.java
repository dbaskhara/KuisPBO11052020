import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller{

    Model model;
    ViewMain viewMain;
    ViewTest viewTest;

    public Controller(Model model, ViewMain viewMain, ViewTest viewTest) {
    	this.model = model;
        this.viewMain = viewMain;
        this.viewTest = viewTest;
        
        viewMain.bassisten.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				model.reborn();
				viewTest.txttulis1.setText("");
				viewTest.txttulis2.setText("");
				viewTest.txttulis3.setText("");
				viewTest.txttulis4.setText("");
				viewTest.getContentPane().removeAll();
				viewTest.getContentPane().repaint();
				viewTest.testmicroteaching();
			}
		});
        
        viewMain.badmin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				model.reborn();
				viewTest.txttulis1.setText("");
				viewTest.txttulis2.setText("");
				viewTest.txttulis3.setText("");
				viewTest.txttulis4.setText("");
				viewTest.getContentPane().removeAll();
				viewTest.getContentPane().repaint();
				viewTest.testjaringan();
			}
		});
        
        viewTest.bnext1aslab.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nilai = 0;
				Test microteaching = new TestMicroteaching();
				nilai += ((TestMicroteaching)microteaching).checkTest1(viewTest.ambilJawaban1());
				nilai += ((TestMicroteaching)microteaching).checkTest2(viewTest.ambilJawaban2());
				nilai += ((TestMicroteaching)microteaching).checkTest3(viewTest.ambilJawaban3());
				nilai += ((TestMicroteaching)microteaching).checkTest4(viewTest.ambilJawaban4());
				model.updateMicroteaching(nilai);
				model.updateNIM(Integer.parseInt(viewTest.ambilJawaban4()));
				viewTest.txttulis1.setText("");
				viewTest.txttulis2.setText("");
				viewTest.txttulis3.setText("");
				viewTest.txttulis4.setText("");
				viewTest.getContentPane().removeAll();
				viewTest.getContentPane().repaint();
				viewTest.tesTulis();
			}
		});
        
        viewTest.bnext1admin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nilai = 0;
				Test jaringan = new TestJaringan();
				nilai += ((TestJaringan)jaringan).checkTest1(viewTest.ambilJawaban1());
				nilai += ((TestJaringan)jaringan).checkTest2(viewTest.ambilJawaban2());
				nilai += ((TestJaringan)jaringan).checkTest3(viewTest.ambilJawaban3());
				nilai += ((TestJaringan)jaringan).checkTest4(viewTest.ambilJawaban4());
				model.updateJaringan(nilai);
				model.updateNIM(Integer.parseInt(viewTest.ambilJawaban4()));
				viewTest.txttulis1.setText("");
				viewTest.txttulis2.setText("");
				viewTest.txttulis3.setText("");
				viewTest.txttulis4.setText("");
				viewTest.getContentPane().removeAll();
				viewTest.getContentPane().repaint();
				viewTest.tesTulis();
			}
		});
        
        viewTest.bnext2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nilai = 0;
				Test tulis = new TestTulis();
				nilai += ((TestTulis)tulis).checkTest1(viewTest.ambilJawaban1());
				nilai += ((TestTulis)tulis).checkTest2(viewTest.ambilJawaban2());
				nilai += ((TestTulis)tulis).checkTest3(viewTest.ambilJawaban3());
				nilai += ((TestTulis)tulis).checkTest4(viewTest.ambilJawaban4());
				model.updateTulis(nilai);
				viewTest.txttulis1.setText("");
				viewTest.txttulis2.setText("");
				viewTest.txttulis3.setText("");
				viewTest.txttulis4.setText("");
				viewTest.getContentPane().removeAll();
				viewTest.getContentPane().repaint();
				viewTest.testCoding();
			}
		});
        
        viewTest.bnext3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nilai = 0;
				Test coding = new TestCoding();
				nilai += ((TestCoding)coding).checkTest1(viewTest.ambilJawaban1());
				nilai += ((TestCoding)coding).checkTest2(viewTest.ambilJawaban2());
				nilai += ((TestCoding)coding).checkTest3(viewTest.ambilJawaban3());
				nilai += ((TestCoding)coding).checkTest4(viewTest.ambilJawaban4());
				model.updateCoding(nilai);
				viewTest.txttulis1.setText("");
				viewTest.txttulis2.setText("");
				viewTest.txttulis3.setText("");
				viewTest.txttulis4.setText("");
				viewTest.getContentPane().removeAll();
				viewTest.getContentPane().repaint();
				viewTest.testWawancara();;
				
			}
		});
        
        viewTest.bnext4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nilai = 0;
				int[] data = new int[6];
				Test wawancara = new TestWawancara();
				nilai += ((TestWawancara)wawancara).checkTest1(viewTest.ambilJawaban1());
				nilai += ((TestWawancara)wawancara).checkTest2(viewTest.ambilJawaban2());
				nilai += ((TestWawancara)wawancara).checkTest3(viewTest.ambilJawaban3());
				nilai += ((TestWawancara)wawancara).checkTest4(viewTest.ambilJawaban4());
				model.updateWawancara(nilai);
				viewTest.txttulis1.setText("");
				viewTest.txttulis2.setText("");
				viewTest.txttulis3.setText("");
				viewTest.txttulis4.setText("");
				viewTest.getContentPane().removeAll();
				viewTest.getContentPane().repaint();
				viewTest.hasil();
				data = model.ambilData();
				HitungNilai hitungNilai = new HitungNilai(data[0], data[1], data[2], data[3]);
				hitungNilai.hitung();
				viewTest.lnimData.setText(Integer.toString(data[4]));
				viewTest.lhasil1Data.setText(Integer.toString(data[0]));
				viewTest.lhasil2Data.setText(Integer.toString(data[1]));
				viewTest.lhasil3Data.setText(Integer.toString(data[2]));
				viewTest.lhasil4Data.setText(Integer.toString(data[3]));
				viewTest.ltotalAkhirData.setText(Float.toString(hitungNilai.ambilTotalNilai()));
				viewTest.lnilaiAkhirData.setText(Float.toString(hitungNilai.ambilHasilNilai()));
				if(hitungNilai.ambilHasilNilai() > 85) {
					viewTest.lconclusionData.setText("Lulus");
				}
				else {
					viewTest.lconclusionData.setText("Tidak Lulus");
				}
			}
		});
    }
}
