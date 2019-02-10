package com.doohong.restapi.event;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(JUnitParamsRunner.class)
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
    @Parameters({
            "0,0,true",
            "100,0,false",
            "0,100,false"
    })
    public void testFree(int basePrice, int maxPrice, boolean isFree){
        //Given
        Event event = Event.builder()
                .basePrice(basePrice)
                .maxPrice(maxPrice)
                .build();
        //When
        event.update();
        //Then
        assertThat(event.isFree()).isEqualTo(isFree);

    }
    private Object[] parametersForTestOffline(){
        return new Object[]{
                new Object[] {"강남역 네이버 D2 스타텁 팩토리",true},
                new Object[]{"",false}
        };
    }
    @Test
    @Parameters
    public void testOffline(String location, boolean isOffline){
        //Given
        Event event = Event.builder()
                .location(location)
                .build();
        //When
        event.update();
        //Then
        assertThat(event.isOffline()).isEqualTo(isOffline);


    }


}