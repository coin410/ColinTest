


//import javax.jdo.annotations.PersistenceCapable;
//import javax.jdo.annotations.PrimaryKey;
//import javax.jdo.annotations.Persistent;

//import com.google.gwt.user.client.rpc.IsSerializable;


//@PersistenceCapable
public class Business{

	
	//@PrimaryKey
	//@Persistent
	private String licenseNumber;
	//@Persistent
	private String LicenseRevNum;
	//@Persistent
	private String LicenseRSN;
	
	//@Persistent
	private String name;
	
	//@Persistent
	private String busTradeName;
	//@Persistent
	private String status;
	//@Persistent
	private String issueDate;
	
	//@Persistent
	private String expiredDate;
	
	//@Persistent
	private String businessType;
	
	//@Persistent
	private String busSubType;
	//@Persistent
	private String unit;
	
	//@Persistent
	private String unitType;
	
	//@Persistent
	private String houseNumber;

	//@Persistent
	private String streetName;
	
	//@Persistent
	private String city;

	//@Persistent
	private String province;
	
	//@Persistent
	private String country;
	
	//@Persistent
	private String postalCode;
	
	//@Persistent
	private String latitude;
	
	//@Persistent
	private String longitude;
	
	//@Persistent
	private String localArea;
		
	//@Persistent
	private String numberOfEmployees;
	
	//@Persistent
	private String feePaid;
	
	//@Persistent
	private String extractDate;
	
	public Business() {
		
	}
	
	public Business(String businessName, String licenseNumber) {
		this.name = businessName;
		this.licenseNumber = licenseNumber;
	}

	public void setUnit(String a){
		unit = nullStringFilter(a);
	}
	
	public void setUnitType(String a){
		unitType = nullStringFilter(a);
	}
	
	public void setHouseNumber(String a){
		houseNumber = nullStringFilter(a);
	}
	
	public void setExtractDate(String a){
		this.extractDate = a;
	}
	
	public void setStreetName(String name) {
		this.streetName = nullStringFilter(name);;
	}
	
	public void setCountry(String country) {
		this.country = nullStringFilter(country);;
	}
	
	public void setLongitude(String a) { 
		this.longitude = nullStringFilter(a);
	}
	
	public void setLatitude(String a) { 
		this.latitude = nullStringFilter(a);
	}
	
	public void setLocalArea(String a) {
		this.localArea = nullStringFilter(a);
	}
	public void setBusinessName(String a){
		this.name = nullStringFilter(a);
	}
	
	public void setBusinessTradeName(String a){
		this.busTradeName =nullStringFilter(a);
	}
	
	public void setLicenseNumber(String a){
		this.licenseNumber = nullStringFilter(a);
	}
	
	public void setNumberOfEmployees(String a) {
		this.numberOfEmployees = nullStringFilter(a);
	}
	
	public String getNumberOfEmployees() {
		return this.numberOfEmployees;
	}
	
	public void setBusinessType(String a) {
		this.businessType = nullStringFilter(a);
	}
	public String getBusinessType() {
		return this.businessType;
	}
	public void setStatus(String a) {
		this.status = nullStringFilter(a);
	}
	
	public void setDateIssue(String a) {
		this.issueDate = nullStringFilter(a);
	}
	
	public String getLicenseNumber() {
		return nullStringFilter(this.licenseNumber);
	}
	
	public String getName() {
		return nullStringFilter(this.name);
	}
	
	public String getTradeName() {
		return nullStringFilter(this.busTradeName);
	}
	public void setTradeName(String a) {
		this.busTradeName = nullStringFilter(a);
	}
	
	public String getStatus() {
		return nullStringFilter(this.status);
	}
	
	public String getDateIssue() {
		return nullStringFilter(this.issueDate);
	}
	
	public String getDateExpire() {
		return nullStringFilter(this.expiredDate);
	}
	
	public void setDateExpire(String a) {
		this.expiredDate = nullStringFilter(a);
	}
	public String getLicRSN(){
		return nullStringFilter(this.LicenseRSN);
	}

	public String getLicRevNum(){
		return nullStringFilter(this.LicenseRevNum);
	}
	
	//set Methods
	
	public void setLicRSN(String a){
		LicenseRSN = nullStringFilter(a);
	}
	
	public void setFeePaid(String a){
		this.feePaid = nullStringFilter(a);
	}
	
	public String getFeePaid(){
		return this.feePaid;
	}
	
	public String getBusinessSubType(){
		return this.busSubType;
	}
	public void setBusinessSubType(String a){
		this.busSubType = nullStringFilter(a);
	}
	
	
	public void setLicRevNum(String a){
		LicenseRevNum = nullStringFilter(a);
	}
	
	public String getUnit(){
		return nullStringFilter(unit);
	}
	
	public String getUnitType(){
		return nullStringFilter(unitType);
	}
	
	public String getHouseNumber(){
		return nullStringFilter(houseNumber);
	}
	
	public String getExtractDate() {
		return this.extractDate;
	}
	
	public String getStreetName() {
		return nullStringFilter(this.streetName);
	}
	
	public String getCity() {
		return nullStringFilter(this.city);
	}
	
	public String getProvince() {
		return nullStringFilter(this.province);
	}
	
	public String getCountry() {
		return nullStringFilter(this.country);
	}
	
	public String getPostalCode() { 
		return nullStringFilter(this.postalCode);
	}
	
	public String getLongitude() { 
		return nullStringFilter(this.longitude);
	}
	
	public String getLatitude() { 
		return nullStringFilter(this.latitude);
	}
	
	public String getLocalArea() {
		return nullStringFilter(this.localArea);
	}

	public void setCity(String a) {
		this.city = nullStringFilter(a);
	}

	public void setProvince(String a) {
		this.province = nullStringFilter(a);	
	}

	public void setPostalCode(String a) {
		this.postalCode = nullStringFilter(a);		
	}
	private String nullStringFilter(String toCheck) {
		if (toCheck == null || toCheck.length() == 0 || toCheck.equals("")) return "";
		return toCheck;
	}
	
	
}
