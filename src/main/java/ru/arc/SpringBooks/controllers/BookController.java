package ru.arc.SpringBooks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.arc.SpringBooks.models.Book;
import ru.arc.SpringBooks.store.BookCache;

@Controller
public class BookController {
    private final BookCache BOOK_CACHE = BookCache.getInstance();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("books", this.BOOK_CACHE.values());
        return "/index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createBook(@RequestParam("name") String name, @RequestParam("author") String author, @RequestParam("genre") String genre, ModelMap model) {
        this.BOOK_CACHE.add(new Book(name, author, genre));
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteBook(@RequestParam("id") int id, ModelMap model) {
        this.BOOK_CACHE.delete(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String deleteBook(@RequestParam("nameSearch") String name, ModelMap model) {
        model.addAttribute("books", this.BOOK_CACHE.search(name));
        return "/index";
    }
}
