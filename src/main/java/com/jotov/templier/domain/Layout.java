package com.jotov.templier.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Locale;

@Data
@EqualsAndHashCode(of = {"id"})
public class Layout {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String subject;

    private String layout;

    private Locale locale;
}
