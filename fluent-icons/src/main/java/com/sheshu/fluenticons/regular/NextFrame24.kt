package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NextFrame24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NextFrame24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3.75f)
            curveTo(5.5f, 3.336f, 5.164f, 3f, 4.75f, 3f)
            reflectiveCurveTo(4f, 3.336f, 4f, 3.75f)
            verticalLineToRelative(16.5f)
            curveTo(4f, 20.664f, 4.336f, 21f, 4.75f, 21f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(3.75f)
            close()
            moveToRelative(6.24f, -0.44f)
            curveTo(10.577f, 2.513f, 9f, 3.344f, 9f, 4.752f)
            verticalLineToRelative(14.495f)
            curveToRelative(0f, 1.413f, 1.589f, 2.244f, 2.75f, 1.437f)
            lineToRelative(10.498f, -7.302f)
            curveToRelative(1.005f, -0.7f, 1f, -2.188f, -0.01f, -2.88f)
            lineTo(11.739f, 3.309f)
            close()
            moveTo(10.5f, 4.752f)
            curveToRelative(0f, -0.201f, 0.225f, -0.32f, 0.391f, -0.206f)
            lineTo(21.39f, 11.74f)
            curveToRelative(0.144f, 0.1f, 0.145f, 0.312f, 0.001f, 0.412f)
            lineToRelative(-10.498f, 7.301f)
            curveTo(10.727f, 19.57f, 10.5f, 19.45f, 10.5f, 19.248f)
            verticalLineTo(4.753f)
            close()
        }
    }.build()
}
