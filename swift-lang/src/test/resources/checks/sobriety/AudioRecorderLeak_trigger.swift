import AVFoundation

var audioRecorder: AVAudioRecorder?

func startRecording() {
    let settings = [
        AVFormatIDKey: Int(kAudioFormatMPEG4AAC),
        AVSampleRateKey: 12000,
        AVNumberOfChannelsKey: 1,
        AVEncoderAudioQualityKey: AVAudioQuality.high.rawValue
    ]

    do {
        audioRecorder = try AVAudioRecorder(url: getDocumentsDirectory().appendingPathComponent("recording.m4a"), settings: settings)
        audioRecorder?.record()
    } catch {
        // Handle error
    }
}