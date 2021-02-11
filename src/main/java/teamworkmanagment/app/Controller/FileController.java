package teamworkmanagment.app.Controller;


import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import teamworkmanagment.app.Entity.Document;
import teamworkmanagment.app.Repository.DocumentRepository;

import java.io.IOException;
import java.net.URI;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

/*@CrossOrigin(value = {"*"}, exposedHeaders = {"Content-Disposition"})
@RestController
@RequestMapping("/api/v1")*/
public class FileController {
   /* @Autowired
    private DocumentRepository documentRepository;
    @PostMapping
    public ResponseEntity uploadToDB(@NotNull @RequestParam("file")  MultipartFile file,@RequestParam("id") Integer id) throws IOException {
        Document document=new Document();
        document.setDocName(file.getOriginalFilename());
        System.out.println(id);
        document.setFile(file.getBytes());
        documentRepository.save(document);
        System.out.println();

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(location).build();

    }

    @GetMapping
    public ResponseEntity<byte[]> getRandomFile() {

        long amountOfFiles = documentRepository.count();
        Long randomPrimaryKey;

        if (amountOfFiles == 0) {
            return ResponseEntity.ok(new byte[0]);
        } else if (amountOfFiles == 1) {
            randomPrimaryKey = 1L;
        } else {
            randomPrimaryKey = ThreadLocalRandom.current().nextLong(1, amountOfFiles + 1);
        }

        Document fileEntity = documentRepository.findById(randomPrimaryKey).get();

        HttpHeaders header = new HttpHeaders();
        header.setContentLength(fileEntity.getFile().length);

        header.set("Content-Disposition", "attachment; filename=" + fileEntity.getDocName());

        return new ResponseEntity<>(fileEntity.getFile(), header, HttpStatus.OK);
    }*/

}
