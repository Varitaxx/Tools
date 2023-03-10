package eu.asgardschmiede.tools;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    public static UserRepository repo;

    @BeforeAll
    static void setUoBeforeClass(){
        repo = new UserRepository();
    }

    @Test
    void hasItems_inList(){
        assertThat(repo.findAll(), hasItems(2,3));

    }

    @Test
    void size_ofList(){
        assertThat(repo., hasSize(3));

    }

}