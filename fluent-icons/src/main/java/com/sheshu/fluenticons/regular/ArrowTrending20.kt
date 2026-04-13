package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTrending20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTrending20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.962f, 5.309f)
            curveToRelative(-0.024f, -0.06f, -0.06f, -0.115f, -0.108f, -0.163f)
            reflectiveCurveTo(17.75f, 5.063f, 17.69f, 5.038f)
            curveTo(17.632f, 5.013f, 17.568f, 5f, 17.5f, 5f)
            horizontalLineToRelative(-6f)
            curveTo(11.224f, 5f, 11f, 5.224f, 11f, 5.5f)
            reflectiveCurveTo(11.224f, 6f, 11.5f, 6f)
            horizontalLineToRelative(4.793f)
            lineTo(10.5f, 11.793f)
            lineTo(8.354f, 9.647f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            lineToRelative(-5.5f, 5.5f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.707f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineTo(8f, 10.707f)
            lineToRelative(2.146f, 2.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(17f, 6.707f)
            verticalLineTo(11.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -0.068f, -0.014f, -0.132f, -0.038f, -0.191f)
            close()
        }
    }.build()
}
