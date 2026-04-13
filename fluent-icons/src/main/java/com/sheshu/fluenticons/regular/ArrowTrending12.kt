package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowTrending12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowTrending12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.962f, 2.309f)
            curveToRelative(-0.024f, -0.06f, -0.06f, -0.115f, -0.108f, -0.163f)
            curveTo(10.806f, 2.1f, 10.75f, 2.063f, 10.69f, 2.038f)
            curveTo(10.632f, 2.014f, 10.568f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-4f)
            curveTo(6.224f, 2f, 6f, 2.224f, 6f, 2.5f)
            reflectiveCurveTo(6.224f, 3f, 6.5f, 3f)
            horizontalLineToRelative(2.793f)
            lineTo(6f, 6.293f)
            lineTo(4.854f, 5.146f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            lineTo(4.5f, 6.208f)
            lineToRelative(1.146f, 1.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(10f, 3.707f)
            verticalLineTo(6.5f)
            curveTo(10f, 6.776f, 10.224f, 7f, 10.5f, 7f)
            reflectiveCurveTo(11f, 6.776f, 11f, 6.5f)
            verticalLineTo(2.497f)
            curveToRelative(0f, -0.067f, -0.014f, -0.13f, -0.038f, -0.188f)
            close()
        }
    }.build()
}
