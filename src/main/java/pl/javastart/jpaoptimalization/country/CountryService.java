package pl.javastart.jpaoptimalization.country;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public List<Country> findAll(Comparator<Country> comparator) {
        List<Country> countries = countryRepository.findAll();
        countries.sort(comparator);
        return countries;
    }
}
