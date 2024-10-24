package com.prathambytes.model;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class verification {
    private boolean status;
    private LocalDateTime startedAt;
    private LocalDateTime endsAt;
    private String planType;


}
