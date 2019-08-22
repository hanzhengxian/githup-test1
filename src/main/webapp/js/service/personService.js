//服务层
app.service('personService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../person/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../user/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../user/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../person/add',entity);
	}
	//修改 
	this.update=function(person){
		return  $http.post('../person/update',person );
	}
	//删除
	this.delete=function(id){
		return $http.get('../person/delete?id='+id);
	}

});
