package kalloaa.resta.restproject.services;

import java.util.ArrayList;
import java.util.List;
import kalloaa.resta.restproject.models.MyLog;
import kalloaa.resta.restproject.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
  private LogRepository logRepository;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public List<MyLog>  getAllLogs(){
    List<MyLog> temp = new ArrayList<>();
    logRepository.findAll().forEach(temp::add);
    return temp;
  }

  public void saveLog(MyLog myLog){
    logRepository.save(myLog);
  }

}
