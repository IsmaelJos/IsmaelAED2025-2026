package com.docencia.hotel.model;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.docencia.hotel.persistance.jpa.interfaces.IGuestRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
public class GuestTest {

    @Autowired
    private IGuestRepository guestRepository;

    private Guest baseGuest;

    @BeforeEach
    @Transactional
    void beforeEach() {
        Guest g = new Guest();
        g.setEmail("email base");
        g.setNombre("nombre base");
        g.setPhone("telefono base");

        baseGuest = guestRepository.save(g);

        assertThat(baseGuest.getId()).isNotNull();
    }
    
}
