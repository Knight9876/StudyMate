import javax.swing.*;
import java.awt.*;
import java.net.*;

class Bot1 extends JFrame
{
	public Bot1() 
	{
		mainPage();
	}

	Font font1 = new Font("ComicSans", Font.BOLD, 20);

	JFrame frame1 = new JFrame("StudyMate");
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel("Main Menu");

	JButton butSem3 = new JButton("SEM 3");
	JButton butSem4 = new JButton("SEM 4");

	JFrame frame2 = new JFrame("StudyMate");
	JPanel panel2 = new JPanel();
	JLabel label2 = new JLabel("   SEM 3");

	JButton butRef1 = new JButton("Reference Books");
	JButton butSyl1 = new JButton("Syllabus");
	JButton butPyq1 = new JButton("PYQs");
	JButton butMain1 = new JButton("Main Menu");

	JFrame frame3 = new JFrame("StudyMate");
	JPanel panel3 = new JPanel();
	JLabel label3 = new JLabel("   SEM 4");

	JButton butRef2 = new JButton("Reference Books");
	JButton butSyl2 = new JButton("Syllabus");
	JButton butPyq2 = new JButton("PYQs");
	JButton butMain2 = new JButton("Main Menu");

	JFrame frame4 = new JFrame("StudyMate");
	JPanel panel4 = new JPanel();
	JLabel label4 = new JLabel("References");

	JButton butMaths = new JButton("EM-III");
	JButton butDsa = new JButton("DSA");
	JButton butDbms = new JButton("DBMS");
	JButton butPcpf = new JButton("PCPF");
	JButton butPcom = new JButton("PCOM");

	JButton butBack1 = new JButton("Back");
	JButton butMain3 = new JButton("Main Menu");

	JFrame frame5 = new JFrame("StudyMate");
	JPanel panel5 = new JPanel();
	JLabel label5 = new JLabel("References");

	JButton butMATHS = new JButton("EM-IV");
	JButton butCN = new JButton("CN");
	JButton butOS = new JButton("OS");
	JButton butAT = new JButton("AT");
	JButton butCOA = new JButton("COA");

	JButton butBack2 = new JButton("Back");
	JButton butMain4 = new JButton("Main Menu");

	Desktop d = Desktop.getDesktop();

	private void mainPage() 
	{
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		frame1.setVisible(true);
	        	frame1.setResizable(true);

        		panel1.setLayout(null);
        		frame1.add(panel1);

        		label1.setFont(new Font("Comic Sans", Font.BOLD, 60));
        		label1.setBounds(620, 100, 800, 50);
  	      	panel1.add(label1);
		panel1.add(label1);

	        	butSem3.setBounds(450,300,200,60);
        		butSem3.setFont(font1);
	        	panel1.add(butSem3);

		butSem4.setBounds(900,300,200,60);
        		butSem4.setFont(font1);
	        	panel1.add(butSem4);
        
        		butSem3.addActionListener(new java.awt.event.ActionListener() 
		{
	           	public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	butSem3ActionPerformed(ev);
			}
		}
		);

		butSem4.addActionListener(new java.awt.event.ActionListener() 
		{
	           	public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	butSem4ActionPerformed(ev);
			}
		}
		);
    	}

    	private void second1Page() 
	{
	        	frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		frame2.setVisible(true);
        		frame2.setResizable(true);

		panel2.setLayout(null);
        		frame2.add(panel2);

        		label2.setFont(new Font("Comic Sans", Font.BOLD, 60));
        		label2.setBounds(620, 100, 800, 50);
  	      	panel2.add(label2);

		butRef1.setBounds(450,300,200,60);
        		butRef1.setFont(font1);
	        	panel2.add(butRef1);
        
        		butRef1.addActionListener(new java.awt.event.ActionListener() 
		{
	           	public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	butRef1ActionPerformed(ev);
            		}
        		}
		);

        		butSyl1.setBounds(900,300,200,60);
        		butSyl1.setFont(font1);
        		panel2.add(butSyl1);

        		butSyl1.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			try
				{
					butSyl1ActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);

		butPyq1.setBounds(450,400,200,60);
        		butPyq1.setFont(font1);
        		panel2.add(butPyq1);

        		butPyq1.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			try
				{
					butPyq1ActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);	

		butMain1.setBounds(900,400,200,60);
        		butMain1.setFont(font1);
	        	panel2.add(butMain1);
        
        		butMain1.addActionListener(new java.awt.event.ActionListener() 
		{
	           	public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	butMain1ActionPerformed(ev);
            		}
        		}
		);
	}

	private void third1Page() 
	{
	        	frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	frame4.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		frame4.setVisible(true);
        		frame4.setResizable(true);

		panel4.setLayout(null);
        		frame4.add(panel4);

        		label4.setFont(new Font("Comic Sans", Font.BOLD, 60));
        		label4.setBounds(620, 100, 800, 50);
  	      	panel4.add(label4);

		butMaths.setBounds(450,300,200,60);
        		butMaths.setFont(font1);
	        	panel4.add(butMaths);
        
		butMaths.addActionListener(new java.awt.event.ActionListener()
		{
           		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	try
				{
					butMathsActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
        			}
		}
		);

        		butDsa.setBounds(900,300,200,60);
        		butDsa.setFont(font1);
        		panel4.add(butDsa);

        		butDsa.addActionListener(new java.awt.event.ActionListener()
		{
           		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	try
				{
					butDsaActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
        			}
		}
		);

		butDbms.setBounds(450,400,200,60);
        		butDbms.setFont(font1);
        		panel4.add(butDbms);

        		butDbms.addActionListener(new java.awt.event.ActionListener()
		{
           		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	try
				{
					butDbmsActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
        			}
		}
		);

		butPcpf.setBounds(900,400,200,60);
        		butPcpf.setFont(font1);
        		panel4.add(butPcpf);

        		butPcpf.addActionListener(new java.awt.event.ActionListener()
		{
           		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	try
				{
					butPcpfActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
        			}
		}
		);

		butPcom.setBounds(450,500,200,60);
        		butPcom.setFont(font1);
        		panel4.add(butPcom);

        		butPcom.addActionListener(new java.awt.event.ActionListener()
		{
           		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	try
				{
					butPcomActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
        			}
		}
		);

		butBack1.setBounds(900,500,200,60);
        		butBack1.setFont(font1);
        		panel4.add(butBack1);

        		butBack1.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			butBack1ActionPerformed(ev);
            		}
        		}
		);

		butMain3.setBounds(450,600,650,60);
        		butMain3.setFont(font1);
        		panel4.add(butMain3);

        		butMain3.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			butMain3ActionPerformed(ev);
            		}
        		}
		);
	}

	private void second2Page() 
	{
	        	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	frame3.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		frame3.setVisible(true);
        		frame3.setResizable(true);

		panel3.setLayout(null);
        		frame3.add(panel3);

        		label3.setFont(new Font("Comic Sans", Font.BOLD, 60));
        		label3.setBounds(620, 100, 800, 50);
  	      	panel3.add(label3);

		butRef2.setBounds(450,300,200,60);
        		butRef2.setFont(font1);
	        	panel3.add(butRef2);
        
        		butRef2.addActionListener(new java.awt.event.ActionListener() 
		{
	           	public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	butRef2ActionPerformed(ev);
            		}
        		}
		);

        		butSyl2.setBounds(900,300,200,60);
        		butSyl2.setFont(font1);
        		panel3.add(butSyl2);

        		butSyl2.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			try
				{
					butSyl2ActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);

		butPyq2.setBounds(450,400,200,60);
        		butPyq2.setFont(font1);
        		panel3.add(butPyq2);

        		butPyq2.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			try
				{
					butPyq2ActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);

		butMain2.setBounds(900,400,200,60);
        		butMain2.setFont(font1);
	        	panel3.add(butMain2);
        
        		butMain2.addActionListener(new java.awt.event.ActionListener() 
		{
	           	public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
		                	butMain2ActionPerformed(ev);
            		}
        		}
		);	
	}

	private void third2Page() 
	{
	        	frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        	frame5.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		frame5.setVisible(true);
        		frame5.setResizable(true);

		panel5.setLayout(null);
        		frame5.add(panel5);

        		label5.setFont(new Font("Comic Sans", Font.BOLD, 60));
        		label5.setBounds(620, 100, 800, 50);
  	      	panel5.add(label5);

		butMATHS.setBounds(450,300,200,60);
        		butMATHS.setFont(font1);
	        	panel5.add(butMATHS);
        
        		butMATHS.addActionListener(new java.awt.event.ActionListener() 
		{
	           	public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
				try
				{
			                	butMATHSActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);

        		butCN.setBounds(900,300,200,60);
        		butCN.setFont(font1);
        		panel5.add(butCN);

        		butCN.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
				try
				{
			                	butCNActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);

		butOS.setBounds(450,400,200,60);
        		butOS.setFont(font1);
        		panel5.add(butOS);

        		butOS.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			try
				{
			                	butOSActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);

		butAT.setBounds(900,400,200,60);
        		butAT.setFont(font1);
        		panel5.add(butAT);

        		butAT.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			try
				{
			                	butATActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);

		butCOA.setBounds(450,500,200,60);
        		butCOA.setFont(font1);
        		panel5.add(butCOA);

        		butCOA.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			try
				{
			                	butCOAActionPerformed(ev);
				}
				catch(Exception e)
				{
				}
            		}
        		}
		);

		butBack2.setBounds(900,500,200,60);
        		butBack2.setFont(font1);
        		panel5.add(butBack2);

		butBack2.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			butBack2ActionPerformed(ev);
            		}
        		}
		);

		butMain4.setBounds(450,600,650,60);
        		butMain4.setFont(font1);
        		panel5.add(butMain4);

        		butMain4.addActionListener(new java.awt.event.ActionListener() 
		{
            		public void actionPerformed(java.awt.event.ActionEvent ev) 
			{
                			butMain4ActionPerformed(ev);
            		}
        		}
		);
	}

	private void butSem3ActionPerformed(java.awt.event.ActionEvent ev)
	{
        		frame1.setVisible(false);
	        	second1Page();
    	}

    	private void butSem4ActionPerformed(java.awt.event.ActionEvent ev) 
	{
        		frame1.setVisible(false);
        		second2Page();
    	}

	private void butRef1ActionPerformed(java.awt.event.ActionEvent ev)
	{
        		frame2.setVisible(false);
	        	third1Page();
    	}

    	private void butSyl1ActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame2.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/156FaT_MFhdgDTwlHXU6fxRxD5eKrdPYE/view?usp=drivesdk"));
    	}

	private void butPyq1ActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame2.setVisible(true);
		d.browse(new URI("https://muquestionpapers.com/be/information-technology/semester-3"));
    	}

	private void butMain1ActionPerformed(java.awt.event.ActionEvent ev) 
	{
        		frame2.setVisible(false);
        		mainPage();
    	}

	private void butMathsActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame4.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1O3l2EVfXVJn3r_Rh203Q-Qz7vP3tcZpB/view?usp=drivesdk"));
    	}

    	private void butDsaActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
		frame4.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1OCMfiNwH_g2OPuxO7pPDKK6wS0Eutm_N/view?usp=drivesdk"));
    	}

	private void butDbmsActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame4.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1appsjpe3PsqZslTo0UCa5NOOMbqPknfL/view?usp=drivesdk"));
    	}

	private void butPcomActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame4.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1OZv-3B27snKzU_W6iC04umq024lQwZSN/view?usp=drivesdk"));
    	}

	private void butPcpfActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame4.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1M4STemZ_oyHWT29J2FMXueJmxzFiK4pG/view?usp=drivesdk"));
    	}

	private void butBack1ActionPerformed(java.awt.event.ActionEvent ev)
	{
        		frame4.setVisible(false);
	        	second1Page();
    	}

	private void butMain3ActionPerformed(java.awt.event.ActionEvent ev)
	{
        		frame4.setVisible(false);
		mainPage();
    	}


	private void butRef2ActionPerformed(java.awt.event.ActionEvent ev)
	{
        		frame3.setVisible(false);
	        	third2Page();
    	}

    	private void butSyl2ActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame3.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/156QQNx8viENt9wmpzr_rnDBMp41PaeoV/view?usp=drivesdk"));
    	}

	private void butPyq2ActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame3.setVisible(true);
		d.browse(new URI("https://muquestionpapers.com/be/information-technology/semester-4"));
    	}

	private void butMain2ActionPerformed(java.awt.event.ActionEvent ev) 
	{
        		frame3.setVisible(false);
		mainPage();
    	}

	private void butMATHSActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame5.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1dBoc2sWLbHC1ibgc31lV-eM1_6S2N9tY/view?usp=drivesdk"));
    	}

    	private void butCNActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame5.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1d5bj0aWe9TPAGCxawm6H1nhY2AeP0KES/view?usp=drivesdk"));
    	}

	private void butOSActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame5.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1wsWOC1klJ8IJdp6g-NB0llMtJjnyRIB6/view?usp=drivesdk"));
    	}

	private void butATActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame5.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1ww9zUq_MtBOR_Htpf9s8sNW_5cmVCgwU/view?usp=drivesdk"));
    	}

	private void butCOAActionPerformed(java.awt.event.ActionEvent ev) throws Exception
	{
        		frame5.setVisible(true);
		d.browse(new URI("https://drive.google.com/file/d/1wwBW_eMzH1Sa2f5BVDkXSddVVXO56UpB/view?usp=drivesdk"));
    	}

	private void butBack2ActionPerformed(java.awt.event.ActionEvent ev)
	{
        		frame5.setVisible(false);
	        	second2Page();
    	}

	private void butMain4ActionPerformed(java.awt.event.ActionEvent ev)
	{
        		frame5.setVisible(false);
		mainPage();
    	}

    	public static void main(String args[])
	{
        		java.awt.EventQueue.invokeLater(new Runnable() 
		{
            		public void run() 
			{
                			new Bot1();
            		}
		}
		);
    	}
}