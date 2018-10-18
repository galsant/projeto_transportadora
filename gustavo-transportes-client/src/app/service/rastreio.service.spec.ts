import { TestBed } from '@angular/core/testing';

import { RastreioService } from './rastreio.service';

describe('RastreioService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RastreioService = TestBed.get(RastreioService);
    expect(service).toBeTruthy();
  });
});
