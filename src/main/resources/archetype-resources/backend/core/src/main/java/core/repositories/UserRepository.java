#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.repositories;

import ${package}.core.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getById(Long id) {
        return new User();
    }
}
