/*
 * TabDemo.java
 *
 * Created on 2007. m�rcius 30., 11:33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.net.URL;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.Graphics.*;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;
import java.text.*;
import javax.swing.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
/**
 *
 * @author Rendszergazda
 */
public class TabDemo implements ActionListener {
        
        ImageIcon equal = createImageIcon("go.gif");
        ImageIcon cancel = createImageIcon("redo.gif");
        ImageIcon tab1 = createImageIcon("temp.jpg");
        ImageIcon bytes = createImageIcon("bytes.jpg");
        ImageIcon power = createImageIcon("power.jpg");
        ImageIcon press = createImageIcon("press.jpg");
        ImageIcon speed = createImageIcon("speed.jpg");
        ImageIcon weight = createImageIcon("weight.jpg");
        ImageIcon volume = createImageIcon("volume.jpg");
        ImageIcon energy = createImageIcon("energy.jpg");
        ImageIcon area = createImageIcon("area.jpg");
        ImageIcon density = createImageIcon("density.jpg");
        ImageIcon force = createImageIcon("force.jpg");
        ImageIcon length = createImageIcon("length.jpg");
        //URL weblapom = new URL("http://www.freeweb.hu/szlavikszabolcs");
        
        Double zero = 0.0;        
        Double zero2 = 0.0;
        Double zero3 = 0.0;
        Double zero4 = 0.0;
        Double zero5 = 0.0;
        Double zero6 = 0.0;
        Double zero7 = 0.0;
        Double zero8 = 0.0;
        Double zero9 = 0.0;
        Double zero10 = 0.0;
        Double zero11 = 0.0;
        Double zero12 = 0.0;
        JComboBox cbox = new JComboBox();
	JComboBox cbox2 = new JComboBox();
        JComboBox cbox3 = new JComboBox();
	JComboBox cbox4 = new JComboBox();
        JComboBox cbox5 = new JComboBox();
	JComboBox cbox6 = new JComboBox();
        JComboBox cbox7 = new JComboBox();
	JComboBox cbox8 = new JComboBox();
        JComboBox cbox9 = new JComboBox();
	JComboBox cbox10 = new JComboBox();
        JComboBox cbox11 = new JComboBox();
	JComboBox cbox12 = new JComboBox();
        JComboBox cbox13 = new JComboBox();
	JComboBox cbox14 = new JComboBox();
        JComboBox cbox15 = new JComboBox();
	JComboBox cbox16 = new JComboBox();
        JComboBox cbox17 = new JComboBox();
	JComboBox cbox18 = new JComboBox();
        JComboBox cbox19 = new JComboBox();
	JComboBox cbox20 = new JComboBox();
        JComboBox cbox21 = new JComboBox();
	JComboBox cbox22 = new JComboBox();
        JComboBox cbox23 = new JComboBox();
	JComboBox cbox24 = new JComboBox();
        JFormattedTextField amountField1= new JFormattedTextField();
        JFormattedTextField amountField2 = new JFormattedTextField();
        JFormattedTextField amountField3 = new JFormattedTextField();
        JFormattedTextField amountField4 = new JFormattedTextField();
        JFormattedTextField amountField5 = new JFormattedTextField();
        JFormattedTextField amountField6 = new JFormattedTextField();
        JFormattedTextField amountField7 = new JFormattedTextField();
        JFormattedTextField amountField8 = new JFormattedTextField();
        JFormattedTextField amountField9 = new JFormattedTextField();
        JFormattedTextField amountField10 = new JFormattedTextField();
        JFormattedTextField amountField11 = new JFormattedTextField();
        JFormattedTextField amountField12 = new JFormattedTextField();
                
        NumberFormat amountFormat;
        NumberFormat amountFormat2;
        NumberFormat amountFormat3;
        NumberFormat amountFormat4;
        NumberFormat amountFormat5;
        NumberFormat amountFormat6;
        NumberFormat amountFormat7;
        NumberFormat amountFormat8;
        NumberFormat amountFormat9;
        NumberFormat amountFormat10;
        NumberFormat amountFormat11;
        NumberFormat amountFormat12;               
        
        JButton button1=new JButton(equal);
       

        JButton button2=new JButton(cancel);
        JButton button3=new JButton(equal);
        JButton button4=new JButton(cancel);
        JButton button5=new JButton(equal);
        JButton button6=new JButton(cancel);
        JButton button7=new JButton(equal);
        JButton button8=new JButton(cancel);
        JButton button9=new JButton(equal);
        JButton button10=new JButton(cancel);
        JButton button11=new JButton(equal);
        JButton button12=new JButton(cancel);
        JButton button13=new JButton(equal);
        JButton button14=new JButton(cancel);
        JButton button15=new JButton(equal);
        JButton button16=new JButton(cancel);
        JButton button17=new JButton(equal);
        JButton button18=new JButton(cancel);
        JButton button19=new JButton(equal);
        JButton button20=new JButton(cancel);
        JButton button21=new JButton(equal);
        JButton button22=new JButton(cancel);
        JButton button23=new JButton(equal);
        JButton button24=new JButton(cancel);
        Border outer = BorderFactory.createEtchedBorder();
        Border inner = BorderFactory.createEmptyBorder(10,10,10,10);
        
        
        JLabel label3 = new JLabel("0.0");
        
        
        JLabel label6 = new JLabel("0.0");
        
        
        JLabel label9 = new JLabel("0.0");
        
        
        JLabel label12 = new JLabel("0.0");
        
        
        JLabel label15 = new JLabel("0.0");
        
        
        JLabel label18 = new JLabel("0.0");
        
        
        JLabel label21 = new JLabel("0.0");
        
        
        JLabel label24 = new JLabel("0.0");
        
        
        
        JLabel label27 = new JLabel("0.0");
        
        
        JLabel label30 = new JLabel("0.0");
        
        
        JLabel label33 = new JLabel("0.0");
        
        
        JLabel label36 = new JLabel("0.0");
        
        JFrame frame;
        JPanel pane = new JPanel();

        
        //JTabbedPane tabbedPane = new JTabbedPane();
        
   public TabDemo(JFrame frame){
   this.frame = frame;
   
   }
    public JMenuBar createMenuBar() {
        JMenuBar menusor = new JMenuBar();
        JMenu menu1 = new JMenu("S�g�");
        JMenuItem almenu1 = new JMenuItem("S�g�");
        JMenu menu2 = new JMenu("N�vjegy");
        JMenuItem almenu2 = new JMenuItem("M�rt�kegys�gv�lt� n�vjegye");    
        JMenu menu3 = new JMenu("Kil�p�s");
        JMenuItem almenu3 = new JMenuItem("Kil�p�s");
        menusor.add(menu1);
        menusor.add(menu2);
        menusor.add(menu3);
       
        menu2.add(almenu2).addActionListener(this);
        menu3.add(almenu3).addActionListener(this);
        menu1.add(almenu1).addActionListener(this);
     
        return menusor;        
        }        
        
        
public void addComponentToPane(Container pane) {
        
    
    amountField1 = new JFormattedTextField(amountFormat);
	//amountField1.setLocale(huLocale);
        amountField1.setValue(new Double (zero));
        amountField1.setColumns(10);
        amountField1.setForeground(Color.BLUE);        
        amountFormat = NumberFormat.getNumberInstance();    
        
    amountField2 = new JFormattedTextField(amountFormat2);
	amountField2.setValue(new Double (zero2));
        amountField2.setColumns(10);    
        amountField2.setForeground(Color.BLUE);
        amountFormat2 = NumberFormat.getNumberInstance();
        
        amountField3 = new JFormattedTextField(amountFormat3);
	amountField3.setValue(new Double (zero3));
        amountField3.setColumns(10);
        amountField3.setForeground(Color.BLUE);
        amountFormat3 = NumberFormat.getNumberInstance();
        
        amountField4 = new JFormattedTextField(amountFormat4);
	amountField4.setValue(new Double (zero4));
        amountField4.setColumns(10);
        amountField4.setForeground(Color.BLUE);
        amountFormat4 = NumberFormat.getNumberInstance();
        
        amountField5 = new JFormattedTextField(amountFormat5);
	amountField5.setValue(new Double (zero5));
        amountField5.setColumns(10);        
        amountField5.setForeground(Color.BLUE);
        amountFormat5 = NumberFormat.getNumberInstance();
        
        amountField6 = new JFormattedTextField(amountFormat6);
	amountField6.setValue(new Double (zero6));
        amountField6.setColumns(10);        
        amountField6.setForeground(Color.BLUE);
        amountFormat6 = NumberFormat.getNumberInstance();
        
        amountField7 = new JFormattedTextField(amountFormat7);
	amountField7.setValue(new Double (zero7));
        amountField7.setColumns(10);
        amountField7.setForeground(Color.BLUE);
        amountFormat7 = NumberFormat.getNumberInstance();
        
        amountField8 = new JFormattedTextField(amountFormat8);
	amountField8.setValue(new Double (zero8));
        amountField8.setColumns(10);
        amountField8.setForeground(Color.BLUE);
        amountFormat8 = NumberFormat.getNumberInstance();
        
        amountField9 = new JFormattedTextField(amountFormat9);
	amountField9.setValue(new Double (zero9));
        amountField9.setColumns(10);
        amountField9.setForeground(Color.BLUE);
        amountFormat9 = NumberFormat.getNumberInstance();
        
        amountField10 = new JFormattedTextField(amountFormat10);
	amountField10.setValue(new Double (zero10));
        amountField10.setColumns(10);
        amountField10.setForeground(Color.BLUE);
        amountFormat10 = NumberFormat.getNumberInstance();
        
        amountField11 = new JFormattedTextField(amountFormat11);
	amountField11.setValue(new Double (zero11));
        amountField11.setColumns(10);
        amountField11.setForeground(Color.BLUE);
        amountFormat11 = NumberFormat.getNumberInstance();
        
        amountField12 = new JFormattedTextField(amountFormat12);
	amountField12.setValue(new Double (zero12));
        amountField12.setColumns(10);
        amountField12.setForeground(Color.BLUE);
        amountFormat12 = NumberFormat.getNumberInstance();
        
        JTabbedPane tabbedPane = new JTabbedPane();

        //Create the "cards".
        //Card1
        
        JPanel card1 = new JPanel(); //{
        GridLayout layout1 = new GridLayout(2, 4, 10, 10);
        card1.setLayout(layout1);
        card1.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        card1.add(amountField1);
        amountField1.setToolTipText("�tv�ltand� mennyis�g");

        card1.add(cbox);
        cbox.setToolTipText("�tv�ltand� m�rt�kegys�ge");
        
                cbox.addItem("Celsius");
                cbox.addItem("Fahrenheit");
                cbox.addItem("Kelvin");
                cbox.addItem("R�aumure");
        card1.add(button1);
        button1.setToolTipText("�tv�lt�s");
        button1.addActionListener(this);
        
        card1.add(label3);
        label3.setForeground(Color.RED);        
        label3.setToolTipText("Eredm�ny");
        card1.add(cbox2);
        cbox2.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox2.addItem("Fahrenheit");
        cbox2.addItem("Celsius");
        cbox2.addItem("Kelvin");              
        cbox2.addItem("R�aumure");
        
        card1.add(button2);
        button2.setToolTipText("T�rl�s");
        button2.addActionListener(this);
        
        //card2
        JPanel card2 = new JPanel();
        GridLayout layout2 = new GridLayout(2, 4, 10, 10);
        card2.setLayout(layout2);
        card2.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        card2.add(amountField2);
        amountField2.setToolTipText("�tv�ltand� mennyis�g");

        card2.add(cbox3);
        cbox3.setToolTipText("�tv�ltand� m�rt�kegys�ge");
        cbox3.addItem("megab�jt[MB]");        
        cbox3.addItem("kilob�jt[KB]");        
        cbox3.addItem("gigab�jt[GB]");
        
        
        
        card2.add(button3);
        button3.setToolTipText("�tv�lt�s");
        button3.addActionListener(this);
       
        card2.add(label6);
        label6.setForeground(Color.RED);
        label6.setToolTipText("Eredm�ny");
        card2.add(cbox4);
        cbox4.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox4.addItem("kilob�jt[KB]");        
        cbox4.addItem("megab�jt[MB]");        
        cbox4.addItem("gigab�jt[GB]");
        
        
        card2.add(button4);
        button4.setToolTipText("T�rl�s");
        button4.addActionListener(this);
        // card3
        JPanel card3 = new JPanel(); //{
        GridLayout layout3 = new GridLayout(2, 4, 10, 10);
        card3.setLayout(layout3);
        card3.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card3.add(amountField3);
        amountField3.setToolTipText("�tv�ltand� mennyis�g");

        card3.add(cbox5);       
        cbox5.setToolTipText("�tv�ltand� m�rt�kegys�ge");        
                cbox5.addItem("m^2");
                cbox5.addItem("hekt�r[ha]");                
                cbox5.addItem("n�gysz�g�l");
                cbox5.addItem("kataszteri hold");                
                cbox5.addItem("acre");                               
                              
                                
        card3.add(button5);
        button5.setToolTipText("�tv�lt�s");
        button5.addActionListener(this);
        
        card3.add(label9);
        label9.setForeground(Color.RED);
        label9.setToolTipText("Eredm�ny");
        card3.add(cbox6);         
        cbox6.setToolTipText("Eredm�ny m�rt�kegys�ge");        
        cbox6.addItem("n�gysz�g�l");        
                cbox6.addItem("m^2");
                cbox6.addItem("hekt�r[ha]");           
                cbox6.addItem("kataszteri hold");
                cbox6.addItem("acre");                     
               
        card3.add(button6);
        button6.setToolTipText("T�rl�s");
        button6.addActionListener(this);
        
        //card4
        JPanel card4 = new JPanel(); //{
        GridLayout layout4 = new GridLayout(2, 4, 10, 10);
        card4.setLayout(layout4);
        card4.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card4.add(amountField4);
        amountField4.setToolTipText("�tv�ltand� mennyis�g");

        card4.add(cbox7);
        cbox7.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox7.addItem("kg/m^3");
                cbox7.addItem("pounds/cubic foot");
        card4.add(button7);
        button7.setToolTipText("�tv�lt�s");
        button7.addActionListener(this);        
        card4.add(label12);
        label12.setForeground(Color.RED);
        label12.setToolTipText("Eredm�ny");
        card4.add(cbox8);
        cbox8.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox8.addItem("pounds/cubic foot");
        cbox8.addItem("kg/m^3");
        
        
        
        card4.add(button8);
        button8.setToolTipText("T�rl�s");
        button8.addActionListener(this);
        
        //card5
        JPanel card5 = new JPanel(); //{
        GridLayout layout5 = new GridLayout(2, 4, 10, 10);
        card5.setLayout(layout5);
        card5.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        
        card5.add(amountField5);
        amountField5.setToolTipText("�tv�ltand� mennyis�g");

        card5.add(cbox9);
        cbox9.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox9.addItem("kal�ria(�tel)");
                cbox9.addItem("kilojoule [kJ]");
                
        card5.add(button9);
        button9.setToolTipText("�tv�lt�s");
        button9.addActionListener(this);
        
        card5.add(label15);
        label15.setForeground(Color.RED);
        label15.setToolTipText("Eredm�ny");
        card5.add(cbox10);
        cbox10.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox10.addItem("kilojoule [kJ]");
        cbox10.addItem("kal�ria(�tel)");
        
               
        card5.add(button10);
        button10.setToolTipText("T�rl�s");
        button10.addActionListener(this);
        
        //card6
        
        JPanel card6 = new JPanel(); //{
        GridLayout layout6 = new GridLayout(2, 4, 10, 10);
        card6.setLayout(layout6);
        card6.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card6.add(amountField6);
        amountField6.setToolTipText("�tv�ltand� mennyis�g");

        card6.add(cbox11);
        cbox11.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox11.addItem("Newton [N]");
                cbox11.addItem("pounds force");
                
        card6.add(button11);
        button11.setToolTipText("�tv�lt�s");
        button11.addActionListener(this);
        
        card6.add(label18);
        label18.setForeground(Color.RED);
        label18.setToolTipText("Eredm�ny");
        card6.add(cbox12);
        cbox12.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox12.addItem("pounds force");
        cbox12.addItem("Newton [N]");
        
        
        
        card6.add(button12);
        button12.setToolTipText("T�rl�s");
        button12.addActionListener(this);
        
        //card7
        JPanel card7 = new JPanel(); //{
        GridLayout layout7 = new GridLayout(2, 4, 10, 10);
        card7.setLayout(layout7);
        card7.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card7.add(amountField7);
        amountField7.setToolTipText("�tv�ltand� mennyis�g");

        card7.add(cbox13);
        cbox13.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox13.addItem("m�ter [m]");
                cbox13.addItem("inch");
                cbox13.addItem("foot");
                cbox13.addItem("yard");
                                               
        card7.add(button13);
        button13.setToolTipText("�tv�lt�s");
        button13.addActionListener(this);
        card7.add(label21);
        label21.setForeground(Color.RED);
        label21.setToolTipText("Eredm�ny");
        card7.add(cbox14);
        cbox14.setToolTipText("Eredm�ny m�rt�kegys�ge");        
        cbox14.addItem("foot");
                cbox14.addItem("m�ter [m]");
                cbox14.addItem("inch");                
                cbox14.addItem("yard");
                                        
        card7.add(button14);
        button14.setToolTipText("T�rl�s");
        button14.addActionListener(this);
        
        //card8
        JPanel card8 = new JPanel(); //{
        GridLayout layout8 = new GridLayout(2, 4, 10, 10);
        card8.setLayout(layout8);
        card8.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card8.add(amountField8);
        amountField8.setToolTipText("�tv�ltand� mennyis�g");

        card8.add(cbox15);
        cbox15.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox15.addItem("gramm [g]");
                cbox15.addItem("ounce (oz.)");
                cbox15.addItem("pound (lb.)");
                              
                
                
        card8.add(button15);
        button15.setToolTipText("�tv�lt�s");
        button15.addActionListener(this);
        
        card8.add(label24);
        label24.setForeground(Color.RED);
        label24.setToolTipText("Eredm�ny");
        card8.add(cbox16);
        cbox16.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox16.addItem("ounce (oz.)");
        cbox16.addItem("gramm [g]");           
        cbox16.addItem("pound (lb.)");                
                
        card8.add(button16);
        button16.setToolTipText("T�rl�s");
        button16.addActionListener(this);
        
        //card9
        JPanel card9 = new JPanel(); //{
        GridLayout layout9 = new GridLayout(2, 4, 10, 10);
        card9.setLayout(layout9);
        card9.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        
        card9.add(amountField9);
        amountField9.setToolTipText("�tv�ltand� mennyis�g");

        card9.add(cbox17);
        cbox17.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox17.addItem("l�er�");
                cbox17.addItem("kilowatt [kW]");
                
        card9.add(button17);
        button17.setToolTipText("�tv�lt�s");
        button17.addActionListener(this);
        
        card9.add(label27);
        label27.setForeground(Color.RED);
        label27.setToolTipText("Eredm�ny");
        card9.add(cbox18);
        cbox18.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox18.addItem("kilowatt [kW]");
        cbox18.addItem("l�er�");
        
        
        
        card9.add(button18);
        button18.setToolTipText("T�rl�s");
        button18.addActionListener(this);
        
        //card10
        
        JPanel card10 = new JPanel(); //{
        GridLayout layout10 = new GridLayout(2, 4, 10, 10);
        card10.setLayout(layout10);
        card10.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card10.add(amountField10);
        amountField10.setToolTipText("�tv�ltand� mennyis�g");

        card10.add(cbox19);
        cbox19.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox19.addItem("Pascal [Pa]");
                cbox19.addItem("pounds force/sq. inch [psi]");
                cbox19.addItem("bar");
                
        card10.add(button19);
        button19.setToolTipText("�tv�lt�s");
        button19.addActionListener(this);
        card10.add(label30);
        label30.setForeground(Color.RED);
        label30.setToolTipText("Eredm�ny");
        card10.add(cbox20);
        cbox20.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox20.addItem("pounds force/sq. inch [psi]");
        cbox20.addItem("Pascal [Pa]");        
        cbox20.addItem("bar");              
        
        
        card10.add(button20);
        button20.setToolTipText("T�rl�s");
        button20.addActionListener(this);
        
        //card11
        
        JPanel card11 = new JPanel(); //{
        GridLayout layout11 = new GridLayout(2, 4, 10, 10);
        card11.setLayout(layout11);
        card11.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card11.add(amountField11);
        amountField11.setToolTipText("�tv�ltand� mennyis�g");

        card11.add(cbox21);
        cbox21.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox21.addItem("km/h");
                cbox21.addItem("m�rf�ld/�ra");
                
        card11.add(button21);
        button21.setToolTipText("�tv�lt�s");
        button21.addActionListener(this);
        card11.add(label33);
        label33.setForeground(Color.RED);
        label33.setToolTipText("Eredm�ny");
        card11.add(cbox22);
        cbox22.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox22.addItem("m�rf�ld/�ra");
        cbox22.addItem("km/h");
        
        
        
        card11.add(button22);
        button22.setToolTipText("T�rl�s");
        button22.addActionListener(this);
        
        //card12
        
        JPanel card12 = new JPanel(); //{
        GridLayout layout12 = new GridLayout(2, 4, 10, 10);
        card12.setLayout(layout12);
        card12.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                       
        card12.add(amountField12);
        amountField12.setToolTipText("�tv�ltand� mennyis�g");

        card12.add(cbox23);
        cbox23.setToolTipText("�tv�ltand� m�rt�kegys�ge");
                cbox23.addItem("cm^3");
                cbox23.addItem("cubic inch");
                
        card12.add(button23);
        button23.setToolTipText("�tv�lt�s");
        button23.addActionListener(this);
        
        card12.add(label36);
        label36.setForeground(Color.RED);
        label36.setToolTipText("Eredm�ny");
        card12.add(cbox24);
        cbox24.setToolTipText("Eredm�ny m�rt�kegys�ge");
        cbox24.addItem("cubic inch");
        cbox24.addItem("cm^3");
        
        
        
        card12.add(button24);
        button24.setToolTipText("T�rl�s");
        button24.addActionListener(this);
        
        
        
        
        tabbedPane.addTab("H�m�rs�klet",tab1,card1,"C� - F�");
        tabbedPane.addTab("B�jtok",bytes,card2,"MB - KB");
        tabbedPane.addTab("Ter�let",area,card3,"m^2 - n�gysz�g�l");
        tabbedPane.addTab("S�r�s�g",density,card4,"kg/m^3 - pounds/cubic foot");
        tabbedPane.addTab("Energia",energy,card5,"kal�ria - kJ");
        tabbedPane.addTab("Er�",force,card6,"N - pounds force");
        tabbedPane.addTab("Hossz�s�g",length,card7,"m - foot");
        tabbedPane.addTab("T�meg",weight,card8,"g - oz.");
        tabbedPane.addTab("Teljes�tm�ny",power,card9,"hp - kw");
        tabbedPane.addTab("Nyom�s",press,card10,"Pa - psi");
        tabbedPane.addTab("Sebess�g",speed,card11,"km/h - MpH");
        tabbedPane.addTab("T�rfogat",volume,card12, "cm^3 - cubic inch");
        
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        pane.add(tabbedPane, BorderLayout.CENTER);
        //pane.setBackground(Color.WHITE);
    }


 protected static Image getFDImage() {
        java.net.URL imgURL = TabDemo.class.getResource("si2.jpg");
        if (imgURL != null) {
            return new ImageIcon(imgURL).getImage();
        } else {
            return null;
        }
    }
   
protected static ImageIcon createImageIcon(String path) 
{
    java.net.URL imgURL = TabDemo.class.getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL);
    } else {
        
        return null;
    }
}






//Creates an icon-worthy Image from scratch.

protected static Image createFDImage() {
       //Create a 16x16 pixel image.
        BufferedImage bi = new BufferedImage(16, 16, BufferedImage.TYPE_INT_RGB);

        //Draw into it.
        Graphics g = bi.getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 15, 15);
        g.setColor(Color.RED);
        g.fillOval(5, 3, 6, 6);

        //Clean up.
        g.dispose();

        //Return it.
        return bi;

    }


public static void createAndShowGUI() {
        
        //Create and set up the window.
        JFrame frame = new JFrame("M�rt�kegys�gv�lt�");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setResizable(false);
        //frame.setDefaultLookAndFeelDecorated(true);
        
        //Create and set up the content pane.
        TabDemo demo = new TabDemo(frame);
        demo.addComponentToPane(frame.getContentPane());
        frame.setJMenuBar(demo.createMenuBar());
        
        frame.setIconImage(getFDImage());
        
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        //ha k�z�pre akarom �ll�tani az ablakot!
        //frame.setLocationRelativeTo(null);      

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Turn off metal's use of bold fonts
	UIManager.put("swing.boldMetal", Boolean.FALSE);

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
// TODO code application logic here
    }
    
});   // TODO code application logic here
    }

    public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand()=="M�rt�kegys�gv�lt� n�vjegye")
    {
    
    JOptionPane.showMessageDialog(frame,"          M�rt�kegys�gv�lt�\n" + "  Szerkesztette: Dr. Szl�vik Szabolcs\n" + "http://www.freeweb.hu/szlavikszabolcs\n"+ "     szlavikszabolcs@freemail.hu\n" + "                      2007." ,"M�rt�kegys�gv�lt� n�vjegye",JOptionPane.INFORMATION_MESSAGE);
    }
    if (e.getActionCommand()=="Kil�p�s")
    {
    Toolkit.getDefaultToolkit().beep();
    Object reply[] = {"Igen", "Nem"};
    int valasz = JOptionPane.showOptionDialog(frame,"Val�ban ki akarsz l�pni?","Kil�p�s",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,reply,null);    
    if (valasz == JOptionPane.YES_OPTION){
    System.exit(0);}
    
    
    }
    
    if (e.getActionCommand()=="S�g�")
    {
    
    JOptionPane.showMessageDialog(frame,"A pogram haszn�lata egyszer�! Az �tv�ltand� �rt�ket �rjuk be tizedesponttal,\n" + "majd v�lasszuk ki a mellette l�v� leg�rd�l� men�ben a m�rt�kegys�g�t.\n" +
            "Ezut�n az als� leg�rd�l� men�ben v�lasszuk ki, hogy milyen m�rt�kegys�get szeretn�nk.\n" +
            "Kattintsunk az �TV�LT�S gombra, �s akkor piros sz�mokkal megkapjuk az eredm�nyt!\n" +
            "A T�RL�S gombbal t�r�lhetj�k a sz�m�t�st �s �jat kezdhet�nk.\n"         
           ,"S�g�",JOptionPane.INFORMATION_MESSAGE);
    }
    
    if (e.getSource() == button1){
                
                Object r = cbox.getSelectedItem();
                Object s = cbox2.getSelectedItem();
                
                if (r == "Fahrenheit" && s == "Celsius") {
                 double f =new Double(amountField1.getText()).doubleValue();
		     
                if (f>= 0) {
                 double c = ((f-32)*5)/9;
                               
                 label3.setText("" + c);}
                else {
                    double c = -(((-f+32)*5)/9);
		label3.setText("" + c);}    
                }    
                if (r == "Celsius" && s == "Fahrenheit") {
    double c =new Double(amountField1.getText()).doubleValue();
		     
                if (c>= 0) {
                double f2 = ((c*9)/5)+32;
		//edit2.setText(""+f2);}
                label3.setText(""+ f2);}
                else {
                    double f2 = 32-(-c*9/5);
		//edit2.setText(""+ f2);}
                label3.setText(""+ f2);} } 
    
    if (r == "Celsius" && s == "Kelvin") {
    double ck =new Double(amountField1.getText()).doubleValue();
		     
                
                double k = ck+273.15;
		label3.setText(""+ k);}
    
     if (r == "Fahrenheit" && s == "Kelvin") {
                 double fk =new Double(amountField1.getText()).doubleValue();
		     
                if (fk>= 0) {
                 double cf = (((fk-32)*5)/9)+273.15;
                                 
                 label3.setText("" + cf);}
                else {
                    double cf = (-(((-fk+32)*5)/9))+273.15;
		
                label3.setText("" + cf);}    
                }    
    if (r == "Kelvin" && s == "Celsius") {
    double kc =new Double(amountField1.getText()).doubleValue();
		     
                
                double k2 = kc-273.15;
		label3.setText(""+ k2);}
    
    if (r == "Kelvin" && s == "Fahrenheit") {
    double kf =new Double(amountField1.getText()).doubleValue();
		
                double s2 = kf-273.15;     
                if (s2>= 0) {
                double f3 = ((s2*9)/5)+32;
		label3.setText(""+ f3);}
                else {                
                double f3 = 32-(-s2*9/5);
		label3.setText(""+ f3);}  
    }  
    if (r == "Celsius" && s == "R�aumure") {
    double cr =new Double(amountField1.getText()).doubleValue();
		     
                
                double r�1 = cr*0.8;
		label3.setText(""+ r�1);}            
                
     if (r == "R�aumure" && s == "Celsius") {
    double rc =new Double(amountField1.getText()).doubleValue();
		     
                
                double r�c = rc/0.8;
		label3.setText(""+ r�c);}           
    
    if (r == "Kelvin" && s == "R�aumure") {
    double kr =new Double(amountField1.getText()).doubleValue();
		     
                double s2 = kr-273.15;
                double r�k = s2*0.8;
		label3.setText(""+ r�k);}            
                
     if (r == "R�aumure" && s == "Kelvin") {
    double rc =new Double(amountField1.getText()).doubleValue();
		     
                
                double r�c = rc/0.8;
                double r�k2 = r�c+273.15;
		label3.setText(""+ r�k2);}            
                
    if (r == "Fahrenheit" && s == "R�aumure") {
                 double fr =new Double(amountField1.getText()).doubleValue();
		     
                if (fr>= 0) {
                 double fr2 = (((fr-32)*5)/9)*0.8;
                                 
                 label3.setText("" + fr2);}
                else {
                    double fr3 = (-(((-fr+32)*5)/9))*0.8;
		
                label3.setText("" + fr3);}    
                }                
      
      if (r == "R�aumure" && s == "Fahrenheit") {
    double r�f =new Double(amountField1.getText()).doubleValue();
		
                double s3 = r�f/0.8;     
                if (s3>= 0) {
                double r�f2 = ((s3*9)/5)+32;
		label3.setText(""+ r�f2);}
                else {                
                double r�f3 = 32-(-s3*9/5);
		label3.setText(""+ r�f3);}  
    }             
                  
                           
                
               
                }
                if (e.getSource()==button2) { // T�R�L gomb lenyom�sa
			amountField1.setValue(zero);
			label3.setText("0.0");
                        cbox.setSelectedItem("Celsius");
                        cbox2.setSelectedItem("Fahrenheit");
				  }
    //card2
    if (e.getSource() == button3) {
                Object r = cbox3.getSelectedItem();
                Object s = cbox4.getSelectedItem();  
        
        if (r == "megab�jt[MB]" && s == "kilob�jt[KB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = f*1024;
                                
                 label6.setText("" + c);
                   
                } 
        if (r == "megab�jt[MB]" && s == "gigab�jt[GB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = f/1024;
                                
                 label6.setText("" + c); }       
         
         if (r == "kilob�jt[KB]" && s == "megab�jt[MB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = f/1024;
                                
                 label6.setText("" + c);
                   
                }        
          if (r == "kilob�jt[KB]" && s == "gigab�jt[GB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = (f/1024)/1024;
                                
                 label6.setText("" + c);
                   
                } 
           if (r == "gigab�jt[GB]" && s == "kilob�jt[KB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = (f*1024)*1024;
                                
                 label6.setText("" + c);
                   
                }      
                if (r == "gigab�jt[GB]" && s == "megab�jt[MB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = f*1024;
                                
                 label6.setText("" + c);
                   
                } 
                
    }            
    if (e.getSource() == button4){
        amountField2.setValue(zero);
			label6.setText("0.0");
                        cbox3.setSelectedItem("megab�jt[MB]");
                        cbox4.setSelectedItem("kilob�jt[KB]");
    }
    //card3
    if (e.getSource() == button5) {
                Object r = cbox5.getSelectedItem();
                Object s = cbox6.getSelectedItem();  
        
        if (r == "m^2" && s == "hekt�r[ha]") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f/10000;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "m^2" && s == "n�gysz�g�l") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f*0.2780364;
                                
                 label9.setText("" + c); }       
         
         if (r == "m^2" && s == "kataszteri hold") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f/10000)*1.7377277;
                                
                 label9.setText("" + c);
                   
                }        
          if (r == "m^2" && s == "acre") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f/4046.78;
                                
                 label9.setText("" + c);
                   
                } 
           if (r == "hekt�r[ha]" && s == "m^2") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f*10000;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "hekt�r[ha]" && s == "n�gysz�g�l") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*0.2780364)*10000;
                                
                 label9.setText("" + c); }       
         
         if (r == "hekt�r[ha]" && s == "kataszteri hold") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f*1.7377277;
                                
                 label9.setText("" + c);
                   
                }        
          if (r == "hekt�r[ha]" && s == "acre") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = 4046.78/(f/10000);
                                
                 label9.setText("" + c);
                   
                } 
                if (r == "n�gysz�g�l" && s == "hekt�r[ha]") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*3.5966510)/10000;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "n�gysz�g�l" && s == "m^2") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f*3.5966510;
                                
                 label9.setText("" + c); }       
         
         if (r == "n�gysz�g�l" && s == "kataszteri hold") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = ((f*3.5966510)/10000)*1.7377277;
                                
                 label9.setText("" + c);
                   
                }        
          if (r == "n�gysz�g�l" && s == "acre") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*3.5966510)/4046.78;
                                
                 label9.setText("" + c);
                   
                } 
                if (r == "kataszteri hold" && s == "hekt�r[ha]") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f/1.7377277;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "kataszteri hold" && s == "n�gysz�g�l") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*5754.642)*0.2780364;
                                
                 label9.setText("" + c); }       
         
         if (r == "kataszteri hold" && s == "m^2") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f*5754.642;
                                
                 label9.setText("" + c);
                   
                }        
          if (r == "kataszteri hold" && s == "acre") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*5754.642)/4046.78;
                                
                 label9.setText("" + c);
                   
                } 
                if (r == "acre" && s == "hekt�r[ha]") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*4046.78)/10000;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "acre" && s == "n�gysz�g�l") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*4046.78)*0.2780364;
                                
                 label9.setText("" + c); }       
         
         if (r == "acre" && s == "kataszteri hold") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*4046.78)/5754.642;
                                
                 label9.setText("" + c);
                   
                }        
          if (r == "acre" && s == "m^2") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*4046.78);
                                
                 label9.setText("" + c);
                   
                } 
    }            
    if (e.getSource() == button6){
        amountField3.setValue(zero);
			label9.setText("0.0");
                        cbox5.setSelectedItem("m^2");
                        cbox6.setSelectedItem("n�gysz�g�l");
    }
    
    //card4
    if (e.getSource() == button7) {
                Object r = cbox7.getSelectedItem();
                Object s = cbox8.getSelectedItem();  
        
        if (r == "kg/m^3" && s == "pounds/cubic foot") {
                 double f =new Double(amountField4.getText()).doubleValue();
		     
                
                 double c = f*0.062428;
                                
                 label12.setText("" + c);
                   
                } 
        if (r == "pounds/cubic foot" && s == "kg/m^3") {
                 double f =new Double(amountField4.getText()).doubleValue();
		     
                
                 double c = f*16.018463;
                                
                 label12.setText("" + c); }       
         
    }     
    if (e.getSource() == button8){
        amountField4.setValue(zero);
			label12.setText("0.0");
                        cbox7.setSelectedItem("kg/m^3");
                        cbox8.setSelectedItem("pounds/cubic foot");
    }
   //card5
    if (e.getSource() == button9) {
                Object r = cbox9.getSelectedItem();
                Object s = cbox10.getSelectedItem();  
        
        if (r == "kal�ria(�tel)" && s == "kilojoule [kJ]") {
                 double f =new Double(amountField5.getText()).doubleValue();
		     
                
                 double c = f*4.186;
                                
                 label15.setText("" + c);
                   
                } 
        if (r == "kilojoule [kJ]" && s == "kal�ria(�tel)") {
                 double f =new Double(amountField5.getText()).doubleValue();
		     
                
                 double c = f*0.238892;
                                
                 label15.setText("" + c); }       
         
    }     
    if (e.getSource() == button10){
        amountField5.setValue(zero);
			label15.setText("0.0");
                        cbox9.setSelectedItem("kal�ria(�tel)");
                        cbox10.setSelectedItem("kilojoule [kJ]");
    }
    //card6
    if (e.getSource() == button11) {
                Object r = cbox11.getSelectedItem();
                Object s = cbox12.getSelectedItem();  
        
        if (r == "Newton [N]" && s == "pounds force") {
                 double f =new Double(amountField6.getText()).doubleValue();
		     
                
                 double c = f*0.224809;
                                
                 label18.setText("" + c);
                   
                } 
        if (r == "pounds force" && s == "Newton [N]") {
                 double f =new Double(amountField6.getText()).doubleValue();
		     
                
                 double c = f*4.448222;
                                
                 label18.setText("" + c); }       
         
    }     
    if (e.getSource() == button12){
        amountField6.setValue(zero);
			label18.setText("0.0");
                        cbox11.setSelectedItem("Newton [N]");
                        cbox12.setSelectedItem("pounds force");
    }
    //card7
    if (e.getSource() == button13) {
                Object r = cbox13.getSelectedItem();
                Object s = cbox14.getSelectedItem();  
        
                
        if (r == "m�ter [m]" && s == "inch") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*39.370079;
                                
                 label21.setText("" + c);
                   
                } 
        if (r == "m�ter [m]" && s == "foot") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*3.28084;
                                
                 label21.setText("" + c); }       
         
         if (r == "m�ter [m]" && s == "yard") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*1.093613;
                                
                 label21.setText("" + c);
                   
                }        
                         
                 if (r == "inch" && s == "m�ter [m]") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*0.0254;
                                
                 label21.setText("" + c);
                   
                } 
                
                
                 if (r == "inch" && s == "foot") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*0.083333;
                                
                 label21.setText("" + c);
                   
                } 
                
                 if (r == "inch" && s == "yard") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*0.027778;
                                
                 label21.setText("" + c);
                   
                } 
                
                        
         if (r == "foot" && s == "m�ter [m]") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*0.3048;
                                
                 label21.setText("" + c);
                   
                }        
          if (r == "foot" && s == "inch") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = (f*12);
                                
                 label21.setText("" + c);
                   
                } 
                if (r == "foot" && s == "yard") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*0.333333;
                                
                 label21.setText("" + c);
                   
                } 
         
          if (r == "yard" && s == "m�ter [m]") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = (f*0.9144);
                                
                 label21.setText("" + c);
                   
                } 
                if (r == "yard" && s == "inch") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*36;
                                
                 label21.setText("" + c);
                   
                } 
        if (r == "yard" && s == "foot") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*3;
                                
                 label21.setText("" + c); }       
         
        
    }            
    if (e.getSource() == button14){
        amountField7.setValue(zero);
			label21.setText("0.0");
                        cbox13.setSelectedItem("m�ter [m]");
                        cbox14.setSelectedItem("foot");
    }
    //card8
    
    if (e.getSource() == button15) {
                Object r = cbox15.getSelectedItem();
                Object s = cbox16.getSelectedItem();  
                        
        if (r == "gramm [g]" && s == "ounce (oz.)") {
                 double f =new Double(amountField8.getText()).doubleValue();
		     
                
                 double c = f/28.35;
                                
                 label24.setText("" + c);
                   
                } 
        if (r == "gramm [g]" && s == "pound (lb.)") {
                 double f =new Double(amountField8.getText()).doubleValue();
		     
                
                 double c = f/453.59237;
                                
                 label24.setText("" + c); }       
         
         if (r == "ounce (oz.)" && s == "gramm [g]") {
                 double f =new Double(amountField8.getText()).doubleValue();
		     
                
                 double c = f*28.349523;
                                
                 label24.setText("" + c);
                   
                }        
          if (r == "ounce (oz.)" && s == "pound (lb.)") {
                 double f =new Double(amountField8.getText()).doubleValue();
		     
                
                 double c = f/16;
                                
                 label24.setText("" + c);
                   
                } 
           if (r == "pound (lb.)" && s == "gramm [g]") {
                 double f =new Double(amountField8.getText()).doubleValue();
		     
                
                 double c = f*453.59237;
                                
                 label24.setText("" + c);
                   
                } 
                
                 if (r == "pound (lb.)" && s == "ounce (oz.)") {
                 double f =new Double(amountField8.getText()).doubleValue();
		     
                
                 double c = f*16;
                                
                 label24.setText("" + c);
                   
                } 
                             
                
    }            
    if (e.getSource() == button16){
        amountField8.setValue(zero);
			label24.setText("0.0");
                        cbox15.setSelectedItem("gramm [g]");
                        cbox16.setSelectedItem("ounce (oz.)");
    }
    //card9
    if (e.getSource() == button17) {
                Object r = cbox17.getSelectedItem();
                Object s = cbox18.getSelectedItem();  
        
        if (r == "l�er�" && s == "kilowatt [kW]") {
                 double f =new Double(amountField9.getText()).doubleValue();
		     
                
                 double c = f*0.7457;
                                
                 label27.setText("" + c);
                   
                } 
        if (r == "kilowatt [kW]" && s == "l�er�") {
                 double f =new Double(amountField9.getText()).doubleValue();
		     
                
                 double c = f*1.341022;
                                
                 label27.setText("" + c); }       
         
    }     
    if (e.getSource() == button18){
        amountField9.setValue(zero);
			label27.setText("0.0");
                        cbox17.setSelectedItem("l�er�");
                        cbox18.setSelectedItem("kilowatt [kW]");
    }
    //card10
    if (e.getSource() == button19) {
                Object r = cbox19.getSelectedItem();
                Object s = cbox20.getSelectedItem();  
                    
        if (r == "Pascal [Pa]" && s == "pounds force/sq. inch [psi]") {
                 double f =new Double(amountField10.getText()).doubleValue();
		     
                
                 double c = f*0.000145;
                                
                 label30.setText("" + c);
                   
                } 
        if (r == "Pascal [Pa]" && s == "bar") {
                 double f =new Double(amountField10.getText()).doubleValue();
		     
                
                 double c = f*0.00001;
                                
                 label30.setText("" + c); }       
         
         if (r == "pounds force/sq. inch [psi]" && s == "Pascal [Pa]") {
                 double f =new Double(amountField10.getText()).doubleValue();
		     
                
                 double c = f*6894.757;
                                
                 label30.setText("" + c);
                   
                }        
          if (r == "pounds force/sq. inch [psi]" && s == "bar") {
                 double f =new Double(amountField10.getText()).doubleValue();
		     
                
                 double c = f*0.068948;
                                
                 label30.setText("" + c);
                   
                } 
           if (r == "bar" && s == "Pascal [Pa]") {
                 double f =new Double(amountField10.getText()).doubleValue();
		     
                
                 double c = f*100000;
                                
                 label30.setText("" + c);
                   
                } 
                
                 if (r == "bar" && s == "pounds force/sq. inch [psi]") {
                 double f =new Double(amountField10.getText()).doubleValue();
		     
                
                 double c = f*14.503774;
                                
                 label30.setText("" + c);
                   
                } 
                             
                
    }            
    if (e.getSource() == button20){
        amountField10.setValue(zero);
			label30.setText("0.0");
                        cbox19.setSelectedItem("Pascal [Pa]");
                        cbox20.setSelectedItem("pounds force/sq. inch [psi]");
    }
    //card11
    if (e.getSource() == button21) {
                Object r = cbox21.getSelectedItem();
                Object s = cbox22.getSelectedItem();  
        
        if (r == "km/h" && s == "m�rf�ld/�ra") {
                 double f =new Double(amountField11.getText()).doubleValue();
		     
                
                 double c = f*0.621371;
                                
                 label33.setText("" + c);
                   
                } 
        if (r == "m�rf�ld/�ra" && s == "km/h") {
                 double f =new Double(amountField11.getText()).doubleValue();
		     
                
                 double c = f*1.609344;
                              
                 label33.setText("" + c); }       
         
    }     
    if (e.getSource() == button22){
        amountField11.setValue(zero);
			label33.setText("0.0");
                        cbox21.setSelectedItem("km/h");
                        cbox22.setSelectedItem("m�rf�ld/�ra");
    }
    //card12
    if (e.getSource() == button23) {
                Object r = cbox23.getSelectedItem();
                Object s = cbox24.getSelectedItem();  
        
        if (r == "cm^3" && s == "cubic inch") {
                 double f =new Double(amountField12.getText()).doubleValue();
		     
                
                 double c = f*0.0610237;
                                
                 label36.setText("" + c);
                   
                } 
        if (r == "cubic inch" && s == "cm^3") {
                 double f =new Double(amountField12.getText()).doubleValue();
		     
                
                 double c = f*16.387064;
                                
                 label36.setText("" + c); }       
         
    }     
    if (e.getSource() == button24){
        amountField12.setValue(zero);
			label36.setText("0.0");
                        cbox23.setSelectedItem("cm^3");
                        cbox24.setSelectedItem("cubic inch");
    }
    }
    
}

