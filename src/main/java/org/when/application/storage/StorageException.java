package org.when.application.storage;

/**
 * @author: when
 * @create: 2020-04-22  14:03
 **/
public class StorageException extends RuntimeException {
    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
