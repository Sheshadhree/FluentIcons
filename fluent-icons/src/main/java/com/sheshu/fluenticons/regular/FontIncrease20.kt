package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FontIncrease20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FontIncrease20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.854f, 4.854f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.195f, 0.511f, -0.195f, 0.707f, 0f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineTo(15.5f, 3.207f)
            lineToRelative(-1.646f, 1.647f)
            close()
            moveTo(10f, 4f)
            curveTo(9.797f, 4f, 9.614f, 4.123f, 9.537f, 4.31f)
            lineToRelative(-4.5f, 11f)
            curveToRelative(-0.104f, 0.256f, 0.018f, 0.548f, 0.274f, 0.653f)
            curveToRelative(0.255f, 0.104f, 0.547f, -0.018f, 0.652f, -0.274f)
            lineTo(7.5f, 11.931f)
            verticalLineTo(12f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-0.068f)
            lineToRelative(1.537f, 3.757f)
            curveToRelative(0.105f, 0.256f, 0.397f, 0.378f, 0.652f, 0.274f)
            curveToRelative(0.256f, -0.105f, 0.378f, -0.397f, 0.274f, -0.652f)
            lineToRelative(-4.5f, -11f)
            curveTo(10.386f, 4.123f, 10.203f, 4f, 10f, 4f)
            close()
            moveToRelative(0f, 1.82f)
            lineTo(12.119f, 11f)
            horizontalLineTo(7.88f)
            lineTo(10f, 5.82f)
            close()
        }
    }.build()
}
