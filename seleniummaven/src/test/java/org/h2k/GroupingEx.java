package org.h2k;

import org.testng.annotations.Test;

	public class GroupingEx {

		@Test(groups={"regression","ui","system","US_001"})
		public void a1()
		{
			
		}
		@Test(groups={"sanity", "ui","US_001"})
		public void a2()
		{
			
		}
		@Test(groups={"sanity","system","US_001"})
		public void a3()
		{
			
		}
	}



