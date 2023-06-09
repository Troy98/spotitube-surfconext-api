package nl.han.oose.dea.rest.cross_cutting_concern.dto;

public class LoginRequestDTO {
    private String user;
    private String password;

    public LoginRequestDTO() {
    }

    public LoginRequestDTO(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
