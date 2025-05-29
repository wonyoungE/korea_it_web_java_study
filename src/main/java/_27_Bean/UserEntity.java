package _27_Bean;

// Bean
// 하나의 객체 설계 규칙(명세, 가이드 라인)
// 멤버변수들은 private => 캡슐화 만족
// 기본 생성자
// getter/setter => 외부 접근 위해
public class UserEntity {
    private int userId;
    private String userName;
    private int age;
    private String email;

    public UserEntity() {}

    @Override
    public String toString() {
        return "UserEntity(" + "userId=" + userId + ", userName=" + userName + ", age=" + age + ", email=" + email + ")";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
