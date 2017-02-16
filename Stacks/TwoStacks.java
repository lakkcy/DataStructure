//Implement two stacks in an array

class TwoStacks{

	int size;
	int top1, top2;
	int[] arr;

	TwoStacks(int n){
		size = n;
		arr = new int[n];
		top1 = -1;
		top2 = size;
	}

	// push1
	public void push1(int d){
		// check for overflow
		if(top1 < top2 - 1){
			top1++;
			arr[top1] = d;
		}
		else{
			System.out.println("Overflow");
			System.exit(1);
		}
	}
	// push2
	public void push2(int d){
		if(top2 > top1 + 1){
			top2--;
			arr[top2] = d;
		}
		else{
			System.out.println("Overflow");
			System.exit(1);
		}
	}

	// pop1
	public void pop1(){
		if(top1 >= 0){
			top1--;
		}
		else{
			System.out.println("Underflow");
			System.exit(1);
		}
	}

	//pop2
	public void pop2(){
		if(top2 < size){
			top2++;
		}
		else{
			System.out.println("Underflow");
			System.exit(1);
		}
	}

	public static void main(String[] args){
		TwoStacks ts = new TwoStacks(10);
		ts.push1(1);
		ts.push2(10);
		ts.push1(2);
		ts.push2(9);
		ts.pop1();
		ts.pop2();

	}
}
