package java_classes.teacher.console_io;

import java.io.Console;

public class MenuUsingFinalStatic {

	private String[] items = { "歡迎使用溫度轉換器:", "1. 華氏轉攝氏", "2. 攝氏轉華氏", "0. 離開" };
	public static final int ANS_0_EXIT = 0;
	public static final int ANS_1_FarenToCelsius = 1;
	public static final int ANS_2_CelsiusToFaren = 2;

	public int show() {
		for (int id = 0; id < items.length; id++) {
			System.out.println(items[id]);
		}
		Console console = System.console();
		if (console == null) {
			System.err.println("No console.");
			System.exit(1);
		}

		int ans = Integer.valueOf(console.readLine("請輸入選項:"));

		while (ans != 0 && ans != 1 && ans != 2) {
			ans = Integer.valueOf(console.readLine("輸入錯誤，請重輸:"));

		}
		return ans;
	}

	public static void main(String[] args) {

		MenuUsingFinalStatic menu = new MenuUsingFinalStatic();
		int result = menu.show();
		System.out.println("result is "+result);
	}

}
