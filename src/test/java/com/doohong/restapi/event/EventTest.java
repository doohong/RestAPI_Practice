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
    @Test
    public void testFree(){
        //Given
        Event event = Event.builder()
                .basePrice(0)
                .maxPrice(0)
                .build();
        //When
        event.update();
        //Then
        assertThat(event.isFree()).isTrue();

        event = Event.builder()
                .basePrice(100)
                .maxPrice(0)
                .build();
        //When
        event.update();
        //Then
        assertThat(event.isFree()).isFalse();

        event = Event.builder()
                 .basePrice(0)
                .maxPrice(100)
                .build();
        //When
        event.update();
        //Then
        assertThat(event.isFree()).isFalse();
    }
    @Test
    public void testOffline(){
        //Given
        Event event = Event.builder()
                .location("강남역 네이버 D2 스타텁 팩토리")
                .build();
        //When
        event.update();
        //Then
        assertThat(event.isOffline()).isTrue();

        //Given
        event = Event.builder()
                .build();
        //When
        event.update();
        //Then
        assertThat(event.isOffline()).isFalse();

    }


}