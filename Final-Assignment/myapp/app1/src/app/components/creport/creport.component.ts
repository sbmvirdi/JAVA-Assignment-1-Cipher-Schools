import { Component, OnInit } from '@angular/core';
import { HttpClient} from "@angular/common/http";
@Component({
  selector: 'app-creport',
  templateUrl: './creport.component.html',
  styleUrls: ['./creport.component.css']
})
export class CreportComponent implements OnInit {

  constructor(public http:HttpClient) { }

  var_search=""
generateReport(){
  
 
  this.http.get<any>("http://localhost:8081/book/"+this.var_search).subscribe(data=>{
    alert(JSON.stringify(data));
  });
}


  ngOnInit(): void {
  }

}
