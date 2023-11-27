import Foundation
import SwiftUI

final class AppDelegate: NSObject, UIApplicationDelegate {
    func application(
        _ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]? = nil
    ) -> Bool {
        
        // Should trigger
        UIView.animateKeyframes(withDuration: 2.0, delay: 0.0, options: [], animations: {
            UIView.addKeyframe(withRelativeStartTime: 0.0, relativeDuration: 0.25) {
                view.transform = CGAffineTransform(scaleX: 1.1, y: 1.1)
            }
            UIView.addKeyframe(withRelativeStartTime: 0.25, relativeDuration: 0.5) {
                view.transform = CGAffineTransform(rotationAngle: .pi)
            }
            UIView.addKeyframe(withRelativeStartTime: 0.75, relativeDuration: 0.25) {
                view.transform = CGAffineTransform.identity
            }
        }, completion: nil)
        return true
    }
}