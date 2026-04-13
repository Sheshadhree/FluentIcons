package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalligraphyPen20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalligraphyPen20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2.5f)
            curveTo(6f, 2.224f, 5.776f, 2f, 5.5f, 2f)
            reflectiveCurveTo(5f, 2.224f, 5f, 2.5f)
            verticalLineToRelative(2f)
            curveTo(5f, 5.328f, 5.672f, 6f, 6.5f, 6f)
            horizontalLineToRelative(0.2f)
            lineTo(5.24f, 9.08f)
            curveToRelative(-0.353f, 0.748f, -0.315f, 1.622f, 0.103f, 2.335f)
            lineToRelative(3.463f, 5.907f)
            curveTo(8.966f, 17.595f, 9.213f, 17.8f, 9.5f, 17.91f)
            verticalLineToRelative(-7.044f)
            curveTo(9.201f, 10.693f, 9f, 10.37f, 9f, 10f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.37f, -0.201f, 0.693f, -0.5f, 0.866f)
            verticalLineToRelative(7.036f)
            curveToRelative(0.278f, -0.112f, 0.518f, -0.313f, 0.674f, -0.58f)
            lineToRelative(3.463f, -5.907f)
            curveToRelative(0.418f, -0.713f, 0.456f, -1.587f, 0.102f, -2.334f)
            lineTo(13.28f, 6f)
            horizontalLineToRelative(0.22f)
            curveTo(14.328f, 6f, 15f, 5.328f, 15f, 4.5f)
            verticalLineToRelative(-2f)
            curveTo(15f, 2.224f, 14.776f, 2f, 14.5f, 2f)
            reflectiveCurveTo(14f, 2.224f, 14f, 2.5f)
            verticalLineToRelative(2f)
            curveTo(14f, 4.776f, 13.776f, 5f, 13.5f, 5f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 5f, 6f, 4.776f, 6f, 4.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.build()
}
