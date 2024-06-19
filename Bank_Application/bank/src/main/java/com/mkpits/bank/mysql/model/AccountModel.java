package com.mkpits.bank.mysql.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class AccountModel {

//    @Column(name="id")
//    private  Integer id ;
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId ;
    @Column(name="account_type")
     private String accountType;
    @Column(name = "balance")
    private String balance;
    @Column(name="rate_of_interest")
    private String rateOfIntrest ;
    @Column(name="updated_by")
    private Integer updatedBy;
    @Column(name="updated_at")
    private LocalDateTime updatedAt ;

}
