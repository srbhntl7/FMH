package assign;

import java.util.Scanner;
class linkedlist{
class node
{
	public int data;
	public node next;
	public node() {
	this(0);
	}
	public node(int data) {
		this.data = data;
		this.next = null;
	}
}
	private node head;
	public linkedlist() {
		this.head=null;
	}
	public void add_first(int val) {
		node nn=new node(val);
		nn.next=head;
		head=nn;
	}
	public void display()
	{
	        node trav = head;
			while (trav.next!= null) {
				System.out.print(trav.data + " ");
				trav = trav.next;
			}
			System.out.println();
	}
	public void add_last(int val) {
		if(head==null) add_first(val);
		else{
		node nn =new node(val);
		node trav=head;
		while(trav.next!=null) trav=trav.next;
		trav.next=nn;
		}
	}
	public void addafterelement(int data,int newdata) {
		if(head==null) return;
		node trav=head;
		while(trav.data!=data) { 
			if(trav.next==null)return;
			trav=trav.next;
			}
		node nn=new node(newdata);
		nn.next=trav.next;
		trav.next=nn;
	}
	public void addbeforeelement(int data,int newdata) {
		if(head==null||head.data==data) return;
		node prev=null, trav=head;
		while(trav.data!=data) { 
			if(trav.next==null)return;
			prev=trav;
			trav=trav.next;
			}
		node nn=new node(newdata);
		nn.next=prev.next;
		prev.next=nn;
	}
	public void del(int data) {
		if(head==null) System.out.println("nothing to delete");
		else {
		node secondlast = null,trav=head;
		while(trav.data!=data) {
			secondlast=trav;
			trav=trav.next;
		}
		secondlast.next=trav.next;
		}
	}
	public void del_pos(int data ) {
		if(head==null||head.data<1)	System.out.println("nothing to delete");
		node trav=head;
		while(trav.data!=data) {
		
			trav=trav.next;
		}
		trav.next=trav.next.next;
	}
}


public class Program {

public static void main(String[] args) {
	linkedlist lt= new linkedlist();
	int data ;
	Scanner sc = new Scanner(System.in);
	String ch;
	do{
		
		ch = sc.next();
	switch(ch) {
	case "AB" :
		
		 data = sc.nextInt();
		lt.add_first(data);
		break;	
	case "PR" :
		lt.display();		
		break;
	case "AE" :
		
		data = sc.nextInt();
		lt.add_last(data);
		break;
	case "AMA" :
		
		int addafter = sc.nextInt();
		
		data = sc.nextInt();
		lt.addafterelement(addafter, data);
		break;
	case "AMB" :
		
		int addbefore = sc.nextInt();
		
		data = sc.nextInt();
		lt.addbeforeelement(addbefore, data);
		break;
	case "DN" :
		
		data = sc.nextInt();
		lt.del(data);
		break;
	case "DNA" :
		
		data = sc.nextInt();
		lt.del_pos(data);
		break;
	case "EXIT" :
		System.exit(0);
	break;
	}
	} while(!ch.equals("EXIT"));
													

			}
	}
