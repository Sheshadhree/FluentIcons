package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Emoji20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Emoji20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            close()
            moveTo(3f, 10f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            close()
            moveToRelative(10.5f, -1.5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
            moveToRelative(-5f, 0f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
            moveToRelative(-1.611f, 4.015f)
            curveTo(6.715f, 12.3f, 6.4f, 12.267f, 6.185f, 12.44f)
            curveToRelative(-0.214f, 0.174f, -0.247f, 0.489f, -0.074f, 0.704f)
            curveTo(7.027f, 14.275f, 8.43f, 15f, 10f, 15f)
            curveToRelative(1.57f, 0f, 2.973f, -0.725f, 3.889f, -1.856f)
            curveToRelative(0.173f, -0.215f, 0.14f, -0.53f, -0.074f, -0.704f)
            curveToRelative(-0.215f, -0.173f, -0.53f, -0.14f, -0.704f, 0.075f)
            curveTo(12.377f, 13.422f, 11.256f, 14f, 10f, 14f)
            curveToRelative(-1.256f, 0f, -2.377f, -0.578f, -3.111f, -1.485f)
            close()
        }
    }.build()
}
