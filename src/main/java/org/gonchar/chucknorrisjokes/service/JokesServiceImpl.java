package org.gonchar.chucknorrisjokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quotesProvider;

    public JokesServiceImpl(ChuckNorrisQuotes quotesProvider) {
        this.quotesProvider = quotesProvider;
    }

    @Override
    public String getJoke() {
        return quotesProvider.getRandomQuote();
    }
}
