package com.example.test2.Repositories;
import com.example.test2.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client,Long> {


}
