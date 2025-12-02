package com.ust.srs.service;

import com.ust.srs.bean.CredentialsBean;
//import com.ust.srs.bean.ProfileBean;

public interface Authenticate {
	public boolean authenticate(CredentialsBean credentialsBean);
	public String authorize(String userId);
	public boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus);
}
