package com.mkpits.abstractions;

import java.io.IOException;

abstract class DepositeWithdrow {
	  
	  abstract void amountDeposite() throws NumberFormatException, IOException;
	  abstract void amountWithdrow() throws NumberFormatException, IOException;
      abstract void balanceInquiry();
      
      
      
}
