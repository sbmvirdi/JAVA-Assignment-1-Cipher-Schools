import { Component, OnInit } from '@angular/core';
import { HttpClient } from "@angular/common/http";
@Component({
  selector: 'app-campusplacement',
  templateUrl: './campusplacement.component.html',
  styleUrls: ['./campusplacement.component.css']
})
export class CampusplacementComponent implements OnInit {

  constructor(public http:HttpClient) { }

  var_name=""
  var_pub=""
  var_author=""
  var_date=""


  register_clickHandler()
  {
    var applicant={
      "id":this.var_name,
      "publisher":this.var_pub,
      "author":this.var_author,
      "date":this.var_date
    }

    //alert(JSON.stringify(applicant));

    this.http.post<any>("http://localhost:8081/book",applicant).subscribe(data=>
    {
      alert("Book added")
    });
  }
  
  ngOnInit(): void {
  }

}
