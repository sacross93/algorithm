package jyJJ;

public class MainStack {
	
	static public String postfix(String exp){
		char token;
		String result = "";
		ListStack postStack = new ListStack();
		for(int i=0; i < exp.length(); i++){
			token = exp.charAt(i);
			if (token == '('){ postStack.push(token); }
			else if (token == ')'){
				while(true){
					if (postStack.peek() == '(') { postStack.delete(); break; }
					result += postStack.pop();
				}
			}
			else if (token == '*' || token == '/'){
				if (postStack.peek() == '+' || postStack.peek() == '-' ){ postStack.push(token);}
				else if(postStack.peek() == '*' || postStack.peek() == '/'){ result += token; }
				else if (postStack.isEmpty() == true || postStack.peek() == '('){postStack.push(token);}
				}
			else if (token == '+' || token == '-'){
				if (postStack.peek() == '+' || postStack.peek() == '-' ){ result += token; }
				else if(postStack.peek() == '*' || postStack.peek() == '/'){ result += postStack.pop(); postStack.push(token); }
				else if (postStack.isEmpty() == true || postStack.peek() == '('){postStack.push(token);}
				}
			else {result += token;}
			}
		while(postStack.isEmpty() != true ){
			result += postStack.pop();
		}
		
		return result;
	}
	static public String evalPostfix(String exp){
		char token;
		char p1, p2;
		int temp;
		String result = "";
		ListStack postStack = new ListStack();
		for(int i=0; i < exp.length(); i++){
			token = exp.charAt(i);
			if (token == '*' || token == '/' || token == '+' || token == '-'){
				p2 = postStack.pop();
				p1 = postStack.pop();
				switch(token){
				case '*':
					temp = (p1-'0')*(p2-'0') + '0';
					postStack.push((char)temp);
					break;
				case '/':
					temp = (p1-'0')/(p2-'0') + '0';
					postStack.push((char)temp);
					break;
				case '+':
					temp = (p1-'0')+(p2-'0') + '0';
					postStack.push((char)temp);
					break;
				case '-':
					temp = (p1-'0')-(p2-'0') + '0';
					postStack.push((char)temp);
					break;
				}
			}
				
			else {postStack.push(token);}
			}
		result += (int)postStack.pop() - '0';		
		return result;
	}

	public static void main(String[] args) {
		String a = ""; // input
		String b = ""; // output
		String c = ""; // output
		a="1+2*3+3";
		b=postfix(a);
		System.out.println(b);
		c = evalPostfix(b);
		System.out.println(c);
		
		

	}

}
