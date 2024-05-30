import CoreMotion

let motionManager = CMMotionManager()

func startMotionUpdates() {
    if motionManager.isAccelerometerAvailable {
        motionManager.startAccelerometerUpdates(to: .main) { data, error in
            // Handle accelerometer updates
        }
    }
    motionManager.magnetometerUpdateInterval = 0.1
}

func stopMotionUpdates() {
    if motionManager.isAccelerometerActive {
        motionManager.stopAccelerometerUpdates()
    }
}