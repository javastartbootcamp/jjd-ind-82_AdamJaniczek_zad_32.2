package pl.javastart.jpaoptimalization.countrylanguage;

public class LanguageCountryDto {
    private String language;
    private String countryName;

    public LanguageCountryDto(String language, String countryName) {
        this.language = language;
        this.countryName = countryName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
