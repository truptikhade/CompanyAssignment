package com.example.assignment.service;

import org.springframework.stereotype.Service;

import com.example.assignment.model.ItemAppModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ItemAppService {
	
	private final List<ItemAppModel> itemList = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public ItemAppModel addItem(ItemAppModel itemAppModel) {
    	itemAppModel.setId(idGenerator.incrementAndGet());
        itemList.add(itemAppModel);
        return itemAppModel;
    }

    public Optional<ItemAppModel> getItemById(Long id) {
        return itemList.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}
