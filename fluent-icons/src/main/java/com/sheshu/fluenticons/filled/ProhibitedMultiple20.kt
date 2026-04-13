package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ProhibitedMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProhibitedMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.11f, 5.11f)
            curveToRelative(1.969f, -1.967f, 5.057f, -2.132f, 7.213f, -0.494f)
            lineToRelative(-7.707f, 7.707f)
            curveTo(2.978f, 10.167f, 3.143f, 7.079f, 5.111f, 5.11f)
            close()
            moveToRelative(0.567f, 8.274f)
            lineToRelative(7.707f, -7.707f)
            curveToRelative(1.638f, 2.156f, 1.473f, 5.244f, -0.495f, 7.212f)
            reflectiveCurveToRelative(-5.056f, 2.133f, -7.212f, 0.495f)
            close()
            moveTo(13.95f, 4.05f)
            curveToRelative(-2.734f, -2.733f, -7.166f, -2.733f, -9.9f, 0f)
            curveToRelative(-2.733f, 2.734f, -2.733f, 7.166f, 0f, 9.9f)
            curveToRelative(2.734f, 2.733f, 7.166f, 2.733f, 9.9f, 0f)
            curveToRelative(2.733f, -2.734f, 2.733f, -7.166f, 0f, -9.9f)
            close()
            moveTo(17f, 9f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            curveToRelative(-0.607f, 0f, -1.197f, -0.068f, -1.765f, -0.195f)
            curveToRelative(1.033f, 0.6f, 2.234f, 0.945f, 3.515f, 0.945f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            curveToRelative(0f, -1.281f, -0.344f, -2.482f, -0.945f, -3.516f)
            curveTo(16.933f, 7.802f, 17f, 8.394f, 17f, 9f)
            close()
        }
    }.build()
}
