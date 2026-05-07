import java.io.Serializable;
public class NhanVien implements Serializable {
    private static final long serialVersionUID = 1L;
    private String FullName,gender,department;
    private int skill;
    public NhanVien(){}
    public NhanVien(String fullName, String gender, String department, int skill) {
        this.FullName = fullName;
        this.gender = gender;
        this.department = department;
        this.skill = skill;
    }
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}