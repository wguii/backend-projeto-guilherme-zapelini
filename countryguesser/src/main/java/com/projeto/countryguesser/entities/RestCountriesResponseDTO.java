package com.projeto.countryguesser.entities;

import java.util.List;
import java.util.Map;

public class RestCountriesResponseDTO {

    private NomeDTO name;
    private String region;
    private List<String> capital;
    private Map<String, String> languages;
    private Map<String, MoedaDTO> currencies;

    public NomeDTO getName() { return name; }
    public void setName(NomeDTO name) { this.name = name; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public List<String> getCapital() { return capital; }
    public void setCapital(List<String> capital) { this.capital = capital; }

    public Map<String, String> getLanguages() { return languages; }
    public void setLanguages(Map<String, String> languages) { this.languages = languages; }

    public Map<String, MoedaDTO> getCurrencies() { return currencies; }
    public void setCurrencies(Map<String, MoedaDTO> currencies) { this.currencies = currencies; }
}