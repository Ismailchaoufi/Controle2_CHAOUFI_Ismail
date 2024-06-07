//package web.security;
//
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import web.models.Employee;
//
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Objects;
//
//public class EmployeeDetails implements UserDetails {
//
//    private Employee employee;
//
//    public EmployeeDetails(Employee client) {
//        super();
//        this.employee = employee;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.singleton(new SimpleGrantedAuthority(employee.getRole()));
//    }
//
//    @Override
//    public String getPassword() {
//        return employee.get();
//    }
//
//    //login by num tel
//
//    @Override
//    public String getUsername() {
//        return employee.getNumTel();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        EmployeeDetails user = (EmployeeDetails) o;
//        return Objects.equals(client.getId_client(), user.client.getId_client());
//    }
//    public Long getId() {
//        return client.getId_client();
//    }
//
//    public String getEmail() {
//        return client.getEmail();
//    }
//}
