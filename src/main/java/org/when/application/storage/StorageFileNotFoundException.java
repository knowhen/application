package org.when.application.storage;

/**
 * @author: when
 * @create: 2020-04-22  14:03
 **/
public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
