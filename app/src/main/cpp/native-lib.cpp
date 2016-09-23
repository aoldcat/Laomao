#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_laomao_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++SB";
    return env->NewStringUTF(hello.c_str());
}
