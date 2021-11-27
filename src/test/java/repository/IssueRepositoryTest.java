package repository;

import domain.Issue;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IssueRepositoryTest {
    repository.IssueRepository repository = new repository.IssueRepository();

    @Test
    void saveAllReports() {
        repository.saveAll(List.of(new Issue(), new Issue()));
        assertEquals(2, repository.findAll().size());
    }
}