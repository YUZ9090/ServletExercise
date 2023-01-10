package org.comstudy21.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {
	
	@RequestMapping(value="/gallery.do")
	public String gallery() {
		System.out.println("gallery():galleryController »£√‚");
		return "gallery";
	}
}
