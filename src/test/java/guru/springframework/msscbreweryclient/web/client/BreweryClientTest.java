package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {

        BeerDto dto = client.getBeerById(UUID.randomUUID());

        assertNotNull(dto);

    }

    @Test
    void testSaveNewBeer() {

        BeerDto beerDto = BeerDto.builder().beerName("EFES").build();

        URI uri = client.saveNewBeer(beerDto);

        assertNotNull(beerDto);

        System.out.println(uri.toString());

    }

    @Test
    void testUpdateBeer() {

        BeerDto beerDto = BeerDto.builder().beerName("EFES").build();

        client.updateBeer(UUID.randomUUID(), beerDto);

    }

    @Test
    void testDeleteBeer() {

        client.deleteBeer(UUID.randomUUID());

    }

    @Test
    void testGetCustomerByID() {

        CustomerDto customer = client.getCustomerById(UUID.randomUUID());

        assertNotNull(customer);

    }


    @Test
    void testSaveNewCustomer() {

        CustomerDto customerDto = CustomerDto.builder().id(UUID.randomUUID()).name("Vagif").build();

        URI uri = client.saveNewCustomer(customerDto);

        assertNotNull(customerDto);

        System.out.println(uri.toString());

    }

    @Test
    void testUpdateCustomer() {

        CustomerDto customerDto = CustomerDto.builder().id(UUID.randomUUID()).name("Vagif").build();

        client.updateCustomer(UUID.randomUUID(), customerDto);

    }

    @Test
    void testDeleteCustomer() {

        client.deleteCustomer(UUID.randomUUID());

    }


}