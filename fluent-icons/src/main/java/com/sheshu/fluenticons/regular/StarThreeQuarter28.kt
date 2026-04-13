package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StarThreeQuarter28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarThreeQuarter28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.302f, 3.908f)
            lineToRelative(2.69f, 5.452f)
            lineToRelative(6.018f, 0.875f)
            curveToRelative(1.19f, 0.173f, 1.664f, 1.634f, 0.804f, 2.473f)
            lineToRelative(-4.355f, 4.244f)
            lineToRelative(1.028f, 5.993f)
            curveToRelative(0.204f, 1.185f, -1.04f, 2.088f, -2.103f, 1.529f)
            lineTo(14f, 21.644f)
            lineToRelative(-5.381f, 2.83f)
            curveToRelative(-1.064f, 0.559f, -2.307f, -0.344f, -2.104f, -1.529f)
            lineToRelative(1.028f, -5.993f)
            lineToRelative(-4.354f, -4.244f)
            curveToRelative(-0.861f, -0.839f, -0.386f, -2.3f, 0.803f, -2.473f)
            lineTo(10.01f, 9.36f)
            lineToRelative(2.691f, -5.452f)
            curveToRelative(0.532f, -1.078f, 2.069f, -1.078f, 2.6f, 0f)
            close()
            moveToRelative(1.7f, 6.587f)
            verticalLineToRelative(11.032f)
            lineToRelative(2.99f, 1.572f)
            lineToRelative(-1.015f, -5.92f)
            curveToRelative(-0.081f, -0.47f, 0.075f, -0.95f, 0.417f, -1.283f)
            lineToRelative(4.3f, -4.191f)
            lineToRelative(-5.943f, -0.864f)
            curveToRelative(-0.282f, -0.04f, -0.541f, -0.163f, -0.749f, -0.346f)
            close()
        }
    }.build()
}
