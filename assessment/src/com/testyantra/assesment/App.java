package com.testyantra.assesment;

import java.util.List;
import java.util.Scanner;

import com.testyantra.assesment.dao.ContactDAO;
import com.testyantra.assesment.dto.ContactInfo;
import com.testyantra.assesment.util.ContactManger;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("press 1 to show all the contacts");
		System.out.println("press 2 to search for contact using name");
		System.out.println("press 3 to operate on a contact");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:
			ContactDAO impl= ContactManger.getContactDAo();
			List<ContactInfo> info=impl.getAllContacts();
			for (ContactInfo contactInfo : info) {
				System.out.println("Contact Name is:"+contactInfo.getName());
			}
			break;
		case 2:
			System.out.println("Enter a name to be searched");
			Scanner sc1=new Scanner(System.in);
			String name=sc1.nextLine();
			ContactDAO impl1=ContactManger.getContactDAo();
			
			ContactInfo info1 =impl1.searchContact(name);
			if(info1!=null) {
				
				System.out.println("name is: "+info1.getName());
				System.out.println("number is: "+info1.getNumber());
				System.out.println("group is: "+info1.getGroupp());
				System.out.println("========================");
				System.out.println("press 1 call");
				System.out.println("press 2 send a message");
				System.out.println("press 3 back to main menu");
				int number=sc1.nextInt();
					switch(number){
						case 1:
							System.out.println("calling to...."+name);
							break;
						case 2:
							System.out.println("sending a message to"+name);
							break;
						case 3:
							main(args);
							break;
					}
			}else {
				System.out.println("No Data Found PLeaase enter valid details");
			}
		
			break;
		case 3:
			System.out.println("press 1 to add contact");
			System.out.println("press 2 to update contact");
			System.out.println("press 3 to delete contact");
			Scanner sc3=new Scanner(System.in);
			int n=sc3.nextInt();
				switch(n) {
				
				case 1:
					System.out.println("Enter a name");
					String name1=sc3.next();
				
					System.out.println("enetr a number");
					int number=sc3.nextInt();
					
					System.out.println("enete a group");
					String group=sc3.next();
					ContactInfo info3=new ContactInfo();
					info3.setName(name1);
					info3.setNumber(number);
					info3.setGroupp(group);
					ContactDAO impl3=ContactManger.getContactDAo();
				int i=impl3.insertContact(info3);
				System.out.println(i+"   Row inserted  ");
					break;
				case 2:
					System.out.println("Enter  the  name");
					String names=sc3.next();
				
					System.out.println("Enter the number");
					int number1=sc3.nextInt();
					
					System.out.println("Enter a group");
					String group1=sc3.next();
					ContactInfo info4=new ContactInfo();
					info4.setName(names);
					info4.setNumber(number1);
					info4.setGroupp(group1);
					ContactDAO impl6=ContactManger.getContactDAo();
				int co=impl6.updateContact(info4);
				System.out.println(co+"Row Updated");
					break;
				case 3:
					System.out.println("Enter the name to be deleted");
					Scanner scc=new Scanner(System.in);
					String deletename=scc.nextLine();
					ContactDAO impl4=ContactManger.getContactDAo();
					int count=impl4.deleteContact(deletename);
					System.out.println(count+"it is deleted");
					break;
				}
			
			break;
		default:System.out.println("invalid chioice");
		
		}//end of switch case
	}//end of main main method

}//end of class
