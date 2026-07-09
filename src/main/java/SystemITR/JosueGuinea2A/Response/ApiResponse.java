package SystemITR.JosueGuinea2A.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString

public class ApiResponse<T> {
    public ApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    private boolean success;
    private String message;
    private T data;
}
