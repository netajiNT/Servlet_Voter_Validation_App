package com.it.servlet.voter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

public class Voter_Info_App extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,IOException{
		PrintWriter pw=null;
		String name=null,tage=null,nationality=null,married=null,tchild=null;
		int age=0,child=0;
		pw=res.getWriter();
		res.setContentType("text/html");
		name=req.getParameter("tname");
		nationality=req.getParameter("nationality");
		married=req.getParameter("tmarried");
		child=Integer.parseInt(req.getParameter("tchild"));
		age=Integer.parseInt(req.getParameter("tage"));
		if(age>=26) {
			pw.println("<h1 style='color:green'>Mr/Mrs/Miss"+"  "+name+"  "+"you are age is"+"  "+age+"  "+"years old elibible to Election Voting ");
		}
		else {
			pw.println("<h1 style='color:red'>Mr/Mrs/Miss"+"  "+name+"  "+"  "+"you are age is "+"  "+age+" years you are not  elibible to Election Voting");

		}
		if(child<=2) {
			pw.println("<h1 style='color:blue'>Mr/Mrs/Miss"+"  "+name+"  "+" WEL-COME  elibible to Election Voting  becoz you have a "+"  "+child+"  "+" child");
		}
		else {
			pw.println("<h1 style='color:red'>Mr/Mrs/Miss"+"  "+name+"  "+"SORRY you have more than"+"  "+child+"  "+"child not  elibible to Election Voting");

		}
		if(married==null) {			
			pw.println("<h1 style=color:'blue'>Mr/Mrs/Miss u r not to"+"  "+married+"  "+"happy bachelor life ");	
		}
		else {
		
		pw.println("<h1 style=color:'blue'>Mr/Mrs/Miss u r married to"+"  "+married+"  "+"congrats and happy married life ");
		}
		
		//pw.println("<a href='input.html>");
		pw.close();
	}
}
