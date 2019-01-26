package com.doohong.restapi.event;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {
    @Test
    public void builder(){
        Event event = Event.builder()
                .name("inflearn")
                .description("rst API")
                .build();
        assertThat(event).isNotNull();

    }
    @Test
    public void JavaBean(){
        //Given
        String name = "Event";
        String description = "Spring";

        //When
        Event event = new Event();
        event.setName("Event");
        event.setDescription("Spring");

        //Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);

    }


}