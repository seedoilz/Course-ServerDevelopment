package contactos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class Contact {
    @NotNull
    @Size(min=1, message = "You must enter the First Name.")
    private String first_name;

    @NotNull
    @Size(min=1, message = "You must enter the Last Name.")
    private String last_name;

    @NotNull
    @Size(min=11,max=11,message = "You must enter the 11-digits Phone Number.")
    private String phone;

    @NotNull
    @Pattern(regexp = "^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$",
                message = "You must enter the right Email Address.")
    private String email;
}
