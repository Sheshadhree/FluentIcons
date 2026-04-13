package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlowchartCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlowchartCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(4f, -3.5f)
            verticalLineToRelative(2f)
            curveTo(6f, 8.776f, 6.224f, 9f, 6.5f, 9f)
            horizontalLineTo(7f)
            verticalLineToRelative(1.793f)
            lineToRelative(-1.354f, 1.353f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(9.207f, 13f)
            horizontalLineTo(11f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineTo(12f)
            horizontalLineTo(9.207f)
            lineTo(8f, 10.793f)
            verticalLineTo(9f)
            horizontalLineToRelative(0.5f)
            curveTo(8.776f, 9f, 9f, 8.776f, 9f, 8.5f)
            verticalLineToRelative(-2f)
            curveTo(9f, 6.224f, 8.776f, 6f, 8.5f, 6f)
            horizontalLineToRelative(-2f)
            curveTo(6.224f, 6f, 6f, 6.224f, 6f, 6.5f)
            close()
        }
    }.build()
}
