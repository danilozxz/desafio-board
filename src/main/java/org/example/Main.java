package org.example;

import br.com.desafio.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static br.com.desafio.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
    }
}