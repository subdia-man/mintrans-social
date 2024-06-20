package ru.mintrans.mintransstartsocial.controllers;

import org.springframework.web.bind.annotation.*;
import ru.mintrans.mintransstartsocial.model.Import;
import ru.mintrans.mintransstartsocial.model.News;
import ru.mintrans.mintransstartsocial.services.ImportService;

import java.net.HttpURLConnection;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/import")
public class ImportController {
    ImportService importService = new ImportService();

    @PostMapping("/add-import")
    public int add (String from, String where, String dateOfAdding) throws ParseException {
        importService.add(from, where, dateOfAdding);
        return HttpURLConnection.HTTP_OK;
    }

    @GetMapping("/get-import")
    public Import get (long id) {
        return importService.get(id);
    }

    @GetMapping ("/get-all-imports")
    public List<Import> getAll () {
        return importService.getAll();
    }

    @PostMapping ("/update-import")
    public int update (String from, String where, String dateOfAdding) throws ParseException {
        importService.update(from, where, dateOfAdding);
        return HttpURLConnection.HTTP_OK;
    }

    @DeleteMapping("/delete-import")
    public int delete (long id) {
        importService.delete(id);
        return HttpURLConnection.HTTP_OK;
    }
}
