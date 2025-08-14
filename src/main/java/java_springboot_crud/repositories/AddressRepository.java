package java_springboot_crud.repositories;

import java_springboot_crud.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, String> {
}
