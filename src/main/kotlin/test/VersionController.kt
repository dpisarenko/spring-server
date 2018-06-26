package test

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/version")
class VersionController {
  @RequestMapping(method=arrayOf(RequestMethod.GET))
  fun version():String {
	  return "1.0"
  }
}
