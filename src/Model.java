import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Model{
    //mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/kuis";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;//untuk perintah query

    public Model() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
            statement = koneksi.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public void reborn() {
    	try {
    		String  query = "UPDATE nilai SET tulis=0 , coding=0 , wawancara=0 , microteaching=0 , jaringan=0 , nim=0";
    		statement.execute(query);
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    }
    
    public int[] ambilData() {
    	try {
    		int[] data = new int[6];
    		String query = "SELECT * FROM nilai ";
    		ResultSet rs = statement.executeQuery(query);
    		while(rs.next()) {
    			if(rs.getInt(4) != 0) {
    				data[0] = rs.getInt(4);
    			}
    			else {
    				data[0] = rs.getInt(5);
    			}
    			data[1] = rs.getInt(1);
    			data[2] = rs.getInt(2);
    			data[3] = rs.getInt(3);
    			data[4] = rs.getInt(6);
    		}
    		return data;
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    	return null;
    }
    
    public void updateNIM(int a) {
    	try {
    		String query = "UPDATE nilai SET nim="+a+"";
    		statement.execute(query);
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    }

    public void updateMicroteaching(int a) {
    	try {
    		String query = "UPDATE nilai SET microteaching="+a+"";
    		statement.execute(query);
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    }
    
    public void updateJaringan(int a) {
    	try {
    		String query = "UPDATE nilai SET jaringan="+a+"";
    		statement.execute(query);
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    }
    
    public void updateTulis(int a) {
    	try {
    		String query = "UPDATE nilai SET tulis="+a+"";
    		statement.execute(query);
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    }
    
    public void updateCoding(int a) {
    	try {
    		String query = "UPDATE nilai SET coding="+a+"";
    		statement.execute(query);
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    }
    
    public void updateWawancara(int a) {
    	try {
    		String query = "UPDATE nilai SET wawancara="+a+"";
    		statement.execute(query);
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    }
    
}
