package day06_net;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient extends Frame {
	Socket s;

	ObjectOutputStream oos;
	ObjectInputStream ois;

	class ClientThread extends Thread {
		public ClientThread() {
			try {
				s = new Socket("localhost", 9000);
				oos = new ObjectOutputStream(s.getOutputStream());
				ois = new ObjectInputStream(s.getInputStream());
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {

			try {
				while (true) {
					ois.readObject();
				}
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} finally {
				try {
					ois.close();
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public MyClient() {
		creatGUI();
	}
	private void creatGUI() {
		TextField tf = new TextField();
		tf.setColumns(15);
		Button bt = new Button("button");
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//send();
			}
		});
		TextArea ta = new TextArea();
		ta.setColumns(30);
		Panel p = new Panel();
		p.add(tf);
		p.add(bt);
		this.add(ta,BorderLayout.CENTER);
		this.add(p,BorderLayout.SOUTH);
		this.setSize(500,500);;
		this.setLocation(400, 500);
		this.setVisible(true);
		
				
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);;
			}
		});
		
	}
	void go() {
		new ClientThread().start();

	}

	public static void main(String[] args) {
		new MyClient().go();
		
	}
}
