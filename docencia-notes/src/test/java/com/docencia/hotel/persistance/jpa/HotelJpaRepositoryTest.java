package com.docencia.hotel.persistance.jpa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import com.docencia.hotel.model.Hotel;
import com.docencia.hotel.persistance.jpa.interfaces.IHotelRepository;


@SpringBootTest
@ActiveProfiles("test")
public class HotelJpaRepositoryTest {
    @Autowired
    private IHotelRepository hotelRepository;

    private Hotel baseHotel;

    @BeforeEach
    @Transactional
    void beforeEach() {
        Hotel h = new Hotel();
        h.setNombre("Nombre base");
        h.setDireccion("Direccion base");

        baseHotel = hotelRepository.save(h);

        assertThat(baseHotel.getId()).isNotNull();
    }

    @Test
    @Transactional
    void createReadFindByTitleTest() {
        String id = baseHotel.getId();

        Hotel leida = hotelRepository.findById(id);
        assertThat(leida).isNotNull();
        assertThat(leida.getNombre()).isEqualTo("Nombre base");
        assertThat(leida.getDireccion()).isEqualTo("Direccion base");

        Hotel buscadaPorTitulo = hotelRepository.find(leida);
        assertThat(buscadaPorTitulo).isNotNull();
        assertThat(buscadaPorTitulo.getId()).isEqualTo(id);
    }

    @Test
    @Transactional
    void updateContentTest() {
        String id = baseHotel.getId();

        baseHotel.setNombre("contenido modificado");
        Hotel actualizada = hotelRepository.save(baseHotel);

        assertThat(actualizada.getNombre())
                .isEqualTo("contenido modificado");

        Hotel reread = hotelRepository.findById(id);
        assertThat(reread.getNombre())
                .isEqualTo("contenido modificado");
    }

    @Test
    @Transactional
    void findByIdTest() {
        String id = baseHotel.getId();

        boolean exists = hotelRepository.exists(id);

        assertThat(exists).isTrue();
    }

    @Test
    @Transactional
    void deleteNoteTest() {
        String id = baseHotel.getId();

        boolean borrada = hotelRepository.delete(id);

        assertThat(borrada).isTrue();
        assertThat(hotelRepository.exists(id)).isFalse();
        assertThat(hotelRepository.findById(id)).isNull();
    }
}
