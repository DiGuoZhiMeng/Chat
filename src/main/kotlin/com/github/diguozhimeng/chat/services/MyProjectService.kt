package com.github.diguozhimeng.chat.services

import com.github.diguozhimeng.chat.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
