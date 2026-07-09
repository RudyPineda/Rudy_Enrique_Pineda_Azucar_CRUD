package SystemITR.JosueGuinea2A.Response;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString

public class ApiResponse<T> {
    private boolean success;
    private String message;

    public ApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    private T data;
}
