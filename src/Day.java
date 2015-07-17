/*
 * W = d + [ (13m - 1) / 5 ] + y + [ y / 4 ] + [ c / 4 ] - 2c

 ��� d - ����� ������;
 m - ����� ������, ������� � ����� (����=1, ������=2, ..�������=12);
 y - ����� ���� � �������� (��������, ��� 1965 ���� y=65. ��� ������ � ������� 1965 ����, �. �. ��� m=11 ��� m=12 ����� ���� ���� ����� ����������, �. �. y=64);
 c - ���������� �������� (��������, ��� 2000 ���� c=20. � ����� ��� ������ � ������� 2000 ���� ���� ����� ���������� �������� �=19);
 ���������� ������ �������� ����� ����� ����������� ����� (����������� �������) .

 ��������� W ������ �� 7 � ������ ������� �� ������� ���� ���� ������ (�����������=0, �����������=1, ..�������=6)

 ������: ��� 31 ������� 2008 ���� ����������:
 d=31, m=10, y=8, c=20

 �� ������� �������:
 W = 31 + [ ( 13 * 10 - 1 ) / 5 ] + 8 + [ 8 / 4 ] + [ 20 / 4 ] - 2 * 20 =
 = 31 + 25 + 8 + 2 + 5 - 40 = 31

 ������ ����� W �� 7 � ������� ������� �� �������: 31 / 7 = 4 � 3 � �������.
 ������ ������������� ��� ������ �����.
 */

public class Day {

	int day;
	int month;
	int year;

	public Day(int day, int month, int year) {
		this.day = day;

		switchAMonth(month);
		
		if (year > 2000) {
			this.year = year - 2000;
		}
	}

	private void switchAMonth(int month) {
		switch (month) {
		case 1:
			this.month = 11;
			break;
		case 2:
			this.month = 12;
			break;
		case 3:
			this.month = 1;
			break;
		case 4:
			this.month = 2;
			break;
		case 5:
			this.month = 3;
			break;
		case 6:
			this.month = 4;
			break;
		case 7:
			this.month = 5;
			break;
		case 8:
			this.month = 6;
			break;
		case 9:
			this.month = 7;
			break;
		case 10:
			this.month = 8;
			break;
		case 11:
			this.month = 9;
			break;
		case 12:
			this.month = 10;
			break;
		}
	}
}
