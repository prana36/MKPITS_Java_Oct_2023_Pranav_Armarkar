package com.example.demo.dto.request;



import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Builder
@Setter // this Annotation will be generated  The setter method .
@Getter // this Annotation will be generated  The getter method
@NoArgsConstructor // this Annotation will be generated  The No Arguments constructor
@AllArgsConstructor // this Annotation will be generated  The  Arguments constructor
@JsonInclude(JsonInclude.Include.NON_NULL) // To avoid  Null value in bellow attribute
public class UserRequestDto
{
    private Integer id ;

    @NotNull(message = "'firstName. ' cannot be null")
    @Pattern(regexp = "[a-zA-Z]+", message = "'firstName' can only contain alphabets")
    @Size(max = 20, message = " limit exceed 'Firstname' limit is 20")
    private String firstName ;

    @NotNull(message = "'middleName. ' cannot be null")
    @Pattern(regexp = "[a-zA-Z]+", message = "'middleName' can only contain alphabets")
    @Size(max = 20, message = " limit exceed 'Middle' limit is 20")
    private String middleName;

    @NotNull(message = "'lastName. ' cannot be null")
    @Pattern(regexp = "[a-zA-Z]+", message = "'lastName' can only contain alphabets")
    @Size(max = 20, message = " limit exceed 'lastname' limit is 20")
    private String lastName ;

    @NotNull(message = "'username' cannot be null")
    @Size(min = 6, max = 20, message = "'username' can be minimum 6 character and maximum 20 characters")
    private String userName ;

    @NotNull(message = "'password. ' cannot be null")
    @Pattern(regexp ="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8}$", message = "Min 1 uppercase letter. Min 1 lowercase letter.Min 1 special character.Min 1 number.Min 8 characters.")
    private String password;

    @NotNull(message = "'aadharNo. ' cannot be null")
    @Size(min = 10, max = 10, message = "'mobile' can be minimum 10 digits ")
    @Pattern(regexp = "^[0-9]+$", message = "mobile No. Must be a number")
    private String mobile;

    @NotNull(message = "'email ' cannot be null and must follow xyz3@gmail.com formate")
    @Pattern(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "'email' contain Ex:- xyz3@gmail.com")
    private String email;

    @NotNull(message = "'dateOfBirth ' cannot be null and must follow yyyy-mm-dd formate")
//    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$" )
    private LocalDate dateOfBirth;

    @NotNull(message = "'aadharNo. ' cannot be null")
    @Size( min = 12, max = 12, message = "'aadharNo.' can be minimum 12 digits ")
    @Pattern(regexp = "^[0-9]+$", message = " 'aadharNo.' Must be a number")
    private String adhaarNo;

    private String gender ;

//   private Integer createdBy;
//    private LocalDateTime createdAt;
//    private Integer updatedBy;
//    private LocalDateTime updatedAt;

}
