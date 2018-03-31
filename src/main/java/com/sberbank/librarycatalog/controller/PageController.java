package com.sberbank.librarycatalog.controller;

import com.sberbank.librarycatalog.entity.Book;
import com.sberbank.librarycatalog.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    LibraryRepository libraryRepository;
    List<Book> allBooks;

    @RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.GET)
    public String GetIndex(ModelMap model) {
        allBooks = libraryRepository.findAllDistinct();
        model.addAttribute("titleList", allBooks);
        return "index";
    }

    @RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.POST)
    public String SubmitIndex(@RequestParam("search") String search, ModelMap model) {
        if (search.equals("")) allBooks = libraryRepository.findAllDistinct();
        else {
            allBooks = libraryRepository.findDistinctTopByTitleContains(search);
            if (allBooks.isEmpty())
                allBooks = libraryRepository.findDistinctTopByTitleauthorContains(search);
        }
        model.addAttribute("titleList", allBooks);
        return "index";
    }

    @RequestMapping(value = "/titles", method = RequestMethod.GET)
    public String GetTitles(@RequestParam("title") String title, @RequestParam("publishing") String publishing, ModelMap model) {
        if (publishing.equalsIgnoreCase("all"))
            allBooks = libraryRepository.findAllByTitleContains(title);
        else if (!publishing.isEmpty()) allBooks = libraryRepository.findAllByTitleAndPublishingContains(title,publishing);
        model.addAttribute("titleList", allBooks);
        return "titles";
    }

    @RequestMapping(value = "/fullsearch", method = RequestMethod.GET)
    public String GetFullSearch() {
        return "fullsearch";
    }

    @RequestMapping(value = "/fullsearch", method = RequestMethod.POST)
    public String FullSearch(@RequestParam("search") String search, @RequestParam("method") String searchMethod, ModelMap model) {
        switch (searchMethod) {
            case "title":
                allBooks = libraryRepository.findDistinctByTitleAndPublishingContains(search);
                break;
            case "author":
                allBooks = libraryRepository.findDistinctByTitleauthorAndPublishingContains(search);
                break;
            case "publishing":
                allBooks = libraryRepository.findDistinctByPublishingContains(search);
                break;
        }
        model.addAttribute("titleList", allBooks);
        return "fullsearch";
    }

    @RequestMapping(value = "/newbook", method = RequestMethod.GET)
    public String GetNewbook() {
        return "newbook";
    }

    @RequestMapping(value = "/newbook", method = RequestMethod.POST)
    public String AddNewbook(@RequestParam("title") String title, @RequestParam("titleauthor") String titleauthor,
                             @RequestParam("publishing") String publishing, @RequestParam("position") String position,
                             ModelMap model) {
        libraryRepository.save(new Book(title, titleauthor, publishing, true, "", position));
        return "newbook";
    }

}