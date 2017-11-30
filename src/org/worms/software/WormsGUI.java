package org.worms.software;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import org.worms.hardware.Store;
import org.worms.people.Employee;
import org.worms.people.Manager;

public class WormsGUI extends JFrame
{
	private Store store;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu HRMenu;
	private JMenu EmployeeMenu;
	private JMenu ManagerMenu;
	
//////////file menu items//////////
	private JMenuItem fileExit;
	
//////////hr menu items//////////
	private JMenuItem HRFire;
	private JMenuItem HRHire;
	private JMenuItem HRPayRate;
	private JMenuItem HRPrintEmployeeList;
	
//////////employee menu items//////////
	private JMenuItem EmployeePrintSchedule;
	private JMenuItem EmployeeViewTasks;
	
//////////manager menu items//////////
	private JMenuItem ManagerPrintSchedule;
	private JMenuItem ManagerPrintEmployeeList;
	private JMenuItem ManagerAssignTask;
	private JMenuItem ManagerRemoveTask;
	
//////////text fields//////////
	private JTextField printScheduleEmployeeNameText;
	private JTextField printTaskText;
	private JTextField printScheduleManagerNameText;
	
//////////frames//////////
	private JFrame printScheduleFrame;
	private JFrame printTaskFrame;
	private JFrame scheduleFrame;
	private JFrame employeeErrorFrame;
	private JFrame taskFrame;
	private JFrame printManagerScheduleFrame;
	private JFrame managerScheduleFrame;
//////////text areas//////////
	private JTextArea wormsText;
	private JTextArea scheduleText;
	private JTextArea taskText;
	private JTextArea managerScheduleText;
	



	public WormsGUI(String windowTitle, Store store)
	{
		
		super("     " + windowTitle);
		
		this.store = store;
		setResizable(true);
		setSize(500, 300);
		wormsText = new JTextArea("     Welcome to I've Got Worms.");
		add(wormsText);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		buildGUI();
		setVisible(true);
		pack();
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
			else if(source.equals(EmployeePrintSchedule))
			{
				handleEmployeePrintSchedule();
			}
			else if(source.equals(EmployeeViewTasks))
			{
				handleEmployeeViewTasks();
			}
			else if(source.equals(ManagerPrintSchedule))
			{
				handleManagerPrintSchedule();
			}
			else if(source.equals(ManagerPrintEmployeeList))
			{
				handleManagerPrintEmployeeList();
			}
			else if(source.equals(ManagerAssignTask))
			{
				handleManagerAssignTask();
			}
			else if(source.equals(ManagerRemoveTask)) {
				handleManagerRemoveTask();
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
	private void handleEmployeeViewTasks()
	{
		printTaskFrame = new JFrame("Print Employee Tasks");
		//printTaskFarme.setSize(300, 100);
		printTaskFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel = new JLabel("Employee Name:");
		printTaskText = new JTextField(15);
		JButton printTaskOKButton = new JButton("OK");
		JButton printTaskCancelButton = new JButton("Cancel");
		
		printTaskOKButton.addActionListener(new printTaskOKButtonListener());
		printTaskCancelButton.addActionListener(new printTaskCancelButtonListener());
		
		panel.add(messageLabel);
		panel.add(printTaskText);
		panel.add(printTaskOKButton);
		panel.add(printTaskCancelButton);
		
		printTaskFrame.add(panel);
		printTaskFrame.setVisible(true);
		printTaskFrame.pack();
	}
	private void handleEmployeePrintSchedule()

	{
		printScheduleFrame = new JFrame("Print Employee Schedule");
		printScheduleFrame.setSize(300, 100);
		printScheduleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel = new JPanel(new GridLayout(4,2));
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel = new JLabel("Employee Name:");
		printScheduleEmployeeNameText = new JTextField(15);
		JButton printScheduleOKButton = new JButton("OK");
		JButton printScheduleCancelButton = new JButton("Cancel");
		
		printScheduleOKButton.addActionListener(new printScheduleOKButtonListener());
		printScheduleCancelButton.addActionListener(new printScheduleCancelButtonListener());
		
		panel.add(messageLabel);
		panel.add(printScheduleEmployeeNameText);
		panel.add(printScheduleOKButton);
		panel.add(printScheduleCancelButton);
		
		printScheduleFrame.add(panel);
		printScheduleFrame.setVisible(true);
		printScheduleFrame.pack();
	}
	private void handleManagerPrintSchedule()
	{
		printManagerScheduleFrame = new JFrame("Print Manager's Schedule");
		printManagerScheduleFrame.setSize(300, 100);
		printManagerScheduleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel = new JPanel(new GridLayout(4,2));
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel = new JLabel("Manager's Name:");
		printScheduleManagerNameText = new JTextField(15);
		JButton printManagerScheduleOKButton = new JButton("OK");
		JButton printManagerScheduleCancelButton = new JButton("Cancel");
		
		printManagerScheduleOKButton.addActionListener(new printManagerScheduleOKButtonListener());
		printManagerScheduleCancelButton.addActionListener(new printManagerScheduleCancelButtonListener());
		
		panel.add(messageLabel);
		panel.add(printScheduleManagerNameText);
		panel.add(printManagerScheduleOKButton);
		panel.add(printManagerScheduleCancelButton);
		
		printManagerScheduleFrame.add(panel);
		printManagerScheduleFrame.setVisible(true);
		printManagerScheduleFrame.pack();
	}
	private void handleManagerPrintEmployeeList()
	{
		
	}
	private void handleManagerAssignTask()
	{
		
	}
	private void handleManagerRemoveTask()
	{
		
	}
	
		
	private class scheduleOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			scheduleFrame.setVisible(false);
		}
	}
	private class printManagerScheduleOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String str;
			boolean isEmployee = false;
			int index = 0;
			
			str = printScheduleManagerNameText.getText();
			for(int i = 0; i < store.getManagerList().size(); i++)
			{
				if(store.getManagerList().get(i).getName().equals(str))
					{
						isEmployee = true;
						index = i;
						
						
				}
			}
			if(isEmployee)
			{
				printManagerSchedule(store.getManagerList().get(index));
			}
			
			else 
			{
				JOptionPane.showMessageDialog(employeeErrorFrame, "Manager \"" + str + "\" doesn't exist", "Error finding employeee", 0);
				return;
			
			}
		}
	}
	private class printScheduleOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			String str;
			boolean isEmployee = false;
			int employeeIndex = 0;
			int departmentIndex = 0;
			str = printScheduleEmployeeNameText.getText();
			for(int i = 0; i < store.getDepartmentList().size(); i++)
			{
				for(int j = 0; j < store.getDepartmentList().get(i).getEmployeeList().size(); j++)
				{
					if(store.getDepartmentList().get(i).getEmployeeList().get(j).getName().equals(str))
					{
						isEmployee = true;
						departmentIndex = i;
						employeeIndex = j;
					}
				}
			}
			if(isEmployee)
			{
				printEmployeeSchedule(store.getDepartmentList().get(departmentIndex).getEmployeeList().get(employeeIndex));
			}
			//System.out.println(str);
			else 
			{
				JOptionPane.showMessageDialog(employeeErrorFrame, "Employee \"" + str + "\" doesn't exist", "Error finding employeee", 0);
				return;
			
			}
			
		}
	}
	private class printScheduleCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			printScheduleFrame.setVisible(false);
		}
	}
	private class printTaskOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
			String str;
			boolean isEmployee = false;
			int employeeIndex = 0;
			int departmentIndex = 0;
			str = printTaskText.getText();
			for(int i = 0; i < store.getDepartmentList().size(); i++)
			{
				for(int j = 0; j < store.getDepartmentList().get(i).getEmployeeList().size(); j++)
				{
					if(store.getDepartmentList().get(i).getEmployeeList().get(j).getName().equals(str))
					{
						isEmployee = true;
						departmentIndex = i;
						employeeIndex = j;
					}
				}
			}
			if(isEmployee)
			{
				
				printEmployeeTasks(store.getDepartmentList().get(departmentIndex).getEmployeeList().get(employeeIndex));
			}
			//System.out.println(str);
			else 
			{
				JOptionPane.showMessageDialog(employeeErrorFrame, "Employee \"" + str + "\" doesn't exist", "Error finding employeee", 0);
				return;
			
			}
			
		}
	}
	private class managerScheduleOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			managerScheduleFrame.setVisible(false);
		}
	}
	private class printManagerScheduleCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			printManagerScheduleFrame.setVisible(false);
		}
	}
	private class taskOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			taskFrame.setVisible(false);
		}
	}
	private class printTaskCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			printTaskFrame.setVisible(false);
		}
	}
	
	private void printEmployeeTasks(Employee employee)
	{
		taskFrame = new JFrame("Print Employee Tasks");
		taskFrame.setSize(300, 500);
		taskFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new FlowLayout());
		taskText = new JTextArea();
		taskText.append("Tasks:\n");
		for(int i = 0; i < employee.getTaskList().size(); i++)
		{
			taskText.append(employee.getTaskList().get(i).getName());
			taskText.append("\n");
			
		}
		
		JButton taskOKButton = new JButton("OK");
		
		
		taskOKButton.addActionListener(new taskOKButtonListener());
		
		
		
		panel.add(taskText);
		panel.add(taskOKButton);
		
		taskFrame.add(panel);
		taskFrame.setVisible(true);
		taskFrame.pack();
	}
	private void printEmployeeSchedule(Employee employee)
	{
		scheduleFrame = new JFrame("Print Employee Schedule");
		scheduleFrame.setSize(300, 500);
		scheduleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel = new JPanel(new GridLayout(4,2));
		JPanel panel = new JPanel(new FlowLayout());
		scheduleText = new JTextArea();
		scheduleText.append("Work Schedule:\n");
		for(int i = 0; i < employee.getWorkSchedule().size(); i++)
		{
			scheduleText.append(Store.scheduleToString(employee.getWorkSchedule().get(i)));
			scheduleText.append("\n");
			
		}
		scheduleText.append("\n\nAppointment Schedule:\n");
		for(int j = 0; j < employee.getAppointmentSchedule().size(); j++)
		{
			scheduleText.append(Store.scheduleToString(employee.getAppointmentSchedule().get(j)));
			scheduleText.append("\n");
		}
		JButton scheduleOKButton = new JButton("OK");
		
		
		scheduleOKButton.addActionListener(new scheduleOKButtonListener());
		
		
		
		panel.add(scheduleText);
		panel.add(scheduleOKButton);
		
		scheduleFrame.add(panel);
		scheduleFrame.setVisible(true);
		scheduleFrame.pack();
	}
	private void printManagerSchedule(Manager manager)
	{
		managerScheduleFrame = new JFrame("Print Manager Schedule");
		managerScheduleFrame.setSize(300, 500);
		managerScheduleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel = new JPanel(new GridLayout(4,2));
		JPanel panel = new JPanel(new FlowLayout());
		managerScheduleText = new JTextArea();
		managerScheduleText.append("Work Schedule:\n");
		for(int i = 0; i < manager.getWorkSchedule().size(); i++)
		{
			managerScheduleText.append(Store.scheduleToString(manager.getWorkSchedule().get(i)));
			managerScheduleText.append("\n");
			
		}
		managerScheduleText.append("\n\nAppointment Schedule:\n");
		for(int j = 0; j < manager.getAppointmentSchedule().size(); j++)
		{
			managerScheduleText.append(Store.scheduleToString(manager.getAppointmentSchedule().get(j)));
			managerScheduleText.append("\n");
		}
		JButton managerScheduleOKButton = new JButton("OK");
		
		
		managerScheduleOKButton.addActionListener(new managerScheduleOKButtonListener());
		
		
		
		panel.add(managerScheduleText);
		panel.add(managerScheduleOKButton);
		
		managerScheduleFrame.add(panel);
		managerScheduleFrame.setVisible(true);
		managerScheduleFrame.pack();
	}
}


