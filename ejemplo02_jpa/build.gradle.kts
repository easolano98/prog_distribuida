plugins {
    id("java")
}

group = "org.example"

repositories {
    mavenCentral()
}

dependencies {

    implementation(project(":ejemplo01_cdi"))
    implementation("com.h2database:h2:2.2.224")
    implementation("org.hibernate:hibernate-core:6.5.2.Final")

}

sourceSets{
    main{
        output.setResourcesDir(file("${buildDir}/classes/java/main"))
    }
}

tasks.test {
    useJUnitPlatform()
}