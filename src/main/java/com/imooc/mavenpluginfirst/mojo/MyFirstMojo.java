package com.imooc.mavenpluginfirst.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "first")
public class MyFirstMojo extends AbstractMojo {

  @Parameter(name = "name", defaultValue = "lisi")
  private String name;

  @Parameter(name = "address", property = "address", defaultValue = "上海")
  private String address;

  public void execute() throws MojoExecutionException, MojoFailureException {
    getLog().info("this is a test plugin," + name + " " + address);
  }
}
