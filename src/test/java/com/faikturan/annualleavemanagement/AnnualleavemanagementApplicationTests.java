package com.faikturan.annualleavemanagement;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class AnnualleavemanagementApplicationTests {

//	@Autowired
//	LoginDetailsRepository loginDetailsRepository;
//
//	@Autowired
//	RoleRepository roleRepository;
//
//	@Autowired
//	EmployeeDetailsRepository employeeDetailsRepository;
//
//	@Autowired
//	PasswordEncoder passwordEncoder;
//
//	@Test
//	public void contextLoads() {
//	}
//
//	@Transactional
//	@Test
//	@Rollback(false)
//	public void testLogin(){
//		String userId = "turanfaik@hotmail.com";
//		Optional<LoginDetails> login = loginDetailsRepository.findByUserIdAndLockAccount(userId, 0);
//
//		Assert.assertEquals(login.get().getUserId(), userId);
//		Assert.assertTrue(login.get().getRoles().size() > 0);
//
//		LoginDetails loginDetails = login.get();
//		loginDetails.setPassword(passwordEncoder.encode("123456"));
//		System.out.println(loginDetails.getPassword());
//		loginDetailsRepository.save(loginDetails);
//
//		System.out.println(login);
//	}
//
//	@Test
//	public void testRole(){
//		List<Roles> roles = roleRepository.findAll();
//		Assert.assertTrue(roles.size() > 0);
//	}
//
//	@Test
//	public void testEmployeeDetails(){
//		String emplId = "E000000011";
//		EmployeeDetails employee = employeeDetailsRepository.findByEmplId(emplId);
//		Assert.assertTrue(employee.getEmplId().equals(emplId));
//	}

}

