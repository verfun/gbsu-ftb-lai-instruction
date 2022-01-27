import { environment } from './../environments/environment.prod';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {

  endPoint = environment.server_url + environment.gbsuFtbLai_service_endpoint;
  result:string;
  constructor(private http:HttpClient) { }

  convertNumberToString(inputNumber: number): Observable<string> {
    return this.http.get<string>(this.endPoint+"/"+inputNumber);
  }
}
