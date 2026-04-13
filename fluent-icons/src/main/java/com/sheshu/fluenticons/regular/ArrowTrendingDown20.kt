package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTrendingDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTrendingDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.962f, 14.691f)
            curveToRelative(-0.024f, 0.06f, -0.06f, 0.115f, -0.108f, 0.163f)
            reflectiveCurveToRelative(-0.104f, 0.084f, -0.163f, 0.108f)
            curveTo(17.632f, 14.986f, 17.568f, 15f, 17.5f, 15f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(4.793f)
            lineTo(10.5f, 8.207f)
            lineToRelative(-2.146f, 2.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-5.5f, -5.5f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineTo(8f, 9.293f)
            lineToRelative(2.146f, -2.146f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineTo(17f, 13.293f)
            verticalLineTo(8.5f)
            curveTo(17f, 8.224f, 17.224f, 8f, 17.5f, 8f)
            reflectiveCurveTo(18f, 8.224f, 18f, 8.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.068f, -0.014f, 0.132f, -0.038f, 0.191f)
            close()
        }
    }.build()
}
