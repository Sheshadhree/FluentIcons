package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cube12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cube12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.449f, 1.105f)
            curveToRelative(0.354f, -0.14f, 0.748f, -0.14f, 1.102f, 0f)
            lineToRelative(3.5f, 1.384f)
            curveTo(10.624f, 2.715f, 11f, 3.268f, 11f, 3.884f)
            verticalLineToRelative(4.23f)
            curveToRelative(0f, 0.616f, -0.376f, 1.17f, -0.949f, 1.395f)
            lineToRelative(-3.5f, 1.384f)
            curveToRelative(-0.354f, 0.14f, -0.748f, 0.14f, -1.102f, 0f)
            lineToRelative(-3.5f, -1.384f)
            curveTo(1.376f, 9.283f, 1f, 8.73f, 1f, 8.114f)
            verticalLineToRelative(-4.23f)
            curveToRelative(0f, -0.616f, 0.376f, -1.17f, 0.948f, -1.395f)
            lineToRelative(3.5f, -1.384f)
            close()
            moveToRelative(-1.763f, 2.93f)
            curveToRelative(-0.257f, -0.102f, -0.548f, 0.023f, -0.65f, 0.28f)
            curveToRelative(-0.103f, 0.256f, 0.022f, 0.547f, 0.278f, 0.65f)
            lineTo(5.5f, 5.837f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(6.5f, 8.276f, 6.5f, 8f)
            verticalLineTo(5.838f)
            lineToRelative(2.186f, -0.874f)
            curveToRelative(0.256f, -0.102f, 0.38f, -0.393f, 0.278f, -0.65f)
            curveToRelative(-0.102f, -0.256f, -0.393f, -0.38f, -0.65f, -0.278f)
            lineTo(6f, 4.962f)
            lineTo(3.686f, 4.035f)
            close()
        }
    }.build()
}
