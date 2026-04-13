package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pentagon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pentagon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.392f, 1.648f)
            curveToRelative(0.957f, -0.868f, 2.417f, -0.863f, 3.37f, 0.01f)
            lineToRelative(5.43f, 4.98f)
            curveToRelative(0.729f, 0.669f, 0.995f, 1.704f, 0.68f, 2.64f)
            lineToRelative(-2.027f, 6.02f)
            curveToRelative(-0.343f, 1.016f, -1.296f, 1.701f, -2.37f, 1.701f)
            horizontalLineTo(6.65f)
            curveToRelative(-1.053f, 0f, -1.993f, -0.66f, -2.351f, -1.65f)
            lineToRelative(-2.15f, -5.947f)
            curveTo(1.805f, 8.448f, 2.07f, 7.382f, 2.822f, 6.7f)
            lineToRelative(5.57f, -5.052f)
            close()
            moveToRelative(2.693f, 0.747f)
            curveTo(10.514f, 1.87f, 9.638f, 1.868f, 9.064f, 2.389f)
            lineTo(3.492f, 7.44f)
            curveToRelative(-0.45f, 0.41f, -0.61f, 1.05f, -0.402f, 1.62f)
            lineToRelative(2.15f, 5.948f)
            curveTo(5.453f, 15.603f, 6.017f, 16f, 6.649f, 16f)
            horizontalLineToRelative(6.827f)
            curveToRelative(0.643f, 0f, 1.216f, -0.41f, 1.421f, -1.02f)
            lineToRelative(2.027f, -6.02f)
            curveToRelative(0.189f, -0.562f, 0.03f, -1.182f, -0.408f, -1.583f)
            lineToRelative(-5.43f, -4.981f)
            close()
        }
    }.build()
}
