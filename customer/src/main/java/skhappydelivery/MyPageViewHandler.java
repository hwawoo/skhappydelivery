package skhappydelivery;

import skhappydelivery.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MyPageViewHandler {


    @Autowired
    private MyPageRepository myPageRepository;



    @StreamListener(KafkaProcessor.INPUT)
    public void whenStatusUpdated_then_UPDATE_1(@Payload StatusUpdated statusUpdated) {
        try {
            if (!statusUpdated.validate()) return;
                // view 객체 조회
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}