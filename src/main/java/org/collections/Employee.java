package org.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phone_no;
    private Map<String, String> courses;
    private Set<String> address;
    private Properties props;

    public Employee() {
        super();
    }

    public Employee(String name, List<String> phone_no, Map<String, String> courses, Set<String> address, Properties props) {
        this.name = name;
        this.phone_no = phone_no;
        this.courses = courses;
        this.address = address;
        this.props = props;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(List<String> phone_no) {
        this.phone_no = phone_no;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone_no=" + phone_no +
                ", courses=" + courses +
                ", address=" + address +
                ", props=" + props +
                '}';
    }
}
