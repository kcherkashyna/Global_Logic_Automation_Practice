package utils;

public class User {
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String mobilePhone;
    private String password;
    private String dayOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
    private String company;
    private String additionalAddress;
    private String additionalInfo;
    private String homePhone;
    private String defaultFirstName;
    private String defaultLastName;
    private String defaultAddressAlias;

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(final String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(final String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAdditionalAddress() {
        return additionalAddress;
    }

    public void setAdditionalAddress(String additionalAddress) {
        this.additionalAddress = additionalAddress;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getDefaultFirstName() {
        return defaultFirstName;
    }

    public void setDefaultFirstName(String defaultFirstName) {
        this.defaultFirstName = defaultFirstName;
    }

    public String getDefaultLastName() {
        return defaultLastName;
    }

    public void setDefaultLastName(String defaultLastName) {
        this.defaultLastName = defaultLastName;
    }

    public String getDefaultAddressAlias() {
        return defaultAddressAlias;
    }

    public void setDefaultAddressAlias(String defaultAddressAlias) {
        this.defaultAddressAlias = defaultAddressAlias;
    }

    public User(){}

    public User(final String email, final String password){
        this.email = email;
        this.password = password;
    }

    public User(String email, String firstName, String lastName, String password, String address, String city, String state, String postcode, String country, String mobilePhone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.mobilePhone = mobilePhone;

    }

    public User(String email, String firstName,  String lastName, String password, String address, String city, String state, String postcode, String country, String mobilePhone,  String defaultFirstName, String defaultLasName, String defaultAddressAlias) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.mobilePhone = mobilePhone;
        this.defaultFirstName = defaultFirstName;
        this.defaultLastName = defaultLasName;
        this.defaultAddressAlias = defaultAddressAlias;
    }
}
