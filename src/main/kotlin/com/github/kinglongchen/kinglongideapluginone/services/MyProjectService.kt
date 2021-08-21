package com.github.kinglongchen.kinglongideapluginone.services

import com.github.kinglongchen.kinglongideapluginone.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
