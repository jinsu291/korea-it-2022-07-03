package a12_상속2;

public class Company {
    private String companyName;

    public Company() {
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void showCompanyInfo(){
        System.out.println("회사명 : " + companyName);
    }
}
