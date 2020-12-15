import { MissingTranslationHandler, MissingTranslationHandlerParams } from '@ngx-translate/core';

export class IdealMissingTranslationHandler implements MissingTranslationHandler {
  handle(params: MissingTranslationHandlerParams) {
    // console.log(params.interpolateParams, '---', params.key, alternative(params.key))

    if (params.interpolateParams) {
      return params.interpolateParams["Default"] || alternative(params.key);
    }
    return alternative(params.key);
  }
}

function alternative(key) {
  let alterNative = key;
  if(key) {
    alterNative = key.split('.').pop()
  }
  return alterNative;
}