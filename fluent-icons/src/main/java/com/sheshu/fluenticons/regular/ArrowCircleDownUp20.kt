package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowCircleDownUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowCircleDownUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.354f, 13.854f)
            lineTo(9f, 12.207f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(7.5f, 12.293f)
            verticalLineTo(6.5f)
            curveTo(7.5f, 6.224f, 7.276f, 6f, 7f, 6f)
            reflectiveCurveTo(6.5f, 6.224f, 6.5f, 6.5f)
            verticalLineToRelative(5.793f)
            lineTo(5.707f, 11.5f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(1.646f, 1.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            close()
            moveTo(15f, 7.793f)
            lineToRelative(-1.646f, -1.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(11f, 7.793f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineTo(12.5f, 7.707f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(7.707f)
            lineTo(14.293f, 8.5f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            close()
            moveTo(18f, 10f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            close()
            moveToRelative(-8f, 7f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
        }
    }.build()
}
