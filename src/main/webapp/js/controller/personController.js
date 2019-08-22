 //控制层 
app.controller('personController' ,function($scope,$controller   ,personService){

	var personList;

	//新增
	personService.add($scope.entity).success(
		function(response){
		}
	);
	//查询
	personService.findAll().success(
		function(response){
			personList = response;
		}
	);


    
});	
