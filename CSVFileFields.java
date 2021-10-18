import com.opencsv.bean.CsvBindByPosition;

public class CSVFileFields {
    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String Firstname;

    @CsvBindByPosition(position = 2)
    private String LastName;

    @CsvBindByPosition(position = 3)
    private String Version;

    @CsvBindByPosition(position = 4)
    private String InsuranceCompany;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getInsuranceCompany() {
        return InsuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        InsuranceCompany = insuranceCompany;
    }

    public CSVFileFields(String id, String firstname, String lastName, String version, String insuranceCompany) {
        this.id = id;
        Firstname = firstname;
        LastName = lastName;
        Version = version;
        InsuranceCompany = insuranceCompany;
    }

    public CSVFileFields(String id) {
        this.id = id;
    }

    public CSVFileFields() {
    }

    @Override
    public String toString() {
        return "CSVFileFields{" +
                "id='" + id + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Version=" + Version +
                ", InsuranceCompany='" + InsuranceCompany + '\'' +
                '}';
    }
}
