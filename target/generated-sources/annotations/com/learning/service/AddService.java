package com.learning.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {

	public int add(int i, int j) {
		return i + j;
	}
}
