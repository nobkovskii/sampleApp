package com.example.demo.infra;

import java.io.Serializable;

public interface BaseRepository<T,ID extends Serializable> {
    T findById(ID id);
}
