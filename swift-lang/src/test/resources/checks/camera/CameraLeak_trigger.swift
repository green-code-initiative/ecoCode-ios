import AVFoundation

class CameraManager {
    var captureSession: AVCaptureSession?

    func activateCamera() {
        captureSession = AVCaptureSession()
        captureSession?.startRunning()  // Camera starts capturing
        // Missing corresponding stopRunning
    }
}