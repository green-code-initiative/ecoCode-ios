import Foundation
import SwiftUI

final class AppDelegate: NSObject, UIApplicationDelegate {
    func application(
        _ application: UIApplication,
        didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]? = nil
    ) -> Bool {

        // Should trigger
        let test = UIView.transition(with: containerView, duration: 0.5, options: [.transitionFlipFromLeft], animations: {
            containerView.addSubview(view)
        }, completion: nil)
        
        return true
    }
}