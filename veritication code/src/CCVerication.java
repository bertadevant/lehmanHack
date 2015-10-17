
public class CCVerication {
	private int[] ccn;
	
	public CCVerication(String ccn){
		this.ccn = new int[ccn.length()];
		for(int i = 0; i < ccn.length(); i++){
			this.ccn[i] = ccn.charAt(i) - '0';
		}			
	}
	
	public int doubleEverySeconddigit(int size){
		int sum = 0;
		for(int i = size-2; i >=0; i = i -2){
			int subSum = ccn[i] * 2;
			if(subSum > 9){
				subSum = subSum / 10 + subSum %10; 
			}
			sum += subSum;
		}
		return sum;
	}
	public int oddPlacesSum(int size){
		int sum = 0;
		for(int i = size-1; i >=0; i = i -2){			
			sum += ccn[i];
		}
		return sum;
	}
	
	public boolean isValid(){		
		if(ccn.length == 13 || ccn.length == 16){
			
			int step1 = doubleEverySeconddigit(ccn.length);			
			int step2 = oddPlacesSum(ccn.length);		
			int luhn = step1 + step2;			
			if(luhn % 10 == 0){
				if(ccn[0] == 4){
					System.out.println("Visa Card");
				}else if(ccn[0] == 5){
					System.out.println("Master Card");
				}else if(ccn[0] == 3 && ccn[1] == 7){
					System.out.println("American Express");
				}
				System.out.println("Verified");
				return true;
			}else{
				System.out.print("Wrong Credit Number");
				return false;
			}
		}else{
			System.out.print("Wrong Credit Number");
			return false;
		}
	}
	
	public static void main(String[] args) {
		String creditCardNumber = "4388576018410707";
		CCVerication cc = new CCVerication(creditCardNumber);
		cc.isValid();
	}


}
