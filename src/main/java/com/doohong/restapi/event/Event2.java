package com.doohong.restapi.event;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="id")
public class Event2 {

    private Integer id;
    private String name;
}