package ru.arc.SpringBooks.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.arc.SpringBooks.entity.BookEntity;
import ru.arc.SpringBooks.service.BookService;

@Controller
@ComponentScan("ru.arc.SpringBooks")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("books", bookService.getAll());
        return "/index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createBook(@RequestParam("name") String name, @RequestParam("author") String author, @RequestParam("genre") String genre, ModelMap model) {
        bookService.add(new BookEntity(name, author, genre));
        return "redirect:/";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteBook(@RequestParam("id") int id, ModelMap model) {
        bookService.delete(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchBook(@RequestParam("nameSearch") String name, ModelMap model) {
        model.addAttribute("books",bookService.searchName(name));
        return "/index";
    }

    @RequestMapping(value = "/search_author", method = RequestMethod.GET)
    public String searchAuthorBook(@RequestParam("nameSearch") String name, ModelMap model) {
        model.addAttribute("books",bookService.searchAuthor(name));
        return "/index";
    }

    @RequestMapping(value = "/get_edit_id", method = RequestMethod.GET)
    public String edithBook(@RequestParam("id") int id, ModelMap model) {
        bookService.delete(id);
        return "EditBook";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editBook(@RequestParam("name") String name, @RequestParam("author") String author, @RequestParam("genre") String genre, ModelMap model) {
        bookService.add(new BookEntity(name, author, genre));
        return "redirect:/";
    }
}
