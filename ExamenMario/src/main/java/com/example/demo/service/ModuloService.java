package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ModuloService {
    public long calculate(long x, long y, long n) {
        return ((n - y) / x) * x + y;
    }
}