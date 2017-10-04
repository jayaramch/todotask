app.service('taskService', function($http) {
	// console.log('getAllTasks')

	this.getAllTasks = function() {
		return $http({
			method : 'GET',
			url : '/getAllTasks'
		}).then(function(data) {
			return data;

		})

	};

	this.getTaskStatus = function() {
		return $http({
			method : 'GET',
			url : '/getTaskStatus'
		}).then(function(data) {
			return data;

		})

	};
	
	this.markComplete = function(taskId) {

		var data = {
			'taskId' : taskId
		};
		console.log('data :: ' + JSON.stringify(data));
		return $http({
			method : 'PUT',
			dataType : 'json',
			url : '/markComplete?taskId=' + taskId,
		}).then(function(data) {
			// console.log('markComplete service :: '+JSON.parse(data))
			return data;

		})

	};

	this.deleteTask = function(taskId) {

		var data = {
			'taskId' : taskId
		};
		console.log('data :: ' + JSON.stringify(data));
		return $http({
			method : 'PUT',
			dataType : 'json',
			url : '/deleteTask?taskId=' + taskId,
		}).then(function(data) {
			// console.log('markComplete service :: '+JSON.parse(data))
			return data;

		})

	};
	
	
	this.saveTask = function(task) {

		var data = task;
		
		console.log('data :: ' + JSON.stringify(data));
		return $http({
			method : 'POST',
			dataType : 'json',
			url : '/saveTask',
			data : data
		}).then(function(data) {
			// console.log('markComplete service :: '+JSON.parse(data))
			return data;

		})

	};
});