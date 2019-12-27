import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {




  constructor(private http: HttpClient) { }

    request;

  loginUser(user): Observable<any> {
    return this.http.post(
      'http://localhost:8080/login',
      user);
  }

  addAsset(user): Observable<any> {
    return this.http.post('http://localhost:8080/addassest', user);
  }

  addEmployee(user): Observable<any> {
    return this.http.post('http://localhost:8080/addemployee', user);
  }

  getData(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/getassest', {headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }

  updateAsset(user): Observable<any> {
    return this.http.put(`http://localhost:8080/modifyassest`, user, {headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }

  raiseRequest(user): Observable<any> {
    return this.http.post('http://localhost:8080/raiserequest', user);
  }

  getRaiseRequestData(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/getrequestassest', {headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }

  allocateData(user): Observable<any> {
    return this.http.post('http://localhost:8080/assetallocate', user);
  }

  rejectData(user): Observable<any> {
    return this.http.post('http://localhost:8080/assetallocate', user);
  }

  getRequestData(empno): Observable<any> {
    // tslint:disable-next-line: max-line-length
    return this.http.get<any>(`http://localhost:8080/getmanager/${empno}`, {headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }

}
