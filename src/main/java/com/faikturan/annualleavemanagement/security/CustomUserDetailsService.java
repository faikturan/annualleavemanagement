package com.faikturan.annualleavemanagement.security;


import com.faikturan.annualleavemanagement.entity.Employee;
import com.faikturan.annualleavemanagement.repository.EmployeeRepository;
import com.faikturan.annualleavemanagement.util.enums.EmployeeStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("userService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Employee employee = employeeRepository.findByUsernameAndStatus(username, EmployeeStatus.ACTIVE);
        if (employee == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        Collection<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList(employee.getRole());

        return new JwtUserDetails(employee.getUsername(), employee.getPassword(), employee.getEmployeeId(), grantedAuthorities);
    }

}