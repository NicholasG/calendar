/*
 * W = d + [ (13m - 1) / 5 ] + y + [ y / 4 ] + [ c / 4 ] - 2c

 где d - число месяца;
 m - номер месяца, начиная с марта (март=1, апрель=2, ..февраль=12);
 y - номер года в столетии (например, для 1965 года y=65. Для января и февраля 1965 года, т. е. для m=11 или m=12 номер года надо брать предыдущий, т. е. y=64);
 c - количество столетий (например, для 2000 года c=20. И здесь для января и февраля 2000 года надо брать предыдущее столетие с=19);
 квадратные скобки означают целую часть полученного числа (отбрасываем дробную) .

 Результат W делите на 7 и модуль остатка от деления даст день недели (воскресенье=0, понедельник=1, ..суббота=6)

 Пример: для 31 декабря 2008 года определяем:
 d=31, m=10, y=8, c=20

 По формуле находим:
 W = 31 + [ ( 13 * 10 - 1 ) / 5 ] + 8 + [ 8 / 4 ] + [ 20 / 4 ] - 2 * 20 =
 = 31 + 25 + 8 + 2 + 5 - 40 = 31

 Теперь делим W на 7 и находим остаток от деления: 31 / 7 = 4 и 3 в остатке.
 Тройка соответствует дню недели СРЕДА.
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
