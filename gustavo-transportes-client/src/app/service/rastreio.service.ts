import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RastreioService {

  private url = 'http://localhost:8080';

  constructor(private httpClient : HttpClient) { }

  rastrearEntrega(codigoObjeto) {
    return this.httpClient.get(this.url + '/rastrear/' +codigoObjeto)
  }
}
