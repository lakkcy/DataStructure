public class BalancedParanthesis{
	int size;
	char[] arr;
	int top;
	char startingChar;

	BalancedParanthesis(int n){
		size = n;
		arr = new char[n];
		top = -1;
	}

	public void push(char c){
		if(top < size - 1){
			top++;
			arr[top] = c;
			startingChar = c;
			//System.out.println("Pushing startingChar.. " + c);
		}
		else{
			System.out.println("Overflow");
			System.exit(1);
		}
		//System.out.println("TOP e " + top);
	}

	public void pop(){
		System.out.println("Popping startingChar.. " + startingChar);
		//System.out.println("TOP " + top);
		if(top >= 0){
			char c = arr[top];
			top--;
			System.out.println("ccccccccc " + c);
			//return c;
			isStringBalanced(c);
		}
		else{
			System.out.println("Underflow");
			System.exit(1);
		}
		//return '';
	}

	public void isStringBalanced(char c){
		//System.out.println(c + " " +startingChar);
		if(c != startingChar){
			System.out.println("Paranthesis not balanced");
			System.exit(1);
		}else{
			if(top >= 0)
			startingChar = arr[top];
		}
	}

	public static void main(String[] args){
		BalancedParanthesis bp = new BalancedParanthesis(20);
		String str = "([[[{{}}]]))";
		for(int i=0; i< str.length(); i++){
			switch(str.charAt(i)){
				case '(':
				case '[':
				case '{': bp.push(str.charAt(i)); break;
				case ')':
				case ']':
				case '}': System.out.println("Popping .. " + str.charAt(i)); bp.pop();
			}
		}
		System.out.println("Paranthesis balanced");
	}
}