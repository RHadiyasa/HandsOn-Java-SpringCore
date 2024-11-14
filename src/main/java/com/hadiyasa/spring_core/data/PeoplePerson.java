package com.hadiyasa.spring_core.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // Auto constructor
@Data // Auto setter getter
public class PeoplePerson {
    private Person person;
    private People people;
}
