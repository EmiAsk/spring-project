package ru.tinkoff.edu.java.scrapper.service.jdbc;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tinkoff.edu.java.scrapper.model.Chat;
import ru.tinkoff.edu.java.scrapper.repository.jdbc.JdbcChatRepository;
import ru.tinkoff.edu.java.scrapper.service.ChatService;


@Service
@Slf4j
@RequiredArgsConstructor
public class JdbcChatService implements ChatService {

    private final JdbcChatRepository chatRepository;

    @Transactional
    @Override
    public void register(long chatId) {
        chatRepository.save(new Chat(chatId));
    }

    @Transactional
    @Override
    public void unregister(long chatId) {
        chatRepository.removeById(chatId);
    }
}
