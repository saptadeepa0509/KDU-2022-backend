
package com.company.collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private List<String>phone_no;
    private Set<String>addresses;
    private Map<String,String>certifications;
    private Properties prop;

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
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

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCertifications() {
        return certifications;
    }

    public void setCertifications(Map<String, String> certifications) {
        this.certifications = certifications;
    }

    public Employee(String name, List<String> phone_no, Set<String> addresses, Map<String, String> certifications, Properties prop) {
        this.name = name;
        this.phone_no = phone_no;
        this.addresses = addresses;
        this.certifications = certifications;
        this.prop = prop;
    }

    public Employee() {
    }
}
