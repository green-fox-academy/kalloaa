package kalloaa.resta.restproject.controllers;


import java.util.ArrayList;
import java.util.List;
import kalloaa.resta.restproject.models.Entries;
import kalloaa.resta.restproject.models.MyAppender;
import kalloaa.resta.restproject.models.MyArray;
import kalloaa.resta.restproject.models.MyError;
import kalloaa.resta.restproject.models.MyLog;
import kalloaa.resta.restproject.models.MyNumber;
import kalloaa.resta.restproject.models.MyUntil;
import kalloaa.resta.restproject.models.MyWelcome;
import kalloaa.resta.restproject.services.LogService;
import kalloaa.resta.restproject.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
  private RestService restService;
  private LogService logService;

  @Autowired
  public MyRestController(RestService restService,LogService logService) {
    this.restService = restService;
    this.logService = logService;
  }

  @GetMapping(value = "/doubling")
  public ResponseEntity<Object>getDoubled(@RequestParam(required = false)Integer input ){
    logService.saveLog(new MyLog(java.time.LocalDate.now().toString(),"/doubling","input = " + input));
    if(input != null){
      return ResponseEntity.status(HttpStatus.OK).body(new MyNumber(input));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new MyError("Please provide an input!"));
    }
  }

  @GetMapping(value = "/greeter")
  public ResponseEntity<Object>getGreetings(@RequestParam(required = false)String name,@RequestParam(required = false)String title){
    logService.saveLog(new MyLog(java.time.LocalDate.now().toString(),"/greeter","title=" + title + " name = " + name));

    if(name!=null && title!=null){
      return ResponseEntity.status(HttpStatus.OK).body(new MyWelcome("Oh, hi there "+ name +", my dear " + title +"!"));
    } else if (name==null && title==null){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a name and a title!"));
    } else if (name == null){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a name!"));
    } else{
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a title!"));
    }
  }

  @GetMapping(value = "appenda/{appendable}")
  public ResponseEntity<Object>getAppended(@PathVariable(required = false)String appendable){
    logService.saveLog(new MyLog(java.time.LocalDate.now().toString(),"/appenda","appendable =" + appendable));
    if(appendable!=null){
      return ResponseEntity.status(HttpStatus.OK).body(new MyAppender(appendable));
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MyError("not found"));
    }
  }

  @PostMapping(value = "dountil/{action}")
  public ResponseEntity<Object>postAction(@PathVariable(required = false)String action,@RequestBody (required = false) MyUntil number){
    logService.saveLog(new MyLog(java.time.LocalDate.now().toString(),"/dountil","action =" + action + " number = " + number));
    if(number==null){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("Please provide a number!"));
    } else if(action.equals("sum")){
      return  ResponseEntity.status(HttpStatus.OK).body(restService.additiveOf(number));
    } else if(action.equals("factor")){
      return  ResponseEntity.status(HttpStatus.OK).body(restService.factorialOf(number));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("No action found"));
    }
  }

  @PostMapping(value = "/arrays")
  public ResponseEntity<Object>postArray(@RequestBody MyArray myArray){
    logService.saveLog(new MyLog(java.time.LocalDate.now().toString(),"/arrays","myArray = " + myArray));
    if(myArray!=null){
      return ResponseEntity.status(HttpStatus.OK).body(restService.arrayHandler(myArray));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyError("something wrong"));
    }
  }

  @GetMapping(value = "/logs")
  public ResponseEntity<Object>getLogs(){
    logService.saveLog(new MyLog(java.time.LocalDate.now().toString(),"/logs","none"));
    return ResponseEntity.status(HttpStatus.OK).body(new Entries(logService.getAllLogs(),logService.getAllLogs().size()));
  }
}
