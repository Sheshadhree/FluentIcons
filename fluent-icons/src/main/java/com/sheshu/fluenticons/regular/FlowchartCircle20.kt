package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlowchartCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlowchartCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 6.5f)
            curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 6f, 9f, 6.224f, 9f, 6.5f)
            verticalLineToRelative(2f)
            curveTo(9f, 8.776f, 8.776f, 9f, 8.5f, 9f)
            horizontalLineTo(8f)
            verticalLineToRelative(1.793f)
            lineTo(9.207f, 12f)
            horizontalLineTo(11f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(13f)
            horizontalLineTo(9.207f)
            lineToRelative(-1.354f, 1.354f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            lineToRelative(-1.5f, -1.5f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(7f, 10.793f)
            verticalLineTo(9f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 9f, 6f, 8.776f, 6f, 8.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(8f, -7f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
        }
    }.build()
}
