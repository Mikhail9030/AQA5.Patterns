package ru.netology.web;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data

public class UserInfo {
    private final String city;
    /**
     *
     */
    public final String facility;
    private final String data;
    /**
     *
     */
    public final String faked;
    private final String name;
    /**
     *
     */
    public final String filename;
    private final String phone;

}
