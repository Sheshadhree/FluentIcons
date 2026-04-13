package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
            moveTo(8f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
            moveToRelative(-0.5f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            curveToRelative(0f, 1.116f, -0.459f, 2.01f, -1.212f, 2.615f)
            curveTo(12.047f, 14.71f, 11.053f, 15f, 10f, 15f)
            curveToRelative(-1.053f, 0f, -2.047f, -0.29f, -2.788f, -0.885f)
            curveTo(6.46f, 13.51f, 6f, 12.616f, 6f, 11.5f)
            curveTo(6f, 10.672f, 6.672f, 10f, 7.5f, 10f)
            close()
        }
    }.build()
}
