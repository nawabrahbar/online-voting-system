package com.aaen.OnlineVotingSystem.model;

import lombok.Data;

@Data
public class PasswordReset {

	private String currentPassword;
	private String newPassword;
}
