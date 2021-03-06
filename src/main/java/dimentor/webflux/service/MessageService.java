package dimentor.webflux.service;

import dimentor.webflux.domain.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MessageService {

    Flux<Message> list();

    Mono<Message> addOne(Message message);
}
