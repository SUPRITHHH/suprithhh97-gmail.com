import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  addProduct(user): Observable<any> {
    return this.http.post('http://localhost:8080/stockmanagement/addproduct', user);
  }

  updateProduct(user): Observable<any> {
    return this.http.put('http://localhost:8080/stockmanagement/modifyproduct', user);
  }

  getData(name): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/stockmanagement/getproduct?name=${name}`,{headers: new HttpHeaders({'Content-Type': 'application/json'})});
  }

}
