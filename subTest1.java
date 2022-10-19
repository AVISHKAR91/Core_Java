package armstrong;

public class subTest1 extends test1 {
	
	public void calcArmstrong(int num) {
			
		ori_num = number;

        while (ori_num != 0)
        {
        	rem = ori_num % 10;
            result += Math.pow(rem, 3);
            ori_num /= 10;
        }
        
	}

}
