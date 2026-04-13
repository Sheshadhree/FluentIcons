package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleDownUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleDownUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 18f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
            moveToRelative(-1f, -5.793f)
            lineToRelative(-1.646f, 1.647f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineTo(5f, 12.207f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            lineTo(6.5f, 12.293f)
            verticalLineTo(6.5f)
            curveTo(6.5f, 6.224f, 6.724f, 6f, 7f, 6f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(5.793f)
            lineTo(8.293f, 11.5f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            close()
            moveToRelative(6f, -4.414f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineTo(13.5f, 7.707f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(7.707f)
            lineTo(11.707f, 8.5f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(1.646f, -1.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            lineTo(15f, 7.793f)
            close()
        }
    }.build()
}
