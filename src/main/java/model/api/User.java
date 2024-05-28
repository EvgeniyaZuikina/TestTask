package model.api;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

@Data
public class User {
    public String name;
    public String job;

    public User() {
        this.name = RandomStringUtils.randomAlphabetic(10).toUpperCase();;
        this.job = RandomStringUtils.randomAlphabetic(10).toUpperCase();
    }
}
