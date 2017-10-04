function init($scope,taskService){
	var pendingTasks = 0;
	var completedTasks = 0;
	
	console.log('init');
	var getAllTasks = taskService.getAllTasks();
	getAllTasks.then(function(data) {
		console.log('tasks :: '+JSON.stringify(data.data));
        $scope.taskList = data.data;
    });
	
	var taskStatus = taskService.getTaskStatus().then(function(data){
		console.log('tasks :: '+JSON.stringify(data.data));
		$scope.taskStatus = data.data;
	});
}

function defaultMessage($timeout,$scope,message) {
	$scope.message = message;
	$timeout(function(){
        $scope.hidden = true;
        $scope.message = '';
    }, 3000);
}

app.controller('homeController', function($scope,$timeout,taskService) {
	console.log('homecontroller')
	$scope.title = 'All Tasks';
	$scope.hidden = true;
//	console.log('getAllTasks :: '+taskService.getAllTasks());
	
	init($scope,taskService);
	$scope.message = '';
	
	/*var getAllTasks = taskService.getAllTasks();
	getAllTasks.then(function(data) {
        $scope.taskList = data.data;
    });*/
    
    $scope.deleteTask = function(taskId){
    	var message = '';
    	var deleteTask = taskService.deleteTask(taskId);
    	$scope.hidden = false;
    	deleteTask.then(function(data) {
    		init($scope,taskService);
    		message = 'Task Deleted Successfully';
    		defaultMessage($timeout,$scope,message);
        });
    	
    };
    
    $scope.markComplete = function(taskId){
    	var message = '';
    	var markComplete = taskService.markComplete(taskId);
    	$scope.hidden = false;
    	markComplete.then(function(data) {
    		init($scope,taskService);
    		message = 'Task Mark completed Successfully';
    		defaultMessage($timeout,$scope,message);
        });
    	
    	
    };
    
    $scope.saveTask = function(task){
    	var message = '';
    	console.log(task);
    	var saveTask = taskService.saveTask(task);
    	$scope.hidden = false;
    	saveTask.then(function(data) {
            init($scope,taskService);
            $scope.task='';
            message = 'Task Saved Successfully';
            defaultMessage($timeout,$scope,message);
        });
    }
//    $scope.taskList = taskService.getAllTasks();
//    
//    console.log('taskList :: '+taskList);
    /*[
    	{
    		"taskId":"1",
    		"taskName":"Task1"
    	},
    	{
    		"taskId":"2",
    		"taskName":"Task2"
    	},
    	{
    		"taskId":"3",
    		"taskName":"Task3"
    	},
    	{
    		"taskId":"4",
    		"taskName":"Task4"
    	},
    	{
    		"taskId":"5",
    		"taskName":"Task5"
    	}
    ];*/
});
