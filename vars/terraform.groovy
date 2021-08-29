#!/usr/bin/env groovy

import org.apache.commons.lang.StringUtils

def call(task){
     if (task == "apply"){
     task = task + " --auto-approve"
     }
     echo "10 lines of terraform $task"
}
