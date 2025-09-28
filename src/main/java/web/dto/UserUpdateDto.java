package web.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class UserUpdateDto {

    @NotNull
    @Positive(message = "The number must be positive.")
    private Long id;

    @NotNull
    @Size(min = 3, max = 20)
    @NotBlank(message = "Username is mandatory.")
    @Pattern(regexp = "^[^0-9]*$", message = "The name must not contain numbers.")
    private String name;

    @NotNull
    @Size(min = 3, max = 20)
    @NotBlank(message = "Lastname is mandatory.")
    @Pattern(regexp = "^[^0-9]*$", message = "The name must not contain numbers.")
    private String lastName;

    @NotNull
    @Positive(message = "The number must be positive.")
    private Long age;

    public UserUpdateDto() {}
    public UserUpdateDto(String name, Long id, String lastName, Long age) {
        this.name = name;
        this.id = id;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
