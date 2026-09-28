package com.jhor;
import com.fasterxml.jackson.annotation.JsonProperty;

class Identity {
	@JsonProperty("applicantId")
	private String Id;
	private String firstName;
	private String lastName;
	@JsonProperty("dateOfBirth")
	private String birthDate;
	@JsonProperty("nationalIdOrSsn")
	private String ssn;

	public Identity() {}

	public String getId() { return (Id); }
	public void setId(String id) { this.Id = id; }

	public String getFirstName() { return (firstName); }
	public void setFirstName(String firstname) { this.firstName = firstname; }

	public String getlastName() { return (lastName); }
	public void setLastName(String lastname) { this.lastName = lastname; }

	public String getbirthDate() { return (birthDate); }
	public void setbirthDate(String birthdate) { this.birthDate = birthdate; }

	public String getSsn() { return (ssn); }
	public void setSsn(String Ssn) { this.ssn = Ssn; }
}

class Contact {
	private String email;
	private String phoneNumber;
	private String streetAddress;
	private String city;
	private String state;
	private int postalCode;

	public Contact() {};

	public String getEmail() { return(email); };
	public void getEmail(String Email) { this.email = Email; }

	public String getPhoneNumber() { return(phoneNumber); };
	public void getPhoneNumber(String PhoneNumber) { this.phoneNumber = PhoneNumber; }

	public String getStreetAddress() { return(streetAddress); };
	public void getStreetAddress(String StreetAddress) { this.streetAddress = StreetAddress; }

	public String getCity() { return(city); };
	public void getCity(String City) { this.city = City; }

	public String getState() { return(state); };
	public void getState(String State) { this.state = State; }

	public int getPostalCode() { return(postalCode); };
	public void getPostalCode(int PostalCode) { this.postalCode = PostalCode; }
}

class FinancialDeclare {
	@JsonProperty("declaredCreditAmount")
	private int monthlyIncome;
	private String employmentStatus;

	public int getMonthlyIncome() { return(monthlyIncome); }
	public void setMonthlyIncome(int MonthlyIncome) { this.monthlyIncome =  MonthlyIncome; }

	public String getEmploymentStatus() { return(employmentStatus); }
	public void setEmploymentStatus(String EmploymentStatus) { this.employmentStatus =  EmploymentStatus; }
}

class RequestInfo {
	@JsonProperty("requestedCreditAmount")
	private double creditAmount;
	private String loanPurpose;

	public double getCreditAmount() { return(creditAmount); }
	public void setCreditAmount(double CreditAmount) { this.creditAmount =  CreditAmount; }

	public String getLoanPurpose() { return(loanPurpose); }
	public void setLoanPurpose(String LoanPurpose) { this.loanPurpose =  LoanPurpose; }
}

class Session {
	@JsonProperty("applicationTimeStamp")
	private String timeStamp;
	private String ipAddress;
	private String deviceId;

	public String getTimeStamp() { return(timeStamp); }
	public void setTimeStamp(String TimeStamp) { this.timeStamp =  TimeStamp; }

	public String getIpAddress() { return(ipAddress); }
	public void setIpAddress(String IpAddress) { this.ipAddress =  IpAddress; }

	public String getDeviceId() { return(deviceId); }
	public void setDeviceId(String DeviceId) { this.deviceId =  DeviceId; }
}

public class Applicant {

	
}
