package edu.ssafy;
import java.util.ArrayList;
import java.util.Scanner;

public class Dispatcher {
	private IManager man;
	private Scanner scan;
	private boolean flag = true;
	private int menu;
	int num = 0;

	public Dispatcher() {
		// man = new Manager();//�Ŵ����� �����ڰ� private�̱� ������
		man =ListManager.getIncetance();
		man.restore();
		scan = new Scanner(System.in);
	}

	public void go() {
		while (flag) {
			System.out.println("�Ͻ÷��� �۾���ȣ�� �������ּ���");
			System.out.println("1.�����ȸ 2.�߰� 3.���� 4.���� 5.��ȸ 6.���� 99.��ΰ� ���� �մϴ�");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				ArrayList<Employee> searchAll = man.searchAll();
				for (Employee emp : searchAll)
					System.out.println(emp.whoami());
				break;
			case 2:
				System.out.println("�߰��Ϸ��� �ٷ��ڸ� �������ּ��� 1.�ٷ��� 2.���� 3.������");
				int submenu = scan.nextInt();
				System.out.println("�߰��Ϸ��� �ٷ����� ��ȣ�� �Է����ּ���");
				num = scan.nextInt();
				switch (submenu) {
				case 1:
					man.add(new Employee(num));
					break;
				case 2:
					man.add(new Salesman(num));
					break;
				case 3:
					man.add(new Programmer(num));
					break;
				default:
					break;
				}
				break;
			case 3:// ����
				System.out.println("�����Ϸ��� �ϴ� �ٷ����� ��ȣ�� �Է��ϼ��� ");
				num = scan.nextInt();
				man.modify(new Employee(num));
				break;
			case 4:
				System.out.println("�����Ϸ��� �ϴ� �ٷ����� ��ȣ�� �Է��ϼ��� ");
				num = scan.nextInt();
				man.delete(new Employee(num));
				break;
			case 5:
				System.out.println("��ȸ�Ϸ��� �ϴ� �ٷ����� ��ȣ�� �Է��ϼ���");
				num = scan.nextInt();
				Employee search;
				try {
					search = man.search(num);
					System.out.println(search.whoami());
				} catch (MyDataNotFoundException e) {
					e.print();
				}
			
				break;
			case 6:
				man.save();
				flag = false;
				break;
			case 99:
				man.allWork();
				break;
			default:
				break;
			}

		}
	}

	public static void main(String[] args) {
		new Dispatcher().go();
	}

}
