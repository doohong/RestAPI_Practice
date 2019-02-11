package com.doohong.restapi.event;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

//public class EventResource extends ResourceSupport {
//    @JsonUnwrapped
//    private Event event;
//
//    public EventResource(Event event){
//        this.event = event;
//    }
//    public Event getEvent(){
//        return event;
//    }
//
//}
public class EventResource extends Resource<Event>{
    public EventResource(Event event, Link... links){
        super(event,links);
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }

}