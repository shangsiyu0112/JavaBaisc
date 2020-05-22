package annotation;

/**
 * @athor 尚思雨
 * @date 2020-05-22-0:17
 */
/*
自定义 Annotation
我们参照@SuppressWarning
 */
@MyAnnotations({@MyAnnotation(value = "hello"),@MyAnnotation(value = "hel")})
public class AnnotationTest {
}
