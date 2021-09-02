package main;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Etudiant e1 = new Etudiant("test","test@gmail.com");
		
		EtudiantDAO.create(e1);
		
		List<Etudiant> l = EtudiantDAO.getAll();
		System.out.println(l);

	}

}
