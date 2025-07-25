
package feedback.helpers;

import jakarta.validation.constraints.*;

public class FeedbackRequest {
    @NotBlank
    @Size(min = 3)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 10)
    private String message;

    // GETTERS
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
