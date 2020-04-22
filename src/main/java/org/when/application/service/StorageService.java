package org.when.application.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author: when
 * @create: 2020-04-22  12:34
 **/
public interface StorageService {

    void init();

    void store(MultipartFile file);

    Path load(String filename);

    Stream<Path> loadAll();

    Resource loadAsResource(String filename);

    void deleteAll();
}
