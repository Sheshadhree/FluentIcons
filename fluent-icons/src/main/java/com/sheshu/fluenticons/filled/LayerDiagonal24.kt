package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayerDiagonal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayerDiagonal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.984f, 2.136f)
            curveTo(12.451f, 1.606f, 14f, 2.692f, 14f, 4.252f)
            verticalLineToRelative(0.177f)
            lineTo(7.474f, 6.79f)
            curveTo(5.989f, 7.328f, 5f, 8.738f, 5f, 10.317f)
            verticalLineToRelative(5.553f)
            curveToRelative(-1.462f, 0.518f, -3f, -0.566f, -3f, -2.12f)
            verticalLineTo(7.666f)
            curveTo(2f, 6.3f, 2.857f, 5.077f, 4.144f, 4.611f)
            lineToRelative(6.84f, -2.475f)
            close()
            moveToRelative(4f, 3f)
            curveTo(16.451f, 4.606f, 18f, 5.692f, 18f, 7.252f)
            verticalLineToRelative(0.177f)
            lineToRelative(-6.856f, 2.48f)
            curveTo(9.857f, 10.376f, 9f, 11.598f, 9f, 12.967f)
            verticalLineToRelative(5.905f)
            curveToRelative(-1.462f, 0.517f, -3f, -0.567f, -3f, -2.122f)
            verticalLineToRelative(-6.432f)
            curveTo(6f, 9.159f, 6.725f, 8.125f, 7.814f, 7.73f)
            lineToRelative(7.17f, -2.595f)
            close()
            moveToRelative(4f, 3f)
            curveTo(20.451f, 7.606f, 22f, 8.692f, 22f, 10.252f)
            verticalLineToRelative(6.783f)
            curveToRelative(0f, 0.948f, -0.593f, 1.794f, -1.484f, 2.116f)
            lineToRelative(-7.5f, 2.714f)
            curveTo(11.549f, 22.395f, 10f, 21.309f, 10f, 19.749f)
            verticalLineToRelative(-6.783f)
            curveToRelative(0f, -0.948f, 0.594f, -1.793f, 1.484f, -2.116f)
            lineToRelative(7.5f, -2.714f)
            close()
        }
    }.build()
}
