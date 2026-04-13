package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextBold16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextBold16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.1f)
            curveTo(4f, 2.5f, 4.5f, 2f, 5.1f, 2f)
            horizontalLineToRelative(3f)
            curveToRelative(2.1f, 0f, 3.4f, 1.4f, 3.4f, 3.4f)
            curveToRelative(0f, 0.9f, -0.3f, 2f, -0.7f, 2.6f)
            curveToRelative(0.8f, 0.6f, 1.4f, 1.2f, 1.4f, 2.5f)
            curveToRelative(0f, 2.7f, -2.1f, 3.5f, -3.6f, 3.5f)
            horizontalLineTo(5.1f)
            curveTo(4.5f, 14f, 4f, 13.5f, 4f, 12.9f)
            verticalLineTo(3.1f)
            close()
            moveTo(6f, 9f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2.4f)
            curveToRelative(0.7f, 0f, 1.5f, -0.5f, 1.5f, -1.5f)
            reflectiveCurveTo(9.1f, 9f, 8.4f, 9f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0f, -2f)
            horizontalLineToRelative(2.2f)
            curveToRelative(0.9f, 0f, 1.5f, -0.7f, 1.5f, -1.5f)
            reflectiveCurveTo(9.1f, 4f, 8.3f, 4f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
