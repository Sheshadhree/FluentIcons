package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ColorFillAccent32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ColorFillAccent32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.797f, 19.5f)
            curveTo(18.65f, 19.915f, 18.5f, 20.448f, 18.5f, 21f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            curveToRelative(0f, -0.395f, -0.076f, -0.78f, -0.174f, -1.12f)
            curveToRelative(0.705f, 0.442f, 1.174f, 1.226f, 1.174f, 2.12f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(6f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(0.439f)
            lineToRelative(2.605f, 2.605f)
            curveToRelative(1.855f, 1.855f, 4.862f, 1.855f, 6.717f, 0f)
            lineToRelative(2.606f, -2.605f)
            horizontalLineToRelative(0.43f)
            close()
        }
    }.build()
}
