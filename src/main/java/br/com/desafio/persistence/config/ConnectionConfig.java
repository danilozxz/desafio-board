package br.com.desafio.persistence.config;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var host = System.getenv("DB_HOST");
        var port = System.getenv("DB_PORT");
        var user = System.getenv("DB_USER");
        var password = System.getenv("DB_PASSWORD");

        var url = String.format("jdbc:mysql://%s:%s/board?serverTimezone=UTC&allowPublicKeyRetrieval=true", host, port);

        var connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }

}
