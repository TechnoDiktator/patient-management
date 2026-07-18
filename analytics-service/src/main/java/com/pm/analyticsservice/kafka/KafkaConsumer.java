package com.pm.analyticsservice.kafka;


import com.google.protobuf.InvalidProtocolBufferException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import patient.events.PatientEvent;

@Service
public class KafkaConsumer {


    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics="patient" , groupId="analytics-service")
    public void consumeEvent(byte[] event){

        try {
            PatientEvent patientevent = PatientEvent.parseFrom(event);
            //performsomething

            log.info("received patient Event: [PatientId={} , PatientName={} ]" + "PatientEmail={}" ,
                    patientevent.getPatientId(),
                    patientevent.getName(),
                    patientevent.getEmail());

        } catch (InvalidProtocolBufferException e) {
            log.error("Error in deserializing the event {}" , e.getMessage());
            //            throw new RuntimeException(e);
        }




    }

}
