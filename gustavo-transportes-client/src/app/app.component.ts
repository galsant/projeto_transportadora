import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { RastreioService } from './service/rastreio.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  
  title = 'Gustavo Transportes';
  
  formulario: FormGroup;

  retorno: any;
  
  constructor(
    private service: RastreioService
  ) {}
  
  ngOnInit() {

    this.formulario = new FormBuilder().group({
      codObjeto: [null]
    });
  }
onSubmit() {

  let codObjeto = this.formulario.get('codObjeto').value

  //Chamada ao RestFull e atribuição do retorno para a variável local retorno
  this.service.rastrearEntrega(codObjeto)
        .subscribe(
          data => {
            this.retorno = data
            console.log(this.retorno);
          }
        );
}
  
}
