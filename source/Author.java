package source;

public class Author {
	private String name;
    private String emailId;
    private int age;
    private String gender;

    public Author(String name, String emailId, int age, String gender) {
        this.name = name;
        this.emailId = emailId;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

}
