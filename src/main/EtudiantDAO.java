package main;

import java.sql.*;
import java.util.*;

public class EtudiantDAO {
	
	public static void create(Etudiant etudiant)
	{
		try {
			Statement stmt = Util.open();
			stmt.executeUpdate("insert into etudiant(nom,email) values('"+etudiant.getNom()+"','"+etudiant.getEmail()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				Util.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static List<Etudiant> getAll()
	{
		List<Etudiant>le = new ArrayList<>();;
		
		try {
			Statement stmt = Util.open();
			ResultSet rs = stmt.executeQuery("select * from etudiant");
			
			while (rs.next()) {
				Etudiant e = new Etudiant(rs.getInt("id"),rs.getString("nom"),rs.getString("email"));
				le.add(e);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			try {
				Util.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	
		return le;
		
	}
	
	public Etudiant delete(int id)  // retourne l'étudiant supprimé
	{
		Etudiant e = null;
		
		// traitement
		
		return e;
		
	}
	
	public Etudiant get(String email) // retourne l'étudiant par son id
	{
		Etudiant e = null;
		
		// traitement
		
		return e;
		
	}

}
