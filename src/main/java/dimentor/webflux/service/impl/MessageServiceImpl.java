package dimentor.webflux.service.impl;

import dimentor.webflux.domain.Message;
import dimentor.webflux.repo.MessageRepository;
import dimentor.webflux.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public Flux<Message> list() {
        return messageRepository.findAll();
    }

    @Override
    public Mono<Message> addOne(Message message) {
        return messageRepository.save(message);
    }
}
