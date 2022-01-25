/*
 * TabDemo.java
 *
 * Created on 2007. március 30., 11:33
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
        JMenu menu1 = new JMenu("Súgó");
        JMenuItem almenu1 = new JMenuItem("Súgó");
        JMenu menu2 = new JMenu("Névjegy");
        JMenuItem almenu2 = new JMenuItem("Mértékegységváltó névjegye");    
        JMenu menu3 = new JMenu("Kilépés");
        JMenuItem almenu3 = new JMenuItem("Kilépés");
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
        amountField1.setToolTipText("Átváltandó mennyiség");

        card1.add(cbox);
        cbox.setToolTipText("Átváltandó mértékegysége");
        
                cbox.addItem("Celsius");
                cbox.addItem("Fahrenheit");
                cbox.addItem("Kelvin");
                cbox.addItem("Réaumure");
        card1.add(button1);
        button1.setToolTipText("Átváltás");
        button1.addActionListener(this);
        
        card1.add(label3);
        label3.setForeground(Color.RED);        
        label3.setToolTipText("Eredmény");
        card1.add(cbox2);
        cbox2.setToolTipText("Eredmény mértékegysége");
        cbox2.addItem("Fahrenheit");
        cbox2.addItem("Celsius");
        cbox2.addItem("Kelvin");              
        cbox2.addItem("Réaumure");
        
        card1.add(button2);
        button2.setToolTipText("Törlés");
        button2.addActionListener(this);
        
        //card2
        JPanel card2 = new JPanel();
        GridLayout layout2 = new GridLayout(2, 4, 10, 10);
        card2.setLayout(layout2);
        card2.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        card2.add(amountField2);
        amountField2.setToolTipText("Átváltandó mennyiség");

        card2.add(cbox3);
        cbox3.setToolTipText("Átváltandó mértékegysége");
        cbox3.addItem("megabájt[MB]");        
        cbox3.addItem("kilobájt[KB]");        
        cbox3.addItem("gigabájt[GB]");
        
        
        
        card2.add(button3);
        button3.setToolTipText("Átváltás");
        button3.addActionListener(this);
       
        card2.add(label6);
        label6.setForeground(Color.RED);
        label6.setToolTipText("Eredmény");
        card2.add(cbox4);
        cbox4.setToolTipText("Eredmény mértékegysége");
        cbox4.addItem("kilobájt[KB]");        
        cbox4.addItem("megabájt[MB]");        
        cbox4.addItem("gigabájt[GB]");
        
        
        card2.add(button4);
        button4.setToolTipText("Törlés");
        button4.addActionListener(this);
        // card3
        JPanel card3 = new JPanel(); //{
        GridLayout layout3 = new GridLayout(2, 4, 10, 10);
        card3.setLayout(layout3);
        card3.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card3.add(amountField3);
        amountField3.setToolTipText("Átváltandó mennyiség");

        card3.add(cbox5);       
        cbox5.setToolTipText("Átváltandó mértékegysége");        
                cbox5.addItem("m^2");
                cbox5.addItem("hektár[ha]");                
                cbox5.addItem("négyszögöl");
                cbox5.addItem("kataszteri hold");                
                cbox5.addItem("acre");                               
                              
                                
        card3.add(button5);
        button5.setToolTipText("Átváltás");
        button5.addActionListener(this);
        
        card3.add(label9);
        label9.setForeground(Color.RED);
        label9.setToolTipText("Eredmény");
        card3.add(cbox6);         
        cbox6.setToolTipText("Eredmény mértékegysége");        
        cbox6.addItem("négyszögöl");        
                cbox6.addItem("m^2");
                cbox6.addItem("hektár[ha]");           
                cbox6.addItem("kataszteri hold");
                cbox6.addItem("acre");                     
               
        card3.add(button6);
        button6.setToolTipText("Törlés");
        button6.addActionListener(this);
        
        //card4
        JPanel card4 = new JPanel(); //{
        GridLayout layout4 = new GridLayout(2, 4, 10, 10);
        card4.setLayout(layout4);
        card4.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card4.add(amountField4);
        amountField4.setToolTipText("Átváltandó mennyiség");

        card4.add(cbox7);
        cbox7.setToolTipText("Átváltandó mértékegysége");
                cbox7.addItem("kg/m^3");
                cbox7.addItem("pounds/cubic foot");
        card4.add(button7);
        button7.setToolTipText("Átváltás");
        button7.addActionListener(this);        
        card4.add(label12);
        label12.setForeground(Color.RED);
        label12.setToolTipText("Eredmény");
        card4.add(cbox8);
        cbox8.setToolTipText("Eredmény mértékegysége");
        cbox8.addItem("pounds/cubic foot");
        cbox8.addItem("kg/m^3");
        
        
        
        card4.add(button8);
        button8.setToolTipText("Törlés");
        button8.addActionListener(this);
        
        //card5
        JPanel card5 = new JPanel(); //{
        GridLayout layout5 = new GridLayout(2, 4, 10, 10);
        card5.setLayout(layout5);
        card5.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        
        card5.add(amountField5);
        amountField5.setToolTipText("Átváltandó mennyiség");

        card5.add(cbox9);
        cbox9.setToolTipText("Átváltandó mértékegysége");
                cbox9.addItem("kalória(étel)");
                cbox9.addItem("kilojoule [kJ]");
                
        card5.add(button9);
        button9.setToolTipText("Átváltás");
        button9.addActionListener(this);
        
        card5.add(label15);
        label15.setForeground(Color.RED);
        label15.setToolTipText("Eredmény");
        card5.add(cbox10);
        cbox10.setToolTipText("Eredmény mértékegysége");
        cbox10.addItem("kilojoule [kJ]");
        cbox10.addItem("kalória(étel)");
        
               
        card5.add(button10);
        button10.setToolTipText("Törlés");
        button10.addActionListener(this);
        
        //card6
        
        JPanel card6 = new JPanel(); //{
        GridLayout layout6 = new GridLayout(2, 4, 10, 10);
        card6.setLayout(layout6);
        card6.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card6.add(amountField6);
        amountField6.setToolTipText("Átváltandó mennyiség");

        card6.add(cbox11);
        cbox11.setToolTipText("Átváltandó mértékegysége");
                cbox11.addItem("Newton [N]");
                cbox11.addItem("pounds force");
                
        card6.add(button11);
        button11.setToolTipText("Átváltás");
        button11.addActionListener(this);
        
        card6.add(label18);
        label18.setForeground(Color.RED);
        label18.setToolTipText("Eredmény");
        card6.add(cbox12);
        cbox12.setToolTipText("Eredmény mértékegysége");
        cbox12.addItem("pounds force");
        cbox12.addItem("Newton [N]");
        
        
        
        card6.add(button12);
        button12.setToolTipText("Törlés");
        button12.addActionListener(this);
        
        //card7
        JPanel card7 = new JPanel(); //{
        GridLayout layout7 = new GridLayout(2, 4, 10, 10);
        card7.setLayout(layout7);
        card7.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card7.add(amountField7);
        amountField7.setToolTipText("Átváltandó mennyiség");

        card7.add(cbox13);
        cbox13.setToolTipText("Átváltandó mértékegysége");
                cbox13.addItem("méter [m]");
                cbox13.addItem("inch");
                cbox13.addItem("foot");
                cbox13.addItem("yard");
                                               
        card7.add(button13);
        button13.setToolTipText("Átváltás");
        button13.addActionListener(this);
        card7.add(label21);
        label21.setForeground(Color.RED);
        label21.setToolTipText("Eredmény");
        card7.add(cbox14);
        cbox14.setToolTipText("Eredmény mértékegysége");        
        cbox14.addItem("foot");
                cbox14.addItem("méter [m]");
                cbox14.addItem("inch");                
                cbox14.addItem("yard");
                                        
        card7.add(button14);
        button14.setToolTipText("Törlés");
        button14.addActionListener(this);
        
        //card8
        JPanel card8 = new JPanel(); //{
        GridLayout layout8 = new GridLayout(2, 4, 10, 10);
        card8.setLayout(layout8);
        card8.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card8.add(amountField8);
        amountField8.setToolTipText("Átváltandó mennyiség");

        card8.add(cbox15);
        cbox15.setToolTipText("Átváltandó mértékegysége");
                cbox15.addItem("gramm [g]");
                cbox15.addItem("ounce (oz.)");
                cbox15.addItem("pound (lb.)");
                              
                
                
        card8.add(button15);
        button15.setToolTipText("Átváltás");
        button15.addActionListener(this);
        
        card8.add(label24);
        label24.setForeground(Color.RED);
        label24.setToolTipText("Eredmény");
        card8.add(cbox16);
        cbox16.setToolTipText("Eredmény mértékegysége");
        cbox16.addItem("ounce (oz.)");
        cbox16.addItem("gramm [g]");           
        cbox16.addItem("pound (lb.)");                
                
        card8.add(button16);
        button16.setToolTipText("Törlés");
        button16.addActionListener(this);
        
        //card9
        JPanel card9 = new JPanel(); //{
        GridLayout layout9 = new GridLayout(2, 4, 10, 10);
        card9.setLayout(layout9);
        card9.setBorder(BorderFactory.createCompoundBorder(outer, inner));
        
        
        card9.add(amountField9);
        amountField9.setToolTipText("Átváltandó mennyiség");

        card9.add(cbox17);
        cbox17.setToolTipText("Átváltandó mértékegysége");
                cbox17.addItem("lóerõ");
                cbox17.addItem("kilowatt [kW]");
                
        card9.add(button17);
        button17.setToolTipText("Átváltás");
        button17.addActionListener(this);
        
        card9.add(label27);
        label27.setForeground(Color.RED);
        label27.setToolTipText("Eredmény");
        card9.add(cbox18);
        cbox18.setToolTipText("Eredmény mértékegysége");
        cbox18.addItem("kilowatt [kW]");
        cbox18.addItem("lóerõ");
        
        
        
        card9.add(button18);
        button18.setToolTipText("Törlés");
        button18.addActionListener(this);
        
        //card10
        
        JPanel card10 = new JPanel(); //{
        GridLayout layout10 = new GridLayout(2, 4, 10, 10);
        card10.setLayout(layout10);
        card10.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card10.add(amountField10);
        amountField10.setToolTipText("Átváltandó mennyiség");

        card10.add(cbox19);
        cbox19.setToolTipText("Átváltandó mértékegysége");
                cbox19.addItem("Pascal [Pa]");
                cbox19.addItem("pounds force/sq. inch [psi]");
                cbox19.addItem("bar");
                
        card10.add(button19);
        button19.setToolTipText("Átváltás");
        button19.addActionListener(this);
        card10.add(label30);
        label30.setForeground(Color.RED);
        label30.setToolTipText("Eredmény");
        card10.add(cbox20);
        cbox20.setToolTipText("Eredmény mértékegysége");
        cbox20.addItem("pounds force/sq. inch [psi]");
        cbox20.addItem("Pascal [Pa]");        
        cbox20.addItem("bar");              
        
        
        card10.add(button20);
        button20.setToolTipText("Törlés");
        button20.addActionListener(this);
        
        //card11
        
        JPanel card11 = new JPanel(); //{
        GridLayout layout11 = new GridLayout(2, 4, 10, 10);
        card11.setLayout(layout11);
        card11.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                
        card11.add(amountField11);
        amountField11.setToolTipText("Átváltandó mennyiség");

        card11.add(cbox21);
        cbox21.setToolTipText("Átváltandó mértékegysége");
                cbox21.addItem("km/h");
                cbox21.addItem("mérföld/óra");
                
        card11.add(button21);
        button21.setToolTipText("Átváltás");
        button21.addActionListener(this);
        card11.add(label33);
        label33.setForeground(Color.RED);
        label33.setToolTipText("Eredmény");
        card11.add(cbox22);
        cbox22.setToolTipText("Eredmény mértékegysége");
        cbox22.addItem("mérföld/óra");
        cbox22.addItem("km/h");
        
        
        
        card11.add(button22);
        button22.setToolTipText("Törlés");
        button22.addActionListener(this);
        
        //card12
        
        JPanel card12 = new JPanel(); //{
        GridLayout layout12 = new GridLayout(2, 4, 10, 10);
        card12.setLayout(layout12);
        card12.setBorder(BorderFactory.createCompoundBorder(outer, inner));
                       
        card12.add(amountField12);
        amountField12.setToolTipText("Átváltandó mennyiség");

        card12.add(cbox23);
        cbox23.setToolTipText("Átváltandó mértékegysége");
                cbox23.addItem("cm^3");
                cbox23.addItem("cubic inch");
                
        card12.add(button23);
        button23.setToolTipText("Átváltás");
        button23.addActionListener(this);
        
        card12.add(label36);
        label36.setForeground(Color.RED);
        label36.setToolTipText("Eredmény");
        card12.add(cbox24);
        cbox24.setToolTipText("Eredmény mértékegysége");
        cbox24.addItem("cubic inch");
        cbox24.addItem("cm^3");
        
        
        
        card12.add(button24);
        button24.setToolTipText("Törlés");
        button24.addActionListener(this);
        
        
        
        
        tabbedPane.addTab("Hõmérséklet",tab1,card1,"C° - F°");
        tabbedPane.addTab("Bájtok",bytes,card2,"MB - KB");
        tabbedPane.addTab("Terület",area,card3,"m^2 - négyszögöl");
        tabbedPane.addTab("Sûrûség",density,card4,"kg/m^3 - pounds/cubic foot");
        tabbedPane.addTab("Energia",energy,card5,"kalória - kJ");
        tabbedPane.addTab("Erõ",force,card6,"N - pounds force");
        tabbedPane.addTab("Hosszúság",length,card7,"m - foot");
        tabbedPane.addTab("Tömeg",weight,card8,"g - oz.");
        tabbedPane.addTab("Teljesítmény",power,card9,"hp - kw");
        tabbedPane.addTab("Nyomás",press,card10,"Pa - psi");
        tabbedPane.addTab("Sebesség",speed,card11,"km/h - MpH");
        tabbedPane.addTab("Térfogat",volume,card12, "cm^3 - cubic inch");
        
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
        JFrame frame = new JFrame("Mértékegységváltó");
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
        
        //ha középre akarom állítani az ablakot!
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
    if (e.getActionCommand()=="Mértékegységváltó névjegye")
    {
    
    JOptionPane.showMessageDialog(frame,"          Mértékegységváltó\n" + "  Szerkesztette: Dr. Szlávik Szabolcs\n" + "http://www.freeweb.hu/szlavikszabolcs\n"+ "     szlavikszabolcs@freemail.hu\n" + "                      2007." ,"Mértékegységváltó névjegye",JOptionPane.INFORMATION_MESSAGE);
    }
    if (e.getActionCommand()=="Kilépés")
    {
    Toolkit.getDefaultToolkit().beep();
    Object reply[] = {"Igen", "Nem"};
    int valasz = JOptionPane.showOptionDialog(frame,"Valóban ki akarsz lépni?","Kilépés",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,reply,null);    
    if (valasz == JOptionPane.YES_OPTION){
    System.exit(0);}
    
    
    }
    
    if (e.getActionCommand()=="Súgó")
    {
    
    JOptionPane.showMessageDialog(frame,"A pogram használata egyszerû! Az átváltandó értéket írjuk be tizedesponttal,\n" + "majd válasszuk ki a mellette lévõ legördülõ menüben a mértékegységét.\n" +
            "Ezután az alsó legördülõ menüben válasszuk ki, hogy milyen mértékegységet szeretnénk.\n" +
            "Kattintsunk az ÁTVÁLTÁS gombra, és akkor piros számokkal megkapjuk az eredményt!\n" +
            "A TÖRLÉS gombbal törölhetjük a számítást és újat kezdhetünk.\n"         
           ,"Súgó",JOptionPane.INFORMATION_MESSAGE);
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
    if (r == "Celsius" && s == "Réaumure") {
    double cr =new Double(amountField1.getText()).doubleValue();
		     
                
                double ré1 = cr*0.8;
		label3.setText(""+ ré1);}            
                
     if (r == "Réaumure" && s == "Celsius") {
    double rc =new Double(amountField1.getText()).doubleValue();
		     
                
                double réc = rc/0.8;
		label3.setText(""+ réc);}           
    
    if (r == "Kelvin" && s == "Réaumure") {
    double kr =new Double(amountField1.getText()).doubleValue();
		     
                double s2 = kr-273.15;
                double rék = s2*0.8;
		label3.setText(""+ rék);}            
                
     if (r == "Réaumure" && s == "Kelvin") {
    double rc =new Double(amountField1.getText()).doubleValue();
		     
                
                double réc = rc/0.8;
                double rék2 = réc+273.15;
		label3.setText(""+ rék2);}            
                
    if (r == "Fahrenheit" && s == "Réaumure") {
                 double fr =new Double(amountField1.getText()).doubleValue();
		     
                if (fr>= 0) {
                 double fr2 = (((fr-32)*5)/9)*0.8;
                                 
                 label3.setText("" + fr2);}
                else {
                    double fr3 = (-(((-fr+32)*5)/9))*0.8;
		
                label3.setText("" + fr3);}    
                }                
      
      if (r == "Réaumure" && s == "Fahrenheit") {
    double réf =new Double(amountField1.getText()).doubleValue();
		
                double s3 = réf/0.8;     
                if (s3>= 0) {
                double réf2 = ((s3*9)/5)+32;
		label3.setText(""+ réf2);}
                else {                
                double réf3 = 32-(-s3*9/5);
		label3.setText(""+ réf3);}  
    }             
                  
                           
                
               
                }
                if (e.getSource()==button2) { // TÖRÖL gomb lenyomása
			amountField1.setValue(zero);
			label3.setText("0.0");
                        cbox.setSelectedItem("Celsius");
                        cbox2.setSelectedItem("Fahrenheit");
				  }
    //card2
    if (e.getSource() == button3) {
                Object r = cbox3.getSelectedItem();
                Object s = cbox4.getSelectedItem();  
        
        if (r == "megabájt[MB]" && s == "kilobájt[KB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = f*1024;
                                
                 label6.setText("" + c);
                   
                } 
        if (r == "megabájt[MB]" && s == "gigabájt[GB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = f/1024;
                                
                 label6.setText("" + c); }       
         
         if (r == "kilobájt[KB]" && s == "megabájt[MB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = f/1024;
                                
                 label6.setText("" + c);
                   
                }        
          if (r == "kilobájt[KB]" && s == "gigabájt[GB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = (f/1024)/1024;
                                
                 label6.setText("" + c);
                   
                } 
           if (r == "gigabájt[GB]" && s == "kilobájt[KB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = (f*1024)*1024;
                                
                 label6.setText("" + c);
                   
                }      
                if (r == "gigabájt[GB]" && s == "megabájt[MB]") {
                 double f =new Double(amountField2.getText()).doubleValue();
		     
                
                 double c = f*1024;
                                
                 label6.setText("" + c);
                   
                } 
                
    }            
    if (e.getSource() == button4){
        amountField2.setValue(zero);
			label6.setText("0.0");
                        cbox3.setSelectedItem("megabájt[MB]");
                        cbox4.setSelectedItem("kilobájt[KB]");
    }
    //card3
    if (e.getSource() == button5) {
                Object r = cbox5.getSelectedItem();
                Object s = cbox6.getSelectedItem();  
        
        if (r == "m^2" && s == "hektár[ha]") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f/10000;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "m^2" && s == "négyszögöl") {
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
           if (r == "hektár[ha]" && s == "m^2") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f*10000;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "hektár[ha]" && s == "négyszögöl") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*0.2780364)*10000;
                                
                 label9.setText("" + c); }       
         
         if (r == "hektár[ha]" && s == "kataszteri hold") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f*1.7377277;
                                
                 label9.setText("" + c);
                   
                }        
          if (r == "hektár[ha]" && s == "acre") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = 4046.78/(f/10000);
                                
                 label9.setText("" + c);
                   
                } 
                if (r == "négyszögöl" && s == "hektár[ha]") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*3.5966510)/10000;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "négyszögöl" && s == "m^2") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f*3.5966510;
                                
                 label9.setText("" + c); }       
         
         if (r == "négyszögöl" && s == "kataszteri hold") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = ((f*3.5966510)/10000)*1.7377277;
                                
                 label9.setText("" + c);
                   
                }        
          if (r == "négyszögöl" && s == "acre") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*3.5966510)/4046.78;
                                
                 label9.setText("" + c);
                   
                } 
                if (r == "kataszteri hold" && s == "hektár[ha]") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = f/1.7377277;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "kataszteri hold" && s == "négyszögöl") {
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
                if (r == "acre" && s == "hektár[ha]") {
                 double f =new Double(amountField3.getText()).doubleValue();
		     
                
                 double c = (f*4046.78)/10000;
                                
                 label9.setText("" + c);
                   
                } 
        if (r == "acre" && s == "négyszögöl") {
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
                        cbox6.setSelectedItem("négyszögöl");
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
        
        if (r == "kalória(étel)" && s == "kilojoule [kJ]") {
                 double f =new Double(amountField5.getText()).doubleValue();
		     
                
                 double c = f*4.186;
                                
                 label15.setText("" + c);
                   
                } 
        if (r == "kilojoule [kJ]" && s == "kalória(étel)") {
                 double f =new Double(amountField5.getText()).doubleValue();
		     
                
                 double c = f*0.238892;
                                
                 label15.setText("" + c); }       
         
    }     
    if (e.getSource() == button10){
        amountField5.setValue(zero);
			label15.setText("0.0");
                        cbox9.setSelectedItem("kalória(étel)");
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
        
                
        if (r == "méter [m]" && s == "inch") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*39.370079;
                                
                 label21.setText("" + c);
                   
                } 
        if (r == "méter [m]" && s == "foot") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*3.28084;
                                
                 label21.setText("" + c); }       
         
         if (r == "méter [m]" && s == "yard") {
                 double f =new Double(amountField7.getText()).doubleValue();
		     
                
                 double c = f*1.093613;
                                
                 label21.setText("" + c);
                   
                }        
                         
                 if (r == "inch" && s == "méter [m]") {
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
                
                        
         if (r == "foot" && s == "méter [m]") {
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
         
          if (r == "yard" && s == "méter [m]") {
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
                        cbox13.setSelectedItem("méter [m]");
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
        
        if (r == "lóerõ" && s == "kilowatt [kW]") {
                 double f =new Double(amountField9.getText()).doubleValue();
		     
                
                 double c = f*0.7457;
                                
                 label27.setText("" + c);
                   
                } 
        if (r == "kilowatt [kW]" && s == "lóerõ") {
                 double f =new Double(amountField9.getText()).doubleValue();
		     
                
                 double c = f*1.341022;
                                
                 label27.setText("" + c); }       
         
    }     
    if (e.getSource() == button18){
        amountField9.setValue(zero);
			label27.setText("0.0");
                        cbox17.setSelectedItem("lóerõ");
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
        
        if (r == "km/h" && s == "mérföld/óra") {
                 double f =new Double(amountField11.getText()).doubleValue();
		     
                
                 double c = f*0.621371;
                                
                 label33.setText("" + c);
                   
                } 
        if (r == "mérföld/óra" && s == "km/h") {
                 double f =new Double(amountField11.getText()).doubleValue();
		     
                
                 double c = f*1.609344;
                              
                 label33.setText("" + c); }       
         
    }     
    if (e.getSource() == button22){
        amountField11.setValue(zero);
			label33.setText("0.0");
                        cbox21.setSelectedItem("km/h");
                        cbox22.setSelectedItem("mérföld/óra");
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

