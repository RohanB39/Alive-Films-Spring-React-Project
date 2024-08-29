package in.aliveFilms.Model;

import java.sql.Date;

public class Employee {
    // Personal Details
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private long phoneNumber;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String maritalStatus;
    private String gender;
    private String nationality;
    private String pan;
    private String adhar;
    private String bloodGroup;
    private String physicalDisabilities;
    private String emergencyContactName;
    private String emergencyContactRelationship;
    private long emergencyContactPhone;
    private String permanentAddress;

    // Employment Details
    private String position;
    private String typeOfWork;
    private String workExperience;
    private String previousEmployer;
    private String previousJobTitle;
    private String previousJobDuration;
    private String previousJobReasonForLeaving;

    // Bank Details
    private String bankAccountNumber;
    private String bankName;
    private String ifscCode;

    // Education Details
    private String education;
    private String degree;
    private String college;
    private String university;
    private String marks;
    private String languageKnown;

    // Professional and Social Media Profiles
    private String linkedInProfile;
    private String githubProfile;

    // Additional Information
    private String skills;
    private String certifications;
    private String hobbies;
    private String references;

    public Employee() {
    }

    public Employee(String firstName, String middleName, String lastName, Date dateOfBirth, String email, long phoneNumber, String address, String city, String state, int zipCode, String maritalStatus, String gender, String nationality, String pan, String adhar, String bloodGroup, String physicalDisabilities, String emergencyContactName, String emergencyContactRelationship, long emergencyContactPhone, String permanentAddress, String position, String typeOfWork, String workExperience, String previousEmployer, String previousJobTitle, String previousJobDuration, String previousJobReasonForLeaving, String bankAccountNumber, String bankName, String ifscCode, String education, String degree, String college, String university, String marks, String languageKnown, String linkedInProfile, String githubProfile, String skills, String certifications, String hobbies, String references) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.nationality = nationality;
        this.pan = pan;
        this.adhar = adhar;
        this.bloodGroup = bloodGroup;
        this.physicalDisabilities = physicalDisabilities;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactRelationship = emergencyContactRelationship;
        this.emergencyContactPhone = emergencyContactPhone;
        this.permanentAddress = permanentAddress;
        this.position = position;
        this.typeOfWork = typeOfWork;
        this.workExperience = workExperience;
        this.previousEmployer = previousEmployer;
        this.previousJobTitle = previousJobTitle;
        this.previousJobDuration = previousJobDuration;
        this.previousJobReasonForLeaving = previousJobReasonForLeaving;
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.education = education;
        this.degree = degree;
        this.college = college;
        this.university = university;
        this.marks = marks;
        this.languageKnown = languageKnown;
        this.linkedInProfile = linkedInProfile;
        this.githubProfile = githubProfile;
        this.skills = skills;
        this.certifications = certifications;
        this.hobbies = hobbies;
        this.references = references;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getPhysicalDisabilities() {
        return physicalDisabilities;
    }

    public void setPhysicalDisabilities(String physicalDisabilities) {
        this.physicalDisabilities = physicalDisabilities;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }

    public long getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(long emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getPreviousEmployer() {
        return previousEmployer;
    }

    public void setPreviousEmployer(String previousEmployer) {
        this.previousEmployer = previousEmployer;
    }

    public String getPreviousJobTitle() {
        return previousJobTitle;
    }

    public void setPreviousJobTitle(String previousJobTitle) {
        this.previousJobTitle = previousJobTitle;
    }

    public String getPreviousJobDuration() {
        return previousJobDuration;
    }

    public void setPreviousJobDuration(String previousJobDuration) {
        this.previousJobDuration = previousJobDuration;
    }

    public String getPreviousJobReasonForLeaving() {
        return previousJobReasonForLeaving;
    }

    public void setPreviousJobReasonForLeaving(String previousJobReasonForLeaving) {
        this.previousJobReasonForLeaving = previousJobReasonForLeaving;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getLanguageKnown() {
        return languageKnown;
    }

    public void setLanguageKnown(String languageKnown) {
        this.languageKnown = languageKnown;
    }

    public String getLinkedInProfile() {
        return linkedInProfile;
    }

    public void setLinkedInProfile(String linkedInProfile) {
        this.linkedInProfile = linkedInProfile;
    }

    public String getGithubProfile() {
        return githubProfile;
    }

    public void setGithubProfile(String githubProfile) {
        this.githubProfile = githubProfile;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }
}
