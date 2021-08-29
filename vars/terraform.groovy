#!/usr/bin/env groovy

def terraform(task){
     if (task == "apply"){
     task = task + " --auto-approve"
     }
     echo "10 lines of terraform $task"
}
