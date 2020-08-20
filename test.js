function uniteUnique(arr1, arr2, arr3) {

	var unique=[];

	var arg = arguments;
debugger;
	for (var i = 0; i < arg.length; i++) {
		for(var j = 0; j < arg[i].length; j++){
			if (unique.indexOf(arguments[i][j])==-1) {
				unique.push(arguments[i][j]);
			}
		}
	}
  return unique;
}


$("#answer").html(uniteUnique([1, 3, 2], [5, 2, 1, 4], [2, 1]));