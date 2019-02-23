package pl.jaceksysiak.designpatterns.demo1.controller;

import java.sql.SQLException;

import pl.jaceksysiak.designpatterns.demo1.model.MySQLDAOFactory;
import pl.jaceksysiak.designpatterns.demo1.model.DAOFactory;
import pl.jaceksysiak.designpatterns.demo1.model.Model;
import pl.jaceksysiak.designpatterns.demo1.model.Person;
import pl.jaceksysiak.designpatterns.demo1.model.PersonDAO;
import pl.jaceksysiak.designpatterns.demo1.view.CreateUserEvent;
import pl.jaceksysiak.designpatterns.demo1.view.CreateUserListener;
import pl.jaceksysiak.designpatterns.demo1.view.View;

public class Controller implements CreateUserListener {
	
	private View view;
	private Model model;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
		
		DAOFactory factory = DAOFactory.getFactory(DAOFactory.MYSQL);
		
		PersonDAO personDAO = factory.getPersonDAO();
		
		System.out.println("Login event received." + " Name: " +event.getName() + " passwrrd: " + event.getPassword());
		System.out.println("Jestem w: controller.userCreated() - implementacja metody interfejsu LoginListener ");
		
		try {
			personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}
