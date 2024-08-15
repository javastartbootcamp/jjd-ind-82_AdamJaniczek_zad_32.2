package pl.javastart.jpaoptimalization.countrylanguage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageKey> {

    @Query("SELECT new pl.javastart.jpaoptimalization.countrylanguage.LanguageCountryDto(cl.language, c.name) FROM CountryLanguage cl JOIN Country c ON cl.countryCode = c.code")
    List<LanguageCountryDto> findLanguageAndCountryName();
}
