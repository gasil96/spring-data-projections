package br.com.gabriel.springprojectionwithopenfeign.entity;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;

@MappedSuperclass
@Data
public abstract class Audit {

    private static final Logger log = LoggerFactory.getLogger(Audit.class);

    @CreatedDate
    private LocalDate created;

    @LastModifiedDate
    private LocalDate modify;

    @Column(name = "IP_AUTH")
    private String ip;

    @PrePersist
    @PreUpdate
    public void beforeSaveOrUpdate() {
        try {
            String ipLocale = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            log.error(e.getLocalizedMessage());
        }
    }
}
