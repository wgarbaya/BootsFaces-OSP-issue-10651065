package com.airhacks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped

public class DepositHolder implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<Deposit> getData()
	    {
		 	List<Deposit> a = new ArrayList<Deposit>();
		 	a.add(new Deposit(50d));
		 	a.add(new Deposit(5d));
		 	a.add(new Deposit(11d));
		 	a.add(new Deposit(100d));

	        return a;
	    }

}
