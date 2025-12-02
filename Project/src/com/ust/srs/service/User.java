package com.ust.srs.service;

import com.ust.srs.bean.CredentialsBean;
import com.ust.srs.bean.ProfileBean;

public interface User {
	public String login(CredentialsBean credentialsBean);
	public boolean logout(String userId);
	public String changePassword(CredentialsBean credentialsBean, String newPassword);
	public String register(ProfileBean profileBean);
}
