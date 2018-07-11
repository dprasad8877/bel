import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		// getSmallestAndLargest("welcome",3);
		System.out.println(getSmallestAndLargest("welcome", 3));
		// SubString("welcome", 3);
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		// int arrLength=(int) Math.ceil((float)s.length()/k);
		// String[] subStrArr = splitByNumber(s, k);
		ArrayList<String> l = SubString(s, k);
		String[] subStrArr = l.toArray(new String[l.size()]);
		System.out.println("hello diwakar");
		int arrLength = subStrArr.length;
		for (int i = 0; i < arrLength - 1; i++) {
			for (int j = 0; j < arrLength - i - 1; j++) {
				boolean flag = false;
				for (int k1 = 0; k1 < subStrArr[j + 1].length(); k1++) {

					if (subStrArr[j].charAt(k1) == subStrArr[j + 1].charAt(k1)) {
						flag = true;
					} else if (subStrArr[j].charAt(k1) < subStrArr[j + 1].charAt(k1)) {
						flag = true;
						break;
					} else {
						flag = false;
						
						break;
					}
				}
				if (flag == false) {
					String temp = subStrArr[j];
					subStrArr[j] = subStrArr[j + 1];
					subStrArr[j + 1] = temp;
				}

			}
		}
		smallest = subStrArr[0];
		largest = subStrArr[arrLength - 1];
		return smallest + "\n" + largest;
	}

	public static ArrayList<String> SubString(String str, int m) {
		int n = str.length();
		ArrayList<String> arrList = new ArrayList<String>();
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++) {
				String ss = str.substring(i, j);
				if (ss.length() == m)
					arrList.add(ss.toString());
			}
		return arrList;
	}

	/*
	 * public static String[] splitByNumber(String str, int size) { return (size < 1
	 * || str == null) ? null : str.split("(?<=\\G.{" + size + "})"); }
	 */
}
