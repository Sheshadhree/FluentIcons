package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAsterisk16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAsterisk16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 7.5f)
            horizontalLineTo(9.207f)
            lineToRelative(3.036f, -3.036f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(8.5f, 6.793f)
            verticalLineTo(2.5f)
            curveTo(8.5f, 2.224f, 8.276f, 2f, 8f, 2f)
            reflectiveCurveTo(7.5f, 2.224f, 7.5f, 2.5f)
            verticalLineToRelative(4.293f)
            lineTo(4.464f, 3.757f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineTo(6.793f, 7.5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 7.5f, 2f, 7.724f, 2f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4.293f)
            lineToRelative(-3.036f, 3.036f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.098f, 0.098f, 0.226f, 0.146f, 0.354f, 0.146f)
            curveToRelative(0.128f, 0f, 0.256f, -0.049f, 0.354f, -0.146f)
            lineToRelative(3.036f, -3.036f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(9.207f)
            lineToRelative(3.036f, 3.036f)
            curveToRelative(0.098f, 0.098f, 0.226f, 0.146f, 0.354f, 0.146f)
            curveToRelative(0.128f, 0f, 0.256f, -0.049f, 0.354f, -0.146f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            lineTo(9.209f, 8.5f)
            horizontalLineToRelative(4.293f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(13.5f)
            close()
        }
    }.build()
}
