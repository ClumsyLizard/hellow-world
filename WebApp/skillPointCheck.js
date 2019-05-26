var commonValueMax = 99;
var commonValueMin = 1;
var magicValueMax = commonValueMax/4;
var errorMsg = " is invalid";

function skillPointCheck(str,dex,hp,magic){
  if (!singleValueCheck(str, commonValueMax, commonValueMin)){
    var resultMsg = "str" + errorMsg;
    return resultMsg;
  }

  if (!singleValueCheck(dex, commonValueMax, commonValueMin)){
    var resultMsg = "dex" + errorMsg;
    return resultMsg;
  }

  if (!singleValueCheck(hp, commonValueMax, commonValueMin)){
    var resultMsg = "hp" + errorMsg;
    return resultMsg;
  }

  if (!singleValueCheck(magic, magicValueMax, commonValueMin)){
    var resultMsg = "magic" + errorMsg;
    return resultMsg;
  }
}

function singleValueCheck(value, max, min){
  if ((value > max) || (value < min)){
    return false;
  }
  return true;
}
