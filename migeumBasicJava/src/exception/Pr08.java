package exception;

import java.util.ArrayList;
import java.util.Scanner;

class AccountException extends Exception {
	@Override
	public String toString() {
		return "이미 등록된 계좌에러입니다.";
	}
}

class AccountBalanceException extends Exception {
	@Override
	public String toString() {
		return "계좌잔액이 부족합니다.";
	}
}

class FrozenAccountException extends Exception {
	@Override
	public String toString() {
		return "계좌는 동결된 계쫘입니다.";
	}
}

class InvalidTransactionException extends Exception {
	@Override
	public String toString() {
		return "존재하지 않는 계좌에러입니다.";
	}
}

class Account {
	String ID;
	String name;
	int balance;
	Boolean isFrozen;

	public Account(String ID, String name, int balance) {
		this.ID = ID;
		this.name = name;
		this.balance = balance;
		this.isFrozen = false;
	}

	void deposit(int balance) {
		this.balance += balance;
	}

	void withdraw(int balance) {
		this.balance -= balance;
	}

	@Override
	public String toString() {
		return ID + "\t" + name + "\t" + balance + "\t" + (isFrozen ? "동결계좌" : "") + "\n";
	}
}

class Bank {
	ArrayList<Account> accounts = new ArrayList<>();

	void register(String Id, String name, int balance) {
		accounts.add(new Account(Id, name, balance));
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	void frozenAccount(String ID) {
		for (Account account : accounts) {
			if (ID.equals(account.ID)) {
				try {
					if (account.isFrozen)
						throw new FrozenAccountException();
				} catch (FrozenAccountException e) {
					System.out.println(e);
					return;
				}

				account.isFrozen = true;
				return;
			}
		}
		try {
			throw new InvalidTransactionException();
		} catch (InvalidTransactionException e) {
			System.out.println(e);
			return;
		}
	}

	void deposit(String ID, Scanner scanner) {
		for (Account account : accounts) {
			if (ID.equals(account.ID)) {
				try {
					if (account.isFrozen)
						throw new FrozenAccountException();
				} catch (FrozenAccountException e) {
					System.out.println(e);
					return;
				}

				System.out.println("입금액 : ");
				account.deposit(scanner.nextInt());
				System.out.println("현재 잔액 : " + account.balance);
				return;
			}
		}
		try {
			throw new InvalidTransactionException();
		} catch (InvalidTransactionException e) {
			System.out.println(e);
			return;
		}
	}

	void withdraw(String ID, Scanner scanner) {
		int tmp;
		for (Account account : accounts) {
			if (ID.equals(account.ID)) {

				try {
					if (account.isFrozen)
						throw new FrozenAccountException();
				} catch (FrozenAccountException e) {
					System.out.println(e);
					return;
				}

				System.out.println("출금액 : ");
				tmp = scanner.nextInt();

				try {
					if (account.balance < tmp)
						throw new AccountBalanceException();
				} catch (AccountBalanceException e) {
					System.out.println(e);
					return;
				}

				account.withdraw(tmp);

				System.out.println("현재 잔액 : " + account.balance);
				return;
			}
		}
		try {
			throw new InvalidTransactionException();
		} catch (InvalidTransactionException e) {
			System.out.println(e);
			return;
		}
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();

		buf.append("ID\tname\tamount\tfrozen\n");
		for (Account account : accounts) {
			buf.append(account.toString());
		}

		return buf.toString();
	}
}

public class Pr08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		String ID;
		String name;
		int balance;
		ArrayList<Account> accounts = bank.getAccounts();

		while (true) {
			System.out.println("1.고객등록 2.계좌동결 3.입금 4.출금 5.고객명단 6.종료 --> ");

			switch (scanner.nextInt()) {
			case 1:
				System.out.println("ID : ");
				ID = scanner.next();

				try {
					for (Account account : accounts) {
						if (ID.equals(account.ID)) {
							throw new AccountException();
						}
					}
				} catch (AccountException e) {
					System.out.println(e);
					continue;
				}

				System.out.println("name : ");
				name = scanner.next();
				System.out.println("amount : ");
				balance = scanner.nextInt();

				bank.register(ID, name, balance);
				break;

			case 2:
				System.out.println("ID : ");
				ID = scanner.next();
				bank.frozenAccount(ID);
				break;

			case 3:
				System.out.println("ID : ");
				ID = scanner.next();
				bank.deposit(ID, scanner);
				break;

			case 4:
				System.out.println("ID : ");
				ID = scanner.next();
				bank.withdraw(ID, scanner);
				break;

			case 5:
				System.out.println(bank);
				break;

			case 6:
				scanner.close();
				return;

			default:
				throw new IllegalArgumentException("Unexpected value: " + scanner);
			}
		}
	}
}

/*
 * 1 1 aaa 4000 1 2 bbb 5000 1 3 ccc 2000
 * 
 */
