package com.proyecto.carrito.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileService {
   private String folder="images//";
   
   public String saveImages(MultipartFile file) throws IOException {
	   
	   if(file.isEmpty()) {
		   byte [] bytes=file.getBytes();
		   java.nio.file.Path path=Paths.get(folder+file.getOriginalFilename());
		   Files.write(path, bytes);
		   return file.getOriginalFilename();
	   }
	   return "default.jpg";
   }
   
   public void deleteImage(String nombre) {
	   String ruta="images//";
	   File file=new File(ruta+nombre);
	   file.delete();
	   
	   
   }
	
	
}
