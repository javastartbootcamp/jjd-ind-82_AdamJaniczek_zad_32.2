package pl.javastart.jpaoptimalization.countrylanguage;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CountryLanguageService {

    private final CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public List<CountryLanguage> findAll() {
        return countryLanguageRepository.findAll();
    }

    public List<CountryLanguage> findAll(Comparator<CountryLanguage> comparator) {
        List<CountryLanguage> countryLanguageList = countryLanguageRepository.findAll();
        countryLanguageList.sort(comparator);
        return countryLanguageList;
    }
}
