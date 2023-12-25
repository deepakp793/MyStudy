package devyaniPatil;
/*Assignment - 4 : 

Please create single class and write 3 methods to fulfill below requirements

Program 1: Find a day based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday
dayIndex -> -3 : Invalid Index
dayIndex -> 13 : Invalid Index*/

class Days {

	void dayIndex(int no) {
		if (no == 1) {
			System.out.println("Monday");
		} else if (no == 2) {
			System.out.println("Tuesday");
		} else if (no == 3) {
			System.out.println("Wedensday");
		} else if (no == 4) {
			System.out.println("Thursday");
		} else if (no == 5) {
			System.out.println("Friday");
		} else if (no == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Sunday");
		}
	}

	/*
	 * Program 2: Find weekdays or weekends based on dayIndex. 1 -> Weekday 2 ->
	 * Weekday 6 -> Weekend dayIndex -> -3 : Invalid Index Note : 1 to 5 index
	 * should be considered weekdays, 6 & 7 should be considered weekend
	 */
	void weekdays(int index) {
		if (index >= 1 && index <= 5) {
			System.out.println("its a week days");
		} else if (index >= 5 && index <= 7) {
			System.out.println("it is a weekend");
		} else {
			System.out.println("Invalid Range");

		}

	}

	/*
	 * Program 3 : Find Quater based on month index. Month index is 1 or 2 or 3 ->
	 * FY2022 Q1 Month index is 4 or 5 or 6 -> FY2022 Q2 Month index is 7 or 8 or 9
	 * -> FY2022 Q3 Month index is 10 or 11 or 12 -> FY2022 Q4 Any other index
	 * should be considered as invalid
	 */
	void number(int no) {
		if (no >= 1 && no <= 3) {
			System.out.println("Q1");
		} else if (no >= 4 && no <= 6) {
			System.out.println("Q2");
		} else if (no >= 7 && no <= 12) {
			System.out.println("Q3");
		} else {
			System.out.println("Invalid");
		}

	}

	public static void main(String[] args) {
		Days W = new Days();
		W.dayIndex(1);
		W.weekdays(6);
		W.number(4);
	}
}
