package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowCircleDownSplit20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowCircleDownSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            close()
            moveToRelative(-9.207f, 2.414f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(7.5f, 12.293f)
            verticalLineTo(9f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(3.293f)
            lineToRelative(-0.586f, -0.586f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(1.44f, 1.44f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(1.439f, -1.44f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(13.5f, 12.293f)
            verticalLineTo(8.5f)
            curveTo(13.5f, 8.224f, 13.276f, 8f, 13f, 8f)
            horizontalLineToRelative(-2.5f)
            verticalLineTo(5.5f)
            curveTo(10.5f, 5.224f, 10.276f, 5f, 10f, 5f)
            reflectiveCurveTo(9.5f, 5.224f, 9.5f, 5.5f)
            verticalLineTo(8f)
            horizontalLineTo(7f)
            curveTo(6.724f, 8f, 6.5f, 8.224f, 6.5f, 8.5f)
            verticalLineToRelative(3.793f)
            lineToRelative(-0.586f, -0.586f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            lineToRelative(1.44f, 1.44f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(1.439f, -1.44f)
            close()
        }
    }.build()
}
