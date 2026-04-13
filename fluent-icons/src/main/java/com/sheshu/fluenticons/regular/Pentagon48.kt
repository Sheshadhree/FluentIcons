package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pentagon48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pentagon48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.502f, 4.313f)
            curveToRelative(1.49f, -1.084f, 3.509f, -1.084f, 5f, 0f)
            lineToRelative(15.75f, 11.456f)
            curveToRelative(1.488f, 1.082f, 2.11f, 3f, 1.543f, 4.75f)
            lineToRelative(-6.018f, 18.54f)
            curveToRelative(-0.569f, 1.752f, -2.2f, 2.938f, -4.042f, 2.938f)
            horizontalLineTo(14.268f)
            curveToRelative(-1.842f, 0f, -3.474f, -1.187f, -4.042f, -2.938f)
            lineToRelative(-6.018f, -18.54f)
            curveToRelative(-0.568f, -1.75f, 0.054f, -3.668f, 1.542f, -4.75f)
            lineTo(21.502f, 4.313f)
            close()
            moveToRelative(3.529f, 2.022f)
            curveToRelative(-0.614f, -0.447f, -1.445f, -0.447f, -2.059f, 0f)
            lineTo(7.221f, 17.79f)
            curveToRelative(-0.613f, 0.445f, -0.87f, 1.235f, -0.635f, 1.955f)
            lineToRelative(6.017f, 18.54f)
            curveToRelative(0.235f, 0.722f, 0.907f, 1.21f, 1.665f, 1.21f)
            horizontalLineToRelative(19.467f)
            curveToRelative(0.758f, 0f, 1.43f, -0.488f, 1.664f, -1.21f)
            lineToRelative(6.018f, -18.54f)
            curveToRelative(0.234f, -0.72f, -0.023f, -1.51f, -0.635f, -1.955f)
            lineTo(25.03f, 6.335f)
            close()
        }
    }.build()
}
