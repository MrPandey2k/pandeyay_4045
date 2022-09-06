package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handle the /start endpoints
 *
 */
@Controller
public class PlantPlacesController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	/**
	 * Handle the /index endpoints
	 *
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
