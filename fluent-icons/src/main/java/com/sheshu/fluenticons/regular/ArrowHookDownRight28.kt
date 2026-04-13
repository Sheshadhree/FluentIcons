package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookDownRight28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookDownRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.84f, 8.016f)
            curveTo(8.078f, 6.78f, 9.914f, 6f, 12.25f, 6f)
            horizontalLineToRelative(7f)
            curveTo(19.664f, 6f, 20f, 6.336f, 20f, 6.75f)
            reflectiveCurveTo(19.664f, 7.5f, 19.25f, 7.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.989f, 0f, -3.426f, 0.656f, -4.35f, 1.578f)
            curveToRelative(-0.931f, 0.928f, -1.4f, 2.17f, -1.4f, 3.422f)
            curveToRelative(0f, 1.251f, 0.469f, 2.494f, 1.4f, 3.422f)
            curveToRelative(0.924f, 0.922f, 2.361f, 1.578f, 4.35f, 1.578f)
            horizontalLineToRelative(8.19f)
            lineToRelative(-3.22f, -3.22f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.141f, 0.14f, 0.22f, 0.33f, 0.22f, 0.53f)
            reflectiveCurveToRelative(-0.079f, 0.39f, -0.22f, 0.53f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(20.44f, 19f)
            horizontalLineToRelative(-8.19f)
            curveToRelative(-2.336f, 0f, -4.172f, -0.781f, -5.41f, -2.016f)
            curveTo(5.609f, 15.756f, 5f, 14.124f, 5f, 12.5f)
            reflectiveCurveToRelative(0.609f, -3.256f, 1.84f, -4.484f)
            close()
        }
    }.build()
}
