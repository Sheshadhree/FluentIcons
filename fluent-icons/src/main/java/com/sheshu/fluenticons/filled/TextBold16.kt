package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextBold16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBold16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.3f)
            curveTo(4f, 2.6f, 4.6f, 2f, 5.3f, 2f)
            horizontalLineToRelative(3.3f)
            curveToRelative(2f, 0f, 3.5f, 1.7f, 3.5f, 3.5f)
            curveToRelative(0f, 0.7f, -0.2f, 1.4f, -0.6f, 1.9f)
            curveToRelative(0.7f, 0.6f, 1.2f, 1.6f, 1.2f, 2.8f)
            curveToRelative(0f, 2.4f, -2f, 3.7f, -3.7f, 3.7f)
            horizontalLineTo(5.3f)
            curveTo(4.6f, 14f, 4f, 13.4f, 4f, 12.7f)
            verticalLineTo(3.3f)
            close()
            moveToRelative(2.6f, 1.3f)
            verticalLineToRelative(1.9f)
            horizontalLineToRelative(2f)
            curveToRelative(0.5f, 0f, 1f, -0.4f, 1f, -1f)
            curveToRelative(0f, -0.5f, -0.4f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(0.1f)
            close()
            moveToRelative(0f, 4.5f)
            verticalLineToRelative(2.4f)
            horizontalLineTo(9f)
            curveToRelative(0.6f, 0f, 1.2f, -0.5f, 1.2f, -1.2f)
            reflectiveCurveTo(9.6f, 9.1f, 9f, 9.1f)
            horizontalLineTo(6.6f)
            close()
        }
    }.build()
}
