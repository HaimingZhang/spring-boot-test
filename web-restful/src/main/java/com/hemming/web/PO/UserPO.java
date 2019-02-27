package com.hemming.web.PO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserPO {
    private Long id;
    private String name;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
