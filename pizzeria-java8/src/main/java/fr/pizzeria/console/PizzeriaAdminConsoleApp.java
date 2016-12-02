package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.FichierDaoFactory;
import fr.pizzeria.ihm.IhmUtil;
import fr.pizzeria.ihm.MainMenu;
import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		p1.setCode("MAR");

		Pizza p2 = new Pizza();
		p2.setCode("MAR");

		System.out.println("p1=p2 ? " + p1.equals(p2));

		IhmUtil ihmUtil = new IhmUtil(new Scanner(System.in), new FichierDaoFactory());

		MainMenu mainMenu = new MainMenu(ihmUtil);

		mainMenu.displayMenu();

	}
}