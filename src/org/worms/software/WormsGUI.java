package org.worms.software;

import java.awt.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import org.worms.hardware.Store;
import org.worms.hardware.Task;
import org.worms.people.Employee;
import org.worms.people.Manager;
import org.worms.people.SalesEmployee;

public class WormsGUI extends JFrame
{
	
	private static final long serialVersionUID = 1L;
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
	private JTextField hrFireNameText;
	private JTextField hrFireHRText;
	private JTextField hrHirePayText;
	private JTextField hrHireNameText;
	private JTextField hrHireHRText;
	private JTextField hrHireDeptText;
	private JTextField hrNameText;
	private JTextField hrEmployeeNameText;
	private JTextField hrAdjustSalaryText;
	private JTextField hrIncreasePayText;
	private JTextField managerNameText;
	private JTextField managerEmpNameText;
	private JTextField managerTaskText;
	private JTextField taskNumberText;
	
//////////frames//////////
	private JFrame printScheduleFrame;
	private JFrame printTaskFrame;
	private JFrame scheduleFrame;
	private JFrame employeeErrorFrame;
	private JFrame taskFrame;
	private JFrame printManagerScheduleFrame;
	private JFrame managerScheduleFrame;
	private JFrame hrFireFrame;
	private JFrame hrHRErrorFrame;
	private JFrame hrEmployeeErrorFrame;
	private JFrame hrFireSuccessFrame;
	private JFrame hrHireFrame;
	private JFrame hrHireSuccessFrame;
	private JFrame hrPayRateFrame;
	private JFrame hrPayRateErrorFrame;
	private JFrame hrEmployeeFrame;
	private JFrame managerPrintEmployeeFrame;
	private JFrame employeeListFrame;
	private JFrame managerAssignTaskFrame;
	private JFrame managerRemoveTaskFrame;
	private JFrame taskListFrame;

	//////////text areas//////////
	private JTextArea wormsText;
	private JTextArea scheduleText;
	private JTextArea taskText;
	private JTextArea managerScheduleText;
	private JTextArea employeeListText;
	private JTextArea managerEmployeeListText;
	private JTextArea taskListText;
	
	



	public WormsGUI(String windowTitle, Store store) throws IOException
	{
		
		super("     " + windowTitle);
		
		this.store = store;
		setResizable(true);
		//setSize(500, 300);
		setPreferredSize(new Dimension(400,300));
		wormsText = new JTextArea("     Welcome to I've Got Worms.");
		BufferedImage image = ImageIO.read(new File("./earthWormJim.jpg"));
		JLabel imageLabel = new JLabel(new ImageIcon(image));
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(wormsText);
		add(imageLabel);
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
		hrFireFrame = new JFrame("Fire an Employee");
		hrFireFrame.setSize(300, 100);
		hrFireFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel = new JPanel(new GridLayout(4,2));
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel2 = new JLabel("Your name(must be HR Employee):");
		hrFireHRText = new JTextField(15);
		JLabel messageLabel = new JLabel("Employee To Fire:");
		hrFireNameText = new JTextField(15);
		
		JButton hrFireOKButton = new JButton("OK");
		JButton hrFireCancelButton = new JButton("Cancel");
		
		hrFireOKButton.addActionListener(new hrFireOKButtonListener());
		hrFireCancelButton.addActionListener(new hrFireCancelButtonListener());
		
		panel.add(messageLabel2);
		panel.add(hrFireHRText);
		panel.add(messageLabel);
		panel.add(hrFireNameText);
		panel.add(hrFireOKButton);
		panel.add(hrFireCancelButton);
		
		hrFireFrame.add(panel);
		hrFireFrame.setVisible(true);
		hrFireFrame.pack();
	}
	private void handleHRHire()
	{
		hrHireFrame = new JFrame("Hire an Employee");
		hrHireFrame.setSize(300, 100);
		hrHireFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel = new JPanel(new GridLayout(4,2));
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel2 = new JLabel("Your name(must be HR Employee):");
		hrHireHRText = new JTextField(15);
		JLabel messageLabel = new JLabel("Employee To Hire:");
		hrHireNameText = new JTextField(15);
		JLabel messageLabel3 = new JLabel("Starting pay Rate:");
		hrHirePayText = new JTextField(5);
		JLabel messageLabel4 = new JLabel("Department:");
		hrHireDeptText = new JTextField(15);
		
		
		JButton hrHireOKButton = new JButton("OK");
		JButton hrHireCancelButton = new JButton("Cancel");
		
		hrHireOKButton.addActionListener(new hrHireOKButtonListener());
		hrHireCancelButton.addActionListener(new hrHireCancelButtonListener());
		
		panel.add(messageLabel2);
		panel.add(hrHireHRText);
		panel.add(messageLabel);
		panel.add(hrHireNameText);
		panel.add(messageLabel3);
		panel.add(hrHirePayText);
		panel.add(messageLabel4);
		panel.add(hrHireDeptText);
		panel.add(hrHireOKButton);
		panel.add(hrHireCancelButton);
		
		hrHireFrame.add(panel);
		hrHireFrame.setVisible(true);
		hrHireFrame.pack();
	}
	private void handleHRPayRate()
	{
		hrPayRateFrame = new JFrame("Adjust Employee's Pay Rate");
		hrPayRateFrame.setSize(300, 100);
		hrPayRateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel = new JPanel(new GridLayout(4,2));
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel2 = new JLabel("Your name(must be HR Employee):");
		hrNameText = new JTextField(15);
		JLabel messageLabel = new JLabel("Employee's pay to adjust:");
		hrEmployeeNameText = new JTextField(15);
		JLabel messageLabel3 = new JLabel("Adjust Salary:");
		hrAdjustSalaryText = new JTextField(10);
		JLabel messageLabel4 = new JLabel("Pay Increase %:");
		hrIncreasePayText = new JTextField(10);
		
		
		JButton hrPayRateOKButton = new JButton("OK");
		JButton hrPayRateCancelButton = new JButton("Cancel");
		
		hrPayRateOKButton.addActionListener(new hrPayRateOKButtonListener());
		hrPayRateCancelButton.addActionListener(new hrPayRateCancelButtonListener());
		
		panel.add(messageLabel2);
		panel.add(hrNameText);
		panel.add(messageLabel);
		panel.add(hrEmployeeNameText);
		panel.add(messageLabel3);
		panel.add(hrAdjustSalaryText);
		panel.add(messageLabel4);
		panel.add(hrIncreasePayText);
		panel.add(hrPayRateOKButton);
		panel.add(hrPayRateCancelButton);
		
		hrPayRateFrame.add(panel);
		hrPayRateFrame.setVisible(true);
		hrPayRateFrame.pack();
	}
	private void handleHRPrintEmployeeList()
	{
		hrEmployeeFrame = new JFrame("Print All Employee's");
		hrEmployeeFrame.setSize(300, 500);
		hrEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new FlowLayout());
		employeeListText = new JTextArea();
		employeeListText.append("Manager     Department     Salary\n");
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getManagerList().size(); j++)
			{
				employeeListText.append(store.getDepartmentList().get(i).getManagerList().get(j).getName() + 
						"     " + store.getDepartmentList().get(i).getName() + 
						"     " + store.getDepartmentList().get(i).getManagerList().get(j).getSalary() + "\n");
			}
		}
		employeeListText.append("\nHR Employee     Department     Salary\n");
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getHREmployeeList().size(); j++)
			{
				employeeListText.append(store.getDepartmentList().get(i).getHREmployeeList().get(j).getName() + 
						"     " + store.getDepartmentList().get(i).getName() + 
						"     " + store.getDepartmentList().get(i).getHREmployeeList().get(j).getSalary() + "\n");
			}
		}
		employeeListText.append("\nSales Employees     Department     Salary\n");
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getSalesEmployeeList().size(); j++)
			{
				employeeListText.append(store.getDepartmentList().get(i).getSalesEmployeeList().get(j).getName() + 
						"          " + store.getDepartmentList().get(i).getName() + 
						"          " + store.getDepartmentList().get(i).getSalesEmployeeList().get(j).getSalary() + "\n");
			}
		}
		System.out.println(store.getDepartmentList().get(0).getSalesEmployeeList().get(0).getName());
		System.out.println(store.getDepartmentList().get(0).getSalesEmployeeList().get(0).getSalary());
		System.out.println(store.getDepartmentList().get(0).getSalesEmployeeList().get(1).getName());
		System.out.println(store.getDepartmentList().get(0).getSalesEmployeeList().get(1).getSalary());
		JButton hrPrintOKButton = new JButton("OK");
		hrPrintOKButton.addActionListener(new hrPrintOKButtonListener());
		
		panel.add(employeeListText);
		panel.add(hrPrintOKButton);
		
		hrEmployeeFrame.add(panel);
		hrEmployeeFrame.setVisible(true);
		hrEmployeeFrame.pack();
		
		
	}
	private void handleEmployeeViewTasks()
	{
		printTaskFrame = new JFrame("Print Employee Tasks");
		
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
		managerPrintEmployeeFrame = new JFrame("Are you a Manager?");
		managerPrintEmployeeFrame.setPreferredSize(new Dimension(400,400));
		managerPrintEmployeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel = new JLabel("Manager's Name:");
		managerNameText = new JTextField(15);
		JButton managerPrintOKButton = new JButton("OK");
		JButton managerPrintCancelButton = new JButton("Cancel");
		
		managerPrintOKButton.addActionListener(new managerPrintOKButtonListener());
		managerPrintCancelButton.addActionListener(new managerPrintCancelButtonListener());
		
		panel.add(messageLabel);
		panel.add(managerNameText);
		panel.add(managerPrintOKButton);
		panel.add(managerPrintCancelButton);
		
		managerPrintEmployeeFrame.add(panel);
		managerPrintEmployeeFrame.setVisible(true);
		managerPrintEmployeeFrame.pack();
		
	}
	private void handleManagerAssignTask()
	{
		managerAssignTaskFrame = new JFrame("Assign Task to Sales Employee");
		managerAssignTaskFrame.setPreferredSize(new Dimension(300,300));
		managerAssignTaskFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel = new JLabel("Employee:");
		managerEmpNameText = new JTextField(15);
		JLabel messageLabel2 = new JLabel("Task to Assign:");
		managerTaskText = new JTextField(50);
		JLabel messageLabel3 = new JLabel("Manager:");
		managerNameText = new JTextField(15);
		JButton managerAssignTaskOKButton = new JButton("Assign");
		JButton managerAssignTaskCancelButton = new JButton("Cancel");
		
		managerAssignTaskOKButton.addActionListener(new managerAssignTaskOKButtonListener());
		managerAssignTaskCancelButton.addActionListener(new managerAssignTaskCancelButtonListener());
		
		panel.add(messageLabel3);
		panel.add(managerNameText);
		panel.add(messageLabel);
		panel.add(managerEmpNameText);
		panel.add(messageLabel2);
		panel.add(managerTaskText);
		panel.add(managerAssignTaskOKButton);
		panel.add(managerAssignTaskCancelButton);
		
		managerAssignTaskFrame.add(panel);
		managerAssignTaskFrame.setVisible(true);
		managerAssignTaskFrame.pack();
		
	}
	private void handleManagerRemoveTask()
	{
		managerRemoveTaskFrame = new JFrame("Remove a Task");
		//managerRemoveTaskFrame.setPreferredSize(new Dimension(300, 300));
		managerRemoveTaskFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new FlowLayout());
		JLabel messageLabel = new JLabel("Manager:");
		managerNameText = new JTextField(15);
		JLabel messageLabel2 = new JLabel("Employee:");
		managerEmpNameText = new JTextField(15);
		
		JButton managerRemoveTaskOKButton = new JButton("OK");
		JButton managerRemoveTaskCancelButton = new JButton("Cancel");
		
		managerRemoveTaskOKButton.addActionListener(new managerRemoveTaskOKButtonListener());
		managerRemoveTaskCancelButton.addActionListener(new managerRemoveTaskCancelButtonListener());
		
		panel.add(messageLabel);
		panel.add(managerNameText);
		panel.add(messageLabel2);
		panel.add(managerEmpNameText);
		panel.add(managerRemoveTaskOKButton);
		panel.add(managerRemoveTaskCancelButton);
		
		managerRemoveTaskFrame.add(panel);
		managerRemoveTaskFrame.setVisible(true);
		managerRemoveTaskFrame.pack();
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
			int departmentIndex = 0;
			
			str = printScheduleManagerNameText.getText();
			for(int i = 0; i < store.getDepartmentList().size(); i++)
			{
				
				for(int j = 0; j < store.getDepartmentList().get(i).getManagerList().size(); j++)
				{
					if(store.getDepartmentList().get(i).getManagerList().get(j).getName().equals(str))
					{
						isEmployee = true;
						departmentIndex = i;
						index = j;
					}
				}
			}
			
			
			if(isEmployee)
			{
				printManagerSchedule(store.getDepartmentList().get(departmentIndex).getManagerList().get(index));
			}
			
			else 
			{
				JOptionPane.showMessageDialog(employeeErrorFrame, "Manager \"" + str + "\" doesn't exist in this Department", "Error finding Manager", 0);
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
				for(int j = 0; j < store.getDepartmentList().get(i).getSalesEmployeeList().size(); j++)
				{
					if(store.getDepartmentList().get(i).getSalesEmployeeList().get(j).getName().equals(str))
					{
						isEmployee = true;
						departmentIndex = i;
						employeeIndex = j;
					}
				}
			}
			if(isEmployee)
			{
				printEmployeeSchedule(store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex));
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
				for(int j = 0; j < store.getDepartmentList().get(i).getSalesEmployeeList().size(); j++)
				{
					if(store.getDepartmentList().get(i).getSalesEmployeeList().get(j).getName().equals(str))
					{
						isEmployee = true;
						departmentIndex = i;
						employeeIndex = j;
					}
				}
			}
			if(isEmployee)
			{
				
				printEmployeeTasks(store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex));
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
	private class hrFireOKButtonListener implements ActionListener
	{
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e)
		{
			String str, str2;
			boolean isEmployee = false;
			
			int index = 0;
			int departmentIndex = 0;
			//int hrIndex = 0;
			str = hrFireNameText.getText();
			str2 = hrFireHRText.getText();
			for(int i = 0; i < store.getDepartmentList().size(); i++)
			{
				for(int j = 0; j < store.getDepartmentList().get(i).getSalesEmployeeList().size(); j++)
				{
					if(store.getDepartmentList().get(i).getSalesEmployeeList().get(j).getName().equals(str))
					{
						isEmployee = true;
						departmentIndex = i;
						index = j;
					}
				}
			}
			if(isEmployee)
			{
				for(int i = 0; i < store.getDepartmentList().size(); i++)
				{
					for(int j = 0; j < store.getDepartmentList().get(i).getHREmployeeList().size(); j++)
					{
						if(store.getDepartmentList().get(i).getHREmployeeList().get(j).getName().equals(str2))
						{
							store.getDepartmentList().get(i).getHREmployeeList().get(j).
							fire(store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(index), store.getDepartmentList().get(departmentIndex));
							JOptionPane.showMessageDialog(hrFireSuccessFrame, "Successfully fired Employee \"" + str + "\"!", "Employee Fired", 1);
							return;
						}
						else
						{
							JOptionPane.showMessageDialog(hrHRErrorFrame, "HR Employee \"" + str2 + "\" doesn't exist", "Error finding HR Employee", 0);
							return;
						}
					}
				}
			}
			else
			{
				JOptionPane.showMessageDialog(hrEmployeeErrorFrame, "Employee \"" + str + "\" doesn't exist", "Error finding employeee", 0);
				return;
			}
			
		}
	}
	private class hrFireCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			hrFireFrame.setVisible(false);
		}
	}
	private class hrHireOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String employeeName, hrEmployeeName, salaryString, departmentString;
			double salary = 0.0;
			boolean isHREmployee = false;
			employeeName = hrHireNameText.getText();
			hrEmployeeName = hrHireHRText.getText();
			salaryString = hrHirePayText.getText();
			departmentString = hrHireDeptText.getText();
			int hrEmployeeIndex = getHREmployeeIndex(hrEmployeeName);
			int hrDepartmentIndex = getDepartmentIndexHR(hrEmployeeName);
			int departmentIndex = getDepartmentIndexDepartment(departmentString);
			if(salaryString.isEmpty())
			{
				JOptionPane.showMessageDialog(hrHRErrorFrame, "Salary field must not be empty", "Enter a salary", 0);
				return;
			}
			salary = Double.parseDouble(salaryString);
			if(departmentIndex == -1)
			{
				JOptionPane.showMessageDialog(hrHRErrorFrame, "Department doesn't exist", "Error finding Deparmtnet", 0);
				return;
			}
			if(hrEmployeeIndex != -1)
			{
				
				SalesEmployee employee = new SalesEmployee();
				employee.setName(employeeName);
				//employee.setSalary(salary);
				store.getDepartmentList().get(hrDepartmentIndex).getHREmployeeList().get(hrEmployeeIndex).hire(employee, store.getDepartmentList().get(departmentIndex), salary);
				
				JOptionPane.showMessageDialog(hrHireSuccessFrame, "Successfully Hired Employee \"" + employeeName + "\"!", "Employee Hired", 1);
			}
			else
			{
				JOptionPane.showMessageDialog(hrHRErrorFrame, "HR Employee \"" + hrEmployeeName + "\" doesn't exist", "Error finding HR Employee", 0);
				return;
			}
			
		}
	}
	private class hrHireCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			hrHireFrame.setVisible(false);
		}
	}
	private class hrPayRateOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String employeeNameString, hrNameString, salaryString, payIncreaseString;
			double salary = 0.0;
			double payIncrease = 0.0;
			int employeeIndex = 0;
			
			int departmentIndex = 0;
			employeeNameString = hrEmployeeNameText.getText();
			employeeIndex = getSalesEmployeeIndex(employeeNameString);
			hrNameString = hrNameText.getText();
			salaryString = hrAdjustSalaryText.getText();
			payIncreaseString = hrIncreasePayText.getText();
			if(!salaryString.isEmpty()) salary = Double.parseDouble(salaryString);
			if(!payIncreaseString.isEmpty()) payIncrease = Double.parseDouble(payIncreaseString);
			if(salary == 0.0 && payIncrease == 0.0)
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Enter a value for the Salary or the percent increase in pay", "Pay Rate Error", 0);
				return;
			}
			if(getHREmployeeIndex(hrNameString) == -1)
			{
				JOptionPane.showMessageDialog(hrHRErrorFrame, "HR Employee \"" + hrNameString + "\" doesn't exist", "Error finding HR Employee", 0);
				return;
			}
			if(getSalesEmployeeIndex(employeeNameString) == -1)
			{
				JOptionPane.showMessageDialog(hrHRErrorFrame, "Employee \"" + employeeNameString + "\" doesn't exist", "Error finding Employee", 0);
				return;
			}
			if(salary != 0.0) store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).setSalary(salary);
			else store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).setRaise(payIncrease);
			JOptionPane.showMessageDialog(hrHRErrorFrame, "Successfully changed Employee \"" + employeeNameString 
					+ "\"'s salary to " + store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).getSalary(), "Salary Changed", 1);
			return;
			
			
			
			
		}
	}
	private class hrPayRateCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			hrPayRateFrame.setVisible(false);
		}
	}
	private class hrPrintOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			hrEmployeeFrame.setVisible(false);
		}
	}
	private class managerPrintOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			boolean isValidPassword = false;
			String managerNameString;
			managerNameString = managerNameText.getText();
			int departmentIndex = getDepartmentIndexManager(managerNameString);
			if(departmentIndex == -1)
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Manager doesn't exist", "Manager not found", 0);
				return;
			}
			else
			{
				isValidPassword = createPasswordFrame();
				if(isValidPassword)
				{
					employeeListFrame = new JFrame("Print List of Employees");
					employeeListFrame.setPreferredSize(new Dimension(400,400));
					employeeListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					JPanel panel = new JPanel(new FlowLayout());
					managerEmployeeListText = new JTextArea();
					managerEmployeeListText.append("Employees:\n");
					for(int i = 0; i < store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().size(); i++)
					{
						managerEmployeeListText.append(store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(i).getName() + "\n");
					}
					JButton managerOKButton = new JButton("OK");
					managerOKButton.addActionListener(new managerOKButtonListener());
					panel.add(managerEmployeeListText);
					panel.add(managerOKButton);
					
					employeeListFrame.add(panel);
					employeeListFrame.setVisible(true);
					employeeListFrame.pack();
				}
			}
			
		}
	}
	private class managerPrintCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			managerPrintEmployeeFrame.setVisible(false);
		}
	}
	private class managerOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			employeeListFrame.setVisible(false);
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
	
	
	private int getDepartmentIndexDepartment(String departmentName)
	{
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			if(store.getDepartmentList().get(i).getName().equals(departmentName))
			{
				return i;
			}
		}
		return -1;
	}
	private int getDepartmentIndexSales(String employeeName)
	{
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getSalesEmployeeList().size(); j++)
			{
				if(store.getDepartmentList().get(i).getSalesEmployeeList().get(j).getName().equals(employeeName))
				{
					return i;
				}
			}
		}
		return -1;
	}
	private int getDepartmentIndexManager(String managerName)
	{
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getManagerList().size(); j++)
			{
				if(store.getDepartmentList().get(i).getManagerList().get(j).getName().equals(managerName))
				{
					return i;
				}
			}
		}
		return -1;
	}
	private int getDepartmentIndexHR(String HRName)
	{
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getHREmployeeList().size(); j++)
			{
				if(store.getDepartmentList().get(i).getHREmployeeList().get(j).getName().equals(HRName))
				{
					return i;
				}
			}
		}
		return -1;
	}
	private int getSalesEmployeeIndex(String employeeName)
	{
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getSalesEmployeeList().size(); j++)
			{
				if(store.getDepartmentList().get(i).getSalesEmployeeList().get(j).getName().equals(employeeName))
				{
					return j;
				}
			}
		}
		return -1;
	}
	private int getManagerIndex(String managerName)
	{
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getManagerList().size(); j++)
			{
				if(store.getDepartmentList().get(i).getManagerList().get(j).getName().equals(managerName))
				{
					return j;
				}
			}
		}
		return -1;
	}
	private int getHREmployeeIndex(String HRName)
	{
		for(int i = 0; i < store.getDepartmentList().size(); i++)
		{
			for(int j = 0; j < store.getDepartmentList().get(i).getHREmployeeList().size(); j++)
			{
				if(store.getDepartmentList().get(i).getHREmployeeList().get(j).getName().equals(HRName))
				{
					return j;
				}
			}
		}
		return -1;
	}

	private class managerAssignTaskOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			boolean isValidPassword = false;
			String managerNameString, employeeNameString, taskString;
			managerNameString = managerNameText.getText();
			employeeNameString = managerEmpNameText.getText();
			taskString = managerTaskText.getText();
			int departmentIndex = getDepartmentIndexManager(managerNameString);
			int employeeIndex = getSalesEmployeeIndex(employeeNameString);
			if(departmentIndex == -1)
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Manager doesn't exist", "Manager not found", 0);
				return;
			}
			if(employeeIndex == -1)
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Employee doesn't exist", "Sales Employee not found", 0);
				return;
			}
			if(taskString.isEmpty())
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Task field must not be empty", "Task error", 0);
				return;
			}
			isValidPassword = createPasswordFrame();
			if(isValidPassword)
			{
				Task task = new Task();
				task.setName(taskString);
				store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).addTask(task);
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Task added successfully", "Task added", 1);
				return;
			}
			
		}
	}
	private class managerAssignTaskCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			managerAssignTaskFrame.setVisible(false);
		}
	}
	private class managerRemoveTaskOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			boolean isValidPassword = false;
			String managerNameString, employeeNameString;
			managerNameString = managerNameText.getText();
			employeeNameString = managerEmpNameText.getText();
			int departmentIndex = getDepartmentIndexManager(managerNameString);
			int employeeIndex = getSalesEmployeeIndex(employeeNameString);
			if(departmentIndex == -1)
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Manager doesn't exist", "Manager not found", 0);
				return;
			}
			if(employeeIndex == -1)
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Employee doesn't exist", "Sales Employee not found", 0);
				return;
			}
			isValidPassword = createPasswordFrame();
			if(isValidPassword)
			{
				int taskCount;
				taskListFrame = new JFrame("List of Task for Employee");
				taskListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JPanel panel = new JPanel(new FlowLayout());
				taskListText = new JTextArea();
				taskListText.append("Tasks for " + store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).getName() + ":\n");
				for(int i = 0; i < store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).getTaskList().size(); i++)
				{
					taskCount = i+1;
					taskListText.append(taskCount + ".  " +
							store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).getTaskList().get(i).getName() + "\n");
				}
				
				JLabel messageLabel = new JLabel("Enter Task Number to Remove:");
				taskNumberText = new JTextField(5);
				//enter task number here
				JButton taskListOKButton = new JButton("OK");
				JButton taskListCancelButton = new JButton("Cancel");
				
				taskListOKButton.addActionListener(new taskListOKButtonListener());
				taskListCancelButton.addActionListener(new taskListCancelButtonListener());
				
				panel.add(taskListText);
				panel.add(messageLabel);
				panel.add(taskNumberText);
				panel.add(taskListOKButton);
				panel.add(taskListCancelButton);
				
				taskListFrame.add(panel);
				taskListFrame.setVisible(true);
				taskListFrame.pack();
			}
		}
	}
	private class managerRemoveTaskCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			managerRemoveTaskFrame.setVisible(false);
		}
	}
	private class taskListOKButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String managerNameString, employeeNameString, taskNumberString;
			managerNameString = managerNameText.getText();
			employeeNameString = managerEmpNameText.getText();
			taskNumberString = taskNumberText.getText();
			if(taskNumberString.isEmpty())
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Choose a task to remove", "Task number not entered", 0);
				return;
			}
			int index = Integer.parseInt(taskNumberString);
			index--;
			int departmentIndex = getDepartmentIndexManager(managerNameString);
			int employeeIndex = getSalesEmployeeIndex(employeeNameString);
			if(store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).getTaskList().get(index).getCompleted())
			{
				store.getDepartmentList().get(departmentIndex).getSalesEmployeeList().get(employeeIndex).getTaskList().remove(index);
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Task Removed Successfully", "Task Removed", 1);
				return;
			}
			else
			{
				JOptionPane.showMessageDialog(hrPayRateErrorFrame, "Task is not completed", "Task Removal Error", 0);
				return;
			}
			
		}
	}
	private class taskListCancelButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			taskListFrame.setVisible(false);
		}
	}
	
	
	
	private boolean createPasswordFrame()
	{
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter a password:");
		JPasswordField password = new JPasswordField(20);
		panel.add(label);
		panel.add(password);
		String[] options = new String[] {"OK", "Cancel"};
		int option = JOptionPane.showOptionDialog(null, panel, "Elevated Privileges Required", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
		if(option == 0)
		{
			char[] enteredPassword = password.getPassword();
			String passwordString = new String(enteredPassword);
			if(passwordString.equals("worms"))
			{
				
				return true;
				
			}
			else 
			{
				
				return false;
			}
		}
		
		
		return false;
	}
}


