class PowerOfTwo {
	public boolean isPowerofTwo(int n){
		if (n & (n-1) == 0){ // bit hack
			return true;
		}
		return false;
	}
	public static void main(){
		boolean result = isPowerofTwo(8);
		System.out.println("Is 8 Power of Two?"+ result);
	}

}