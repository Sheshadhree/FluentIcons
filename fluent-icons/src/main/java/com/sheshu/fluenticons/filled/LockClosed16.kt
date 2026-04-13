package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LockClosed16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockClosed16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 3.5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            verticalLineTo(4f)
            horizontalLineToRelative(0.5f)
            curveTo(12.88f, 4f, 14f, 5.12f, 14f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-5f)
            curveTo(2f, 5.12f, 3.12f, 4f, 4.5f, 4f)
            horizontalLineTo(5f)
            verticalLineTo(3.5f)
            close()
            moveToRelative(3f, -2f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineTo(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveTo(8f, 10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(8.552f, 8f, 8f, 8f)
            reflectiveCurveTo(7f, 8.448f, 7f, 9f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
