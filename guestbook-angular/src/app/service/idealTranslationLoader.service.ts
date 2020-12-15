import { HttpClient } from '@angular/common/http';
import { TranslateLoader } from '@ngx-translate/core';
import { Observable } from 'rxjs';

export class IdealTranslationLoaderService implements TranslateLoader  {
  constructor(private httpClient: HttpClient) { }

  getTranslation(lang: string): Observable<any> {
    if (lang == null) {
      lang == "en";
    }
    const url = `http://localhost:8080/o/v1/api/greetings/translation/${lang}`

    const observer = new Observable(observer => {
      this.httpClient.get(url).subscribe(
        data => {
          observer.next(data);
          observer.complete();
        }
      );
    });
    return observer;
  }
  
}