import AVFoundation

var captureSession: AVCaptureSession?

func startVideoRecording() {
    captureSession = AVCaptureSession()
    captureSession?.beginConfiguration()

    let videoDevice = AVCaptureDevice.default(for: .video)
    let audioDevice = AVCaptureDevice.default(for: .audio)

    do {
        let videoInput = try AVCaptureDeviceInput(device: videoDevice!)
        let audioInput = try AVCaptureDeviceInput(device: audioDevice!)

        if (captureSession?.canAddInput(videoInput) ?? false) {
            captureSession?.addInput(videoInput)
        }

        if (captureSession?.canAddInput(audioInput) ?? false) {
            captureSession?.addInput(audioInput)
        }

        captureSession?.commitConfiguration()
        captureSession?.startRunning()
    } catch {
        // Handle error
    }
}