import Foundation
import SwiftUI

final class AppDelegate: NSObject, UIApplicationDelegate {
    func application(
        _ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]? = nil
    ) -> Bool {

        // Should trigger
        let animation = CAKeyframeAnimation(keyPath: "position")
        animation.values = [NSValue(cgPoint: CGPoint(x: 0, y: 0)), NSValue(cgPoint: CGPoint(x: 50, y: 50)), NSValue(cgPoint: CGPoint(x: 100, y: 0)), NSValue(cgPoint: CGPoint(x: 0, y: 0))]
        animation.duration = 2.0
        animation.repeatCount = .infinity
        view.layer.add(animation, forKey: "position")

        return true
    }
}