package ru.darneyko.pet.sbsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.darneyko.pet.sbsecurity.entity.CustomUser;

@Repository
public interface CustomUserRepository extends JpaRepository<CustomUser, Long> {
    CustomUser findByLogin(String login);
}
