package org.worms.software;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class WormsGUI extends JFrame
{
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu HRMenu;
	private JMenu EmployeeMenu;
	private JMenu ManagerMenu;
	
	private JMenuItem fileExit;
	
	private JMenuItem HRFire;
	private JMenuItem HRHire;
	private JMenuItem HRPayRate;
	private JMenuItem HRPrintEmployeeList;
	
	private JMenuItem EmployeePrintSchedule;
	private JMenuItem EmployeeViewTasks;
	
	private JMenuItem ManagerPrintSchedule;
	private JMenuItem ManagerPrintEmployeeList;
	private JMenuItem ManagerAssignTask;
	private JMenuItem ManagerRemoveTask;
	
	
	
	private JTextArea wormsText;
	
	public WormsGUI(String windowTitle)
	{
		super("     " + windowTitle);
		setSize(500, 500);
		wormsText = new JTextArea("     Welcome to I've Got Worms.");
		add(wormsText);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		buildGUI();
		setVisible(true);
	}
	public void buildGUI()
	{
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		
		HRMenu = new JMenu("HR");
		
		EmployeeMenu = new JMenu("Employee");
		
		ManagerMenu = new JMenu("Manager");
		
		fileExit = new JMenuItem("Exit");
		
		HRFire = new JMenuItem("Fire");
		HRHire = new JMenuItem("Hire");
		HRPayRate = new JMenuItem("Adjust Pay");
		HRPrintEmployeeList = new JMenuItem("Print Employee's");
		
		EmployeePrintSchedule = new JMenuItem("Print Schedule");
		EmployeeViewTasks = new JMenuItem("View Tasks");
		
		ManagerPrintSchedule = new JMenuItem("Print Schedule");
		ManagerPrintEmployeeList = new JMenuItem("Print Employee List");
		ManagerAssignTask = new JMenuItem("Assign Task");
		ManagerRemoveTask = new JMenuItem("Remove Task");
		
		
		//action listeners
		fileExit.addActionListener(new MenuListener());;
		
		HRFire.addActionListener(new MenuListener());
		HRHire.addActionListener(new MenuListener());
		HRPayRate.addActionListener(new MenuListener());
		HRPrintEmployeeList.addActionListener(new MenuListener());
		
		EmployeePrintSchedule.addActionListener(new MenuListener());
		EmployeeViewTasks.addActionListener(new MenuListener());
		
		ManagerPrintSchedule.addActionListener(new MenuListener());
		ManagerPrintEmployeeList.addActionListener(new MenuListener());
		ManagerAssignTask.addActionListener(new MenuListener());
		ManagerRemoveTask.addActionListener(new MenuListener());
		
		fileMenu.add(fileExit);
		
		HRMenu.add(HRFire);
		HRMenu.add(HRHire);
		HRMenu.add(HRPayRate);
		HRMenu.add(HRPrintEmployeeList);
		
		EmployeeMenu.add(EmployeePrintSchedule);
		EmployeeMenu.add(EmployeeViewTasks);
		
		ManagerMenu.add(ManagerPrintSchedule);
		ManagerMenu.add(ManagerPrintEmployeeList);
		ManagerMenu.add(ManagerAssignTask);
		ManagerMenu.add(ManagerRemoveTask);
		
		menuBar.add(fileMenu);
		menuBar.add(HRMenu);
		menuBar.add(ManagerMenu);
		menuBar.add(EmployeeMenu);
		
		setJMenuBar(menuBar);
		
	}
	private class MenuListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			JMenuItem source = (JMenuItem)(e.getSource());
			if(source.equals(fileExit))
			{
				handleFileExit();
			}
			else if(source.equals(HRFire)) 
			{
				handleHRFire();
			}
			else if(source.equals(HRHire))
			{
				handleHRHire();
			}
			else if(source.equals(HRPayRate))
			{
				handleHRPayRate();
			}
			else if(source.equals(HRPrintEmployeeList))
			{
				handleHRPrintEmployeeList();
			}		
		}
	}
	private void handleFileExit()
	{
		System.exit(0);
	}
	private void handleHRFire()
	{
		
	}
	private void handleHRHire()
	{
		
	}
	private void handleHRPayRate()
	{
		
	}
	private void handleHRPrintEmployeeList()
	{
		
	}
	
	
}


