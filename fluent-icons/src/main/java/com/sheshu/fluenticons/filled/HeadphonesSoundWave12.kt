package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HeadphonesSoundWave12: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeadphonesSoundWave12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 11f, 8f, 10.776f, 8f, 10.5f)
            verticalLineToRelative(-4f)
            curveTo(8f, 6.224f, 8.224f, 6f, 8.5f, 6f)
            horizontalLineTo(10f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveTo(2f, 3.79f, 2f, 6f)
            horizontalLineToRelative(1.5f)
            curveTo(3.776f, 6f, 4f, 6.224f, 4f, 6.5f)
            verticalLineToRelative(4f)
            curveTo(4f, 10.776f, 3.776f, 11f, 3.5f, 11f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            close()
            moveToRelative(0f, 4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(5f)
            curveTo(6.5f, 10.776f, 6.276f, 11f, 6f, 11f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(5.5f, 5.224f, 5.724f, 5f, 6f, 5f)
            close()
        }
    }.build()
}
