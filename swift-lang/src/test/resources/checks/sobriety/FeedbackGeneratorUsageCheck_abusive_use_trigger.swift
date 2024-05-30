import UIKit

func triggerVibration() {
    let generator = UIImpactFeedbackGenerator(style: .heavy)
    generator.impactOccurred()
}