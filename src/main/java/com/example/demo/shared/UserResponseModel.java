package com.example.demo.shared;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseModel {
	private String userId;
    private String firstName;
    private String lastName;
    private String email;
    
}
