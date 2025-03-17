package br.com.desafio.exception;

public class CardBlockedException extends RuntimeException{

    public CardBlockedException(final String message) {
        super(message);
    }
}