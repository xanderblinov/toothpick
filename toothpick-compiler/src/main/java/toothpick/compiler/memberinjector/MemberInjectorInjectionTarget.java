package toothpick.compiler.memberinjector;

import java.util.ArrayList;
import java.util.List;
import javax.lang.model.type.TypeMirror;

public final class MemberInjectorInjectionTarget {

  public final List<TypeMirror> parameters = new ArrayList<>();
  public final String classPackage;
  public final String className;
  public final String targetClass;
  public final boolean hasSingletonAnnotation;
  public final boolean hasProducesSingletonAnnotation;
  //TODO detect if class or super class has injected members hasInjectedMembers
  //if so, the MemberInjector has to call inject on the created instance.

  public MemberInjectorInjectionTarget(String classPackage, String className, String targetClass, boolean hasSingletonAnnotation,
      boolean hasProducesSingletonAnnotation) {
    this.classPackage = classPackage;
    this.className = className;
    this.targetClass = targetClass;
    this.hasSingletonAnnotation = hasSingletonAnnotation;
    this.hasProducesSingletonAnnotation = hasProducesSingletonAnnotation;
  }

  public String getFqcn() {
    return classPackage + "." + className;
  }
}
