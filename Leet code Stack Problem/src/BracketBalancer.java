public class BracketBalancer {
	public static boolean bracketBalancer(String s) {
		int length = s.length();
		Stack stack = new Stack(s.length());
		int count = 0;
		String newString = "";
		while(s != "") {
			if(s.charAt(0) == '(' || s.charAt(0) == '{' || s.charAt(0) == '[') {
				stack.push(s.charAt(0));
				count++;
				s = s.replace(s.charAt(0) + "", "");
			}
			else {
				System.out.println(s);
				newString += s.charAt(0);
				s = s.replace(s.charAt(0) + "", "");
			}
		}
		System.out.println(newString);
		boolean result = check(newString, stack);
		return result;
	}
	
	private static boolean check(String s, Stack stack) {
		boolean flag = false;
		if((stack.top().data == '(' && s.charAt(0) == ')') ||
				(stack.top().data == '{' && s.charAt(0) == '}') ||
				(stack.top().data == '[' && s.charAt(0) == ']')) {
			for(int i = 0; i < s.length(); i++) {
				if((stack.top().data == '(' && s.charAt(i) == ')') ||
						(stack.top().data == '{' && s.charAt(i) == '}') ||
						(stack.top().data == '[' && s.charAt(i) == ']')) {
					stack.pop();
					flag = true;
				}
				else {
					return false;
				}
			}
		}
		else {
			for(int i = s.length() -1; i >= 0; i--) {
				if((stack.top().data == '(' && s.charAt(i) == ')') ||
						(stack.top().data == '{' && s.charAt(i) == '}') ||
						(stack.top().data == '[' && s.charAt(i) == ']')) {
					stack.pop();
					flag = true;
				}
				else {
					return false;
				}
			}
		}
		return flag;
	}
}
