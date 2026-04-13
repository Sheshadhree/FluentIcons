package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Compose32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Compose32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 4f)
            curveTo(18.776f, 4f, 19f, 4.224f, 19f, 4.5f)
            reflectiveCurveTo(18.776f, 5f, 18.5f, 5f)
            horizontalLineToRelative(-11f)
            curveTo(5.567f, 5f, 4f, 6.567f, 4f, 8.5f)
            verticalLineToRelative(16f)
            lineToRelative(0.005f, 0.18f)
            curveTo(4.098f, 26.53f, 5.627f, 28f, 7.5f, 28f)
            horizontalLineToRelative(16f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-11f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-16f)
            curveToRelative(-2.408f, 0f, -4.374f, -1.89f, -4.494f, -4.268f)
            lineTo(3f, 24.5f)
            verticalLineToRelative(-16f)
            curveTo(3f, 6.015f, 5.015f, 4f, 7.5f, 4f)
            horizontalLineToRelative(11f)
            close()
            moveToRelative(9.646f, -0.853f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            curveToRelative(0.195f, 0.195f, 0.196f, 0.511f, 0f, 0.707f)
            lineTo(13.06f, 19.647f)
            lineTo(12f, 20f)
            lineToRelative(0.354f, -1.06f)
            lineTo(28.145f, 3.146f)
            close()
        }
    }.build()
}
