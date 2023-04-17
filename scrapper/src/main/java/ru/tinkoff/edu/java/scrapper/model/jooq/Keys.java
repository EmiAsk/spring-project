/*
 * This file is generated by jOOQ.
 */
package ru.tinkoff.edu.java.scrapper.model.jooq;


import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import ru.tinkoff.edu.java.scrapper.model.jooq.tables.Chat;
import ru.tinkoff.edu.java.scrapper.model.jooq.tables.ChatLink;
import ru.tinkoff.edu.java.scrapper.model.jooq.tables.Databasechangeloglock;
import ru.tinkoff.edu.java.scrapper.model.jooq.tables.Link;
import ru.tinkoff.edu.java.scrapper.model.jooq.tables.records.ChatLinkRecord;
import ru.tinkoff.edu.java.scrapper.model.jooq.tables.records.ChatRecord;
import ru.tinkoff.edu.java.scrapper.model.jooq.tables.records.DatabasechangeloglockRecord;
import ru.tinkoff.edu.java.scrapper.model.jooq.tables.records.LinkRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.17.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ChatRecord> CHAT_PKEY = Internal.createUniqueKey(Chat.CHAT, DSL.name("chat_pkey"), new TableField[] { Chat.CHAT.ID }, true);
    public static final UniqueKey<ChatLinkRecord> CHAT_LINK_PKEY = Internal.createUniqueKey(ChatLink.CHAT_LINK, DSL.name("chat_link_pkey"), new TableField[] { ChatLink.CHAT_LINK.CHAT_ID, ChatLink.CHAT_LINK.LINK_ID }, true);
    public static final UniqueKey<DatabasechangeloglockRecord> DATABASECHANGELOGLOCK_PKEY = Internal.createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, DSL.name("databasechangeloglock_pkey"), new TableField[] { Databasechangeloglock.DATABASECHANGELOGLOCK.ID }, true);
    public static final UniqueKey<LinkRecord> LINK_PKEY = Internal.createUniqueKey(Link.LINK, DSL.name("link_pkey"), new TableField[] { Link.LINK.ID }, true);
    public static final UniqueKey<LinkRecord> LINK_URL_KEY = Internal.createUniqueKey(Link.LINK, DSL.name("link_url_key"), new TableField[] { Link.LINK.URL }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ChatLinkRecord, ChatRecord> CHAT_LINK__CHAT_LINK_CHAT_ID_FKEY = Internal.createForeignKey(ChatLink.CHAT_LINK, DSL.name("chat_link_chat_id_fkey"), new TableField[] { ChatLink.CHAT_LINK.CHAT_ID }, Keys.CHAT_PKEY, new TableField[] { Chat.CHAT.ID }, true);
    public static final ForeignKey<ChatLinkRecord, LinkRecord> CHAT_LINK__CHAT_LINK_LINK_ID_FKEY = Internal.createForeignKey(ChatLink.CHAT_LINK, DSL.name("chat_link_link_id_fkey"), new TableField[] { ChatLink.CHAT_LINK.LINK_ID }, Keys.LINK_PKEY, new TableField[] { Link.LINK.ID }, true);
}
