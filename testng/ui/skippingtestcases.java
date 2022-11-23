package ui;
//TO SKIP THE TESTCASES IN TESTNG
import org.testng.SkipException;
import org.testng.annotations.Test;
@Test
public class skippingtestcases 
	{
		boolean b = false;
		@Test(enabled=false)                                              //---------------------------------------> 1st method to skip test case 
		public void skiptest1()
		{
			System.out.println("---------skipping test1 as it is not complete---------");
		}
		public void skiptest2()
		{
			System.out.println("---------skipping test2 forcefully-----------");
			throw new SkipException("Skipping the test forcefully ");       //--------------------------------------->2nd method to skip test case
		}

		public void skiptest3()
		{
			
			System.out.println("-------skipping test3 based on the condition--------");
			if(b==true)
			{
				System.out.println("==============execute the testcase==============");
			}
			else
			{
				System.out.println("============skip the test cases===========");
				throw new SkipException("skips the testcase based on the conmdition "); //---------------------------->3rd method to skip the testcase
			}
		}
	}	
