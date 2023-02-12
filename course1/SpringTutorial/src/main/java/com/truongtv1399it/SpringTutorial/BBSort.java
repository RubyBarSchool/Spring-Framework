package com.truongtv1399it.SpringTutorial;

import org.springframework.stereotype.Service;

@Service
public class BBSort implements Algorithm{
    @Override
    public void run() {
        System.out.println("BBSort");
    }

    @Override
    public int sum(int[] abc) {
        int result = 0;
        for(int i = 0; i < abc.length; i++){
            result+=abc[i];
        }
        return result;
    }
}
